
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for YearlyRecurrencePatternTypeEnum</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="YearlyRecurrencePatternTypeEnum">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ByDay"/>
 *     <enumeration value="ByWeek"/>
 *     <enumeration value="ByMonth"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "YearlyRecurrencePatternTypeEnum")
@XmlEnum
public enum YearlyRecurrencePatternTypeEnum {

    @XmlEnumValue("ByDay")
    BY_DAY("ByDay"),
    @XmlEnumValue("ByWeek")
    BY_WEEK("ByWeek"),
    @XmlEnumValue("ByMonth")
    BY_MONTH("ByMonth");
    private final String value;

    YearlyRecurrencePatternTypeEnum(String v) {
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
    public static YearlyRecurrencePatternTypeEnum fromValue(String v) {
        for (YearlyRecurrencePatternTypeEnum c: YearlyRecurrencePatternTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
