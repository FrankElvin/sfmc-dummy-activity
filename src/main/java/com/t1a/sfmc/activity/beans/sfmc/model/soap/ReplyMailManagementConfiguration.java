
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReplyMailManagementConfiguration complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ReplyMailManagementConfiguration">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       <sequence>
 *         <element name="EmailDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ReplySubdomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="EmailReplyAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DNSRedirectComplete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="DeleteAutoReplies" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="SupportUnsubscribes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="SupportUnsubKeyword" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="SupportUnsubscribeKeyword" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="SupportRemoveKeyword" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="SupportOptOutKeyword" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="SupportLeaveKeyword" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="SupportMisspelledKeywords" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="SendAutoReplies" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="AutoReplySubject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="AutoReplyBody" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ForwardingAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplyMailManagementConfiguration", propOrder = {
    "emailDisplayName",
    "replySubdomain",
    "emailReplyAddress",
    "dnsRedirectComplete",
    "deleteAutoReplies",
    "supportUnsubscribes",
    "supportUnsubKeyword",
    "supportUnsubscribeKeyword",
    "supportRemoveKeyword",
    "supportOptOutKeyword",
    "supportLeaveKeyword",
    "supportMisspelledKeywords",
    "sendAutoReplies",
    "autoReplySubject",
    "autoReplyBody",
    "forwardingAddress"
})
public class ReplyMailManagementConfiguration
    extends APIObject
{

    @XmlElement(name = "EmailDisplayName")
    protected String emailDisplayName;
    @XmlElement(name = "ReplySubdomain")
    protected String replySubdomain;
    @XmlElement(name = "EmailReplyAddress")
    protected String emailReplyAddress;
    @XmlElement(name = "DNSRedirectComplete")
    protected Boolean dnsRedirectComplete;
    @XmlElement(name = "DeleteAutoReplies")
    protected Boolean deleteAutoReplies;
    @XmlElement(name = "SupportUnsubscribes")
    protected Boolean supportUnsubscribes;
    @XmlElement(name = "SupportUnsubKeyword")
    protected Boolean supportUnsubKeyword;
    @XmlElement(name = "SupportUnsubscribeKeyword")
    protected Boolean supportUnsubscribeKeyword;
    @XmlElement(name = "SupportRemoveKeyword")
    protected Boolean supportRemoveKeyword;
    @XmlElement(name = "SupportOptOutKeyword")
    protected Boolean supportOptOutKeyword;
    @XmlElement(name = "SupportLeaveKeyword")
    protected Boolean supportLeaveKeyword;
    @XmlElement(name = "SupportMisspelledKeywords")
    protected Boolean supportMisspelledKeywords;
    @XmlElement(name = "SendAutoReplies")
    protected Boolean sendAutoReplies;
    @XmlElement(name = "AutoReplySubject")
    protected String autoReplySubject;
    @XmlElement(name = "AutoReplyBody")
    protected String autoReplyBody;
    @XmlElement(name = "ForwardingAddress")
    protected String forwardingAddress;

    /**
     * Gets the value of the emailDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailDisplayName() {
        return emailDisplayName;
    }

    /**
     * Sets the value of the emailDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailDisplayName(String value) {
        this.emailDisplayName = value;
    }

    /**
     * Gets the value of the replySubdomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplySubdomain() {
        return replySubdomain;
    }

    /**
     * Sets the value of the replySubdomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplySubdomain(String value) {
        this.replySubdomain = value;
    }

    /**
     * Gets the value of the emailReplyAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailReplyAddress() {
        return emailReplyAddress;
    }

    /**
     * Sets the value of the emailReplyAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailReplyAddress(String value) {
        this.emailReplyAddress = value;
    }

    /**
     * Gets the value of the dnsRedirectComplete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDNSRedirectComplete() {
        return dnsRedirectComplete;
    }

    /**
     * Sets the value of the dnsRedirectComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDNSRedirectComplete(Boolean value) {
        this.dnsRedirectComplete = value;
    }

    /**
     * Gets the value of the deleteAutoReplies property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeleteAutoReplies() {
        return deleteAutoReplies;
    }

    /**
     * Sets the value of the deleteAutoReplies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeleteAutoReplies(Boolean value) {
        this.deleteAutoReplies = value;
    }

    /**
     * Gets the value of the supportUnsubscribes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportUnsubscribes() {
        return supportUnsubscribes;
    }

    /**
     * Sets the value of the supportUnsubscribes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportUnsubscribes(Boolean value) {
        this.supportUnsubscribes = value;
    }

    /**
     * Gets the value of the supportUnsubKeyword property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportUnsubKeyword() {
        return supportUnsubKeyword;
    }

    /**
     * Sets the value of the supportUnsubKeyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportUnsubKeyword(Boolean value) {
        this.supportUnsubKeyword = value;
    }

    /**
     * Gets the value of the supportUnsubscribeKeyword property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportUnsubscribeKeyword() {
        return supportUnsubscribeKeyword;
    }

    /**
     * Sets the value of the supportUnsubscribeKeyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportUnsubscribeKeyword(Boolean value) {
        this.supportUnsubscribeKeyword = value;
    }

    /**
     * Gets the value of the supportRemoveKeyword property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportRemoveKeyword() {
        return supportRemoveKeyword;
    }

    /**
     * Sets the value of the supportRemoveKeyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportRemoveKeyword(Boolean value) {
        this.supportRemoveKeyword = value;
    }

    /**
     * Gets the value of the supportOptOutKeyword property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportOptOutKeyword() {
        return supportOptOutKeyword;
    }

    /**
     * Sets the value of the supportOptOutKeyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportOptOutKeyword(Boolean value) {
        this.supportOptOutKeyword = value;
    }

    /**
     * Gets the value of the supportLeaveKeyword property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportLeaveKeyword() {
        return supportLeaveKeyword;
    }

    /**
     * Sets the value of the supportLeaveKeyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportLeaveKeyword(Boolean value) {
        this.supportLeaveKeyword = value;
    }

    /**
     * Gets the value of the supportMisspelledKeywords property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportMisspelledKeywords() {
        return supportMisspelledKeywords;
    }

    /**
     * Sets the value of the supportMisspelledKeywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportMisspelledKeywords(Boolean value) {
        this.supportMisspelledKeywords = value;
    }

    /**
     * Gets the value of the sendAutoReplies property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendAutoReplies() {
        return sendAutoReplies;
    }

    /**
     * Sets the value of the sendAutoReplies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendAutoReplies(Boolean value) {
        this.sendAutoReplies = value;
    }

    /**
     * Gets the value of the autoReplySubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoReplySubject() {
        return autoReplySubject;
    }

    /**
     * Sets the value of the autoReplySubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoReplySubject(String value) {
        this.autoReplySubject = value;
    }

    /**
     * Gets the value of the autoReplyBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoReplyBody() {
        return autoReplyBody;
    }

    /**
     * Sets the value of the autoReplyBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoReplyBody(String value) {
        this.autoReplyBody = value;
    }

    /**
     * Gets the value of the forwardingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForwardingAddress() {
        return forwardingAddress;
    }

    /**
     * Sets the value of the forwardingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForwardingAddress(String value) {
        this.forwardingAddress = value;
    }

}
