
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TriggeredSendSummary complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TriggeredSendSummary">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       <sequence>
 *         <element name="TriggeredSendDefinition" type="{http://exacttarget.com/wsdl/partnerAPI}TriggeredSendDefinition" minOccurs="0"/>
 *         <element name="Sent" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="NotSentDueToOptOut" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="NotSentDueToUndeliverable" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="Bounces" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="Opens" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="Clicks" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="UniqueOpens" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="UniqueClicks" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="OptOuts" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="SurveyResponses" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="FTAFRequests" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="FTAFEmailsSent" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="FTAFOptIns" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="Conversions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="UniqueConversions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="InProcess" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="NotSentDueToError" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="Queued" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TriggeredSendSummary", propOrder = {
    "triggeredSendDefinition",
    "sent",
    "notSentDueToOptOut",
    "notSentDueToUndeliverable",
    "bounces",
    "opens",
    "clicks",
    "uniqueOpens",
    "uniqueClicks",
    "optOuts",
    "surveyResponses",
    "ftafRequests",
    "ftafEmailsSent",
    "ftafOptIns",
    "conversions",
    "uniqueConversions",
    "inProcess",
    "notSentDueToError",
    "queued"
})
public class TriggeredSendSummary
    extends APIObject
{

    @XmlElement(name = "TriggeredSendDefinition")
    protected TriggeredSendDefinition triggeredSendDefinition;
    @XmlElement(name = "Sent")
    protected Long sent;
    @XmlElement(name = "NotSentDueToOptOut")
    protected Long notSentDueToOptOut;
    @XmlElement(name = "NotSentDueToUndeliverable")
    protected Long notSentDueToUndeliverable;
    @XmlElement(name = "Bounces")
    protected Long bounces;
    @XmlElement(name = "Opens")
    protected Long opens;
    @XmlElement(name = "Clicks")
    protected Long clicks;
    @XmlElement(name = "UniqueOpens")
    protected Long uniqueOpens;
    @XmlElement(name = "UniqueClicks")
    protected Long uniqueClicks;
    @XmlElement(name = "OptOuts")
    protected Long optOuts;
    @XmlElement(name = "SurveyResponses")
    protected Long surveyResponses;
    @XmlElement(name = "FTAFRequests")
    protected Long ftafRequests;
    @XmlElement(name = "FTAFEmailsSent")
    protected Long ftafEmailsSent;
    @XmlElement(name = "FTAFOptIns")
    protected Long ftafOptIns;
    @XmlElement(name = "Conversions")
    protected Long conversions;
    @XmlElement(name = "UniqueConversions")
    protected Long uniqueConversions;
    @XmlElement(name = "InProcess")
    protected Long inProcess;
    @XmlElement(name = "NotSentDueToError")
    protected Long notSentDueToError;
    @XmlElement(name = "Queued")
    protected Long queued;

    /**
     * Gets the value of the triggeredSendDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link TriggeredSendDefinition }
     *     
     */
    public TriggeredSendDefinition getTriggeredSendDefinition() {
        return triggeredSendDefinition;
    }

    /**
     * Sets the value of the triggeredSendDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggeredSendDefinition }
     *     
     */
    public void setTriggeredSendDefinition(TriggeredSendDefinition value) {
        this.triggeredSendDefinition = value;
    }

    /**
     * Gets the value of the sent property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSent() {
        return sent;
    }

    /**
     * Sets the value of the sent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSent(Long value) {
        this.sent = value;
    }

    /**
     * Gets the value of the notSentDueToOptOut property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNotSentDueToOptOut() {
        return notSentDueToOptOut;
    }

    /**
     * Sets the value of the notSentDueToOptOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNotSentDueToOptOut(Long value) {
        this.notSentDueToOptOut = value;
    }

    /**
     * Gets the value of the notSentDueToUndeliverable property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNotSentDueToUndeliverable() {
        return notSentDueToUndeliverable;
    }

    /**
     * Sets the value of the notSentDueToUndeliverable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNotSentDueToUndeliverable(Long value) {
        this.notSentDueToUndeliverable = value;
    }

    /**
     * Gets the value of the bounces property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBounces() {
        return bounces;
    }

    /**
     * Sets the value of the bounces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBounces(Long value) {
        this.bounces = value;
    }

    /**
     * Gets the value of the opens property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOpens() {
        return opens;
    }

    /**
     * Sets the value of the opens property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOpens(Long value) {
        this.opens = value;
    }

    /**
     * Gets the value of the clicks property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClicks() {
        return clicks;
    }

    /**
     * Sets the value of the clicks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClicks(Long value) {
        this.clicks = value;
    }

    /**
     * Gets the value of the uniqueOpens property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUniqueOpens() {
        return uniqueOpens;
    }

    /**
     * Sets the value of the uniqueOpens property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUniqueOpens(Long value) {
        this.uniqueOpens = value;
    }

    /**
     * Gets the value of the uniqueClicks property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUniqueClicks() {
        return uniqueClicks;
    }

    /**
     * Sets the value of the uniqueClicks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUniqueClicks(Long value) {
        this.uniqueClicks = value;
    }

    /**
     * Gets the value of the optOuts property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOptOuts() {
        return optOuts;
    }

    /**
     * Sets the value of the optOuts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOptOuts(Long value) {
        this.optOuts = value;
    }

    /**
     * Gets the value of the surveyResponses property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSurveyResponses() {
        return surveyResponses;
    }

    /**
     * Sets the value of the surveyResponses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSurveyResponses(Long value) {
        this.surveyResponses = value;
    }

    /**
     * Gets the value of the ftafRequests property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFTAFRequests() {
        return ftafRequests;
    }

    /**
     * Sets the value of the ftafRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFTAFRequests(Long value) {
        this.ftafRequests = value;
    }

    /**
     * Gets the value of the ftafEmailsSent property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFTAFEmailsSent() {
        return ftafEmailsSent;
    }

    /**
     * Sets the value of the ftafEmailsSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFTAFEmailsSent(Long value) {
        this.ftafEmailsSent = value;
    }

    /**
     * Gets the value of the ftafOptIns property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFTAFOptIns() {
        return ftafOptIns;
    }

    /**
     * Sets the value of the ftafOptIns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFTAFOptIns(Long value) {
        this.ftafOptIns = value;
    }

    /**
     * Gets the value of the conversions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConversions() {
        return conversions;
    }

    /**
     * Sets the value of the conversions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConversions(Long value) {
        this.conversions = value;
    }

    /**
     * Gets the value of the uniqueConversions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUniqueConversions() {
        return uniqueConversions;
    }

    /**
     * Sets the value of the uniqueConversions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUniqueConversions(Long value) {
        this.uniqueConversions = value;
    }

    /**
     * Gets the value of the inProcess property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInProcess() {
        return inProcess;
    }

    /**
     * Sets the value of the inProcess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInProcess(Long value) {
        this.inProcess = value;
    }

    /**
     * Gets the value of the notSentDueToError property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNotSentDueToError() {
        return notSentDueToError;
    }

    /**
     * Sets the value of the notSentDueToError property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNotSentDueToError(Long value) {
        this.notSentDueToError = value;
    }

    /**
     * Gets the value of the queued property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQueued() {
        return queued;
    }

    /**
     * Sets the value of the queued property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQueued(Long value) {
        this.queued = value;
    }

}
