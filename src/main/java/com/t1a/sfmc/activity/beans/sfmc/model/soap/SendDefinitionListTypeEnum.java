
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for SendDefinitionListTypeEnum</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="SendDefinitionListTypeEnum">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SourceList"/>
 *     <enumeration value="ExclusionList"/>
 *     <enumeration value="DomainExclusion"/>
 *     <enumeration value="OptOutList"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SendDefinitionListTypeEnum")
@XmlEnum
public enum SendDefinitionListTypeEnum {

    @XmlEnumValue("SourceList")
    SOURCE_LIST("SourceList"),
    @XmlEnumValue("ExclusionList")
    EXCLUSION_LIST("ExclusionList"),
    @XmlEnumValue("DomainExclusion")
    DOMAIN_EXCLUSION("DomainExclusion"),
    @XmlEnumValue("OptOutList")
    OPT_OUT_LIST("OptOutList");
    private final String value;

    SendDefinitionListTypeEnum(String v) {
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
    public static SendDefinitionListTypeEnum fromValue(String v) {
        for (SendDefinitionListTypeEnum c: SendDefinitionListTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
