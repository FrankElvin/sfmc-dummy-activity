
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for AutomationSourceTypes</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="AutomationSourceTypes">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Unknown"/>
 *     <enumeration value="FileTrigger"/>
 *     <enumeration value="UserInterface"/>
 *     <enumeration value="UserAPI"/>
 *     <enumeration value="RESTApi"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AutomationSourceTypes")
@XmlEnum
public enum AutomationSourceTypes {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("FileTrigger")
    FILE_TRIGGER("FileTrigger"),
    @XmlEnumValue("UserInterface")
    USER_INTERFACE("UserInterface"),
    @XmlEnumValue("UserAPI")
    USER_API("UserAPI"),
    @XmlEnumValue("RESTApi")
    REST_API("RESTApi");
    private final String value;

    AutomationSourceTypes(String v) {
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
    public static AutomationSourceTypes fromValue(String v) {
        for (AutomationSourceTypes c: AutomationSourceTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
