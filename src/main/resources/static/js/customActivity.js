var connection = new Postmonger.Session();
var payload = {};
var schemaFields = [];
var journeyMeta = {};

// State Tracking
var currentStep = 1;
var selectedChannel = "";
var lastFocusedElement = null; // To know where to insert {{Field}}

$(window).ready(function() {
    connection.trigger('ready');
    connection.trigger('requestTokens');
    connection.trigger('requestEndpoints');
    connection.trigger('requestSchema');
    connection.trigger('requestInteraction');

    // Default UI state
    $('#channel-select').change(validateStep1);

    // Track focus for variable injection
    $(document).on('focus', '.inject-target', function() {
        lastFocusedElement = $(this);
    });

    // Add Image Logic
    $('#btn-add-image').click(function() { addImageRow(""); });

    // Add Button Logic
    $('#btn-add-button').click(function() { addButtonRow({}); });
});

// --- POSTMONGER LISTENERS ---

connection.on('requestedSchema', function(data) {
    if (data.schema) schemaFields = data.schema;
    renderFields(schemaFields);
});

connection.on('requestedInteraction', function(interaction) {
    journeyMeta.journeyName = interaction.name;
    journeyMeta.journeyVersion = interaction.version;
    journeyMeta.journeyKey = interaction.key;
});

connection.on('initActivity', function(data) {
    if (data) payload = data;

    // Parse existing configuration
    var inArgs = payload['arguments'].execute.inArguments;
    var config = {};

    // Flatten inArguments for easier reading
    $.each(inArgs, function(i, arg) {
        $.extend(config, arg);
    });

    // 1. Restore Channel
    if (config.channel) {
        selectedChannel = config.channel;
        $('#channel-select').val(selectedChannel);
    }

    // 2. Restore Fields (Decoding [[ ]] back to {{ }})
    if (config.messageTitle) $('#msg-title').val(decodeTags(config.messageTitle));
    if (config.messageTemplate) $('#msg-template').val(decodeTags(config.messageTemplate));

    // 3. Restore Images
    if (config.images) {
        // config.images might be a JSON string or array depending on how it was saved.
        // Assuming Array for cleanliness in this example.
        var imgs = Array.isArray(config.images) ? config.images : JSON.parse(config.images || "[]");
        imgs.forEach(url => addImageRow(url));
    }

    // 4. Restore Buttons
    if (config.buttons) {
        var btns = Array.isArray(config.buttons) ? config.buttons : JSON.parse(config.buttons || "[]");
        btns.forEach(btn => addButtonRow(btn));
    }

    // If we have a channel, we technically could jump to step 2,
    // but standard behavior is to start at step 1 or the saved step.
    // For simplicity, we start at step 1 but validate it immediately.
    validateStep1();
});

// Navigation Handler
connection.on('clickedNext', function() {
    if (currentStep === 1) {
        // Validation
        selectedChannel = $('#channel-select').val();
        if (!selectedChannel) {
            connection.trigger('updateButton', { button: 'next', enabled: false });
            return;
        }

        // Move to Step 2
        goToStep(2);
    } else {
        // We are on Step 2 -> Save and Close
        save();
    }
});

connection.on('clickedBack', function() {
    goToStep(1);
});

// --- FUNCTIONS ---

function buildArgument(key, value) {
    var result = {};
    result.name = key;
    result.value = value;
    console.log("Argument built");
    console.log(result);
    return result;
}

function goToStep(step) {
    currentStep = step;
    $('.step-container').removeClass('active');
    $('#step' + step).addClass('active');

    if (step === 1) {
        // UI: Show "Next", Hide "Back"
        connection.trigger('updateButton', { button: 'next', text: 'next', visible: true, enabled: true });
        connection.trigger('updateButton', { button: 'back', visible: false });
    } else {
        // Setup Step 2 UI based on Channel
        setupStep2UI();
        // UI: Show "Done", Show "Back"
        connection.trigger('updateButton', { button: 'next', text: 'done', visible: true });
        connection.trigger('updateButton', { button: 'back', visible: true });
    }
}

function validateStep1() {
    var val = $('#channel-select').val();
    connection.trigger('updateButton', { button: 'next', enabled: !!val });
}

function setupStep2UI() {
    // Reset Visibility
    $('#group-title, #group-images, #group-buttons').addClass('hidden');

    // Always show Template
    $('#group-template').removeClass('hidden');

    if (selectedChannel === 'sms') {
        // Just Template
    }
    else if (selectedChannel === 'viber') {
        $('#group-images').removeClass('hidden');
        $('#group-buttons').removeClass('hidden');
    }
    else if (selectedChannel === 'push') {
        $('#group-title').removeClass('hidden');
        $('#group-images').removeClass('hidden');
        $('#group-buttons').removeClass('hidden');
    }
}

// --- DYNAMIC WIDGETS ---

function addImageRow(value) {
    var $container = $('#image-list-container');
    var id = Date.now();

    var html = `
        <div class="dynamic-item" id="img-row-${id}">
            <div class="remove-btn" onclick="$('#img-row-${id}').remove()">Remove</div>
            <label class="slds-form-element__label">Image URL</label>
            <input type="text" class="slds-input img-input" value="${value}" placeholder="https://..." oninput="updatePreview(this)">
            <img src="${value}" class="img-preview ${value ? '' : 'hidden'}">
        </div>
    `;
    $container.append(html);
}

