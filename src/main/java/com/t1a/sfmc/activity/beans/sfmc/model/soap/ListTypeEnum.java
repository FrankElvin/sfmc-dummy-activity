
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for ListTypeEnum</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ListTypeEnum">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Public"/>
 *     <enumeration value="Private"/>
 *     <enumeration value="SalesForce"/>
 *     <enumeration value="GlobalUnsubscribe"/>
 *     <enumeration value="Master"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ListTypeEnum")
@XmlEnum
public enum ListTypeEnum {

    @XmlEnumValue("Public")
    PUBLIC("Public"),
    @XmlEnumValue("Private")
    PRIVATE("Private"),
    @XmlEnumValue("SalesForce")
    SALES_FORCE("SalesForce"),
    @XmlEnumValue("GlobalUnsubscribe")
    GLOBAL_UNSUBSCRIBE("GlobalUnsubscribe"),
    @XmlEnumValue("Master")
    MASTER("Master");
    private final String value;

    ListTypeEnum(String v) {
        value = v;
    }

    /**
     * Gets the value associated to the enum constant.
     * 
     * @return
     *     The value linked to the enum.
     */
    public String value() {
        return value;
    }

    /**
     * Gets the enum associated to the value passed as parameter.
     * 
     * @param v
     *     The value to get the enum from.
     * @return
     *     The enum which corresponds to the value, if it exists.
     * @throws IllegalArgumentException
     *     If no value matches in the enum declaration.
     */
    public static ListTypeEnum fromValue(String v) {
        for (ListTypeEnum c: ListTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
