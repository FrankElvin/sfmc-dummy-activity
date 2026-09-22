
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for Asset complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Asset">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       <sequence>
 *         <element name="ContentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Version" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="Locked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ActiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="MemberId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="EnterpriseId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="CreatedBy" type="{http://exacttarget.com/wsdl/partnerAPI}UserBasicsEntity" minOccurs="0"/>
 *         <element name="ModifiedBy" type="{http://exacttarget.com/wsdl/partnerAPI}UserBasicsEntity" minOccurs="0"/>
 *         <element name="Content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Design" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="SuperContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="MinBlocks" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="MaxBlocks" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="File" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="AssetType" type="{http://exacttarget.com/wsdl/partnerAPI}NameIdReference" minOccurs="0"/>
 *         <element name="Status" type="{http://exacttarget.com/wsdl/partnerAPI}NameIdReference" minOccurs="0"/>
 *         <element name="Thumbnail" type="{http://exacttarget.com/wsdl/partnerAPI}Thumbnail" minOccurs="0"/>
 *         <element name="GenerateFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Template" type="{http://exacttarget.com/wsdl/partnerAPI}Asset" minOccurs="0"/>
 *         <element name="Category" type="{http://exacttarget.com/wsdl/partnerAPI}CategoryNameIdReference" minOccurs="0"/>
 *         <element name="Data" type="{http://exacttarget.com/wsdl/partnerAPI}AssetAnyProperty" minOccurs="0"/>
 *         <element name="FileProperties" type="{http://exacttarget.com/wsdl/partnerAPI}AssetAnyProperty" minOccurs="0"/>
 *         <element name="Meta" type="{http://exacttarget.com/wsdl/partnerAPI}AssetAnyProperty" minOccurs="0"/>
 *         <element name="CustomFields" type="{http://exacttarget.com/wsdl/partnerAPI}AssetAnyProperty" minOccurs="0"/>
 *         <element name="SharingProperties" type="{http://exacttarget.com/wsdl/partnerAPI}AssetAnyProperty" minOccurs="0"/>
 *         <element name="Views" type="{http://exacttarget.com/wsdl/partnerAPI}AssetAnyProperty" minOccurs="0"/>
 *         <element name="Blocks" type="{http://exacttarget.com/wsdl/partnerAPI}AssetAnyProperty" minOccurs="0"/>
 *         <element name="Slots" type="{http://exacttarget.com/wsdl/partnerAPI}AssetAnyProperty" minOccurs="0"/>
 *         <element name="Channels" type="{http://exacttarget.com/wsdl/partnerAPI}AssetAnyProperty" minOccurs="0"/>
 *         <element name="AllowedBlocks" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Block" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Tags" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Tag" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Attributes" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Attribute" type="{http://exacttarget.com/wsdl/partnerAPI}AttributeEntityV1" maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Asset", propOrder = {
    "contentType",
    "version",
    "locked",
    "name",
    "description",
    "activeDate",
    "expirationDate",
    "memberId",
    "enterpriseId",
    "createdBy",
    "modifiedBy",
    "content",
    "design",
    "superContent",
    "minBlocks",
    "maxBlocks",
    "file",
    "assetType",
    "status",
    "thumbnail",
    "generateFrom",
    "template",
    "category",
    "data",
    "fileProperties",
    "meta",
    "customFields",
    "sharingProperties",
    "views",
    "blocks",
    "slots",
    "channels",
    "allowedBlocks",
    "tags",
    "attributes"
})
public class Asset
    extends APIObject
{

    @XmlElement(name = "ContentType")
    protected String contentType;
    @XmlElementRef(name = "Version", namespace = "http://exacttarget.com/wsdl/partnerAPI", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> version;
    @XmlElementRef(name = "Locked", namespace = "http://exacttarget.com/wsdl/partnerAPI", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> locked;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElementRef(name = "ActiveDate", namespace = "http://exacttarget.com/wsdl/partnerAPI", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> activeDate;
    @XmlElementRef(name = "ExpirationDate", namespace = "http://exacttarget.com/wsdl/partnerAPI", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> expirationDate;
    @XmlElementRef(name = "MemberId", namespace = "http://exacttarget.com/wsdl/partnerAPI", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> memberId;
    @XmlElementRef(name = "EnterpriseId", namespace = "http://exacttarget.com/wsdl/partnerAPI", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> enterpriseId;
    @XmlElement(name = "CreatedBy")
    protected UserBasicsEntity createdBy;
    @XmlElement(name = "ModifiedBy")
    protected UserBasicsEntity modifiedBy;
    @XmlElement(name = "Content")
    protected String content;
    @XmlElement(name = "Design")
    protected String design;
    @XmlElement(name = "SuperContent")
    protected String superContent;
    @XmlElementRef(name = "MinBlocks", namespace = "http://exacttarget.com/wsdl/partnerAPI", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> minBlocks;
    @XmlElementRef(name = "MaxBlocks", namespace = "http://exacttarget.com/wsdl/partnerAPI", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxBlocks;
    @XmlElement(name = "File")
    protected String file;
    @XmlElement(name = "AssetType")
    protected NameIdReference assetType;
    @XmlElement(name = "Status")
    protected NameIdReference status;
    @XmlElement(name = "Thumbnail")
    protected Thumbnail thumbnail;
    @XmlElement(name = "GenerateFrom")
    protected String generateFrom;
    @XmlElement(name = "Template")
    protected Asset template;
    @XmlElement(name = "Category")
    protected CategoryNameIdReference category;
    @XmlElement(name = "Data")
    protected AssetAnyProperty data;
    @XmlElement(name = "FileProperties")
    protected AssetAnyProperty fileProperties;
    @XmlElement(name = "Meta")
    protected AssetAnyProperty meta;
    @XmlElement(name = "CustomFields")
    protected AssetAnyProperty customFields;
    @XmlElement(name = "SharingProperties")
    protected AssetAnyProperty sharingProperties;
    @XmlElement(name = "Views")
    protected AssetAnyProperty views;
    @XmlElement(name = "Blocks")
    protected AssetAnyProperty blocks;
    @XmlElement(name = "Slots")
    protected AssetAnyProperty slots;
    @XmlElement(name = "Channels")
    protected AssetAnyProperty channels;
    @XmlElement(name = "AllowedBlocks")
    protected AllowedBlocks allowedBlocks;
    @XmlElement(name = "Tags")
    protected Tags tags;
    @XmlElement(name = "Attributes")
    protected Attributes attributes;

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentType(String value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setVersion(JAXBElement<Integer> value) {
        this.version = value;
    }

    /**
     * Gets the value of the locked property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getLocked() {
        return locked;
    }

    /**
     * Sets the value of the locked property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setLocked(JAXBElement<Boolean> value) {
        this.locked = value;
    }

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
     * Gets the value of the activeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getActiveDate() {
        return activeDate;
    }

    /**
     * Sets the value of the activeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setActiveDate(JAXBElement<XMLGregorianCalendar> value) {
        this.activeDate = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setExpirationDate(JAXBElement<XMLGregorianCalendar> value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the memberId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getMemberId() {
        return memberId;
    }

    /**
     * Sets the value of the memberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setMemberId(JAXBElement<Long> value) {
        this.memberId = value;
    }

    /**
     * Gets the value of the enterpriseId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getEnterpriseId() {
        return enterpriseId;
    }

    /**
     * Sets the value of the enterpriseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setEnterpriseId(JAXBElement<Long> value) {
        this.enterpriseId = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link UserBasicsEntity }
     *     
     */
    public UserBasicsEntity getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserBasicsEntity }
     *     
     */
    public void setCreatedBy(UserBasicsEntity value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the modifiedBy property.
     * 
     * @return
     *     possible object is
     *     {@link UserBasicsEntity }
     *     
     */
    public UserBasicsEntity getModifiedBy() {
        return modifiedBy;
    }

    /**
     * Sets the value of the modifiedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserBasicsEntity }
     *     
     */
    public void setModifiedBy(UserBasicsEntity value) {
        this.modifiedBy = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the design property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesign() {
        return design;
    }

    /**
     * Sets the value of the design property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesign(String value) {
        this.design = value;
    }

    /**
     * Gets the value of the superContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuperContent() {
        return superContent;
    }

    /**
     * Sets the value of the superContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuperContent(String value) {
        this.superContent = value;
    }

    /**
     * Gets the value of the minBlocks property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMinBlocks() {
        return minBlocks;
    }

    /**
     * Sets the value of the minBlocks property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMinBlocks(JAXBElement<Integer> value) {
        this.minBlocks = value;
    }

    /**
     * Gets the value of the maxBlocks property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxBlocks() {
        return maxBlocks;
    }

    /**
     * Sets the value of the maxBlocks property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxBlocks(JAXBElement<Integer> value) {
        this.maxBlocks = value;
    }

    /**
     * Gets the value of the file property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFile() {
        return file;
    }

    /**
     * Sets the value of the file property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFile(String value) {
        this.file = value;
    }

    /**
     * Gets the value of the assetType property.
     * 
     * @return
     *     possible object is
     *     {@link NameIdReference }
     *     
     */
    public NameIdReference getAssetType() {
        return assetType;
    }

    /**
     * Sets the value of the assetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameIdReference }
     *     
     */
    public void setAssetType(NameIdReference value) {
        this.assetType = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link NameIdReference }
     *     
     */
    public NameIdReference getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameIdReference }
     *     
     */
    public void setStatus(NameIdReference value) {
        this.status = value;
    }

    /**
     * Gets the value of the thumbnail property.
     * 
     * @return
     *     possible object is
     *     {@link Thumbnail }
     *     
     */
    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    /**
     * Sets the value of the thumbnail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Thumbnail }
     *     
     */
    public void setThumbnail(Thumbnail value) {
        this.thumbnail = value;
    }

    /**
     * Gets the value of the generateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenerateFrom() {
        return generateFrom;
    }

    /**
     * Sets the value of the generateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenerateFrom(String value) {
        this.generateFrom = value;
    }

    /**
     * Gets the value of the template property.
     * 
     * @return
     *     possible object is
     *     {@link Asset }
     *     
     */
    public Asset getTemplate() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     * @param value
     *     allowed object is
     *     {@link Asset }
     *     
     */
    public void setTemplate(Asset value) {
        this.template = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryNameIdReference }
     *     
     */
    public CategoryNameIdReference getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryNameIdReference }
     *     
     */
    public void setCategory(CategoryNameIdReference value) {
        this.category = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link AssetAnyProperty }
     *     
     */
    public AssetAnyProperty getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetAnyProperty }
     *     
     */
    public void setData(AssetAnyProperty value) {
        this.data = value;
    }

    /**
     * Gets the value of the fileProperties property.
     * 
     * @return
     *     possible object is
     *     {@link AssetAnyProperty }
     *     
     */
    public AssetAnyProperty getFileProperties() {
        return fileProperties;
    }

    /**
     * Sets the value of the fileProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetAnyProperty }
     *     
     */
    public void setFileProperties(AssetAnyProperty value) {
        this.fileProperties = value;
    }

    /**
     * Gets the value of the meta property.
     * 
     * @return
     *     possible object is
     *     {@link AssetAnyProperty }
     *     
     */
    public AssetAnyProperty getMeta() {
        return meta;
    }

    /**
     * Sets the value of the meta property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetAnyProperty }
     *     
     */
    public void setMeta(AssetAnyProperty value) {
        this.meta = value;
    }

    /**
     * Gets the value of the customFields property.
     * 
     * @return
     *     possible object is
     *     {@link AssetAnyProperty }
     *     
     */
    public AssetAnyProperty getCustomFields() {
        return customFields;
    }

    /**
     * Sets the value of the customFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetAnyProperty }
     *     
     */
    public void setCustomFields(AssetAnyProperty value) {
        this.customFields = value;
    }

    /**
     * Gets the value of the sharingProperties property.
     * 
     * @return
     *     possible object is
     *     {@link AssetAnyProperty }
     *     
     */
    public AssetAnyProperty getSharingProperties() {
        return sharingProperties;
    }

    /**
     * Sets the value of the sharingProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetAnyProperty }
     *     
     */
    public void setSharingProperties(AssetAnyProperty value) {
        this.sharingProperties = value;
    }

    /**
     * Gets the value of the views property.
     * 
     * @return
     *     possible object is
     *     {@link AssetAnyProperty }
     *     
     */
    public AssetAnyProperty getViews() {
        return views;
    }

    /**
     * Sets the value of the views property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetAnyProperty }
     *     
     */
    public void setViews(AssetAnyProperty value) {
        this.views = value;
    }

    /**
     * Gets the value of the blocks property.
     * 
     * @return
     *     possible object is
     *     {@link AssetAnyProperty }
     *     
     */
    public AssetAnyProperty getBlocks() {
        return blocks;
    }

    /**
     * Sets the value of the blocks property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetAnyProperty }
     *     
     */
    public void setBlocks(AssetAnyProperty value) {
        this.blocks = value;
    }

    /**
     * Gets the value of the slots property.
     * 
     * @return
     *     possible object is
     *     {@link AssetAnyProperty }
     *     
     */
    public AssetAnyProperty getSlots() {
        return slots;
    }

    /**
     * Sets the value of the slots property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetAnyProperty }
     *     
     */
    public void setSlots(AssetAnyProperty value) {
        this.slots = value;
    }

    /**
     * Gets the value of the channels property.
     * 
     * @return
     *     possible object is
     *     {@link AssetAnyProperty }
     *     
     */
    public AssetAnyProperty getChannels() {
        return channels;
    }

    /**
     * Sets the value of the channels property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetAnyProperty }
     *     
     */
    public void setChannels(AssetAnyProperty value) {
        this.channels = value;
    }

    /**
     * Gets the value of the allowedBlocks property.
     * 
     * @return
     *     possible object is
     *     {@link AllowedBlocks }
     *     
     */
    public AllowedBlocks getAllowedBlocks() {
        return allowedBlocks;
    }

    /**
     * Sets the value of the allowedBlocks property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowedBlocks }
     *     
     */
    public void setAllowedBlocks(AllowedBlocks value) {
        this.allowedBlocks = value;
    }

    /**
     * Gets the value of the tags property.
     * 
     * @return
     *     possible object is
     *     {@link Tags }
     *     
     */
    public Tags getTags() {
        return tags;
    }

    /**
     * Sets the value of the tags property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tags }
     *     
     */
    public void setTags(Tags value) {
        this.tags = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link Attributes }
     *     
     */
    public Attributes getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attributes }
     *     
     */
    public void setAttributes(Attributes value) {
        this.attributes = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="Block" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "block"
    })
    public static class AllowedBlocks {

        @XmlElement(name = "Block")
        protected List<String> block;

        /**
         * Gets the value of the block property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the block property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getBlock().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * </p>
         * 
         * 
         * @return
         *     The value of the block property.
         */
        public List<String> getBlock() {
            if (block == null) {
                block = new ArrayList<>();
            }
            return this.block;
        }

    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="Attribute" type="{http://exacttarget.com/wsdl/partnerAPI}AttributeEntityV1" maxOccurs="unbounded" minOccurs="0"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "attribute"
    })
    public static class Attributes {

        @XmlElement(name = "Attribute")
        protected List<AttributeEntityV1> attribute;

        /**
         * Gets the value of the attribute property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attribute property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getAttribute().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AttributeEntityV1 }
         * </p>
         * 
         * 
         * @return
         *     The value of the attribute property.
         */
        public List<AttributeEntityV1> getAttribute() {
            if (attribute == null) {
                attribute = new ArrayList<>();
            }
            return this.attribute;
        }

    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="Tag" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tag"
    })
    public static class Tags {

        @XmlElement(name = "Tag")
        protected List<String> tag;

        /**
         * Gets the value of the tag property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tag property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getTag().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * </p>
         * 
         * 
         * @return
         *     The value of the tag property.
         */
        public List<String> getTag() {
            if (tag == null) {
                tag = new ArrayList<>();
            }
            return this.tag;
        }

    }

}
