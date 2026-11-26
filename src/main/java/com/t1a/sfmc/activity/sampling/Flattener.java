package com.t1a.sfmc.activity.sampling;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Option;
import com.jayway.jsonpath.spi.json.JacksonJsonNodeJsonProvider;
import com.jayway.jsonpath.spi.mapper.JacksonMappingProvider;

import java.math.BigDecimal;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Port of src/flatten.js. Fixed fallback slots (spec §3), declared in public/v1/config.json.
 * Journey Builder has no "no value" for an outArgument: null fails the activity for every contact, a missing key
 * fails that contact. So a missing value is sent as "" / 0 / "False", like an empty DE column would be, and the
 * results DE gets an explicit null. A Decision Split on a Date whose value is "" is a platform Hard Error.
 */
public final class Flattener {
    public static final Map<String, Object> DEFAULTS;
    static {
        Map<String, Object> d = new LinkedHashMap<>();
        d.put("OutText1", ""); d.put("OutText2", ""); d.put("OutText3", "");
        d.put("OutNumber1", BigDecimal.ZERO); d.put("OutNumber2", BigDecimal.ZERO);
        d.put("OutDate1", "");
        d.put("OutFound", "0");
        DEFAULTS = Collections.unmodifiableMap(d); // keeps insertion order: the response keys come out in this order
    }
    private static final Pattern NAME_RE = Pattern.compile("^[A-Za-z_]\\w*$");
    private static final Pattern DATE_RE = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}(T\\S+)?$");
    private static final Pattern DOT_QUOTED = Pattern.compile("\\.(\"[^\"]*\")");
    private static final Pattern DQ_BRACKET = Pattern.compile("\\[\"((?:[^\"\\\\]|\\\\.)*)\"\\]");
    private static final Configuration CONF = Configuration.builder()
            .jsonProvider(new JacksonJsonNodeJsonProvider(Json.M))
            .mappingProvider(new JacksonMappingProvider(Json.M))
            .options(Option.SUPPRESS_EXCEPTIONS)
            .build();

    public record Result(Map<String, Object> out, List<String> missing) {}

    private Flattener() {}

    public static Map<String, Object> defaults() {
        return new LinkedHashMap<>(DEFAULTS);
    }

    /** JSON.parse that yields an object or array; anything else is "no JSON". */
    static JsonNode parse(JsonNode jsonInput) {
        if (jsonInput == null || !jsonInput.isTextual()) return null;
        JsonNode json = Json.parse(jsonInput.asText());
        return json != null && json.isContainerNode() ? json : null;
    }

    private static final Pattern SIMPLE_STEP = Pattern.compile("\\G(?:\\[(\\d+)\\]|\\.length$|\\.([A-Za-z_$][\\w$]*)|\\['((?:[^'\\\\]|\\\\.)*)'\\])");

    /**
     * First match of a JSONPath, or null. Accepts the spec's ."key with space" form.
     * Paths the modal produces ($, [n], .key, ['key'], .length) are walked here with one tolerance: a key on an array reads
     * item [0], and [0] on an object is the object itself, so a field that is an object in one row and an array in another
     * is one field. Anything else (.., filters) goes to Jayway.
     */
    static JsonNode extract(JsonNode json, String path) {
        String p = normalize(path);
        try {
            if (p.startsWith("$")) {
                JsonNode walked = walk(json, p);
                if (walked != NOT_SIMPLE) return walked;
            }
            if (p.endsWith(".length")) p = p + "()";
            JsonNode node = read(json, p);
            if (node == null) return null;
            // the JS code does `Array.isArray(value) ? value[0] : value`
            if (node.isArray()) return node.isEmpty() ? null : node.get(0);
            return node;
        } catch (RuntimeException e) {
            return null;
        }
    }

    /** ."key" → ['key'] and ["key"] → ['key']: the bracket form Jayway and the walker share. */
    static String normalize(String path) {
        String p = DOT_QUOTED.matcher(String.valueOf(path)).replaceAll("[$1]");
        Matcher m = DQ_BRACKET.matcher(p);
        StringBuilder sb = new StringBuilder();
        while (m.find()) m.appendReplacement(sb, Matcher.quoteReplacement("['" + m.group(1).replace("\\\"", "\"").replace("'", "\\'") + "']"));
        m.appendTail(sb);
        return sb.toString();
    }

    private static final JsonNode NOT_SIMPLE = Json.M.getNodeFactory().textNode("not a simple path");

    private static JsonNode walk(JsonNode json, String p) {
        return walk(json, p, true);
    }

    /** collapse=false returns a leaf array itself (the list a mapping aggregates over) instead of its first item. */
    private static JsonNode walk(JsonNode json, String p, boolean collapse) {
        JsonNode node = json;
        Matcher m = SIMPLE_STEP.matcher(p);
        int at = 1;
        while (at < p.length()) {
            if (!m.find(at) || m.start() != at) return NOT_SIMPLE;
            at = m.end();
            if (node == null || node.isNull()) return null;
            if (m.group(1) != null) { // [n]
                int i = Integer.parseInt(m.group(1));
                node = node.isArray() ? (i < node.size() ? node.get(i) : null) : i == 0 ? node : null;
            } else if (m.group(2) == null && m.group(3) == null) { // .length: arrays and strings have one; an object is one item
                if (node.isArray()) return Json.M.getNodeFactory().numberNode(node.size());
                if (node.isTextual()) return Json.M.getNodeFactory().numberNode(node.asText().length());
                return node.isObject() ? Json.M.getNodeFactory().numberNode(1) : null;
            } else {
                String key = m.group(2) != null ? m.group(2) : m.group(3).replace("\\'", "'").replace("\\\\", "\\");
                if (node.isArray()) node = node.isEmpty() ? null : node.get(0);
                node = node == null || !node.isObject() ? null : node.get(key);
            }
        }
        if (node == null || node.isNull()) return null;
        if (collapse && node.isArray()) return node.isEmpty() ? null : node.get(0); // leaf array: first item, like the JS code
        return node;
    }

    static final List<String> AGGS = List.of("first", "last", "min", "max", "sum");
    private static final Pattern LIST_STEP = Pattern.compile("\\[(\\d+)\\](?=.)");

    /**
     * The value of a path for every item of its nearest enclosing list ($[0].Task_Home[0].Status → one value per task;
     * an object counts as one item). A path without a list step, or one Jayway handles, gives the single extract().
     */
    static List<JsonNode> extractAll(JsonNode json, String path) {
        String p = normalize(path);
        Matcher m = LIST_STEP.matcher(p);
        int start = -1, end = -1;
        while (m.find()) { start = m.start(); end = m.end(); }
        List<JsonNode> single = new ArrayList<>();
        single.add(extract(json, path));
        if (start < 0 || !p.startsWith("$")) return single;
        JsonNode container;
        try {
            container = walk(json, p.substring(0, start), false);
        } catch (RuntimeException e) {
            return single;
        }
        if (container == NOT_SIMPLE) return single;
        if (container == null || container.isNull()) return List.of();
        String rest = "$" + p.substring(end);
        List<JsonNode> values = new ArrayList<>();
        if (container.isArray()) for (JsonNode item : container) values.add(extract(item, rest));
        else values.add(extract(container, rest));
        return values;
    }

    /**
     * first/last/min/max/sum over the coerced item values; absent/empty items are skipped, a present but unparsable item
     * makes min/max/sum missing (a partial sum would be silently wrong); sum is for Number/Decimal only.
     */
    static Object aggregate(List<JsonNode> raw, String agg, String type) {
        List<Object> values = new ArrayList<>();
        for (JsonNode v : raw) {
            if (Json.isNull(v) || (v.isTextual() && v.asText().trim().isEmpty())) continue;
            Object c = coerce(v, type);
            if (c == null) { if (!"last".equals(agg)) return null; else continue; }
            values.add(c);
        }
        if (values.isEmpty()) return null;
        boolean numeric = "Number".equals(type) || "Decimal".equals(type);
        switch (agg) {
            case "last": return values.get(values.size() - 1);
            case "sum": {
                if (!numeric) return null;
                BigDecimal sum = BigDecimal.ZERO;
                for (Object v : values) sum = sum.add((BigDecimal) v);
                return Json.num(sum);
            }
            case "min": case "max": {
                Object best = values.get(0);
                for (Object v : values) {
                    int cmp = compare(v, best, type);
                    if ("min".equals(agg) ? cmp < 0 : cmp > 0) best = v;
                }
                return best;
            }
            default: return values.get(0);
        }
    }

    private static int compare(Object a, Object b, String type) {
        if (a instanceof BigDecimal x && b instanceof BigDecimal y) return x.compareTo(y);
        if ("Date".equals(type)) return instant((String) a).compareTo(instant((String) b)); // offsets compared as moments, not as strings
        return String.valueOf(a).compareTo(String.valueOf(b));
    }

    private static java.time.Instant instant(String s) {
        String t = s.trim().replace(' ', 'T');
        try { return java.time.OffsetDateTime.parse(t).toInstant(); } catch (RuntimeException ignored) {}
        try { return java.time.LocalDateTime.parse(t).toInstant(java.time.ZoneOffset.UTC); } catch (RuntimeException ignored) {}
        return java.time.LocalDate.parse(t.length() > 10 ? t.substring(0, 10) : t).atStartOfDay(java.time.ZoneOffset.UTC).toInstant();
    }

    /** The mapping's value: the item path as before, or an aggregate over the enclosing list when `agg` says so. */
    static Object value(JsonNode json, JsonNode m) {
        String path = text(m, "path");
        String type = text(m, "type");
        String agg = text(m, "agg");
        if (agg == null || "first".equals(agg) || !AGGS.contains(agg) || path.endsWith(".length")) return coerce(extract(json, path), type);
        return aggregate(extractAll(json, path), agg, type);
    }

    /** The node at a Jayway path, or null; an indefinite path gives its first match (jsonpath-plus wrap:false). */
    private static JsonNode read(JsonNode json, String p) {
        JsonPath jp = JsonPath.compile(p);
        Object v = jp.read(json, CONF);
        if (v == null) return null;
        JsonNode node = v instanceof JsonNode n ? n : Json.M.valueToTree(v);
        if (!jp.isDefinite()) {
            ArrayNode matches = (ArrayNode) node;
            if (matches.isEmpty()) return null;
            node = matches.size() == 1 ? matches.get(0) : matches;
        }
        return node;
    }

    /** Value for the declared type, or null when the value is missing (absent, null, empty, unparsable). */
    static Object coerce(JsonNode value, String type) {
        if (Json.isNull(value)) return null;
        if ("Number".equals(type) || "Decimal".equals(type)) {
            if (value.isNumber()) return Json.num(value);
            if (value.isBoolean()) return value.asBoolean() ? BigDecimal.ONE : BigDecimal.ZERO; // Number(true) === 1
            if (value.isContainerNode()) return null;
            return Json.num(value.asText());
        }
        if ("Boolean".equals(type)) {
            String s = Json.display(value).trim().toLowerCase();
            // SFMC Boolean is the string True/False
            BigDecimal n = Json.num(s);
            return s.equals("true") || s.equals("yes") || s.equals("y") || (n != null && n.compareTo(BigDecimal.ONE) == 0) ? "True" : "False";
        }
        if ("Date".equals(type)) {
            // ISO only: Date.parse would also accept "11/30/2026" or "1", which JB then cannot read as a Date
            String s = Json.display(value).trim();
            return DATE_RE.matcher(s).matches() && Json.isDate(s) ? s : null;
        }
        String s = Json.display(value);
        return s.trim().isEmpty() ? null : s; // empty text is a missing value, like an empty DE column
    }

    static Object defaultFor(String type) {
        return "Number".equals(type) || "Decimal".equals(type) ? BigDecimal.ZERO : "Boolean".equals(type) ? "False" : "";
    }

    public static String text(JsonNode node, String field) {
        JsonNode v = node == null ? null : node.get(field);
        return Json.isNull(v) ? null : v.isTextual() ? v.asText() : Json.display(v);
    }

    private static boolean truthy(JsonNode node, String field) {
        return truthy(node == null ? null : node.get(field));
    }

    /** JavaScript truthiness: null, false, 0, "" are falsy, everything else is truthy. */
    private static boolean truthy(JsonNode v) {
        if (Json.isNull(v)) return false;
        if (v.isTextual()) return !v.asText().isEmpty();
        if (v.isNumber()) return v.decimalValue().signum() != 0;
        if (v.isBoolean()) return v.asBoolean();
        return true;
    }

    private static boolean isSlot(String slot) {
        return slot != null && DEFAULTS.containsKey(slot) && !slot.equals("OutFound");
    }

    /**
     * flatten(jsonInput, mappings: [{out, path, type, slot?}], missing) → always the 7 fixed keys plus one key per custom
     * `out` name; `slot` (OutText1…), set by older saved configurations, gets a copy of the value. Never throws.
     * `missing` collects the `out` names that got no value and kept their default.
     */
    static Map<String, Object> flatten(JsonNode jsonInput, JsonNode mappings, Set<String> missing) {
        Map<String, Object> out = defaults();
        List<JsonNode> list = new ArrayList<>();
        if (mappings != null && mappings.isArray()) {
            for (JsonNode m : mappings) {
                if (m == null || m.isNull() || !truthy(m, "path")) continue;
                String name = text(m, "out");
                if (name == null || !NAME_RE.matcher(name).matches() || name.equals("OutFound")) continue;
                list.add(m);
            }
        }
        // every declared custom name is always present (JB rejects missing/null outArguments)
        for (JsonNode m : list) {
            out.put(text(m, "out"), defaultFor(text(m, "type")));
            missing.add(text(m, "out"));
        }
        JsonNode json = parse(jsonInput);
        if (json == null) return out;

        boolean found = false;
        for (JsonNode m : list) {
            Object coerced = value(json, m);
            if (coerced == null) continue;
            String name = text(m, "out");
            missing.remove(name);
            out.put(name, coerced);
            String slot = text(m, "slot");
            if (isSlot(slot)) out.put(slot, coerced);
            found = true;
        }
        out.put("OutFound", found ? "1" : "0");
        return out;
    }

    static Map<String, Object> flatten(String jsonInput, JsonNode mappings) {
        return flatten(jsonInput == null ? null : Json.M.getNodeFactory().textNode(jsonInput), mappings, new LinkedHashSet<>());
    }

    /**
     * flattenAll(args, mappings): each mapping reads the inArgument named by its `arg` (several JSON columns,
     * one inArgument each); mappings without `arg` read jsonInput. OutFound = any column gave a value.
     */
    public static Result flattenAll(JsonNode args, JsonNode mappings) {
        List<JsonNode> list = new ArrayList<>();
        if (mappings != null && mappings.isArray()) {
            for (JsonNode m : mappings) if (truthy(m)) list.add(m); // JS filter(Boolean)
        }
        Map<String, Object> out = defaults();
        Set<String> missing = new LinkedHashSet<>();
        Set<String> argNames = new LinkedHashSet<>();
        for (JsonNode m : list) argNames.add(argOf(m));
        for (String arg : argNames) {
            List<JsonNode> group = new ArrayList<>();
            for (JsonNode m : list) if (argOf(m).equals(arg)) group.add(m);
            Map<String, Object> part = flatten(args == null ? null : args.get(arg), Json.M.valueToTree(group), missing);
            for (JsonNode m : group) {
                String name = text(m, "out");
                if (name != null && part.containsKey(name)) out.put(name, part.get(name));
                String slot = text(m, "slot");
                if (isSlot(slot)) out.put(slot, part.get(slot));
            }
            if ("1".equals(part.get("OutFound"))) out.put("OutFound", "1");
        }
        return new Result(out, new ArrayList<>(missing));
    }

    private static String argOf(JsonNode m) {
        return truthy(m, "arg") ? text(m, "arg") : "jsonInput";
    }
}
