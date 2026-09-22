
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Email complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Email">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       <sequence>
 *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Folder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CategoryID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="HTMLBody" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TextBody" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ContentAreas" type="{http://exacttarget.com/wsdl/partnerAPI}ContentArea" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="IsHTMLPaste" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ClonedFromID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="EmailType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CharacterSet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="HasDynamicSubjectLine" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ContentCheckStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="SyncTextWithHTML" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="PreHeader" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="IsApproved" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="__AdditionalEmailAttribute1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="__AdditionalEmailAttribute2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="__AdditionalEmailAttribute3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="__AdditionalEmailAttribute4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="__AdditionalEmailAttribute5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Email", propOrder = {
    "name",
    "folder",
    "categoryID",
    "htmlBody",
    "textBody",
    "contentAreas",
    "subject",
    "isActive",
    "isHTMLPaste",
    "clonedFromID",
    "status",
    "emailType",
    "characterSet",
    "hasDynamicSubjectLine",
    "contentCheckStatus",
    "syncTextWithHTML",
    "preHeader",
    "isApproved",
    "additionalEmailAttribute1",
    "additionalEmailAttribute2",
    "additionalEmailAttribute3",
    "additionalEmailAttribute4",
    "additionalEmailAttribute5"
})
public class Email
    extends APIObject
{

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Folder")
    protected String folder;
    @XmlElement(name = "CategoryID")
    protected Integer categoryID;
    @XmlElement(name = "HTMLBody")
    protected String htmlBody;
    @XmlElement(name = "TextBody")
    protected String textBody;
    @XmlElement(name = "ContentAreas")
    protected List<ContentArea> contentAreas;
    @XmlElement(name = "Subject")
    protected String subject;
    @XmlElement(name = "IsActive")
    protected Boolean isActive;
    @XmlElement(name = "IsHTMLPaste")
    protected Boolean isHTMLPaste;
    @XmlElement(name = "ClonedFromID")
    protected Integer clonedFromID;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "EmailType")
    protected String emailType;
    @XmlElement(name = "CharacterSet")
    protected String characterSet;
    @XmlElement(name = "HasDynamicSubjectLine")
    protected Boolean hasDynamicSubjectLine;
    @XmlElement(name = "ContentCheckStatus")
    protected String contentCheckStatus;
    @XmlElement(name = "SyncTextWithHTML")
    protected Boolean syncTextWithHTML;
    @XmlElement(name = "PreHeader")
    protected String preHeader;
    @XmlElement(name = "IsApproved")
    protected Boolean isApproved;
    @XmlElement(name = "__AdditionalEmailAttribute1")
    protected String additionalEmailAttribute1;
    @XmlElement(name = "__AdditionalEmailAttribute2")
    protected String additionalEmailAttribute2;
    @XmlElement(name = "__AdditionalEmailAttribute3")
    protected String additionalEmailAttribute3;
    @XmlElement(name = "__AdditionalEmailAttribute4")
    protected String additionalEmailAttribute4;
    @XmlElement(name = "__AdditionalEmailAttribute5")
    protected String additionalEmailAttribute5;

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
     * Gets the value of the folder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolder() {
        return folder;
    }

    /**
     * Sets the value of the folder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolder(String value) {
        this.folder = value;
    }

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
     * Gets the value of the htmlBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHTMLBody() {
        return htmlBody;
    }

    /**
     * Sets the value of the htmlBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHTMLBody(String value) {
        this.htmlBody = value;
    }

    /**
     * Gets the value of the textBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextBody() {
        return textBody;
    }

    /**
     * Sets the value of the textBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextBody(String value) {
        this.textBody = value;
    }

    /**
     * Gets the value of the contentAreas property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentAreas property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getContentAreas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContentArea }
     * </p>
     * 
     * 
     * @return
     *     The value of the contentAreas property.
     */
    public List<ContentArea> getContentAreas() {
        if (contentAreas == null) {
            contentAreas = new ArrayList<>();
        }
        return this.contentAreas;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the isHTMLPaste property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsHTMLPaste() {
        return isHTMLPaste;
    }

    /**
     * Sets the value of the isHTMLPaste property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsHTMLPaste(Boolean value) {
        this.isHTMLPaste = value;
    }

    /**
     * Gets the value of the clonedFromID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClonedFromID() {
        return clonedFromID;
    }

    /**
     * Sets the value of the clonedFromID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClonedFromID(Integer value) {
        this.clonedFromID = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the emailType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailType() {
        return emailType;
    }

    /**
     * Sets the value of the emailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailType(String value) {
        this.emailType = value;
    }

    /**
     * Gets the value of the characterSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacterSet() {
        return characterSet;
    }

    /**
     * Sets the value of the characterSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacterSet(String value) {
        this.characterSet = value;
    }

    /**
     * Gets the value of the hasDynamicSubjectLine property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasDynamicSubjectLine() {
        return hasDynamicSubjectLine;
    }

    /**
     * Sets the value of the hasDynamicSubjectLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasDynamicSubjectLine(Boolean value) {
        this.hasDynamicSubjectLine = value;
    }

    /**
     * Gets the value of the contentCheckStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentCheckStatus() {
        return contentCheckStatus;
    }

    /**
     * Sets the value of the contentCheckStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentCheckStatus(String value) {
        this.contentCheckStatus = value;
    }

    /**
     * Gets the value of the syncTextWithHTML property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSyncTextWithHTML() {
        return syncTextWithHTML;
    }

    /**
     * Sets the value of the syncTextWithHTML property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSyncTextWithHTML(Boolean value) {
        this.syncTextWithHTML = value;
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
     * Gets the value of the isApproved property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsApproved() {
        return isApproved;
    }

    /**
     * Sets the value of the isApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsApproved(Boolean value) {
        this.isApproved = value;
    }

    /**
     * Gets the value of the additionalEmailAttribute1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalEmailAttribute1() {
        return additionalEmailAttribute1;
    }

    /**
     * Sets the value of the additionalEmailAttribute1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalEmailAttribute1(String value) {
        this.additionalEmailAttribute1 = value;
    }

    /**
     * Gets the value of the additionalEmailAttribute2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalEmailAttribute2() {
        return additionalEmailAttribute2;
    }

    /**
     * Sets the value of the additionalEmailAttribute2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalEmailAttribute2(String value) {
        this.additionalEmailAttribute2 = value;
    }

    /**
     * Gets the value of the additionalEmailAttribute3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalEmailAttribute3() {
        return additionalEmailAttribute3;
    }

    /**
     * Sets the value of the additionalEmailAttribute3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalEmailAttribute3(String value) {
        this.additionalEmailAttribute3 = value;
    }

    /**
     * Gets the value of the additionalEmailAttribute4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalEmailAttribute4() {
        return additionalEmailAttribute4;
    }

    /**
     * Sets the value of the additionalEmailAttribute4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalEmailAttribute4(String value) {
        this.additionalEmailAttribute4 = value;
    }

    /**
     * Gets the value of the additionalEmailAttribute5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalEmailAttribute5() {
        return additionalEmailAttribute5;
    }

    /**
     * Sets the value of the additionalEmailAttribute5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalEmailAttribute5(String value) {
        this.additionalEmailAttribute5 = value;
    }

}
