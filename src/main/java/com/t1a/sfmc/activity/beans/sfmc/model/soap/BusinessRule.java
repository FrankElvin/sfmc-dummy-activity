
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessRule complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BusinessRule">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       <sequence>
 *         <element name="MemberBusinessRuleID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="BusinessRuleID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Data" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Quality" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="IsViewable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="IsInheritedFromParent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessRule", propOrder = {
    "memberBusinessRuleID",
    "businessRuleID",
    "data",
    "quality",
    "name",
    "type",
    "description",
    "isViewable",
    "isInheritedFromParent",
    "displayName",
    "productCode"
})
public class BusinessRule
    extends APIObject
{

    @XmlElement(name = "MemberBusinessRuleID")
    protected int memberBusinessRuleID;
    @XmlElement(name = "BusinessRuleID")
    protected int businessRuleID;
    @XmlElement(name = "Data")
    protected int data;
    @XmlElement(name = "Quality", required = true)
    protected String quality;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "IsViewable")
    protected Boolean isViewable;
    @XmlElement(name = "IsInheritedFromParent")
    protected Boolean isInheritedFromParent;
    @XmlElement(name = "DisplayName", required = true)
    protected String displayName;
    @XmlElement(name = "ProductCode", required = true)
    protected String productCode;

    /**
     * Gets the value of the memberBusinessRuleID property.
     * 
     */
    public int getMemberBusinessRuleID() {
        return memberBusinessRuleID;
    }

    /**
     * Sets the value of the memberBusinessRuleID property.
     * 
     */
    public void setMemberBusinessRuleID(int value) {
        this.memberBusinessRuleID = value;
    }

    /**
     * Gets the value of the businessRuleID property.
     * 
     */
    public int getBusinessRuleID() {
        return businessRuleID;
    }

    /**
     * Sets the value of the businessRuleID property.
     * 
     */
    public void setBusinessRuleID(int value) {
        this.businessRuleID = value;
    }

    /**
     * Gets the value of the data property.
     * 
     */
    public int getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     */
    public void setData(int value) {
        this.data = value;
    }

    /**
     * Gets the value of the quality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuality() {
        return quality;
    }

    /**
     * Sets the value of the quality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuality(String value) {
        this.quality = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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
     * Gets the value of the isViewable property.
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
     */
    public void setIsViewable(Boolean value) {
        this.isViewable = value;
    }

    /**
     * Gets the value of the isInheritedFromParent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInheritedFromParent() {
        return isInheritedFromParent;
    }

    /**
     * Sets the value of the isInheritedFromParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInheritedFromParent(Boolean value) {
        this.isInheritedFromParent = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

}
