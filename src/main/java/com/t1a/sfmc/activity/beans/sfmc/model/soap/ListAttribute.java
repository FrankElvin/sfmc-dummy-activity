
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;


/**
 * <p>Java class for ListAttribute complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ListAttribute">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       <sequence>
 *         <element name="List" type="{http://exacttarget.com/wsdl/partnerAPI}List" minOccurs="0"/>
 *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="FieldType" type="{http://exacttarget.com/wsdl/partnerAPI}ListAttributeFieldType" minOccurs="0"/>
 *         <element name="FieldLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="Scale" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="MinValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="MaxValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DefaultValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="IsNullable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="IsHidden" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="IsReadOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Inheritable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Overridable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="MustOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="OverrideType" type="{http://exacttarget.com/wsdl/partnerAPI}OverrideType" minOccurs="0"/>
 *         <element name="Ordinal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="RestrictedValues" type="{http://exacttarget.com/wsdl/partnerAPI}ListAttributeRestrictedValue" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="BaseAttribute" type="{http://exacttarget.com/wsdl/partnerAPI}ListAttribute" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListAttribute", propOrder = {
    "list",
    "name",
    "description",
    "fieldType",
    "fieldLength",
    "scale",
    "minValue",
    "maxValue",
    "defaultValue",
    "isNullable",
    "isHidden",
    "isReadOnly",
    "inheritable",
    "overridable",
    "mustOverride",
    "overrideType",
    "ordinal",
    "restrictedValues",
    "baseAttribute"
})
public class ListAttribute
    extends APIObject
{

    @XmlElement(name = "List")
    protected com.t1a.sfmc.activity.beans.sfmc.model.soap.List list;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "FieldType")
    @XmlSchemaType(name = "string")
    protected ListAttributeFieldType fieldType;
    @XmlElement(name = "FieldLength")
    protected Integer fieldLength;
    @XmlElement(name = "Scale")
    protected Integer scale;
    @XmlElement(name = "MinValue")
    protected String minValue;
    @XmlElement(name = "MaxValue")
    protected String maxValue;
    @XmlElement(name = "DefaultValue")
    protected String defaultValue;
    @XmlElement(name = "IsNullable")
    protected Boolean isNullable;
    @XmlElement(name = "IsHidden")
    protected Boolean isHidden;
    @XmlElement(name = "IsReadOnly")
    protected Boolean isReadOnly;
    @XmlElement(name = "Inheritable")
    protected Boolean inheritable;
    @XmlElement(name = "Overridable")
    protected Boolean overridable;
    @XmlElement(name = "MustOverride")
    protected Boolean mustOverride;
    @XmlElement(name = "OverrideType")
    @XmlSchemaType(name = "string")
    protected OverrideType overrideType;
    @XmlElement(name = "Ordinal")
    protected Integer ordinal;
    @XmlElement(name = "RestrictedValues")
    protected java.util.List<ListAttributeRestrictedValue> restrictedValues;
    @XmlElement(name = "BaseAttribute")
    protected ListAttribute baseAttribute;

    /**
     * Gets the value of the list property.
     * 
     * @return
     *     possible object is
     *     {@link com.t1a.sfmc.activity.beans.sfmc.model.soap.List }
     *     
     */
    public com.t1a.sfmc.activity.beans.sfmc.model.soap.List getList() {
        return list;
    }

    /**
     * Sets the value of the list property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.t1a.sfmc.activity.beans.sfmc.model.soap.List }
     *     
     */
    public void setList(com.t1a.sfmc.activity.beans.sfmc.model.soap.List value) {
        this.list = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the fieldType property.
     * 
     * @return
     *     possible object is
     *     {@link ListAttributeFieldType }
     *     
     */
    public ListAttributeFieldType getFieldType() {
        return fieldType;
    }

    /**
     * Sets the value of the fieldType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListAttributeFieldType }
     *     
     */
    public void setFieldType(ListAttributeFieldType value) {
        this.fieldType = value;
    }

    /**
     * Gets the value of the fieldLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFieldLength() {
        return fieldLength;
    }

    /**
     * Sets the value of the fieldLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFieldLength(Integer value) {
        this.fieldLength = value;
    }

    /**
     * Gets the value of the scale property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScale(Integer value) {
        this.scale = value;
    }

    /**
     * Gets the value of the minValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinValue() {
        return minValue;
    }

    /**
     * Sets the value of the minValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinValue(String value) {
        this.minValue = value;
    }

    /**
     * Gets the value of the maxValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxValue() {
        return maxValue;
    }

    /**
     * Sets the value of the maxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxValue(String value) {
        this.maxValue = value;
    }

    /**
     * Gets the value of the defaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultValue(String value) {
        this.defaultValue = value;
    }

    /**
     * Gets the value of the isNullable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNullable() {
        return isNullable;
    }

    /**
     * Sets the value of the isNullable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNullable(Boolean value) {
        this.isNullable = value;
    }

    /**
     * Gets the value of the isHidden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsHidden() {
        return isHidden;
    }

    /**
     * Sets the value of the isHidden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsHidden(Boolean value) {
        this.isHidden = value;
    }

    /**
     * Gets the value of the isReadOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReadOnly() {
        return isReadOnly;
    }

    /**
     * Sets the value of the isReadOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReadOnly(Boolean value) {
        this.isReadOnly = value;
    }

    /**
     * Gets the value of the inheritable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInheritable() {
        return inheritable;
    }

    /**
     * Sets the value of the inheritable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInheritable(Boolean value) {
        this.inheritable = value;
    }

    /**
     * Gets the value of the overridable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverridable() {
        return overridable;
    }

    /**
     * Sets the value of the overridable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverridable(Boolean value) {
        this.overridable = value;
    }

    /**
     * Gets the value of the mustOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMustOverride() {
        return mustOverride;
    }

    /**
     * Sets the value of the mustOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMustOverride(Boolean value) {
        this.mustOverride = value;
    }

    /**
     * Gets the value of the overrideType property.
     * 
     * @return
     *     possible object is
     *     {@link OverrideType }
     *     
     */
    public OverrideType getOverrideType() {
        return overrideType;
    }

    /**
     * Sets the value of the overrideType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverrideType }
     *     
     */
    public void setOverrideType(OverrideType value) {
        this.overrideType = value;
    }

    /**
     * Gets the value of the ordinal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrdinal() {
        return ordinal;
    }

    /**
     * Sets the value of the ordinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrdinal(Integer value) {
        this.ordinal = value;
    }

    /**
     * Gets the value of the restrictedValues property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restrictedValues property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRestrictedValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListAttributeRestrictedValue }
     * </p>
     * 
     * 
     * @return
     *     The value of the restrictedValues property.
     */
    public java.util.List<ListAttributeRestrictedValue> getRestrictedValues() {
        if (restrictedValues == null) {
            restrictedValues = new ArrayList<>();
        }
        return this.restrictedValues;
    }

    /**
     * Gets the value of the baseAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link ListAttribute }
     *     
     */
    public ListAttribute getBaseAttribute() {
        return baseAttribute;
    }

    /**
     * Sets the value of the baseAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListAttribute }
     *     
     */
    public void setBaseAttribute(ListAttribute value) {
        this.baseAttribute = value;
    }

}
