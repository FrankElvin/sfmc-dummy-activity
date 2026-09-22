
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for SaveAction</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="SaveAction">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AddOnly"/>
 *     <enumeration value="Default"/>
 *     <enumeration value="Nothing"/>
 *     <enumeration value="UpdateAdd"/>
 *     <enumeration value="UpdateOnly"/>
 *     <enumeration value="Delete"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SaveAction")
@XmlEnum
public enum SaveAction {

    @XmlEnumValue("AddOnly")
    ADD_ONLY("AddOnly"),
    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Nothing")
    NOTHING("Nothing"),
    @XmlEnumValue("UpdateAdd")
    UPDATE_ADD("UpdateAdd"),
    @XmlEnumValue("UpdateOnly")
    UPDATE_ONLY("UpdateOnly"),
    @XmlEnumValue("Delete")
    DELETE("Delete");
    private final String value;

    SaveAction(String v) {
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
    public static SaveAction fromValue(String v) {
        for (SaveAction c: SaveAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
