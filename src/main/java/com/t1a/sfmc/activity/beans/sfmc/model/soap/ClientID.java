
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClientID complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClientID">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ClientID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="PartnerClientKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="UserID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="PartnerUserKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="EnterpriseID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="CustomerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientID", propOrder = {
    "clientID",
    "id",
    "partnerClientKey",
    "userID",
    "partnerUserKey",
    "createdBy",
    "modifiedBy",
    "enterpriseID",
    "customerKey",
    "customerID"
})
public class ClientID {

    /**
     * Deprecated.  Use ID.
     * 
     */
    @XmlElement(name = "ClientID")
    protected Integer clientID;
    @XmlElement(name = "ID")
    protected Integer id;
    @XmlElement(name = "PartnerClientKey")
    protected String partnerClientKey;
    @XmlElement(name = "UserID")
    protected Integer userID;
    @XmlElement(name = "PartnerUserKey")
    protected String partnerUserKey;
    @XmlElement(name = "CreatedBy")
    protected Integer createdBy;
    @XmlElement(name = "ModifiedBy")
    protected Integer modifiedBy;
    @XmlElement(name = "EnterpriseID")
    protected Long enterpriseID;
    @XmlElement(name = "CustomerKey")
    protected String customerKey;
    @XmlElement(name = "CustomerID")
    protected String customerID;

    /**
     * Deprecated.  Use ID.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClientID() {
        return clientID;
    }

    /**
     * Sets the value of the clientID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getClientID()
     */
    public void setClientID(Integer value) {
        this.clientID = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setID(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the partnerClientKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerClientKey() {
        return partnerClientKey;
    }

    /**
     * Sets the value of the partnerClientKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerClientKey(String value) {
        this.partnerClientKey = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUserID(Integer value) {
        this.userID = value;
    }

    /**
     * Gets the value of the partnerUserKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerUserKey() {
        return partnerUserKey;
    }

    /**
     * Sets the value of the partnerUserKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerUserKey(String value) {
        this.partnerUserKey = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCreatedBy(Integer value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the modifiedBy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getModifiedBy() {
        return modifiedBy;
    }

    /**
     * Sets the value of the modifiedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setModifiedBy(Integer value) {
        this.modifiedBy = value;
    }

    /**
     * Gets the value of the enterpriseID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEnterpriseID() {
        return enterpriseID;
    }

    /**
     * Sets the value of the enterpriseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEnterpriseID(Long value) {
        this.enterpriseID = value;
    }

    /**
     * Gets the value of the customerKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerKey() {
        return customerKey;
    }

    /**
     * Sets the value of the customerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerKey(String value) {
        this.customerKey = value;
    }

    /**
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerID(String value) {
        this.customerID = value;
    }

}
