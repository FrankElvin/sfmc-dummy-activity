
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for SimpleOperators</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="SimpleOperators">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="equals"/>
 *     <enumeration value="notEquals"/>
 *     <enumeration value="greaterThan"/>
 *     <enumeration value="lessThan"/>
 *     <enumeration value="isNull"/>
 *     <enumeration value="isNotNull"/>
 *     <enumeration value="greaterThanOrEqual"/>
 *     <enumeration value="lessThanOrEqual"/>
 *     <enumeration value="between"/>
 *     <enumeration value="IN"/>
 *     <enumeration value="like"/>
 *     <enumeration value="existsInString"/>
 *     <enumeration value="existsInStringAsAWord"/>
 *     <enumeration value="notExistsInString"/>
 *     <enumeration value="beginsWith"/>
 *     <enumeration value="endsWith"/>
 *     <enumeration value="contains"/>
 *     <enumeration value="notContains"/>
 *     <enumeration value="isAnniversary"/>
 *     <enumeration value="isNotAnniversary"/>
 *     <enumeration value="greaterThanAnniversary"/>
 *     <enumeration value="lessThanAnniversary"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SimpleOperators")
@XmlEnum
public enum SimpleOperators {

    @XmlEnumValue("equals")
    EQUALS("equals"),
    @XmlEnumValue("notEquals")
    NOT_EQUALS("notEquals"),
    @XmlEnumValue("greaterThan")
    GREATER_THAN("greaterThan"),
    @XmlEnumValue("lessThan")
    LESS_THAN("lessThan"),
    @XmlEnumValue("isNull")
    IS_NULL("isNull"),
    @XmlEnumValue("isNotNull")
    IS_NOT_NULL("isNotNull"),
    @XmlEnumValue("greaterThanOrEqual")
    GREATER_THAN_OR_EQUAL("greaterThanOrEqual"),
    @XmlEnumValue("lessThanOrEqual")
    LESS_THAN_OR_EQUAL("lessThanOrEqual"),
    @XmlEnumValue("between")
    BETWEEN("between"),
    IN("IN"),
    @XmlEnumValue("like")
    LIKE("like"),
    @XmlEnumValue("existsInString")
    EXISTS_IN_STRING("existsInString"),
    @XmlEnumValue("existsInStringAsAWord")
    EXISTS_IN_STRING_AS_A_WORD("existsInStringAsAWord"),
    @XmlEnumValue("notExistsInString")
    NOT_EXISTS_IN_STRING("notExistsInString"),
    @XmlEnumValue("beginsWith")
    BEGINS_WITH("beginsWith"),
    @XmlEnumValue("endsWith")
    ENDS_WITH("endsWith"),
    @XmlEnumValue("contains")
    CONTAINS("contains"),
    @XmlEnumValue("notContains")
    NOT_CONTAINS("notContains"),
    @XmlEnumValue("isAnniversary")
    IS_ANNIVERSARY("isAnniversary"),
    @XmlEnumValue("isNotAnniversary")
    IS_NOT_ANNIVERSARY("isNotAnniversary"),
    @XmlEnumValue("greaterThanAnniversary")
    GREATER_THAN_ANNIVERSARY("greaterThanAnniversary"),
    @XmlEnumValue("lessThanAnniversary")
    LESS_THAN_ANNIVERSARY("lessThanAnniversary");
    private final String value;

    SimpleOperators(String v) {
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
    public static SimpleOperators fromValue(String v) {
        for (SimpleOperators c: SimpleOperators.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
