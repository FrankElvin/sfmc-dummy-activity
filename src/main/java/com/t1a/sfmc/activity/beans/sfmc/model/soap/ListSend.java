
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import java.util.ArrayList;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListSend complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ListSend">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       <sequence>
 *         <element name="SendID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="List" type="{http://exacttarget.com/wsdl/partnerAPI}List" minOccurs="0"/>
 *         <element name="Duplicates" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="InvalidAddresses" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="ExistingUndeliverables" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="ExistingUnsubscribes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="HardBounces" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="SoftBounces" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="OtherBounces" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="ForwardedEmails" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="UniqueClicks" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="UniqueOpens" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="NumberSent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="NumberDelivered" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="Unsubscribes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="MissingAddresses" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="PreviewURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Links" type="{http://exacttarget.com/wsdl/partnerAPI}Link" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Events" type="{http://exacttarget.com/wsdl/partnerAPI}TrackingEvent" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListSend", propOrder = {
    "sendID",
    "list",
    "duplicates",
    "invalidAddresses",
    "existingUndeliverables",
    "existingUnsubscribes",
    "hardBounces",
    "softBounces",
    "otherBounces",
    "forwardedEmails",
    "uniqueClicks",
    "uniqueOpens",
    "numberSent",
    "numberDelivered",
    "unsubscribes",
    "missingAddresses",
    "previewURL",
    "links",
    "events"
})
public class ListSend
    extends APIObject
{

    @XmlElement(name = "SendID")
    protected Integer sendID;
    @XmlElement(name = "List")
    protected com.t1a.sfmc.activity.beans.sfmc.model.soap.List list;
    @XmlElement(name = "Duplicates")
    protected Integer duplicates;
    @XmlElement(name = "InvalidAddresses")
    protected Integer invalidAddresses;
    @XmlElement(name = "ExistingUndeliverables")
    protected Integer existingUndeliverables;
    @XmlElement(name = "ExistingUnsubscribes")
    protected Integer existingUnsubscribes;
    @XmlElement(name = "HardBounces")
    protected Integer hardBounces;
    @XmlElement(name = "SoftBounces")
    protected Integer softBounces;
    @XmlElement(name = "OtherBounces")
    protected Integer otherBounces;
    @XmlElement(name = "ForwardedEmails")
    protected Integer forwardedEmails;
    @XmlElement(name = "UniqueClicks")
    protected Integer uniqueClicks;
    @XmlElement(name = "UniqueOpens")
    protected Integer uniqueOpens;
    @XmlElementRef(name = "NumberSent", namespace = "http://exacttarget.com/wsdl/partnerAPI", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numberSent;
    @XmlElementRef(name = "NumberDelivered", namespace = "http://exacttarget.com/wsdl/partnerAPI", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numberDelivered;
    @XmlElement(name = "Unsubscribes")
    protected Integer unsubscribes;
    @XmlElement(name = "MissingAddresses")
    protected Integer missingAddresses;
    @XmlElement(name = "PreviewURL")
    protected String previewURL;
    @XmlElement(name = "Links")
    protected java.util.List<Link> links;
    @XmlElement(name = "Events")
    protected java.util.List<TrackingEvent> events;

    /**
     * Gets the value of the sendID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSendID() {
        return sendID;
    }

    /**
     * Sets the value of the sendID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSendID(Integer value) {
        this.sendID = value;
    }

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
     * Gets the value of the duplicates property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDuplicates() {
        return duplicates;
    }

    /**
     * Sets the value of the duplicates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDuplicates(Integer value) {
        this.duplicates = value;
    }

    /**
     * Gets the value of the invalidAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInvalidAddresses() {
        return invalidAddresses;
    }

    /**
     * Sets the value of the invalidAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInvalidAddresses(Integer value) {
        this.invalidAddresses = value;
    }

    /**
     * Gets the value of the existingUndeliverables property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExistingUndeliverables() {
        return existingUndeliverables;
    }

    /**
     * Sets the value of the existingUndeliverables property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExistingUndeliverables(Integer value) {
        this.existingUndeliverables = value;
    }

    /**
     * Gets the value of the existingUnsubscribes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExistingUnsubscribes() {
        return existingUnsubscribes;
    }

    /**
     * Sets the value of the existingUnsubscribes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExistingUnsubscribes(Integer value) {
        this.existingUnsubscribes = value;
    }

    /**
     * Gets the value of the hardBounces property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHardBounces() {
        return hardBounces;
    }

    /**
     * Sets the value of the hardBounces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHardBounces(Integer value) {
        this.hardBounces = value;
    }

    /**
     * Gets the value of the softBounces property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSoftBounces() {
        return softBounces;
    }

    /**
     * Sets the value of the softBounces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSoftBounces(Integer value) {
        this.softBounces = value;
    }

    /**
     * Gets the value of the otherBounces property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOtherBounces() {
        return otherBounces;
    }

    /**
     * Sets the value of the otherBounces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOtherBounces(Integer value) {
        this.otherBounces = value;
    }

    /**
     * Gets the value of the forwardedEmails property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getForwardedEmails() {
        return forwardedEmails;
    }

    /**
     * Sets the value of the forwardedEmails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setForwardedEmails(Integer value) {
        this.forwardedEmails = value;
    }

    /**
     * Gets the value of the uniqueClicks property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUniqueClicks() {
        return uniqueClicks;
    }

    /**
     * Sets the value of the uniqueClicks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUniqueClicks(Integer value) {
        this.uniqueClicks = value;
    }

    /**
     * Gets the value of the uniqueOpens property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUniqueOpens() {
        return uniqueOpens;
    }

    /**
     * Sets the value of the uniqueOpens property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUniqueOpens(Integer value) {
        this.uniqueOpens = value;
    }

    /**
     * Gets the value of the numberSent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumberSent() {
        return numberSent;
    }

    /**
     * Sets the value of the numberSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumberSent(JAXBElement<Integer> value) {
        this.numberSent = value;
    }

    /**
     * Gets the value of the numberDelivered property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumberDelivered() {
        return numberDelivered;
    }

    /**
     * Sets the value of the numberDelivered property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumberDelivered(JAXBElement<Integer> value) {
        this.numberDelivered = value;
    }

    /**
     * Gets the value of the unsubscribes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnsubscribes() {
        return unsubscribes;
    }

    /**
     * Sets the value of the unsubscribes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnsubscribes(Integer value) {
        this.unsubscribes = value;
    }

    /**
     * Gets the value of the missingAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMissingAddresses() {
        return missingAddresses;
    }

    /**
     * Sets the value of the missingAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMissingAddresses(Integer value) {
        this.missingAddresses = value;
    }

    /**
     * Gets the value of the previewURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviewURL() {
        return previewURL;
    }

    /**
     * Sets the value of the previewURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviewURL(String value) {
        this.previewURL = value;
    }

    /**
     * Gets the value of the links property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the links property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLinks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Link }
     * </p>
     * 
     * 
     * @return
     *     The value of the links property.
     */
    public java.util.List<Link> getLinks() {
        if (links == null) {
            links = new ArrayList<>();
        }
        return this.links;
    }

    /**
     * Gets the value of the events property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the events property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackingEvent }
     * </p>
     * 
     * 
     * @return
     *     The value of the events property.
     */
    public java.util.List<TrackingEvent> getEvents() {
        if (events == null) {
            events = new ArrayList<>();
        }
        return this.events;
    }

}
