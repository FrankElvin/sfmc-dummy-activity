
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TrackingEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TrackingEvent">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       <sequence>
 *         <element name="SendID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="SubscriberKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="EventDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="EventType" type="{http://exacttarget.com/wsdl/partnerAPI}EventType" minOccurs="0"/>
 *         <element name="TriggeredSendDefinitionObjectID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="BatchID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackingEvent", propOrder = {
    "sendID",
    "subscriberKey",
    "eventDate",
    "eventType",
    "triggeredSendDefinitionObjectID",
    "batchID"
})
@XmlSeeAlso({
    OpenEvent.class,
    BounceEvent.class,
    UnsubEvent.class,
    ClickEvent.class,
    SentEvent.class,
    NotSentEvent.class,
    SurveyEvent.class,
    ForwardedEmailEvent.class,
    ForwardedEmailOptInEvent.class,
    DeliveredEvent.class
})
public class TrackingEvent
    extends APIObject
{

    @XmlElement(name = "SendID")
    protected Integer sendID;
    @XmlElement(name = "SubscriberKey")
    protected String subscriberKey;
    @XmlElement(name = "EventDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventDate;
    @XmlElement(name = "EventType")
    @XmlSchemaType(name = "string")
    protected EventType eventType;
    @XmlElement(name = "TriggeredSendDefinitionObjectID")
    protected String triggeredSendDefinitionObjectID;
    @XmlElement(name = "BatchID")
    protected Integer batchID;

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
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link EventType }
     *     
     */
    public EventType getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventType }
     *     
     */
    public void setEventType(EventType value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the triggeredSendDefinitionObjectID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTriggeredSendDefinitionObjectID() {
        return triggeredSendDefinitionObjectID;
    }

    /**
     * Sets the value of the triggeredSendDefinitionObjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTriggeredSendDefinitionObjectID(String value) {
        this.triggeredSendDefinitionObjectID = value;
    }

    /**
     * Gets the value of the batchID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBatchID() {
        return batchID;
    }

    /**
     * Sets the value of the batchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBatchID(Integer value) {
        this.batchID = value;
    }

}
