
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SMSMTEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SMSMTEvent">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       <sequence>
 *         <element name="SMSTriggeredSend" type="{http://exacttarget.com/wsdl/partnerAPI}SMSTriggeredSend" minOccurs="0"/>
 *         <element name="Subscriber" type="{http://exacttarget.com/wsdl/partnerAPI}Subscriber" minOccurs="0"/>
 *         <element name="MOCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="EventDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SMSMTEvent", propOrder = {
    "smsTriggeredSend",
    "subscriber",
    "moCode",
    "eventDate",
    "carrier"
})
public class SMSMTEvent
    extends APIObject
{

    @XmlElement(name = "SMSTriggeredSend")
    protected SMSTriggeredSend smsTriggeredSend;
    @XmlElement(name = "Subscriber")
    protected Subscriber subscriber;
    @XmlElement(name = "MOCode")
    protected String moCode;
    @XmlElement(name = "EventDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventDate;
    @XmlElement(name = "Carrier")
    protected String carrier;

    /**
     * Gets the value of the smsTriggeredSend property.
     * 
     * @return
     *     possible object is
     *     {@link SMSTriggeredSend }
     *     
     */
    public SMSTriggeredSend getSMSTriggeredSend() {
        return smsTriggeredSend;
    }

    /**
     * Sets the value of the smsTriggeredSend property.
     * 
     * @param value
     *     allowed object is
     *     {@link SMSTriggeredSend }
     *     
     */
    public void setSMSTriggeredSend(SMSTriggeredSend value) {
        this.smsTriggeredSend = value;
    }

    /**
     * Gets the value of the subscriber property.
     * 
     * @return
     *     possible object is
     *     {@link Subscriber }
     *     
     */
    public Subscriber getSubscriber() {
        return subscriber;
    }

    /**
     * Sets the value of the subscriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Subscriber }
     *     
     */
    public void setSubscriber(Subscriber value) {
        this.subscriber = value;
    }

    /**
     * Gets the value of the moCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOCode() {
        return moCode;
    }

    /**
     * Sets the value of the moCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOCode(String value) {
        this.moCode = value;
    }

    /**
     * Gets the value of the eventDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventDate() {
        return eventDate;
    }

    /**
     * Sets the value of the eventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventDate(XMLGregorianCalendar value) {
        this.eventDate = value;
    }

    /**
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrier(String value) {
        this.carrier = value;
    }

}
