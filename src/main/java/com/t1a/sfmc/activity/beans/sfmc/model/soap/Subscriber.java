
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for Subscriber complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Subscriber">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       <sequence>
 *         <element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Attributes" type="{http://exacttarget.com/wsdl/partnerAPI}Attribute" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SubscriberKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="UnsubscribedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="Status" type="{http://exacttarget.com/wsdl/partnerAPI}SubscriberStatus" minOccurs="0"/>
 *         <element name="PartnerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="EmailTypePreference" type="{http://exacttarget.com/wsdl/partnerAPI}EmailType" minOccurs="0"/>
 *         <element name="Lists" type="{http://exacttarget.com/wsdl/partnerAPI}SubscriberList" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="GlobalUnsubscribeCategory" type="{http://exacttarget.com/wsdl/partnerAPI}GlobalUnsubscribeCategory" minOccurs="0"/>
 *         <element name="SubscriberTypeDefinition" type="{http://exacttarget.com/wsdl/partnerAPI}SubscriberTypeDefinition" minOccurs="0"/>
 *         <element name="Addresses" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Address" type="{http://exacttarget.com/wsdl/partnerAPI}SubscriberAddress" maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="PrimarySMSAddress" type="{http://exacttarget.com/wsdl/partnerAPI}SMSAddress" minOccurs="0"/>
 *         <element name="PrimarySMSPublicationStatus" type="{http://exacttarget.com/wsdl/partnerAPI}SubscriberAddressStatus" minOccurs="0"/>
 *         <element name="PrimaryEmailAddress" type="{http://exacttarget.com/wsdl/partnerAPI}EmailAddress" minOccurs="0"/>
 *         <element name="Locale" type="{http://exacttarget.com/wsdl/partnerAPI}Locale" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subscriber", propOrder = {
    "emailAddress",
    "attributes",
    "subscriberKey",
    "unsubscribedDate",
    "status",
    "partnerType",
    "emailTypePreference",
    "lists",
    "globalUnsubscribeCategory",
    "subscriberTypeDefinition",
    "addresses",
    "primarySMSAddress",
    "primarySMSPublicationStatus",
    "primaryEmailAddress",
    "locale"
})
public class Subscriber
    extends APIObject
{

    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlElement(name = "Attributes")
    protected List<Attribute> attributes;
    @XmlElement(name = "SubscriberKey")
    protected String subscriberKey;
    @XmlElement(name = "UnsubscribedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar unsubscribedDate;
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    protected SubscriberStatus status;
    @XmlElement(name = "PartnerType")
    protected String partnerType;
    @XmlElement(name = "EmailTypePreference")
    @XmlSchemaType(name = "string")
    protected EmailType emailTypePreference;
    @XmlElement(name = "Lists")
    protected List<SubscriberList> lists;
    @XmlElement(name = "GlobalUnsubscribeCategory")
    protected GlobalUnsubscribeCategory globalUnsubscribeCategory;
    @XmlElement(name = "SubscriberTypeDefinition")
    protected SubscriberTypeDefinition subscriberTypeDefinition;
    @XmlElement(name = "Addresses")
    protected Addresses addresses;
    @XmlElement(name = "PrimarySMSAddress")
    protected SMSAddress primarySMSAddress;
    @XmlElement(name = "PrimarySMSPublicationStatus")
    @XmlSchemaType(name = "string")
    protected SubscriberAddressStatus primarySMSPublicationStatus;
    @XmlElement(name = "PrimaryEmailAddress")
    protected EmailAddress primaryEmailAddress;
    @XmlElement(name = "Locale")
    protected Locale locale;

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributes property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attribute }
     * </p>
     * 
     * 
     * @return
     *     The value of the attributes property.
     */
    public List<Attribute> getAttributes() {
        if (attributes == null) {
            attributes = new ArrayList<>();
        }
        return this.attributes;
    }

    /**
     * Gets the value of the subscriberKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberKey() {
        return subscriberKey;
    }

    /**
     * Sets the value of the subscriberKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberKey(String value) {
        this.subscriberKey = value;
    }

    /**
     * Gets the value of the unsubscribedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUnsubscribedDate() {
        return unsubscribedDate;
    }

    /**
     * Sets the value of the unsubscribedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUnsubscribedDate(XMLGregorianCalendar value) {
        this.unsubscribedDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberStatus }
     *     
     */
    public SubscriberStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberStatus }
     *     
     */
    public void setStatus(SubscriberStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the partnerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerType() {
        return partnerType;
    }

    /**
     * Sets the value of the partnerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerType(String value) {
        this.partnerType = value;
    }

    /**
     * Gets the value of the emailTypePreference property.
     * 
     * @return
     *     possible object is
     *     {@link EmailType }
     *     
     */
    public EmailType getEmailTypePreference() {
        return emailTypePreference;
    }

    /**
     * Sets the value of the emailTypePreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailType }
     *     
     */
    public void setEmailTypePreference(EmailType value) {
        this.emailTypePreference = value;
    }

    /**
     * Gets the value of the lists property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lists property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscriberList }
     * </p>
     * 
     * 
     * @return
     *     The value of the lists property.
     */
    public List<SubscriberList> getLists() {
        if (lists == null) {
            lists = new ArrayList<>();
        }
        return this.lists;
    }

    /**
     * Gets the value of the globalUnsubscribeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalUnsubscribeCategory }
     *     
     */
    public GlobalUnsubscribeCategory getGlobalUnsubscribeCategory() {
        return globalUnsubscribeCategory;
    }

    /**
     * Sets the value of the globalUnsubscribeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalUnsubscribeCategory }
     *     
     */
    public void setGlobalUnsubscribeCategory(GlobalUnsubscribeCategory value) {
        this.globalUnsubscribeCategory = value;
    }

    /**
     * Gets the value of the subscriberTypeDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberTypeDefinition }
     *     
     */
    public SubscriberTypeDefinition getSubscriberTypeDefinition() {
        return subscriberTypeDefinition;
    }

    /**
     * Sets the value of the subscriberTypeDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberTypeDefinition }
     *     
     */
    public void setSubscriberTypeDefinition(SubscriberTypeDefinition value) {
        this.subscriberTypeDefinition = value;
    }

    /**
     * Gets the value of the addresses property.
     * 
     * @return
     *     possible object is
     *     {@link Addresses }
     *     
     */
    public Addresses getAddresses() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Addresses }
     *     
     */
    public void setAddresses(Addresses value) {
        this.addresses = value;
    }

    /**
     * Gets the value of the primarySMSAddress property.
     * 
     * @return
     *     possible object is
     *     {@link SMSAddress }
     *     
     */
    public SMSAddress getPrimarySMSAddress() {
        return primarySMSAddress;
    }

    /**
     * Sets the value of the primarySMSAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link SMSAddress }
     *     
     */
    public void setPrimarySMSAddress(SMSAddress value) {
        this.primarySMSAddress = value;
    }

    /**
     * Gets the value of the primarySMSPublicationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberAddressStatus }
     *     
     */
    public SubscriberAddressStatus getPrimarySMSPublicationStatus() {
        return primarySMSPublicationStatus;
    }

    /**
     * Sets the value of the primarySMSPublicationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberAddressStatus }
     *     
     */
    public void setPrimarySMSPublicationStatus(SubscriberAddressStatus value) {
        this.primarySMSPublicationStatus = value;
    }

    /**
     * Gets the value of the primaryEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link EmailAddress }
     *     
     */
    public EmailAddress getPrimaryEmailAddress() {
        return primaryEmailAddress;
    }

    /**
     * Sets the value of the primaryEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailAddress }
     *     
     */
    public void setPrimaryEmailAddress(EmailAddress value) {
        this.primaryEmailAddress = value;
    }

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link Locale }
     *     
     */
    public Locale getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Locale }
     *     
     */
    public void setLocale(Locale value) {
        this.locale = value;
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
     *         <element name="Address" type="{http://exacttarget.com/wsdl/partnerAPI}SubscriberAddress" maxOccurs="unbounded" minOccurs="0"/>
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
        "address"
    })
    public static class Addresses {

        @XmlElement(name = "Address")
        protected List<SubscriberAddress> address;

        /**
         * Gets the value of the address property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the address property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SubscriberAddress }
         * </p>
         * 
         * 
         * @return
         *     The value of the address property.
         */
        public List<SubscriberAddress> getAddress() {
            if (address == null) {
                address = new ArrayList<>();
            }
            return this.address;
        }

    }

}
