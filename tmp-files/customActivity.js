'use strict';
// JSON Flattener config UI. Postmonger flow: /sample (real DE rows, every JSON column) → tick/rename/retype fields → Done.
// On Done the node (a) declares the chosen names as its outArguments (Decision Split reads them) and
// (b) asks the server to add matching columns to the results DE (emails read them with Lookup()).

var TYPES = ['Text', 'Number', 'Decimal', 'Date', 'Boolean', 'Email', 'Phone', 'Locale'];
// Journey Builder argument type, where it differs from the node's type. Decimal: a Decision Split on a
// Decimal outArgument is a Hard Error for every contact; JB compares it as Number.
// Date: JB has no "no value" for a Date outArgument ("" → split Hard Error, null → activity fails, missing key
// → contact fails), so JB sees dates as Text; the results DE keeps the Date type for Contact Data splits.
var JB_TYPE = { Locale: 'Text', Decimal: 'Number' };
var FIXED = ['journeyKey', 'mappings', 'contactKey', 'resultsDeKey', 'resultsDeName'];

var connection = new Postmonger.Session();
var payload = {};
var saved = {};           // merged inArguments from initActivity (edit mode)
var schemaFields = null;
var tokens = {};
var endpoints = {};
var journeyKey = '';
var resultsDE = '';     // name of this journey's results DE ("<Entry DE> Result"), for the Lookup() snippet
var resultsDeKey = '';  // its external key, saved into inArguments so /execute writes there
var fields = [];          // { binding, path, name, type, values }, grouped by binding
var sampleState = '';     // '' → 'loading' → 'done'
var ensureFailedFor = ''; // mappings whose results DE update failed: Done again saves them anyway
var SAMPLE_LIMIT = 100;   // $pageSize of the rowset read in /sample

var $name = document.getElementById('node-name');
var $table = document.getElementById('tableWrap');
var $rows = document.getElementById('fields');
var $status = document.getElementById('status');
var $lookup = document.getElementById('lookup');
var $all = document.getElementById('check-all');

connection.on('initActivity', function (data) {
  if (data) payload = data;
  var inArgs = (((payload.arguments || {}).execute || {}).inArguments) || [];
  saved = Object.assign.apply(null, [{}].concat(inArgs));
  $name.value = payload.name || 'JSON Flattener';
  journeyKey = saved.journeyKey || journeyKey;
  resultsDeKey = saved.resultsDeKey || resultsDeKey;
  resultsDE = saved.resultsDeName || resultsDE;
  // show the saved configuration at once; DE values fill in when /sample answers
  fields = savedMappings().map(function (m) { return { binding: m.binding, path: m.path, name: m.out, type: m.type, agg: m.agg || 'first', values: [] }; });
  if (fields.length) renderFields();
  validate();
  loadFields();
});
connection.on('requestedTokens', function (data) { tokens = data || {}; loadFields(); });
connection.on('requestedEndpoints', function (data) { endpoints = data || {}; loadFields(); });
connection.on('requestedInteraction', function (data) { if (data && data.key) journeyKey = data.key; renderLookup(); });
connection.on('requestedSchema', function (data) { schemaFields = (data && data.schema) || []; loadFields(); });
connection.on('clickedNext', save);

// Saved mappings with their column binding; a mapping without `arg` was saved by the single-column UI
function savedMappings() {
  try {
    return JSON.parse(saved.mappings || '[]').map(function (m) {
      return Object.assign({}, m, { binding: String(saved[m.arg || 'jsonInput'] || '').replace(/^\{\{|\}\}$/g, '') });
    });
  } catch (e) { return []; }
}

// The journey's entry event (its DE is the source of the sample rows and the name of the results DE)
function entryEventKey() {
  var k = schemaFields.map(function (f) { return f.key; }).filter(splitKey)[0];
  return k ? splitKey(k).eventDefinitionKey : undefined;
}

// Key looks like Event.DEAudience-<eventDefinitionKey>.<column>
function splitKey(key) {
  var m = /^Event\.([^.]+)\.(.+)$/.exec(key || '');
  return m ? { eventDefinitionKey: m[1], column: m[2] } : null;
}

