
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VoiceTriggeredSend complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VoiceTriggeredSend">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       <sequence>
 *         <element name="VoiceTriggeredSendDefinition" type="{http://exacttarget.com/wsdl/partnerAPI}VoiceTriggeredSendDefinition" minOccurs="0"/>
 *         <element name="Subscriber" type="{http://exacttarget.com/wsdl/partnerAPI}Subscriber" minOccurs="0"/>
 *         <element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TransferMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TransferNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoiceTriggeredSend", propOrder = {
    "voiceTriggeredSendDefinition",
    "subscriber",
    "message",
    "number",
    "transferMessage",
    "transferNumber"
})
public class VoiceTriggeredSend
    extends APIObject
{

    @XmlElement(name = "VoiceTriggeredSendDefinition")
    protected VoiceTriggeredSendDefinition voiceTriggeredSendDefinition;
    @XmlElement(name = "Subscriber")
    protected Subscriber subscriber;
    @XmlElement(name = "Message")
    protected String message;
    @XmlElement(name = "Number")
    protected String number;
    @XmlElement(name = "TransferMessage")
    protected String transferMessage;
    @XmlElement(name = "TransferNumber")
    protected String transferNumber;

    /**
     * Gets the value of the voiceTriggeredSendDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link VoiceTriggeredSendDefinition }
     *     
     */
    public VoiceTriggeredSendDefinition getVoiceTriggeredSendDefinition() {
        return voiceTriggeredSendDefinition;
    }

    /**
     * Sets the value of the voiceTriggeredSendDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoiceTriggeredSendDefinition }
     *     
     */
    public void setVoiceTriggeredSendDefinition(VoiceTriggeredSendDefinition value) {
        this.voiceTriggeredSendDefinition = value;
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
     * Gets the value of the transferMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferMessage() {
        return transferMessage;
    }

    /**
     * Sets the value of the transferMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferMessage(String value) {
        this.transferMessage = value;
    }

    /**
     * Gets the value of the transferNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferNumber() {
        return transferNumber;
    }

    /**
     * Sets the value of the transferNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferNumber(String value) {
        this.transferNumber = value;
    }

}
