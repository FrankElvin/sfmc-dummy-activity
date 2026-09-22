
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for DataSourceTypeEnum</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="DataSourceTypeEnum">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="List"/>
 *     <enumeration value="CustomObject"/>
 *     <enumeration value="DomainExclusion"/>
 *     <enumeration value="SalesForceReport"/>
 *     <enumeration value="SalesForceCampaign"/>
 *     <enumeration value="FilterDefinition"/>
 *     <enumeration value="OptOutList"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DataSourceTypeEnum")
@XmlEnum
public enum DataSourceTypeEnum {

    @XmlEnumValue("List")
    LIST("List"),
    @XmlEnumValue("CustomObject")
    CUSTOM_OBJECT("CustomObject"),
    @XmlEnumValue("DomainExclusion")
    DOMAIN_EXCLUSION("DomainExclusion"),
    @XmlEnumValue("SalesForceReport")
    SALES_FORCE_REPORT("SalesForceReport"),
    @XmlEnumValue("SalesForceCampaign")
    SALES_FORCE_CAMPAIGN("SalesForceCampaign"),
    @XmlEnumValue("FilterDefinition")
    FILTER_DEFINITION("FilterDefinition"),
    @XmlEnumValue("OptOutList")
    OPT_OUT_LIST("OptOutList");
    private final String value;

    DataSourceTypeEnum(String v) {
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
    public static DataSourceTypeEnum fromValue(String v) {
        for (DataSourceTypeEnum c: DataSourceTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
