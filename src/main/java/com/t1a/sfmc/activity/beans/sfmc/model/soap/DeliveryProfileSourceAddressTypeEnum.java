
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for DeliveryProfileSourceAddressTypeEnum</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="DeliveryProfileSourceAddressTypeEnum">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DefaultPrivateIPAddress"/>
 *     <enumeration value="CustomPrivateIPAddress"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DeliveryProfileSourceAddressTypeEnum")
@XmlEnum
public enum DeliveryProfileSourceAddressTypeEnum {

    @XmlEnumValue("DefaultPrivateIPAddress")
    DEFAULT_PRIVATE_IP_ADDRESS("DefaultPrivateIPAddress"),
    @XmlEnumValue("CustomPrivateIPAddress")
    CUSTOM_PRIVATE_IP_ADDRESS("CustomPrivateIPAddress");
    private final String value;

    DeliveryProfileSourceAddressTypeEnum(String v) {
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
    public static DeliveryProfileSourceAddressTypeEnum fromValue(String v) {
        for (DeliveryProfileSourceAddressTypeEnum c: DeliveryProfileSourceAddressTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
