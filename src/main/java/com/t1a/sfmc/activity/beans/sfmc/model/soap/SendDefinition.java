
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendDefinition complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SendDefinition">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}InteractionDefinition">
 *       <sequence>
 *         <element name="CategoryID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="SendClassification" type="{http://exacttarget.com/wsdl/partnerAPI}SendClassification" minOccurs="0"/>
 *         <element name="SenderProfile" type="{http://exacttarget.com/wsdl/partnerAPI}SenderProfile" minOccurs="0"/>
 *         <element name="FromName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="FromAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DeliveryProfile" type="{http://exacttarget.com/wsdl/partnerAPI}DeliveryProfile" minOccurs="0"/>
 *         <element name="SourceAddressType" type="{http://exacttarget.com/wsdl/partnerAPI}DeliveryProfileSourceAddressTypeEnum" minOccurs="0"/>
 *         <element name="PrivateIP" type="{http://exacttarget.com/wsdl/partnerAPI}PrivateIP" minOccurs="0"/>
 *         <element name="DomainType" type="{http://exacttarget.com/wsdl/partnerAPI}DeliveryProfileDomainTypeEnum" minOccurs="0"/>
 *         <element name="PrivateDomain" type="{http://exacttarget.com/wsdl/partnerAPI}PrivateDomain" minOccurs="0"/>
 *         <element name="HeaderSalutationSource" type="{http://exacttarget.com/wsdl/partnerAPI}SalutationSourceEnum" minOccurs="0"/>
 *         <element name="HeaderContentArea" type="{http://exacttarget.com/wsdl/partnerAPI}ContentArea" minOccurs="0"/>
 *         <element name="FooterSalutationSource" type="{http://exacttarget.com/wsdl/partnerAPI}SalutationSourceEnum" minOccurs="0"/>
 *         <element name="FooterContentArea" type="{http://exacttarget.com/wsdl/partnerAPI}ContentArea" minOccurs="0"/>
 *         <element name="SuppressTracking" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="IsSendLogging" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendDefinition", propOrder = {
    "categoryID",
    "sendClassification",
    "senderProfile",
    "fromName",
    "fromAddress",
    "deliveryProfile",
    "sourceAddressType",
    "privateIP",
    "domainType",
    "privateDomain",
    "headerSalutationSource",
    "headerContentArea",
    "footerSalutationSource",
    "footerContentArea",
    "suppressTracking",
    "isSendLogging"
})
@XmlSeeAlso({
    TriggeredSendDefinition.class,
    EmailSendDefinition.class,
    VoiceTriggeredSendDefinition.class,
    SMSTriggeredSendDefinition.class
})
public class SendDefinition
    extends InteractionDefinition
{

    @XmlElement(name = "CategoryID")
    protected Integer categoryID;
    @XmlElement(name = "SendClassification")
    protected SendClassification sendClassification;
    @XmlElement(name = "SenderProfile")
    protected SenderProfile senderProfile;
    /**
     * As of Fall 2007 SenderProfile.FromName should be used.
     * 
     */
    @XmlElement(name = "FromName")
    protected String fromName;
    /**
     * As of Fall 2007 SenderProfile.FromAddress should be used.
     * 
     */
    @XmlElement(name = "FromAddress")
    protected String fromAddress;
    @XmlElement(name = "DeliveryProfile")
    protected DeliveryProfile deliveryProfile;
    /**
     * As of Fall 2007 DeliveryProfile.SourceAddressType should be used.
     * 
     */
    @XmlElement(name = "SourceAddressType")
    @XmlSchemaType(name = "string")
    protected DeliveryProfileSourceAddressTypeEnum sourceAddressType;
    /**
     * As of Fall 2007 DeliveryProfile.PrivateIP should be used.
     * 
     */
    @XmlElement(name = "PrivateIP")
    protected PrivateIP privateIP;
    /**
     * As of Fall 2007 DeliveryProfile.DomainType should be used.
     * 
     */
    @XmlElement(name = "DomainType")
    @XmlSchemaType(name = "string")
    protected DeliveryProfileDomainTypeEnum domainType;
    /**
     * As of Fall 2007 DeliveryProfile.PrivateDomain should be used.
     * 
     */
    @XmlElement(name = "PrivateDomain")
    protected PrivateDomain privateDomain;
    /**
     * As of Fall 2007 DeliveryProfile.HeaderSalutationSource should be used.
     * 
     */
    @XmlElement(name = "HeaderSalutationSource")
    @XmlSchemaType(name = "string")
    protected SalutationSourceEnum headerSalutationSource;
    /**
     * As of Fall 2007 DeliveryProfile.HeaderContentArea should be used.
     * 
     */
    @XmlElement(name = "HeaderContentArea")
    protected ContentArea headerContentArea;
    /**
     * As of Fall 2007 DeliveryProfile.FooterSalutationSource should be used.
     * 
     */
    @XmlElement(name = "FooterSalutationSource")
    @XmlSchemaType(name = "string")
    protected SalutationSourceEnum footerSalutationSource;
    /**
     * As of Fall 2007 DeliveryProfile.FooterContentArea should be used.
     * 
     */
    @XmlElement(name = "FooterContentArea")
    protected ContentArea footerContentArea;
    @XmlElement(name = "SuppressTracking")
    protected Boolean suppressTracking;
    @XmlElement(name = "IsSendLogging")
    protected Boolean isSendLogging;

    /**
     * Gets the value of the categoryID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCategoryID() {
        return categoryID;
    }

    /**
     * Sets the value of the categoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCategoryID(Integer value) {
        this.categoryID = value;
    }

    /**
     * Gets the value of the sendClassification property.
     * 
     * @return
     *     possible object is
     *     {@link SendClassification }
     *     
     */
    public SendClassification getSendClassification() {
        return sendClassification;
    }

    /**
     * Sets the value of the sendClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendClassification }
     *     
     */
    public void setSendClassification(SendClassification value) {
        this.sendClassification = value;
    }

    /**
     * Gets the value of the senderProfile property.
     * 
     * @return
     *     possible object is
     *     {@link SenderProfile }
     *     
     */
    public SenderProfile getSenderProfile() {
        return senderProfile;
    }

    /**
     * Sets the value of the senderProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link SenderProfile }
     *     
     */
    public void setSenderProfile(SenderProfile value) {
        this.senderProfile = value;
    }

    /**
     * As of Fall 2007 SenderProfile.FromName should be used.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromName() {
        return fromName;
    }

    /**
     * Sets the value of the fromName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFromName()
     */
    public void setFromName(String value) {
        this.fromName = value;
    }

    /**
     * As of Fall 2007 SenderProfile.FromAddress should be used.
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
     * @see #getFromAddress()
     */
    public void setFromAddress(String value) {
        this.fromAddress = value;
    }

    /**
     * Gets the value of the deliveryProfile property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryProfile }
     *     
     */
    public DeliveryProfile getDeliveryProfile() {
        return deliveryProfile;
    }

    /**
     * Sets the value of the deliveryProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryProfile }
     *     
     */
    public void setDeliveryProfile(DeliveryProfile value) {
        this.deliveryProfile = value;
    }

    /**
     * As of Fall 2007 DeliveryProfile.SourceAddressType should be used.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryProfileSourceAddressTypeEnum }
     *     
     */
    public DeliveryProfileSourceAddressTypeEnum getSourceAddressType() {
        return sourceAddressType;
    }

    /**
     * Sets the value of the sourceAddressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryProfileSourceAddressTypeEnum }
     *     
     * @see #getSourceAddressType()
     */
    public void setSourceAddressType(DeliveryProfileSourceAddressTypeEnum value) {
        this.sourceAddressType = value;
    }

    /**
     * As of Fall 2007 DeliveryProfile.PrivateIP should be used.
     * 
     * @return
     *     possible object is
     *     {@link PrivateIP }
     *     
     */
    public PrivateIP getPrivateIP() {
        return privateIP;
    }

    /**
     * Sets the value of the privateIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateIP }
     *     
     * @see #getPrivateIP()
     */
    public void setPrivateIP(PrivateIP value) {
        this.privateIP = value;
    }

    /**
     * As of Fall 2007 DeliveryProfile.DomainType should be used.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryProfileDomainTypeEnum }
     *     
     */
    public DeliveryProfileDomainTypeEnum getDomainType() {
        return domainType;
    }

    /**
     * Sets the value of the domainType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryProfileDomainTypeEnum }
     *     
     * @see #getDomainType()
     */
    public void setDomainType(DeliveryProfileDomainTypeEnum value) {
        this.domainType = value;
    }

    /**
     * As of Fall 2007 DeliveryProfile.PrivateDomain should be used.
     * 
     * @return
     *     possible object is
     *     {@link PrivateDomain }
     *     
     */
    public PrivateDomain getPrivateDomain() {
        return privateDomain;
    }

    /**
     * Sets the value of the privateDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateDomain }
     *     
     * @see #getPrivateDomain()
     */
    public void setPrivateDomain(PrivateDomain value) {
        this.privateDomain = value;
    }

    /**
     * As of Fall 2007 DeliveryProfile.HeaderSalutationSource should be used.
     * 
     * @return
     *     possible object is
     *     {@link SalutationSourceEnum }
     *     
     */
    public SalutationSourceEnum getHeaderSalutationSource() {
        return headerSalutationSource;
    }

    /**
     * Sets the value of the headerSalutationSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalutationSourceEnum }
     *     
     * @see #getHeaderSalutationSource()
     */
    public void setHeaderSalutationSource(SalutationSourceEnum value) {
        this.headerSalutationSource = value;
    }

    /**
     * As of Fall 2007 DeliveryProfile.HeaderContentArea should be used.
     * 
     * @return
     *     possible object is
     *     {@link ContentArea }
     *     
     */
    public ContentArea getHeaderContentArea() {
        return headerContentArea;
    }

    /**
     * Sets the value of the headerContentArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentArea }
     *     
     * @see #getHeaderContentArea()
     */
    public void setHeaderContentArea(ContentArea value) {
        this.headerContentArea = value;
    }

    /**
     * As of Fall 2007 DeliveryProfile.FooterSalutationSource should be used.
     * 
     * @return
     *     possible object is
     *     {@link SalutationSourceEnum }
     *     
     */
    public SalutationSourceEnum getFooterSalutationSource() {
        return footerSalutationSource;
    }

    /**
     * Sets the value of the footerSalutationSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalutationSourceEnum }
     *     
     * @see #getFooterSalutationSource()
     */
    public void setFooterSalutationSource(SalutationSourceEnum value) {
        this.footerSalutationSource = value;
    }

    /**
     * As of Fall 2007 DeliveryProfile.FooterContentArea should be used.
     * 
     * @return
     *     possible object is
     *     {@link ContentArea }
     *     
     */
    public ContentArea getFooterContentArea() {
        return footerContentArea;
    }

    /**
     * Sets the value of the footerContentArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentArea }
     *     
     * @see #getFooterContentArea()
     */
    public void setFooterContentArea(ContentArea value) {
        this.footerContentArea = value;
    }

    /**
     * Gets the value of the suppressTracking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuppressTracking() {
        return suppressTracking;
    }

    /**
     * Sets the value of the suppressTracking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuppressTracking(Boolean value) {
        this.suppressTracking = value;
    }

    /**
     * Gets the value of the isSendLogging property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSendLogging() {
        return isSendLogging;
    }

    /**
     * Sets the value of the isSendLogging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSendLogging(Boolean value) {
        this.isSendLogging = value;
    }

}
