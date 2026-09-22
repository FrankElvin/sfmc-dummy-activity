
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for ImportDefinitionUpdateType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ImportDefinitionUpdateType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AddAndUpdate"/>
 *     <enumeration value="AddAndDoNotUpdate"/>
 *     <enumeration value="UpdateButDoNotAdd"/>
 *     <enumeration value="Merge"/>
 *     <enumeration value="Overwrite"/>
 *     <enumeration value="ColumnBased"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ImportDefinitionUpdateType")
@XmlEnum
public enum ImportDefinitionUpdateType {

    @XmlEnumValue("AddAndUpdate")
    ADD_AND_UPDATE("AddAndUpdate"),
    @XmlEnumValue("AddAndDoNotUpdate")
    ADD_AND_DO_NOT_UPDATE("AddAndDoNotUpdate"),
    @XmlEnumValue("UpdateButDoNotAdd")
    UPDATE_BUT_DO_NOT_ADD("UpdateButDoNotAdd"),
    @XmlEnumValue("Merge")
    MERGE("Merge"),
    @XmlEnumValue("Overwrite")
    OVERWRITE("Overwrite"),
    @XmlEnumValue("ColumnBased")
    COLUMN_BASED("ColumnBased");
    private final String value;

    ImportDefinitionUpdateType(String v) {
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
    public static ImportDefinitionUpdateType fromValue(String v) {
        for (ImportDefinitionUpdateType c: ImportDefinitionUpdateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