window.updatePreview = function(input) {
    var url = $(input).val();
    var $img = $(input).siblings('.img-preview');
    if(url) {
        $img.attr('src', url).removeClass('hidden');
    } else {
        $img.addClass('hidden');
    }
};

function addButtonRow(data) {
    var $container = $('#button-list-container');
    if ($container.children().length >= 2) {
        alert("Maximum 2 buttons allowed.");
        return;
    }

    var id = Date.now();
    var title = data.title || "";
    var url = data.url || "";
    var tracked = data.track ? "checked" : "";

    // Note: Title and URL inputs have class 'inject-target' so we can insert variables into them
    var html = `
        <div class="dynamic-item button-row" id="btn-row-${id}">
            <div class="remove-btn" onclick="$('#btn-row-${id}').remove()">Remove</div>

            <div class="slds-form-element">
                <label class="slds-form-element__label">Button Title</label>
                <input type="text" class="slds-input btn-title inject-target" value="${title}">
            </div>

            <div class="slds-form-element slds-m-top_x-small">
                <label class="slds-form-element__label">Button URL</label>
                <input type="text" class="slds-input btn-url inject-target" value="${url}">
            </div>

            <div class="slds-form-element slds-m-top_x-small">
                <label class="slds-checkbox">
                    <input type="checkbox" class="btn-track" ${tracked}>
                    <span class="slds-checkbox__label">
                        <span class="slds-checkbox_faux"></span>
                        <span class="slds-form-element__label">Track Clicks</span>
                    </span>
                </label>
            </div>
        </div>
    `;
    $container.append(html);
}

// --- FIELD INJECTION ---

function renderFields(fields) {
    var $list = $('#field-list');
    $list.empty();
    if (!fields.length) $list.html("No fields found.");

    $.each(fields, function(i, field) {
        var fieldName = field.name || field.key;
        if(fieldName.startsWith("_")) return;

        var $chip = $('<div class="field-chip"></div>').text(fieldName);
        $chip.click(function() {
            insertAtCursor(fieldName);
        });
        $list.append($chip);
    });
}

function insertAtCursor(text) {
    if (!lastFocusedElement) {
        // Default to message template if nothing clicked yet
        lastFocusedElement = $('#msg-template');
    }

    var $input = lastFocusedElement;
    var currentVal = $input.val();
    var start = $input[0].selectionStart || currentVal.length;
    var end = $input[0].selectionEnd || currentVal.length;

    var txtToAdd = "{{" + text + "}}";
    $input.val(currentVal.substring(0, start) + txtToAdd + currentVal.substring(end));
    $input.focus();
}

// --- SAVE / ENCODING ---

function encodeTags(str) {
    if(!str) return "";
    return str.replace(/{{/g, '[[').replace(/}}/g, ']]');
}

function decodeTags(str) {
    if(!str) return "";
    return str.replace(/\[\[/g, '{{').replace(/\]\]/g, '}}');
}

function save() {
    var inArgs = [];

    // 1. Channel
    inArgs.push(buildArgument("channel", selectedChannel));

    // 2. Common Fields
    var rawTemplate = $('#msg-template').val();
    inArgs.push(buildArgument("messageTemplate", encodeTags(rawTemplate)));

    // 3. Conditional Fields
    if (selectedChannel === 'push') {
        var rawTitle = $('#msg-title').val();
        inArgs.push(buildArgument("messageTitle", encodeTags(rawTitle)));
    }

    if (selectedChannel === 'viber' || selectedChannel === 'push') {
        // Collect Images
        var images = [];
        $('.img-input').each(function() {
            var val = $(this).val();
            if(val) images.push(val);
        });
        inArgs.push(buildArgument("images", images)); // Backend will receive List<String>

        // Collect Buttons
        var buttons = [];
        $('.button-row').each(function() {
            var $row = $(this);
            buttons.push({
                title: encodeTags($row.find('.btn-title').val()),
                url: encodeTags($row.find('.btn-url').val()),
                track: $row.find('.btn-track').is(':checked')
            });
        });
        inArgs.push(buildArgument("buttons", buttons));
        //inArgs.push({ "buttons": buttons }); // Backend will receive List<Map>
    }

    // 4. Schema Mapping (Data Binding)
    // We add all available schema fields to inArguments so SFMC resolves them if used in {{ }}
    $.each(schemaFields, function(i, field) {
        //var obj = {};
        //obj[field.name] = "{{" + field.key + "}}";
        inArgs.push(buildArgument(field.name, field.key));
    });

    // 5. Metadata
    if (journeyMeta.journeyName) inArgs.push(buildArgument("_journeyName", journeyMeta.journeyName));
    if (journeyMeta.journeyVersion) inArgs.push(buildArgument("_journeyVersion", journeyMeta.journeyVersion));

    // UPDATE PAYLOAD
    payload['arguments'].execute.inArguments = inArgs;
    payload['metaData'].isConfigured = true;

    console.log("Returning payload");
    console.log(payload);

    connection.trigger('updateActivity', payload);
}
