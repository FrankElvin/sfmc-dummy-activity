
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;


/**
 * <p>Java class for TriggeredSendDefinition complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TriggeredSendDefinition">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}SendDefinition">
 *       <sequence>
 *         <element name="TriggeredSendType" type="{http://exacttarget.com/wsdl/partnerAPI}TriggeredSendTypeEnum" minOccurs="0"/>
 *         <element name="TriggeredSendStatus" type="{http://exacttarget.com/wsdl/partnerAPI}TriggeredSendStatusEnum" minOccurs="0"/>
 *         <element name="Email" type="{http://exacttarget.com/wsdl/partnerAPI}Email" minOccurs="0"/>
 *         <element name="List" type="{http://exacttarget.com/wsdl/partnerAPI}List" minOccurs="0"/>
 *         <element name="AutoAddSubscribers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="AutoUpdateSubscribers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="BatchInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="BccEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="EmailSubject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DynamicEmailSubject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="IsMultipart" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="IsWrapped" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="AllowedSlots" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         <element name="NewSlotTrigger" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="SendLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="SendWindowOpen" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         <element name="SendWindowClose" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         <element name="SendWindowDelete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="RefreshContent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ExclusionFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="SendSourceCustomerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ExclusionListCollection" type="{http://exacttarget.com/wsdl/partnerAPI}TriggeredSendExclusionList" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CCEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="SendSourceDataExtension" type="{http://exacttarget.com/wsdl/partnerAPI}DataExtension" minOccurs="0"/>
 *         <element name="IsAlwaysOn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="DisableOnEmailBuildError" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="PreHeader" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ReplyToAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ReplyToDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TriggeredSendClass" type="{http://exacttarget.com/wsdl/partnerAPI}TriggeredSendClassEnum" minOccurs="0"/>
 *         <element name="TriggeredSendSubClass" type="{http://exacttarget.com/wsdl/partnerAPI}TriggeredSendSubClassEnum" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TriggeredSendDefinition", propOrder = {
    "triggeredSendType",
    "triggeredSendStatus",
    "email",
    "list",
    "autoAddSubscribers",
    "autoUpdateSubscribers",
    "batchInterval",
    "bccEmail",
    "emailSubject",
    "dynamicEmailSubject",
    "isMultipart",
    "isWrapped",
    "allowedSlots",
    "newSlotTrigger",
    "sendLimit",
    "sendWindowOpen",
    "sendWindowClose",
    "sendWindowDelete",
    "refreshContent",
    "exclusionFilter",
    "priority",
    "sendSourceCustomerKey",
    "exclusionListCollection",
    "ccEmail",
    "sendSourceDataExtension",
    "isAlwaysOn",
    "disableOnEmailBuildError",
    "preHeader",
    "replyToAddress",
    "replyToDisplayName",
    "triggeredSendClass",
    "triggeredSendSubClass"
})
public class TriggeredSendDefinition
    extends SendDefinition
{

    /**
     * Always will be set to Continuous. For additional fee, TriggeredSendDefinition.Priority can be used to adjust priority.
     * 
     */
    @XmlElement(name = "TriggeredSendType")
    @XmlSchemaType(name = "string")
    protected TriggeredSendTypeEnum triggeredSendType;
    @XmlElement(name = "TriggeredSendStatus")
    @XmlSchemaType(name = "string")
    protected TriggeredSendStatusEnum triggeredSendStatus;
    @XmlElement(name = "Email")
    protected Email email;
    @XmlElement(name = "List")
    protected com.t1a.sfmc.activity.beans.sfmc.model.soap.List list;
    @XmlElement(name = "AutoAddSubscribers")
    protected Boolean autoAddSubscribers;
    @XmlElement(name = "AutoUpdateSubscribers")
    protected Boolean autoUpdateSubscribers;
    /**
     * Always will be set to 1.  For additional fee, TriggeredSendDefinition.Priority can be used to adjust priority.
     * 
     */
    @XmlElement(name = "BatchInterval")
    protected Integer batchInterval;
    @XmlElement(name = "BccEmail")
    protected String bccEmail;
    @XmlElement(name = "EmailSubject")
    protected String emailSubject;
    @XmlElement(name = "DynamicEmailSubject")
    protected String dynamicEmailSubject;
    @XmlElement(name = "IsMultipart")
    protected Boolean isMultipart;
    @XmlElement(name = "IsWrapped")
    protected Boolean isWrapped;
    @XmlElement(name = "AllowedSlots")
    protected Short allowedSlots;
    @XmlElement(name = "NewSlotTrigger")
    protected Integer newSlotTrigger;
    @XmlElement(name = "SendLimit")
    protected Integer sendLimit;
    @XmlElement(name = "SendWindowOpen")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar sendWindowOpen;
    @XmlElement(name = "SendWindowClose")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar sendWindowClose;
    @XmlElement(name = "SendWindowDelete")
    protected Boolean sendWindowDelete;
    @XmlElement(name = "RefreshContent")
    protected Boolean refreshContent;
    @XmlElement(name = "ExclusionFilter")
    protected String exclusionFilter;
    @XmlElement(name = "Priority")
    protected String priority;
    /**
     * Deprecated.  Use SendSourceDataExtension instead.
     * 
     */
    @XmlElement(name = "SendSourceCustomerKey")
    protected String sendSourceCustomerKey;
    @XmlElement(name = "ExclusionListCollection")
    protected java.util.List<TriggeredSendExclusionList> exclusionListCollection;
    @XmlElement(name = "CCEmail")
    protected String ccEmail;
    @XmlElement(name = "SendSourceDataExtension")
    protected DataExtension sendSourceDataExtension;
    @XmlElement(name = "IsAlwaysOn")
    protected Boolean isAlwaysOn;
    @XmlElement(name = "DisableOnEmailBuildError")
    protected Boolean disableOnEmailBuildError;
    @XmlElement(name = "PreHeader")
    protected String preHeader;
    @XmlElement(name = "ReplyToAddress")
    protected String replyToAddress;
    @XmlElement(name = "ReplyToDisplayName")
    protected String replyToDisplayName;
    @XmlElement(name = "TriggeredSendClass")
    @XmlSchemaType(name = "string")
    protected TriggeredSendClassEnum triggeredSendClass;
    @XmlElement(name = "TriggeredSendSubClass")
    @XmlSchemaType(name = "string")
    protected TriggeredSendSubClassEnum triggeredSendSubClass;

    /**
     * Always will be set to Continuous. For additional fee, TriggeredSendDefinition.Priority can be used to adjust priority.
     * 
     * @return
     *     possible object is
     *     {@link TriggeredSendTypeEnum }
     *     
     */
    public TriggeredSendTypeEnum getTriggeredSendType() {
        return triggeredSendType;
    }

    /**
     * Sets the value of the triggeredSendType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggeredSendTypeEnum }
     *     
     * @see #getTriggeredSendType()
     */
    public void setTriggeredSendType(TriggeredSendTypeEnum value) {
        this.triggeredSendType = value;
    }

    /**
     * Gets the value of the triggeredSendStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TriggeredSendStatusEnum }
     *     
     */
    public TriggeredSendStatusEnum getTriggeredSendStatus() {
        return triggeredSendStatus;
    }

    /**
     * Sets the value of the triggeredSendStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggeredSendStatusEnum }
     *     
     */
    public void setTriggeredSendStatus(TriggeredSendStatusEnum value) {
        this.triggeredSendStatus = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link Email }
     *     
     */
    public Email getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link Email }
     *     
     */
    public void setEmail(Email value) {
        this.email = value;
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
     * Gets the value of the autoAddSubscribers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoAddSubscribers() {
        return autoAddSubscribers;
    }

    /**
     * Sets the value of the autoAddSubscribers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoAddSubscribers(Boolean value) {
        this.autoAddSubscribers = value;
    }

    /**
     * Gets the value of the autoUpdateSubscribers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoUpdateSubscribers() {
        return autoUpdateSubscribers;
    }

    /**
     * Sets the value of the autoUpdateSubscribers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoUpdateSubscribers(Boolean value) {
        this.autoUpdateSubscribers = value;
    }

    /**
     * Always will be set to 1.  For additional fee, TriggeredSendDefinition.Priority can be used to adjust priority.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBatchInterval() {
        return batchInterval;
    }

    /**
     * Sets the value of the batchInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getBatchInterval()
     */
    public void setBatchInterval(Integer value) {
        this.batchInterval = value;
    }

    /**
     * Gets the value of the bccEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBccEmail() {
        return bccEmail;
    }

    /**
     * Sets the value of the bccEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBccEmail(String value) {
        this.bccEmail = value;
    }

    /**
     * Gets the value of the emailSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailSubject() {
        return emailSubject;
    }

    /**
     * Sets the value of the emailSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailSubject(String value) {
        this.emailSubject = value;
    }

    /**
     * Gets the value of the dynamicEmailSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDynamicEmailSubject() {
        return dynamicEmailSubject;
    }

    /**
     * Sets the value of the dynamicEmailSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDynamicEmailSubject(String value) {
        this.dynamicEmailSubject = value;
    }

    /**
     * Gets the value of the isMultipart property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMultipart() {
        return isMultipart;
    }

    /**
     * Sets the value of the isMultipart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMultipart(Boolean value) {
        this.isMultipart = value;
    }

    /**
     * Gets the value of the isWrapped property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsWrapped() {
        return isWrapped;
    }

    /**
     * Sets the value of the isWrapped property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsWrapped(Boolean value) {
        this.isWrapped = value;
    }

    /**
     * Gets the value of the allowedSlots property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAllowedSlots() {
        return allowedSlots;
    }

    /**
     * Sets the value of the allowedSlots property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAllowedSlots(Short value) {
        this.allowedSlots = value;
    }

    /**
     * Gets the value of the newSlotTrigger property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNewSlotTrigger() {
        return newSlotTrigger;
    }

    /**
     * Sets the value of the newSlotTrigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNewSlotTrigger(Integer value) {
        this.newSlotTrigger = value;
    }

    /**
     * Gets the value of the sendLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSendLimit() {
        return sendLimit;
    }

    /**
     * Sets the value of the sendLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSendLimit(Integer value) {
        this.sendLimit = value;
    }

    /**
     * Gets the value of the sendWindowOpen property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSendWindowOpen() {
        return sendWindowOpen;
    }

    /**
     * Sets the value of the sendWindowOpen property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSendWindowOpen(XMLGregorianCalendar value) {
        this.sendWindowOpen = value;
    }

    /**
     * Gets the value of the sendWindowClose property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSendWindowClose() {
        return sendWindowClose;
    }

    /**
     * Sets the value of the sendWindowClose property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSendWindowClose(XMLGregorianCalendar value) {
        this.sendWindowClose = value;
    }

    /**
     * Gets the value of the sendWindowDelete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendWindowDelete() {
        return sendWindowDelete;
    }

    /**
     * Sets the value of the sendWindowDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendWindowDelete(Boolean value) {
        this.sendWindowDelete = value;
    }

    /**
     * Gets the value of the refreshContent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefreshContent() {
        return refreshContent;
    }

    /**
     * Sets the value of the refreshContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefreshContent(Boolean value) {
        this.refreshContent = value;
    }

    /**
     * Gets the value of the exclusionFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExclusionFilter() {
        return exclusionFilter;
    }

    /**
     * Sets the value of the exclusionFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExclusionFilter(String value) {
        this.exclusionFilter = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Deprecated.  Use SendSourceDataExtension instead.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendSourceCustomerKey() {
        return sendSourceCustomerKey;
    }

    /**
     * Sets the value of the sendSourceCustomerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSendSourceCustomerKey()
     */
    public void setSendSourceCustomerKey(String value) {
        this.sendSourceCustomerKey = value;
    }

    /**
     * Gets the value of the exclusionListCollection property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exclusionListCollection property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExclusionListCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TriggeredSendExclusionList }
     * </p>
     * 
     * 
     * @return
     *     The value of the exclusionListCollection property.
     */
    public java.util.List<TriggeredSendExclusionList> getExclusionListCollection() {
        if (exclusionListCollection == null) {
            exclusionListCollection = new ArrayList<>();
        }
        return this.exclusionListCollection;
    }

    /**
     * Gets the value of the ccEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCEmail() {
        return ccEmail;
    }

    /**
     * Sets the value of the ccEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCEmail(String value) {
        this.ccEmail = value;
    }

    /**
     * Gets the value of the sendSourceDataExtension property.
     * 
     * @return
     *     possible object is
     *     {@link DataExtension }
     *     
     */
    public DataExtension getSendSourceDataExtension() {
        return sendSourceDataExtension;
    }

    /**
     * Sets the value of the sendSourceDataExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataExtension }
     *     
     */
    public void setSendSourceDataExtension(DataExtension value) {
        this.sendSourceDataExtension = value;
    }

    /**
     * Gets the value of the isAlwaysOn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAlwaysOn() {
        return isAlwaysOn;
    }

    /**
     * Sets the value of the isAlwaysOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAlwaysOn(Boolean value) {
        this.isAlwaysOn = value;
    }

    /**
     * Gets the value of the disableOnEmailBuildError property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableOnEmailBuildError() {
        return disableOnEmailBuildError;
    }

    /**
     * Sets the value of the disableOnEmailBuildError property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableOnEmailBuildError(Boolean value) {
        this.disableOnEmailBuildError = value;
    }

    /**
     * Gets the value of the preHeader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreHeader() {
        return preHeader;
    }

    /**
     * Sets the value of the preHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreHeader(String value) {
        this.preHeader = value;
    }

    /**
     * Gets the value of the replyToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyToAddress() {
        return replyToAddress;
    }

    /**
     * Sets the value of the replyToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyToAddress(String value) {
        this.replyToAddress = value;
    }

    /**
     * Gets the value of the replyToDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyToDisplayName() {
        return replyToDisplayName;
    }

    /**
     * Sets the value of the replyToDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyToDisplayName(String value) {
        this.replyToDisplayName = value;
    }

    /**
     * Gets the value of the triggeredSendClass property.
     * 
     * @return
     *     possible object is
     *     {@link TriggeredSendClassEnum }
     *     
     */
    public TriggeredSendClassEnum getTriggeredSendClass() {
        return triggeredSendClass;
    }

    /**
     * Sets the value of the triggeredSendClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggeredSendClassEnum }
     *     
     */
    public void setTriggeredSendClass(TriggeredSendClassEnum value) {
        this.triggeredSendClass = value;
    }

    /**
     * Gets the value of the triggeredSendSubClass property.
     * 
     * @return
     *     possible object is
     *     {@link TriggeredSendSubClassEnum }
     *     
     */
    public TriggeredSendSubClassEnum getTriggeredSendSubClass() {
        return triggeredSendSubClass;
    }

    /**
     * Sets the value of the triggeredSendSubClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggeredSendSubClassEnum }
     *     
     */
    public void setTriggeredSendSubClass(TriggeredSendSubClassEnum value) {
        this.triggeredSendSubClass = value;
    }

}
