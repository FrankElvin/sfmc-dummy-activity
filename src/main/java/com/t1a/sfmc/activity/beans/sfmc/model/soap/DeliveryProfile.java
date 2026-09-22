
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.*;


/**
 * <p>Java class for DeliveryProfile complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DeliveryProfile">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       <sequence>
 *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="SourceAddressType" type="{http://exacttarget.com/wsdl/partnerAPI}DeliveryProfileSourceAddressTypeEnum" minOccurs="0"/>
 *         <element name="PrivateIP" type="{http://exacttarget.com/wsdl/partnerAPI}PrivateIP" minOccurs="0"/>
 *         <element name="DomainType" type="{http://exacttarget.com/wsdl/partnerAPI}DeliveryProfileDomainTypeEnum" minOccurs="0"/>
 *         <element name="PrivateDomain" type="{http://exacttarget.com/wsdl/partnerAPI}PrivateDomain" minOccurs="0"/>
 *         <element name="HeaderSalutationSource" type="{http://exacttarget.com/wsdl/partnerAPI}SalutationSourceEnum" minOccurs="0"/>
 *         <element name="HeaderContentArea" type="{http://exacttarget.com/wsdl/partnerAPI}ContentArea" minOccurs="0"/>
 *         <element name="FooterSalutationSource" type="{http://exacttarget.com/wsdl/partnerAPI}SalutationSourceEnum" minOccurs="0"/>
 *         <element name="FooterContentArea" type="{http://exacttarget.com/wsdl/partnerAPI}ContentArea" minOccurs="0"/>
 *         <element name="SubscriberLevelPrivateDomain" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="SMIMESignatureCertificate" type="{http://exacttarget.com/wsdl/partnerAPI}Certificate" minOccurs="0"/>
 *         <element name="PrivateDomainSet" type="{http://exacttarget.com/wsdl/partnerAPI}PrivateDomainSet" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryProfile", propOrder = {
    "name",
    "description",
    "sourceAddressType",
    "privateIP",
    "domainType",
    "privateDomain",
    "headerSalutationSource",
    "headerContentArea",
    "footerSalutationSource",
    "footerContentArea",
    "subscriberLevelPrivateDomain",
    "smimeSignatureCertificate",
    "privateDomainSet"
})
public class DeliveryProfile
    extends APIObject
{

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "SourceAddressType")
    @XmlSchemaType(name = "string")
    protected DeliveryProfileSourceAddressTypeEnum sourceAddressType;
    @XmlElement(name = "PrivateIP")
    protected PrivateIP privateIP;
    @XmlElement(name = "DomainType")
    @XmlSchemaType(name = "string")
    protected DeliveryProfileDomainTypeEnum domainType;
    @XmlElement(name = "PrivateDomain")
    protected PrivateDomain privateDomain;
    @XmlElement(name = "HeaderSalutationSource")
    @XmlSchemaType(name = "string")
    protected SalutationSourceEnum headerSalutationSource;
    @XmlElement(name = "HeaderContentArea")
    protected ContentArea headerContentArea;
    @XmlElement(name = "FooterSalutationSource")
    @XmlSchemaType(name = "string")
    protected SalutationSourceEnum footerSalutationSource;
    @XmlElement(name = "FooterContentArea")
    protected ContentArea footerContentArea;
    @XmlElement(name = "SubscriberLevelPrivateDomain")
    protected Boolean subscriberLevelPrivateDomain;
    @XmlElement(name = "SMIMESignatureCertificate")
    protected Certificate smimeSignatureCertificate;
    @XmlElement(name = "PrivateDomainSet")
    protected PrivateDomainSet privateDomainSet;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the sourceAddressType property.
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
     */
    public void setSourceAddressType(DeliveryProfileSourceAddressTypeEnum value) {
        this.sourceAddressType = value;
    }

    /**
     * Gets the value of the privateIP property.
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
     */
    public void setPrivateIP(PrivateIP value) {
        this.privateIP = value;
    }

    /**
     * Gets the value of the domainType property.
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
     */
    public void setDomainType(DeliveryProfileDomainTypeEnum value) {
        this.domainType = value;
    }

    /**
     * Gets the value of the privateDomain property.
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
     */
    public void setPrivateDomain(PrivateDomain value) {
        this.privateDomain = value;
    }

    /**
     * Gets the value of the headerSalutationSource property.
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
     */
    public void setHeaderSalutationSource(SalutationSourceEnum value) {
        this.headerSalutationSource = value;
    }

    /**
     * Gets the value of the headerContentArea property.
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
     */
    public void setHeaderContentArea(ContentArea value) {
        this.headerContentArea = value;
    }

    /**
     * Gets the value of the footerSalutationSource property.
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
     */
    public void setFooterSalutationSource(SalutationSourceEnum value) {
        this.footerSalutationSource = value;
    }

    /**
     * Gets the value of the footerContentArea property.
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
     */
    public void setFooterContentArea(ContentArea value) {
        this.footerContentArea = value;
    }

    /**
     * Gets the value of the subscriberLevelPrivateDomain property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubscriberLevelPrivateDomain() {
        return subscriberLevelPrivateDomain;
    }

    /**
     * Sets the value of the subscriberLevelPrivateDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubscriberLevelPrivateDomain(Boolean value) {
        this.subscriberLevelPrivateDomain = value;
    }

    /**
     * Gets the value of the smimeSignatureCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link Certificate }
     *     
     */
    public Certificate getSMIMESignatureCertificate() {
        return smimeSignatureCertificate;
    }

    /**
     * Sets the value of the smimeSignatureCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Certificate }
     *     
     */
    public void setSMIMESignatureCertificate(Certificate value) {
        this.smimeSignatureCertificate = value;
    }

    /**
     * Gets the value of the privateDomainSet property.
     * 
     * @return
     *     possible object is
     *     {@link PrivateDomainSet }
     *     
     */
    public PrivateDomainSet getPrivateDomainSet() {
        return privateDomainSet;
    }

    /**
     * Sets the value of the privateDomainSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateDomainSet }
     *     
     */
    public void setPrivateDomainSet(PrivateDomainSet value) {
        this.privateDomainSet = value;
    }

}