function session() {
  return { token: tokens.fuel2token, restHost: endpoints.fuelapiRestHost || endpoints.restHost };
}

// Runs once all of schema, token and endpoints have arrived, in whatever order
function loadFields() {
  var s = session();
  if (sampleState || !schemaFields || !s.token || !s.restHost) return;
  var keys = schemaFields.map(function (f) { return f.key; }).filter(splitKey);
  if (!keys.length) return setStatus('Choose the Entry Source and save the journey first.', true);
  sampleState = 'loading';
  setStatus('Reading rows of the Entry DE…');
  fetch(BACKEND_URL + '/sample', {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify({ eventDefinitionKey: splitKey(keys[0]).eventDefinitionKey, token: s.token, restHost: s.restHost }),
  }).then(function (r) { return r.json(); }).then(function (data) {
    if (data.error) throw new Error(data.error);
    sampleState = 'done';
    fields = withAggregateRows(mergeFields(data.columns, keys));
    document.getElementById('rows-read').textContent = '· ' + rowsText(data.rows);
    setStatus(fields.length ? '' : 'No JSON found: ' + rowsText(data.rows) + '.', !fields.length);
    renderFields();
    validate();
  }).catch(function (err) {
    sampleState = '';
    console.error(err); // the server log has the details too
    setStatus('Could not read the Entry DE. Save the journey and reopen this node.', true);
    validate();
  });
}

function rowsText(n) {
  if (n >= SAMPLE_LIMIT) return 'first ' + SAMPLE_LIMIT + ' rows of the Entry DE read';
  return n + (n === 1 ? ' row' : ' rows') + ' read from the Entry DE';
}

// A list field can be used several times with different aggregates: each saved {path, agg != first} is its own row (clone)
function withAggregateRows(list) {
  var out = [];
  list.forEach(function (f) {
    out.push(f);
    savedMappings().forEach(function (m) {
      if (m.binding === f.binding && m.agg && m.agg !== 'first' && m.path.replace(/\[0\]/g, '') === f.path.replace(/\[0\]/g, '')) {
        out.push(Object.assign({}, f, { agg: m.agg, clone: true }));
      }
    });
  });
  return out;
}

// Discovered fields + saved ones the sample did not show (they stay configured), grouped by column.
// rowset returns column names lower-cased, so columns are matched to schema keys case-insensitively.
function mergeFields(columns, keys) {
  var list = [];
  columns.forEach(function (c) {
    var key = keys.find(function (k) { return splitKey(k).column.toLowerCase() === c.column.toLowerCase(); });
    if (key) c.fields.forEach(function (f) { list.push(Object.assign({ binding: key }, f)); });
  });
  fields.forEach(function (f) {
    if (!list.some(function (x) { return x.binding === f.binding && x.path === f.path; })) list.push(f);
  });
  var order = list.map(function (f) { return f.binding; }).filter(function (b, i, all) { return all.indexOf(b) === i; });
  return order.reduce(function (acc, b) { return acc.concat(list.filter(function (f) { return f.binding === b; })); }, []);
}

// JB stores outArgument names with a lower-case first letter; a Decision Split built on
// the upper-case spelling fails on Number. Keep every spelling lower-first so they agree.
function lowerFirst(name) { return name.charAt(0).toLowerCase() + name.slice(1); }

// "Credit Request ID" → credit_Request_ID; a name JB, the DE and AMPscript all accept
function sanitize(name) {
  var n = String(name).replace(/\W+/g, '_').replace(/^_+|_+$/g, '');
  if (/^\d/.test(n)) n = '_' + n;
  return lowerFirst(n.slice(0, 100));
}

