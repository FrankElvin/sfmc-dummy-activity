
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for PropertyDefinition complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PropertyDefinition">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       <sequence>
 *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DataType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ValueType" type="{http://exacttarget.com/wsdl/partnerAPI}SoapType" minOccurs="0"/>
 *         <element name="PropertyType" type="{http://exacttarget.com/wsdl/partnerAPI}PropertyType" minOccurs="0"/>
 *         <element name="IsCreatable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="IsUpdatable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="IsRetrievable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="IsQueryable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="IsFilterable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="IsPartnerProperty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="IsAccountProperty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="PartnerMap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="AttributeMaps" type="{http://exacttarget.com/wsdl/partnerAPI}AttributeMap" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Markups" type="{http://exacttarget.com/wsdl/partnerAPI}APIProperty" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Precision" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="Scale" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="Label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DefaultValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="MinLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="MaxLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="MinValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="MaxValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="IsRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="IsViewable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="IsEditable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="IsNillable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="IsRestrictedPicklist" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="PicklistItems" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="PicklistItem" type="{http://exacttarget.com/wsdl/partnerAPI}PicklistItem" maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="IsSendTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="DisplayOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="References" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Reference" type="{http://exacttarget.com/wsdl/partnerAPI}APIObject" maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="RelationshipName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="IsContextSpecific" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyDefinition", propOrder = {
    "name",
    "dataType",
    "valueType",
    "propertyType",
    "isCreatable",
    "isUpdatable",
    "isRetrievable",
    "isQueryable",
    "isFilterable",
    "isPartnerProperty",
    "isAccountProperty",
    "partnerMap",
    "attributeMaps",
    "markups",
    "precision",
    "scale",
    "label",
    "description",
    "defaultValue",
    "minLength",
    "maxLength",
    "minValue",
    "maxValue",
    "isRequired",
    "isViewable",
    "isEditable",
    "isNillable",
    "isRestrictedPicklist",
    "picklistItems",
    "isSendTime",
    "displayOrder",
    "references",
    "relationshipName",
    "status",
    "isContextSpecific"
})
@XmlSeeAlso({
    DataExtensionField.class
})
public class PropertyDefinition
    extends APIObject
{

    @XmlElement(name = "Name")
    protected String name;
    /**
     * Deprecated.  Please use ValueType.
     * 
     */
    @XmlElement(name = "DataType")
    protected String dataType;
    /**
     * Reserved for future use.
     * 
     */
    @XmlElement(name = "ValueType")
    @XmlSchemaType(name = "string")
    protected SoapType valueType;
    /**
     * ExactTarget data type of the property
     * 
     */
    @XmlElement(name = "PropertyType")
    @XmlSchemaType(name = "string")
    protected PropertyType propertyType;
    /**
     * Reserved for future use.
     * 
     */
    @XmlElement(name = "IsCreatable")
    protected Boolean isCreatable;
    /**
     * Indicates whether the property can be updated.  If true, then this property value can be set in an update call.
     * 
     */
    @XmlElement(name = "IsUpdatable")
    protected Boolean isUpdatable;
    /**
     * Indicates whether the object can be retrieved via the retrieve call.
     * 
     */
    @XmlElement(name = "IsRetrievable")
    protected Boolean isRetrievable;
    /**
     * Reserved for future use.
     * 
     */
    @XmlElement(name = "IsQueryable")
    protected Boolean isQueryable;
    /**
     * Reserved for future use.
     * 
     */
    @XmlElement(name = "IsFilterable")
    protected Boolean isFilterable;
    /**
     * Reserved for future use.
     * 
     */
    @XmlElement(name = "IsPartnerProperty")
    protected Boolean isPartnerProperty;
    /**
     * Reserved for future use.
     * 
     */
    @XmlElement(name = "IsAccountProperty")
    protected Boolean isAccountProperty;
    /**
     * Deprecated.
     * 
     */
    @XmlElement(name = "PartnerMap")
    protected String partnerMap;
    @XmlElement(name = "AttributeMaps")
    protected List<AttributeMap> attributeMaps;
    /**
     * Deprecated.
     * 
     */
    @XmlElement(name = "Markups")
    protected List<APIProperty> markups;
    /**
     * Reserved for future use.
     * 
     */
    @XmlElement(name = "Precision")
    protected Integer precision;
    /**
     * Reserved for future use.
     * 
     */
    @XmlElement(name = "Scale")
    protected Integer scale;
    /**
     * Text label that is displayed next to the field in the user interface.
     * 
     */
    @XmlElement(name = "Label")
    protected String label;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "DefaultValue")
    protected String defaultValue;
    /**
     * Minimum length of the data.
     * 
     */
    @XmlElement(name = "MinLength")
    protected Integer minLength;
    /**
     * Maximum length of the data.
     * 
     */
    @XmlElement(name = "MaxLength")
    protected Integer maxLength;
    /**
     * Minimum value that this property can be set to.
     * 
     */
    @XmlElement(name = "MinValue")
    protected String minValue;
    /**
     * Maximum value that this property can be set to.
     * 
     */
    @XmlElement(name = "MaxValue")
    protected String maxValue;
    /**
     * Indicates whether the property must have a value specified.
     * 
     */
    @XmlElement(name = "IsRequired")
    protected Boolean isRequired;
    /**
     * Indicates whether the property is viewable to the end-user in the profile center.
     * 
     */
    @XmlElement(name = "IsViewable")
    protected Boolean isViewable;
    /**
     * Indicates whether the property is editable by the end-user in the profile center.
     * 
     */
    @XmlElement(name = "IsEditable")
    protected Boolean isEditable;
    /**
     * Reserved for future use.
     * 
     */
    @XmlElement(name = "IsNillable")
    protected Boolean isNillable;
    /**
     * Indicates if the property has a restricted list of valid values.
     * 
     */
    @XmlElement(name = "IsRestrictedPicklist")
    protected Boolean isRestrictedPicklist;
    /**
     * List of valid values.
     * 
     */
    @XmlElement(name = "PicklistItems")
    protected PicklistItems picklistItems;
    /**
     * Indicates whether the property is a send time attribute.
     * 
     */
    @XmlElement(name = "IsSendTime")
    protected Boolean isSendTime;
    /**
     * Indicates the placement of this property within the list of properties.
     * 
     */
    @XmlElement(name = "DisplayOrder")
    protected Integer displayOrder;
    /**
     * Reserved for future use.
     * 
     */
    @XmlElement(name = "References")
    protected References references;
    /**
     * Reserved for future use.
     * 
     */
    @XmlElement(name = "RelationshipName")
    protected String relationshipName;
    /**
     * Reserved for future use.
     * 
     */
    @XmlElement(name = "Status")
    protected String status;
    /**
     * Reserved for future use.
     * 
     */
    @XmlElement(name = "IsContextSpecific")
    protected Boolean isContextSpecific;

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
     * Deprecated.  Please use ValueType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDataType()
     */
    public void setDataType(String value) {
        this.dataType = value;
    }

    /**
     * Reserved for future use.
     * 
     * @return
     *     possible object is
     *     {@link SoapType }
     *     
     */
    public SoapType getValueType() {
        return valueType;
    }

    /**
     * Sets the value of the valueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapType }
     *     
     * @see #getValueType()
     */
    public void setValueType(SoapType value) {
        this.valueType = value;
    }

    /**
     * ExactTarget data type of the property
     * 
     * @return
     *     possible object is
     *     {@link PropertyType }
     *     
     */
    public PropertyType getPropertyType() {
        return propertyType;
    }

    /**
     * Sets the value of the propertyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyType }
     *     
     * @see #getPropertyType()
     */
    public void setPropertyType(PropertyType value) {
        this.propertyType = value;
    }

    /**
     * Reserved for future use.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCreatable() {
        return isCreatable;
    }

    /**
     * Sets the value of the isCreatable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsCreatable()
     */
    public void setIsCreatable(Boolean value) {
        this.isCreatable = value;
    }

    /**
     * Indicates whether the property can be updated.  If true, then this property value can be set in an update call.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsUpdatable() {
        return isUpdatable;
    }

    /**
     * Sets the value of the isUpdatable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsUpdatable()
     */
    public void setIsUpdatable(Boolean value) {
        this.isUpdatable = value;
    }

    /**
     * Indicates whether the object can be retrieved via the retrieve call.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRetrievable() {
        return isRetrievable;
    }

    /**
     * Sets the value of the isRetrievable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsRetrievable()
     */
    public void setIsRetrievable(Boolean value) {
        this.isRetrievable = value;
    }

    /**
     * Reserved for future use.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsQueryable() {
        return isQueryable;
    }

    /**
     * Sets the value of the isQueryable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsQueryable()
     */
    public void setIsQueryable(Boolean value) {
        this.isQueryable = value;
    }

    /**
     * Reserved for future use.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFilterable() {
        return isFilterable;
    }

    /**
     * Sets the value of the isFilterable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsFilterable()
     */
    public void setIsFilterable(Boolean value) {
        this.isFilterable = value;
    }

    /**
     * Reserved for future use.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPartnerProperty() {
        return isPartnerProperty;
    }

    /**
     * Sets the value of the isPartnerProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsPartnerProperty()
     */
    public void setIsPartnerProperty(Boolean value) {
        this.isPartnerProperty = value;
    }

    /**
     * Reserved for future use.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAccountProperty() {
        return isAccountProperty;
    }

    /**
     * Sets the value of the isAccountProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsAccountProperty()
     */
    public void setIsAccountProperty(Boolean value) {
        this.isAccountProperty = value;
    }

    /**
     * Deprecated.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerMap() {
        return partnerMap;
    }

    /**
     * Sets the value of the partnerMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPartnerMap()
     */
    public void setPartnerMap(String value) {
        this.partnerMap = value;
    }

    /**
     * Gets the value of the attributeMaps property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeMaps property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAttributeMaps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeMap }
     * </p>
     * 
     * 
     * @return
     *     The value of the attributeMaps property.
     */
    public List<AttributeMap> getAttributeMaps() {
        if (attributeMaps == null) {
            attributeMaps = new ArrayList<>();
        }
        return this.attributeMaps;
    }

    /**
     * Deprecated.
     * 
     * Gets the value of the markups property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the markups property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMarkups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link APIProperty }
     * </p>
     * 
     * 
     * @return
     *     The value of the markups property.
     */
    public List<APIProperty> getMarkups() {
        if (markups == null) {
            markups = new ArrayList<>();
        }
        return this.markups;
    }

    /**
     * Reserved for future use.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrecision() {
        return precision;
    }

    /**
     * Sets the value of the precision property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getPrecision()
     */
    public void setPrecision(Integer value) {
        this.precision = value;
    }

    /**
     * Reserved for future use.
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
     * @see #getScale()
     */
    public void setScale(Integer value) {
        this.scale = value;
    }

    /**
     * Text label that is displayed next to the field in the user interface.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLabel()
     */
    public void setLabel(String value) {
        this.label = value;
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
     * Minimum length of the data.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinLength() {
        return minLength;
    }

    /**
     * Sets the value of the minLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getMinLength()
     */
    public void setMinLength(Integer value) {
        this.minLength = value;
    }

    /**
     * Maximum length of the data.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxLength() {
        return maxLength;
    }

    /**
     * Sets the value of the maxLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getMaxLength()
     */
    public void setMaxLength(Integer value) {
        this.maxLength = value;
    }

    /**
     * Minimum value that this property can be set to.
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
     * @see #getMinValue()
     */
    public void setMinValue(String value) {
        this.minValue = value;
    }

    /**
     * Maximum value that this property can be set to.
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
     * @see #getMaxValue()
     */
    public void setMaxValue(String value) {
        this.maxValue = value;
    }

    /**
     * Indicates whether the property must have a value specified.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRequired() {
        return isRequired;
    }

    /**
     * Sets the value of the isRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsRequired()
     */
    public void setIsRequired(Boolean value) {
        this.isRequired = value;
    }

    /**
     * Indicates whether the property is viewable to the end-user in the profile center.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsViewable() {
        return isViewable;
    }

    /**
     * Sets the value of the isViewable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsViewable()
     */
    public void setIsViewable(Boolean value) {
        this.isViewable = value;
    }

    /**
     * Indicates whether the property is editable by the end-user in the profile center.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEditable() {
        return isEditable;
    }

    /**
     * Sets the value of the isEditable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsEditable()
     */
    public void setIsEditable(Boolean value) {
        this.isEditable = value;
    }

    /**
     * Reserved for future use.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNillable() {
        return isNillable;
    }

    /**
     * Sets the value of the isNillable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsNillable()
     */
    public void setIsNillable(Boolean value) {
        this.isNillable = value;
    }

    /**
     * Indicates if the property has a restricted list of valid values.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRestrictedPicklist() {
        return isRestrictedPicklist;
    }

    /**
     * Sets the value of the isRestrictedPicklist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsRestrictedPicklist()
     */
    public void setIsRestrictedPicklist(Boolean value) {
        this.isRestrictedPicklist = value;
    }

    /**
     * List of valid values.
     * 
     * @return
     *     possible object is
     *     {@link PicklistItems }
     *     
     */
    public PicklistItems getPicklistItems() {
        return picklistItems;
    }

    /**
     * Sets the value of the picklistItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistItems }
     *     
     * @see #getPicklistItems()
     */
    public void setPicklistItems(PicklistItems value) {
        this.picklistItems = value;
    }

    /**
     * Indicates whether the property is a send time attribute.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSendTime() {
        return isSendTime;
    }

    /**
     * Sets the value of the isSendTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsSendTime()
     */
    public void setIsSendTime(Boolean value) {
        this.isSendTime = value;
    }

    /**
     * Indicates the placement of this property within the list of properties.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisplayOrder() {
        return displayOrder;
    }

    /**
     * Sets the value of the displayOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getDisplayOrder()
     */
    public void setDisplayOrder(Integer value) {
        this.displayOrder = value;
    }

    /**
     * Reserved for future use.
     * 
     * @return
     *     possible object is
     *     {@link References }
     *     
     */
    public References getReferences() {
        return references;
    }

    /**
     * Sets the value of the references property.
     * 
     * @param value
     *     allowed object is
     *     {@link References }
     *     
     * @see #getReferences()
     */
    public void setReferences(References value) {
        this.references = value;
    }

    /**
     * Reserved for future use.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipName() {
        return relationshipName;
    }

    /**
     * Sets the value of the relationshipName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRelationshipName()
     */
    public void setRelationshipName(String value) {
        this.relationshipName = value;
    }

    /**
     * Reserved for future use.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStatus()
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Reserved for future use.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsContextSpecific() {
        return isContextSpecific;
    }

    /**
     * Sets the value of the isContextSpecific property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsContextSpecific()
     */
    public void setIsContextSpecific(Boolean value) {
        this.isContextSpecific = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="PicklistItem" type="{http://exacttarget.com/wsdl/partnerAPI}PicklistItem" maxOccurs="unbounded" minOccurs="0"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "picklistItem"
    })
    public static class PicklistItems {

        @XmlElement(name = "PicklistItem")
        protected List<PicklistItem> picklistItem;

        /**
         * Gets the value of the picklistItem property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the picklistItem property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getPicklistItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PicklistItem }
         * </p>
         * 
         * 
         * @return
         *     The value of the picklistItem property.
         */
        public List<PicklistItem> getPicklistItem() {
            if (picklistItem == null) {
                picklistItem = new ArrayList<>();
            }
            return this.picklistItem;
        }

    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="Reference" type="{http://exacttarget.com/wsdl/partnerAPI}APIObject" maxOccurs="unbounded" minOccurs="0"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "reference"
    })
    public static class References {

        @XmlElement(name = "Reference")
        protected List<APIObject> reference;

        /**
         * Gets the value of the reference property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reference property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getReference().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link APIObject }
         * </p>
         * 
         * 
         * @return
         *     The value of the reference property.
         */
        public List<APIObject> getReference() {
            if (reference == null) {
                reference = new ArrayList<>();
            }
            return this.reference;
        }

    }

}
