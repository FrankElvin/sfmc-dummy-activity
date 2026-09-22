
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SMSTriggeredSend complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SMSTriggeredSend">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       <sequence>
 *         <element name="SMSTriggeredSendDefinition" type="{http://exacttarget.com/wsdl/partnerAPI}SMSTriggeredSendDefinition" minOccurs="0"/>
 *         <element name="Subscriber" type="{http://exacttarget.com/wsdl/partnerAPI}Subscriber" minOccurs="0"/>
 *         <element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="FromAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="SmsSendId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SMSTriggeredSend", propOrder = {
    "smsTriggeredSendDefinition",
    "subscriber",
    "message",
    "number",
    "fromAddress",
    "smsSendId"
})
public class SMSTriggeredSend
    extends APIObject
{

    @XmlElement(name = "SMSTriggeredSendDefinition")
    protected SMSTriggeredSendDefinition smsTriggeredSendDefinition;
    @XmlElement(name = "Subscriber")
    protected Subscriber subscriber;
    @XmlElement(name = "Message")
    protected String message;
    @XmlElement(name = "Number")
    protected String number;
    @XmlElement(name = "FromAddress")
    protected String fromAddress;
    @XmlElement(name = "SmsSendId")
    protected String smsSendId;

    /**
     * Gets the value of the smsTriggeredSendDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link SMSTriggeredSendDefinition }
     *     
     */
    public SMSTriggeredSendDefinition getSMSTriggeredSendDefinition() {
        return smsTriggeredSendDefinition;
    }

    /**
     * Sets the value of the smsTriggeredSendDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link SMSTriggeredSendDefinition }
     *     
     */
    public void setSMSTriggeredSendDefinition(SMSTriggeredSendDefinition value) {
        this.smsTriggeredSendDefinition = value;
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
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the fromAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromAddress() {
        return fromAddress;
    }

    /**
     * Sets the value of the fromAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromAddress(String value) {
        this.fromAddress = value;
    }

    /**
     * Gets the value of the smsSendId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsSendId() {
        return smsSendId;
    }

    /**
     * Sets the value of the smsSendId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsSendId(String value) {
        this.smsSendId = value;
    }

}
