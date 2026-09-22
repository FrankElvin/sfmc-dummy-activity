
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Subscription complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Subscription">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SubscriptionID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="EmailsPurchased" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="AccountsPurchased" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="AdvAccountsPurchased" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="LPAccountsPurchased" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="DOTOAccountsPurchased" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="BUAccountsPurchased" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Period" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="NotificationTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="NotificationMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="NotificationFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="NotificationExpDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="ForAccounting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="HasPurchasedEmails" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="ContractNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ContractModifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="IsRenewal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="NumberofEmails" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subscription", propOrder = {
    "subscriptionID",
    "emailsPurchased",
    "accountsPurchased",
    "advAccountsPurchased",
    "lpAccountsPurchased",
    "dotoAccountsPurchased",
    "buAccountsPurchased",
    "beginDate",
    "endDate",
    "notes",
    "period",
    "notificationTitle",
    "notificationMessage",
    "notificationFlag",
    "notificationExpDate",
    "forAccounting",
    "hasPurchasedEmails",
    "contractNumber",
    "contractModifier",
    "isRenewal",
    "numberofEmails"
})
public class Subscription {

    @XmlElementRef(name = "SubscriptionID", namespace = "http://exacttarget.com/wsdl/partnerAPI", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> subscriptionID;
    @XmlElement(name = "EmailsPurchased")
    protected int emailsPurchased;
    @XmlElement(name = "AccountsPurchased")
    protected int accountsPurchased;
    @XmlElement(name = "AdvAccountsPurchased")
    protected int advAccountsPurchased;
    @XmlElement(name = "LPAccountsPurchased")
    protected int lpAccountsPurchased;
    @XmlElement(name = "DOTOAccountsPurchased")
    protected int dotoAccountsPurchased;
    @XmlElement(name = "BUAccountsPurchased")
    protected int buAccountsPurchased;
    @XmlElement(name = "BeginDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar beginDate;
    @XmlElement(name = "EndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElementRef(name = "Notes", namespace = "http://exacttarget.com/wsdl/partnerAPI", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notes;
    @XmlElement(name = "Period", required = true)
    protected String period;
    @XmlElementRef(name = "NotificationTitle", namespace = "http://exacttarget.com/wsdl/partnerAPI", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notificationTitle;
    @XmlElementRef(name = "NotificationMessage", namespace = "http://exacttarget.com/wsdl/partnerAPI", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notificationMessage;
    @XmlElementRef(name = "NotificationFlag", namespace = "http://exacttarget.com/wsdl/partnerAPI", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notificationFlag;
    @XmlElementRef(name = "NotificationExpDate", namespace = "http://exacttarget.com/wsdl/partnerAPI", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> notificationExpDate;
    @XmlElementRef(name = "ForAccounting", namespace = "http://exacttarget.com/wsdl/partnerAPI", type = JAXBElement.class, required = false)
    protected JAXBElement<String> forAccounting;
    @XmlElement(name = "HasPurchasedEmails")
    protected boolean hasPurchasedEmails;
    @XmlElement(name = "ContractNumber")
    protected String contractNumber;
    @XmlElement(name = "ContractModifier")
    protected String contractModifier;
    @XmlElement(name = "IsRenewal")
    protected Boolean isRenewal;
    @XmlElement(name = "NumberofEmails")
    protected long numberofEmails;

    /**
     * Gets the value of the subscriptionID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSubscriptionID() {
        return subscriptionID;
    }

    /**
     * Sets the value of the subscriptionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSubscriptionID(JAXBElement<Integer> value) {
        this.subscriptionID = value;
    }

    /**
     * Gets the value of the emailsPurchased property.
     * 
     */
    public int getEmailsPurchased() {
        return emailsPurchased;
    }

    /**
     * Sets the value of the emailsPurchased property.
     * 
     */
    public void setEmailsPurchased(int value) {
        this.emailsPurchased = value;
    }

    /**
     * Gets the value of the accountsPurchased property.
     * 
     */
    public int getAccountsPurchased() {
        return accountsPurchased;
    }

    /**
     * Sets the value of the accountsPurchased property.
     * 
     */
    public void setAccountsPurchased(int value) {
        this.accountsPurchased = value;
    }

    /**
     * Gets the value of the advAccountsPurchased property.
     * 
     */
    public int getAdvAccountsPurchased() {
        return advAccountsPurchased;
    }

    /**
     * Sets the value of the advAccountsPurchased property.
     * 
     */
    public void setAdvAccountsPurchased(int value) {
        this.advAccountsPurchased = value;
    }

    /**
     * Gets the value of the lpAccountsPurchased property.
     * 
     */
    public int getLPAccountsPurchased() {
        return lpAccountsPurchased;
    }

    /**
     * Sets the value of the lpAccountsPurchased property.
     * 
     */
    public void setLPAccountsPurchased(int value) {
        this.lpAccountsPurchased = value;
    }

    /**
     * Gets the value of the dotoAccountsPurchased property.
     * 
     */
    public int getDOTOAccountsPurchased() {
        return dotoAccountsPurchased;
    }

    /**
     * Sets the value of the dotoAccountsPurchased property.
     * 
     */
    public void setDOTOAccountsPurchased(int value) {
        this.dotoAccountsPurchased = value;
    }

    /**
     * Gets the value of the buAccountsPurchased property.
     * 
     */
    public int getBUAccountsPurchased() {
        return buAccountsPurchased;
    }

    /**
     * Sets the value of the buAccountsPurchased property.
     * 
     */
    public void setBUAccountsPurchased(int value) {
        this.buAccountsPurchased = value;
    }

    /**
     * Gets the value of the beginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginDate() {
        return beginDate;
    }

    /**
     * Sets the value of the beginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginDate(XMLGregorianCalendar value) {
        this.beginDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNotes(JAXBElement<String> value) {
        this.notes = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriod(String value) {
        this.period = value;
    }

    /**
     * Gets the value of the notificationTitle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNotificationTitle() {
        return notificationTitle;
    }

    /**
     * Sets the value of the notificationTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNotificationTitle(JAXBElement<String> value) {
        this.notificationTitle = value;
    }

    /**
     * Gets the value of the notificationMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNotificationMessage() {
        return notificationMessage;
    }

    /**
     * Sets the value of the notificationMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNotificationMessage(JAXBElement<String> value) {
        this.notificationMessage = value;
    }

    /**
     * Gets the value of the notificationFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNotificationFlag() {
        return notificationFlag;
    }

    /**
     * Sets the value of the notificationFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNotificationFlag(JAXBElement<String> value) {
        this.notificationFlag = value;
    }

    /**
     * Gets the value of the notificationExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getNotificationExpDate() {
        return notificationExpDate;
    }

    /**
     * Sets the value of the notificationExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setNotificationExpDate(JAXBElement<XMLGregorianCalendar> value) {
        this.notificationExpDate = value;
    }

    /**
     * Gets the value of the forAccounting property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getForAccounting() {
        return forAccounting;
    }

    /**
     * Sets the value of the forAccounting property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setForAccounting(JAXBElement<String> value) {
        this.forAccounting = value;
    }

    /**
     * Gets the value of the hasPurchasedEmails property.
     * 
     */
    public boolean isHasPurchasedEmails() {
        return hasPurchasedEmails;
    }

    /**
     * Sets the value of the hasPurchasedEmails property.
     * 
     */
    public void setHasPurchasedEmails(boolean value) {
        this.hasPurchasedEmails = value;
    }

    /**
     * Gets the value of the contractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * Sets the value of the contractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNumber(String value) {
        this.contractNumber = value;
    }

    /**
     * Gets the value of the contractModifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractModifier() {
        return contractModifier;
    }

    /**
     * Sets the value of the contractModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractModifier(String value) {
        this.contractModifier = value;
    }

    /**
     * Gets the value of the isRenewal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRenewal() {
        return isRenewal;
    }

    /**
     * Sets the value of the isRenewal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRenewal(Boolean value) {
        this.isRenewal = value;
    }

    /**
     * Gets the value of the numberofEmails property.
     * 
     */
    public long getNumberofEmails() {
        return numberofEmails;
    }

    /**
     * Sets the value of the numberofEmails property.
     * 
     */
    public void setNumberofEmails(long value) {
        this.numberofEmails = value;
    }

}