function renderFields() {
  var prevBy = {};
  savedMappings().forEach(function (m) { prevBy[m.binding + '|' + m.path.replace(/\[0\]/g, '') + '|' + (m.agg || 'first')] = m; }); // [0] stripped: an object may have become an array
  var editing = Object.keys(prevBy).length > 0;

  $rows.innerHTML = '';
  var group = null;
  fields.forEach(function (f, i) {
    if (f.binding !== group) {
      group = f.binding;
      var head = document.createElement('tr');
      head.className = 'group';
      head.innerHTML = '<td colspan="5"></td>';
      head.firstChild.textContent = (splitKey(group) || { column: group }).column;
      $rows.appendChild(head);
    }
    f.agg = f.agg || 'first';
    var prev = prevBy[f.binding + '|' + f.path.replace(/\[0\]/g, '') + '|' + f.agg];
    var st = f.state; // unsaved edits kept across a re-render (+ also as… / × remove)
    var tr = document.createElement('tr');
    tr.innerHTML =
      '<td><input type="checkbox" data-i="' + i + '"></td>' +
      '<td class="key"></td><td class="values"></td>' +
      '<td class="type"><select data-i="' + i + '" aria-label="Type">' + TYPES.map(function (t) { return '<option>' + t + '</option>'; }).join('') + '</select></td>' +
      '<td><input type="text" data-i="' + i + '" maxlength="100"></td>';
    tr.querySelector('input[type=checkbox]').checked = st ? st.checked : prev ? true : (!editing && !/count$/.test(f.name) && !f.clone) || !!f.clone;
    // $[0]["Credit Request ID"] → Credit Request ID; nested arrays keep [0] (Task_Home[0].Status) so it is clear the first item is used
    var label = f.path.replace(/^\$\[0\]/, '$').replace(/\["((?:[^"\\]|\\.)*)"\]/g, '.$1').replace(/^\$\.?/, '');
    // a count row is labelled with the array itself ("Task_Home", the column for the root array); its First value is the count
    label = label === 'length' ? (splitKey(f.binding) || { column: f.binding }).column : label.replace(/\.length$/, '') || '(root)';
    tr.querySelector('.key').textContent = label;
    tr.querySelector('.key').style.paddingLeft = (8 + 14 * (label.replace(/\.length$| · .*$/, '').split('.').length - 1)) + 'px'; // indent by depth
    tr.querySelector('input[type=checkbox]').setAttribute('aria-label', 'Use ' + label);
    tr.querySelector('input[type=text]').setAttribute('aria-label', 'Attribute name for ' + label);
    tr.querySelector('select').value = st ? st.type : prev ? prev.type : f.type;
    var first = f.values.find(function (v) { return v !== ''; });
    tr.querySelector('.values').textContent = f.values.length ? (first === undefined ? '—' : first) : sampleState === 'done' ? 'not in sample' : '…';
    tr.querySelector('input[type=text]').value = st ? st.out : prev ? prev.out : sanitize(f.name);
    $rows.appendChild(tr);
  });
  $table.hidden = false;
}

// aggregates over list items (agg last/min/max/sum) are supported by the server but not offered in this UI
// Ticked fields → { out, path, type, binding, agg }
function currentMappings() {
  var out = [];
  $rows.querySelectorAll('input[type=checkbox]').forEach(function (cb) {
    if (!cb.checked) return;
    var i = cb.dataset.i;
    var $out = $rows.querySelector('input[type=text][data-i="' + i + '"]');
    $out.value = lowerFirst($out.value.trim());
    out.push({
      out: $out.value,
      path: fields[i].path,
      type: $rows.querySelector('select[aria-label="Type"][data-i="' + i + '"]').value,
      binding: fields[i].binding,
      agg: fields[i].agg && fields[i].agg !== 'first' ? fields[i].agg : undefined,
    });
  });
  return out;
}

