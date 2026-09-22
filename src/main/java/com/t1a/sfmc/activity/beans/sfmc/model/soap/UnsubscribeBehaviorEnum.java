
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for UnsubscribeBehaviorEnum</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="UnsubscribeBehaviorEnum">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ENTIRE_ENTERPRISE"/>
 *     <enumeration value="BUSINESS_UNIT_ONLY"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UnsubscribeBehaviorEnum")
@XmlEnum
public enum UnsubscribeBehaviorEnum {

    ENTIRE_ENTERPRISE,
    BUSINESS_UNIT_ONLY;

    public String value() {
        return name();
    }

    public static UnsubscribeBehaviorEnum fromValue(String v) {
        return valueOf(v);
    }

}
