
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for SoapType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="SoapType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="xsd:string"/>
 *     <enumeration value="xsd:boolean"/>
 *     <enumeration value="xsd:double"/>
 *     <enumeration value="xsd:dateTime"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SoapType")
@XmlEnum
public enum SoapType {

    @XmlEnumValue("xsd:string")
    XSD_STRING("xsd:string"),
    @XmlEnumValue("xsd:boolean")
    XSD_BOOLEAN("xsd:boolean"),
    @XmlEnumValue("xsd:double")
    XSD_DOUBLE("xsd:double"),
    @XmlEnumValue("xsd:dateTime")
    XSD_DATE_TIME("xsd:dateTime");
    private final String value;

    SoapType(String v) {
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
    public static SoapType fromValue(String v) {
        for (SoapType c: SoapType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
