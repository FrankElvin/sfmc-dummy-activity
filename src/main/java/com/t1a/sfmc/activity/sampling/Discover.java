package com.t1a.sfmc.activity.sampling;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.*;
import java.util.regex.Pattern;

/** Fields of a JSON column, collected from sample rows of the Entry DE. */
public final class Discover {
    private static final Pattern NON_WORD = Pattern.compile("[^A-Za-z0-9_]+");
    private static final Pattern IDENT = Pattern.compile("^[A-Za-z_]\\w*$");
    private static final Pattern DATE_PREFIX = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}");
    private static final Pattern EMAIL = Pattern.compile("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$");
    private static final Pattern PHONE = Pattern.compile("^\\+\\d{7,15}$");
    private static final Set<String> NUM = Set.of("Number", "Decimal");

    public static final class Field {
        String path;
        String name;
        String type; // null while undecided
        List<String> values;

        Field(String path, String name, String type, List<String> values) {
            this.path = path; this.name = name; this.type = type; this.values = values;
        }

        public Map<String, Object> toMap() {
            Map<String, Object> m = new LinkedHashMap<>();
            m.put("path", path); m.put("name", name); m.put("type", type); m.put("values", values);
            return m;
        }
    }

    public record Column(String column, List<Field> fields) {
        public Map<String, Object> toMap() {
            Map<String, Object> m = new LinkedHashMap<>();
            m.put("column", column);
            m.put("fields", fields.stream().map(Field::toMap).toList());
            return m;
        }
    }

    private Discover() {}

    /**
     * rows are raw values of one JSON column from several DE rows. Fields are collected from every row
     * (arrays: element [0] of each row); the type is Text if rows disagree or no row has a value.
     */
    static List<Field> discover(List<JsonNode> rows) {
        List<JsonNode> docs = new ArrayList<>();
        if (rows != null) for (JsonNode r : rows) { JsonNode d = Flattener.parse(r); if (d != null) docs.add(d); }
        Map<String, Field> fields = new LinkedHashMap<>();
        Set<String> names = new HashSet<>();
        for (JsonNode d : docs) walk(d, "$", "", fields, names, docs);
        List<Field> list = new ArrayList<>(fields.values());
        // a key that is null in one row and an object in another is not a field of its own
        List<Field> result = new ArrayList<>();
        for (Field f : list) {
            boolean parentOfOther = list.stream().anyMatch(o -> o.path.startsWith(f.path + ".") || o.path.startsWith(f.path + "["));
            if (f.type == null && parentOfOther) continue;
            if (f.type == null) f.type = "Text";
            result.add(f);
        }
        return result;
    }

    /**
     * Every nested JSON below the root is a list (a related record is 0..n in the source system; an object is one item):
     * a count row `Key.length` and the first item's fields `Key[0].x`, the same for an object and an array. The root is a
     * list only when it is an array.
     */
    private static void walk(JsonNode node, String path, String key, Map<String, Field> fields, Set<String> names, List<JsonNode> docs) {
        boolean list = node != null && node.isContainerNode() && !path.endsWith("[0]") && (!path.equals("$") || node.isArray());
        if (list) {
            push(path + ".length", key.isEmpty() ? "count" : key + "_count", "Number", fields, names, docs);
            JsonNode first = node.isArray() ? (node.isEmpty() ? null : node.get(0)) : node;
            if (first != null) walk(first, path + "[0]", key, fields, names, docs);
        } else if (node != null && node.isObject()) {
            for (Iterator<String> it = node.fieldNames(); it.hasNext(); ) {
                String k = it.next();
                walk(node.get(k), path + accessor(k), key.isEmpty() ? k : key + "_" + k, fields, names, docs); // Task_Home.Id → Task_Home_Id
            }
        } else {
            push(path, key, typeOf(node), fields, names, docs);
        }
    }

    private static void push(String path, String key, String type, Map<String, Field> fields, Set<String> names, List<JsonNode> docs) {
        Field seen = fields.get(path);
        if (seen != null) { seen.type = merge(seen.type, type); return; }
        String name = NON_WORD.matcher(String.valueOf(key)).replaceAll("_").replaceAll("^_+|_+$", "");
        if (name.isEmpty()) name = "field";
        if (Character.isDigit(name.charAt(0))) name = "_" + name;
        for (int i = 2; names.contains(name); i++) name = name.replaceFirst("(_\\d+)?$", "_" + i);
        names.add(name);
        List<String> values = new ArrayList<>();
        for (JsonNode d : docs) {
            JsonNode v = Flattener.extract(d, path);
            values.add(v != null && v.isTextual() ? v.toString() : Json.display(v)); // strings as in the JSON: "6", not 6
        }
        fields.put(path, new Field(path, name, type, values));
    }

    /** Only columns holding JSON. Attribute names are unique across columns: a repeated name gets its column as a prefix. */
    public static List<Column> discoverColumns(List<Map<String, JsonNode>> rows) {
        Set<String> taken = new HashSet<>();
        Set<String> columns = new LinkedHashSet<>();
        for (Map<String, JsonNode> r : rows) columns.addAll(r.keySet());
        List<Column> result = new ArrayList<>();
        for (String column : columns) {
            List<JsonNode> values = new ArrayList<>();
            for (Map<String, JsonNode> r : rows) values.add(r.get(column));
            List<Field> fields = discover(values);
            String prefix = NON_WORD.matcher(column).replaceAll("_");
            for (Field f : fields) {
                if (f.path.equals("$.length")) f.name = prefix + "_count";
                else if (taken.contains(f.name.toLowerCase())) f.name = prefix + "_" + f.name;
                taken.add(f.name.toLowerCase());
            }
            if (!fields.isEmpty()) result.add(new Column(column, fields));
        }
        return result;
    }

    private static String merge(String a, String b) {
        if ((a == null && b == null) || (a != null && a.equals(b)) || b == null) return a;
        if (a == null) return b;
        return NUM.contains(a) && NUM.contains(b) ? "Decimal" : "Text";
    }

    private static String accessor(String k) {
        return IDENT.matcher(k).matches() ? "." + k : "[\"" + k.replace("\"", "\\\"") + "\"]";
    }

    static String typeOf(JsonNode v) {
        if (Json.isNull(v)) return null;
        if (v.isNumber()) return Json.num(v).scale() <= 0 ? "Number" : "Decimal"; // JB Number is a whole number
        if (v.isBoolean()) return "Boolean";
        if (v.isTextual()) {
            String s = v.asText();
            if (DATE_PREFIX.matcher(s).find() && Json.isDate(s)) return "Date";
            if (EMAIL.matcher(s).matches()) return "Email";
            if (PHONE.matcher(s).matches()) return "Phone";
        }
        return "Text";
    }
}