function validate() {
  var problem = '';
  var mappings = currentMappings();
  var names = mappings.map(function (m) { return m.out; });
  if (!$name.value.trim()) problem = 'Enter a node name.';
  else if (!mappings.length) problem = 'Tick at least one field.';
  else if (names.some(function (n) { return !/^[A-Za-z_]\w*$/.test(n); })) problem = 'Attribute names: letters, digits and _ only, not starting with a digit.';
  else if (names.some(function (n) { return /^(OutFound|ContactKey|JourneyKey)$/i.test(n); })) problem = 'OutFound, ContactKey and JourneyKey are reserved names.';
  else if (new Set(names.map(function (n) { return n.toLowerCase(); })).size !== names.length) problem = 'Attribute names must be unique.';
  else if (new Set(mappings.map(function (m) { return m.binding + '|' + m.path + '|' + (m.agg || 'first'); })).size !== mappings.length) problem = 'The same field is used twice with the same item choice. Pick another item (last, min, max, sum) or remove the row.';
  if (problem && fields.length) setStatus(problem, true);
  else if (!problem && $status.className === 'error' && !/Could not read|No JSON|Entry Source/.test($status.textContent)) setStatus('');
  var boxes = Array.from($rows.querySelectorAll('input[type=checkbox]'));
  var ticked = boxes.filter(function (cb) { return cb.checked; }).length;
  $all.checked = boxes.length > 0 && ticked === boxes.length;
  $all.indeterminate = ticked > 0 && ticked < boxes.length;
  renderLookup();
  connection.trigger('updateButton', { button: 'next', text: 'done', visible: true, enabled: !problem });
  connection.trigger('updateButton', { button: 'back', visible: false });
  return !problem;
}

// Collapsed by default: the snippets are needed once, when the email is built; "Copy" works inside the JB iframe (clipboard API, fallback execCommand)
function renderLookup() {
  var names = currentMappings().map(function (m) { return m.out; });
  $lookup.hidden = !names.length || !resultsDE;
  if ($lookup.hidden) return;
  var lines = names.map(function (n) { return '%%=Lookup("' + resultsDE + '","' + n + '","ContactKey",_subscriberkey,"JourneyKey","' + journeyKey + '")=%%'; });
  $lookup.querySelector('summary').textContent = 'Use in an email (AMPscript) · ' + names.length + ' attribute' + (names.length === 1 ? '' : 's');
  var body = $lookup.querySelector('.body');
  body.innerHTML = '';
  lines.forEach(function (line) {
    var div = document.createElement('div');
    div.className = 'snippet';
    var code = document.createElement('code');
    code.textContent = line;
    div.appendChild(code);
    div.appendChild(copyButton(line, 'Copy'));
    body.appendChild(div);
  });
  var all = document.createElement('div');
  all.className = 'all';
  all.appendChild(copyButton(lines.join('\n'), 'Copy all'));
  body.appendChild(all);
}

function copyButton(text, label) {
  var b = document.createElement('button');
  b.type = 'button';
  b.className = 'copy';
  b.textContent = label;
  b.addEventListener('click', function () {
    var done = function () { b.textContent = 'Copied'; setTimeout(function () { b.textContent = label; }, 1500); };
    var fallback = function () {
      var ta = document.createElement('textarea');
      ta.value = text; ta.style.position = 'fixed'; ta.style.opacity = '0';
      document.body.appendChild(ta); ta.select();
      try { document.execCommand('copy'); done(); } catch (e) { b.textContent = 'Select and copy'; }
      document.body.removeChild(ta);
    };
    if (navigator.clipboard && navigator.clipboard.writeText) navigator.clipboard.writeText(text).then(done, fallback); else fallback();
  });
  return b;
}

function setStatus(text, isError) {
  $status.textContent = text;
  $status.className = isError ? 'error' : '';
}

function save() {
  if (!validate()) return;
  var mappings = currentMappings();
  var attempt = JSON.stringify(mappings);
  if (attempt === ensureFailedFor) return commit(mappings);
  var s = session();
  setStatus('Preparing the results Data Extension…');
  connection.trigger('updateButton', { button: 'next', text: 'done', visible: true, enabled: false });
  fetch(BACKEND_URL + '/ensure', {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify({ fields: mappings.map(function (m) { return { name: m.out, type: m.type }; }), eventDefinitionKey: entryEventKey(), token: s.token, restHost: s.restHost }),
  }).then(function (r) { return r.json(); }).then(function (data) {
    if (data.error) throw new Error(data.error);
    if (data.conflicts) {
      // a DE column cannot change type: the campaigner renames the attribute or keeps the old type
      validate();
      return setStatus(data.conflicts.join('; ') + '. Rename the attribute or change its type.', true);
    }
    if (data.de) { resultsDeKey = data.de.key; resultsDE = data.de.name; }
    commit(mappings);
  }).catch(function (err) {
    // the campaigner must see this before the modal closes; Decision Split works without the DE, so Done again saves
    ensureFailedFor = attempt;
    validate();
    setStatus('Results DE not updated (' + err.message + '). Fix it and try again, or click Done again to save: Decision Split will work, email Lookup() may miss columns.', true);
  });
}

