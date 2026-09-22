
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for DataExtensionFieldStorageType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="DataExtensionFieldStorageType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Unspecified"/>
 *     <enumeration value="Plain"/>
 *     <enumeration value="Obfuscated"/>
 *     <enumeration value="Encrypted"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DataExtensionFieldStorageType")
@XmlEnum
public enum DataExtensionFieldStorageType {

    @XmlEnumValue("Unspecified")
    UNSPECIFIED("Unspecified"),
    @XmlEnumValue("Plain")
    PLAIN("Plain"),
    @XmlEnumValue("Obfuscated")
    OBFUSCATED("Obfuscated"),
    @XmlEnumValue("Encrypted")
    ENCRYPTED("Encrypted");
    private final String value;

    DataExtensionFieldStorageType(String v) {
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
    public static DataExtensionFieldStorageType fromValue(String v) {
        for (DataExtensionFieldStorageType c: DataExtensionFieldStorageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
