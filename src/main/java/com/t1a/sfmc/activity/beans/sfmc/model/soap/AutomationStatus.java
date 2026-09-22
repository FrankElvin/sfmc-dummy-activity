
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for AutomationStatus</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="AutomationStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Error"/>
 *     <enumeration value="BuildingError"/>
 *     <enumeration value="Building"/>
 *     <enumeration value="Ready"/>
 *     <enumeration value="Running"/>
 *     <enumeration value="Paused"/>
 *     <enumeration value="Stopped"/>
 *     <enumeration value="Scheduled"/>
 *     <enumeration value="AwaitingTrigger"/>
 *     <enumeration value="InactiveTrigger"/>
 *     <enumeration value="Skipped"/>
 *     <enumeration value="Unknown"/>
 *     <enumeration value="New"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AutomationStatus")
@XmlEnum
public enum AutomationStatus {

    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("BuildingError")
    BUILDING_ERROR("BuildingError"),
    @XmlEnumValue("Building")
    BUILDING("Building"),
    @XmlEnumValue("Ready")
    READY("Ready"),
    @XmlEnumValue("Running")
    RUNNING("Running"),
    @XmlEnumValue("Paused")
    PAUSED("Paused"),
    @XmlEnumValue("Stopped")
    STOPPED("Stopped"),
    @XmlEnumValue("Scheduled")
    SCHEDULED("Scheduled"),
    @XmlEnumValue("AwaitingTrigger")
    AWAITING_TRIGGER("AwaitingTrigger"),
    @XmlEnumValue("InactiveTrigger")
    INACTIVE_TRIGGER("InactiveTrigger"),
    @XmlEnumValue("Skipped")
    SKIPPED("Skipped"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("New")
    NEW("New");
    private final String value;

    AutomationStatus(String v) {
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
    public static AutomationStatus fromValue(String v) {
        for (AutomationStatus c: AutomationStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
