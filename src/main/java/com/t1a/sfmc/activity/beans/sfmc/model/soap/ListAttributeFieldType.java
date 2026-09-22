
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for ListAttributeFieldType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ListAttributeFieldType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Text"/>
 *     <enumeration value="Number"/>
 *     <enumeration value="Date"/>
 *     <enumeration value="Boolean"/>
 *     <enumeration value="Decimal"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ListAttributeFieldType")
@XmlEnum
public enum ListAttributeFieldType {

    @XmlEnumValue("Text")
    TEXT("Text"),
    @XmlEnumValue("Number")
    NUMBER("Number"),
    @XmlEnumValue("Date")
    DATE("Date"),
    @XmlEnumValue("Boolean")
    BOOLEAN("Boolean"),
    @XmlEnumValue("Decimal")
    DECIMAL("Decimal");
    private final String value;

    ListAttributeFieldType(String v) {
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
    public static ListAttributeFieldType fromValue(String v) {
        for (ListAttributeFieldType c: ListAttributeFieldType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
