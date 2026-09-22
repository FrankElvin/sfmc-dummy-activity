
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for EventType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="EventType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Open"/>
 *     <enumeration value="Click"/>
 *     <enumeration value="HardBounce"/>
 *     <enumeration value="SoftBounce"/>
 *     <enumeration value="OtherBounce"/>
 *     <enumeration value="Unsubscribe"/>
 *     <enumeration value="Sent"/>
 *     <enumeration value="NotSent"/>
 *     <enumeration value="Survey"/>
 *     <enumeration value="ForwardedEmail"/>
 *     <enumeration value="ForwardedEmailOptIn"/>
 *     <enumeration value="DeliveredEvent"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EventType")
@XmlEnum
public enum EventType {

    @XmlEnumValue("Open")
    OPEN("Open"),
    @XmlEnumValue("Click")
    CLICK("Click"),
    @XmlEnumValue("HardBounce")
    HARD_BOUNCE("HardBounce"),
    @XmlEnumValue("SoftBounce")
    SOFT_BOUNCE("SoftBounce"),
    @XmlEnumValue("OtherBounce")
    OTHER_BOUNCE("OtherBounce"),
    @XmlEnumValue("Unsubscribe")
    UNSUBSCRIBE("Unsubscribe"),
    @XmlEnumValue("Sent")
    SENT("Sent"),
    @XmlEnumValue("NotSent")
    NOT_SENT("NotSent"),
    @XmlEnumValue("Survey")
    SURVEY("Survey"),
    @XmlEnumValue("ForwardedEmail")
    FORWARDED_EMAIL("ForwardedEmail"),
    @XmlEnumValue("ForwardedEmailOptIn")
    FORWARDED_EMAIL_OPT_IN("ForwardedEmailOptIn"),
    @XmlEnumValue("DeliveredEvent")
    DELIVERED_EVENT("DeliveredEvent");
    private final String value;

    EventType(String v) {
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
    public static EventType fromValue(String v) {
        for (EventType c: EventType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
