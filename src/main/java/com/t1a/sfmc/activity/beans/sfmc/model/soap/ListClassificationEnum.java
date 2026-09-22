
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for ListClassificationEnum</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ListClassificationEnum">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ExactTargetList"/>
 *     <enumeration value="PublicationList"/>
 *     <enumeration value="SuppressionList"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ListClassificationEnum")
@XmlEnum
public enum ListClassificationEnum {

    @XmlEnumValue("ExactTargetList")
    EXACT_TARGET_LIST("ExactTargetList"),
    @XmlEnumValue("PublicationList")
    PUBLICATION_LIST("PublicationList"),
    @XmlEnumValue("SuppressionList")
    SUPPRESSION_LIST("SuppressionList");
    private final String value;

    ListClassificationEnum(String v) {
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
    public static ListClassificationEnum fromValue(String v) {
        for (ListClassificationEnum c: ListClassificationEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