function commit(mappings) {
  // one inArgument per JSON column: json0, json1, … (JB binds each to its column at runtime)
  var bindings = mappings.map(function (m) { return m.binding; }).filter(function (b, i, all) { return all.indexOf(b) === i; });
  var jsonArgs = bindings.map(function (b, i) { return 'json' + i; });
  var inArgument = {
    journeyKey: journeyKey,                // stable across journey versions; part of the results DE key
    mappings: JSON.stringify(mappings.map(function (m) {   // string: JB inArguments take scalars only
      var o = { out: m.out, path: m.path, type: m.type, arg: 'json' + bindings.indexOf(m.binding) };
      if (m.agg) o.agg = m.agg;
      return o;
    })),
    contactKey: '{{Contact.Key}}',
    resultsDeKey: resultsDeKey,            // "<Entry DE>_Result": /execute writes this journey's rows there
    resultsDeName: resultsDE,
  };
  bindings.forEach(function (b, i) { inArgument['json' + i] = '{{' + b + '}}'; });

  payload.name = $name.value.trim();
  payload.arguments = payload.arguments || {};
  payload.arguments.execute = payload.arguments.execute || {};
  payload.arguments.execute.inArguments = [inArgument];

  // declare the chosen names as outArguments of this activity instance (Decision Split reads this schema);
  // the fixed slots from config.json stay declared but hidden
  var outDefaults = [{ OutText1: '' }, { OutText2: '' }, { OutText3: '' }, { OutNumber1: 0 }, { OutNumber2: 0 }, { OutDate1: '' }, { OutFound: '0' }];
  var outSchema = outDefaults.map(function (d) {
    var k = Object.keys(d)[0];
    return obj(k, { dataType: /Number/.test(k) ? 'Number' : /Date/.test(k) ? 'Date' : 'Text', isNullable: k !== 'OutFound', access: k === 'OutFound' ? 'visible' : 'hidden', direction: 'out' });
  });
  mappings.forEach(function (m) {
    outDefaults.push(obj(m.out, m.type === 'Number' || m.type === 'Decimal' ? 0 : m.type === 'Boolean' ? 'False' : ''));
    outSchema.push(obj(m.out, { dataType: JB_TYPE[m.type] || m.type, isNullable: true, access: 'visible', direction: 'out' }));
  });
  payload.arguments.execute.outArguments = outDefaults;
  payload.schema = payload.schema || {};
  payload.schema.arguments = payload.schema.arguments || {};
  payload.schema.arguments.execute = payload.schema.arguments.execute || {};
  payload.schema.arguments.execute.outArguments = outSchema;
  payload.schema.arguments.execute.inArguments = FIXED.concat(jsonArgs).map(function (k) { return obj(k, { dataType: 'Text', isNullable: true, direction: 'in' }); });

  payload.metaData = payload.metaData || {};
  payload.metaData.isConfigured = true;
  connection.trigger('updateActivity', payload);
}

function obj(k, v) { var o = {}; o[k] = v; return o; }

$name.addEventListener('input', validate);
$rows.addEventListener('change', validate);
$rows.addEventListener('input', validate);
$all.addEventListener('change', function () {
  $rows.querySelectorAll('input[type=checkbox]').forEach(function (cb) { cb.checked = $all.checked; });
  validate();
});


connection.trigger('ready');
connection.trigger('requestTokens');
connection.trigger('requestEndpoints');
connection.trigger('requestSchema');
connection.trigger('requestInteraction');
