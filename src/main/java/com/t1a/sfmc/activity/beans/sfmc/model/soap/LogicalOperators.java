
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for LogicalOperators</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="LogicalOperators">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OR"/>
 *     <enumeration value="AND"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "LogicalOperators")
@XmlEnum
public enum LogicalOperators {

    OR,
    AND;

    public String value() {
        return name();
    }

    public static LogicalOperators fromValue(String v) {
        return valueOf(v);
    }

}
