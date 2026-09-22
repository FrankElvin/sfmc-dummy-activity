
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for TriggeredSendClassEnum</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="TriggeredSendClassEnum">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Standard"/>
 *     <enumeration value="SMTPRestV1"/>
 *     <enumeration value="SMTPRestV2"/>
 *     <enumeration value="SMTPRestV3"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TriggeredSendClassEnum")
@XmlEnum
public enum TriggeredSendClassEnum {

    @XmlEnumValue("Standard")
    STANDARD("Standard"),
    @XmlEnumValue("SMTPRestV1")
    SMTP_REST_V_1("SMTPRestV1"),
    @XmlEnumValue("SMTPRestV2")
    SMTP_REST_V_2("SMTPRestV2"),
    @XmlEnumValue("SMTPRestV3")
    SMTP_REST_V_3("SMTPRestV3");
    private final String value;

    TriggeredSendClassEnum(String v) {
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
    public static TriggeredSendClassEnum fromValue(String v) {
        for (TriggeredSendClassEnum c: TriggeredSendClassEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
