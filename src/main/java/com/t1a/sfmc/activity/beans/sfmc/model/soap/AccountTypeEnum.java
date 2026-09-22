
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for AccountTypeEnum</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="AccountTypeEnum">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="None"/>
 *     <enumeration value="EXACTTARGET"/>
 *     <enumeration value="PRO_CONNECT"/>
 *     <enumeration value="CHANNEL_CONNECT"/>
 *     <enumeration value="CONNECT"/>
 *     <enumeration value="PRO_CONNECT_CLIENT"/>
 *     <enumeration value="LP_MEMBER"/>
 *     <enumeration value="DOTO_MEMBER"/>
 *     <enumeration value="ENTERPRISE_2"/>
 *     <enumeration value="BUSINESS_UNIT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AccountTypeEnum")
@XmlEnum
public enum AccountTypeEnum {

    @XmlEnumValue("None")
    NONE("None"),
    EXACTTARGET("EXACTTARGET"),
    PRO_CONNECT("PRO_CONNECT"),
    CHANNEL_CONNECT("CHANNEL_CONNECT"),
    CONNECT("CONNECT"),
    PRO_CONNECT_CLIENT("PRO_CONNECT_CLIENT"),
    LP_MEMBER("LP_MEMBER"),
    DOTO_MEMBER("DOTO_MEMBER"),
    ENTERPRISE_2("ENTERPRISE_2"),
    BUSINESS_UNIT("BUSINESS_UNIT");
    private final String value;

    AccountTypeEnum(String v) {
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
    public static AccountTypeEnum fromValue(String v) {
        for (AccountTypeEnum c: AccountTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
