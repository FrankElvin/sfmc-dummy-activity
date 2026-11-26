package com.t1a.sfmc.activity.sampling;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;

/** Jackson configured so numbers print the way JavaScript prints them (1627000.0000 → 1627000, 100.5 → 100.5). */
public final class Json {
    public static final ObjectMapper M = JsonMapper.builder()
            .enable(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)
            .enable(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN)
            .build();

    private Json() {}

    public static BigDecimal num(BigDecimal d) {
        d = d.stripTrailingZeros();
        return d.scale() < 0 ? d.setScale(0) : d;
    }

    public static BigDecimal num(JsonNode n) {
        return num(n.decimalValue());
    }

    /** JavaScript Number(string): null when not a finite number. */
    public static BigDecimal num(String s) {
        s = s.trim();
        if (s.isEmpty()) return null;
        try {
            return num(new BigDecimal(s));
        } catch (NumberFormatException e) {
            return null;
        }
    }

    static boolean isNull(JsonNode v) {
        return v == null || v.isNull() || v.isMissingNode();
    }

    /** JavaScript String(v): objects as compact JSON, numbers without trailing zeros. */
    static String display(JsonNode v) {
        if (isNull(v)) return "";
        if (v.isContainerNode()) return v.toString();
        if (v.isNumber()) return num(v).toPlainString();
        return v.asText();
    }

    /** What Date.parse accepts among ISO-looking strings: date, date-time, date-time with offset or Z. */
    static boolean isDate(String s) {
        s = s.trim();
        try {
            if (s.length() == 10) {
                LocalDate.parse(s);
                return true;
            }
            String t = s.replace(' ', 'T');
            try {
                OffsetDateTime.parse(t);
                return true;
            } catch (RuntimeException ignored) { /* try next form */ }
            LocalDateTime.parse(t);
            return true;
        } catch (RuntimeException e) {
            return false;
        }
    }

    public static JsonNode parse(String s) {
        try {
            return M.readTree(s);
        } catch (Exception e) {
            return null;
        }
    }

    public static String stringify(Object o) {
        try {
            return M.writeValueAsString(o);
        } catch (Exception e) {
            return String.valueOf(o);
        }
    }
}
