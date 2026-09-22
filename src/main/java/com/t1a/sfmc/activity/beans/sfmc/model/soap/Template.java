
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Template complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Template">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       <sequence>
 *         <element name="TemplateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="LayoutHTML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="BackgroundColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="BorderColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="BorderWidth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="Cellpadding" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="Cellspacing" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="Width" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="Align" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ActiveFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="CategoryID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="CategoryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="OwnerID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="HeaderContent" type="{http://exacttarget.com/wsdl/partnerAPI}ContentArea" minOccurs="0"/>
 *         <element name="Layout" type="{http://exacttarget.com/wsdl/partnerAPI}Layout" minOccurs="0"/>
 *         <element name="TemplateSubject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="IsTemplateSubjectLocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="PreHeader" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Template", propOrder = {
    "templateName",
    "layoutHTML",
    "backgroundColor",
    "borderColor",
    "borderWidth",
    "cellpadding",
    "cellspacing",
    "width",
    "align",
    "activeFlag",
    "categoryID",
    "categoryType",
    "ownerID",
    "headerContent",
    "layout",
    "templateSubject",
    "isTemplateSubjectLocked",
    "preHeader"
})
public class Template
    extends APIObject
{

    @XmlElement(name = "TemplateName")
    protected String templateName;
    @XmlElement(name = "LayoutHTML")
    protected String layoutHTML;
    @XmlElement(name = "BackgroundColor")
    protected String backgroundColor;
    @XmlElement(name = "BorderColor")
    protected String borderColor;
    @XmlElement(name = "BorderWidth")
    protected Integer borderWidth;
    @XmlElement(name = "Cellpadding")
    protected Integer cellpadding;
    @XmlElement(name = "Cellspacing")
    protected Integer cellspacing;
    @XmlElement(name = "Width")
    protected Integer width;
    @XmlElement(name = "Align")
    protected String align;
    @XmlElement(name = "ActiveFlag")
    protected Integer activeFlag;
    @XmlElement(name = "CategoryID")
    protected Integer categoryID;
    @XmlElement(name = "CategoryType")
    protected String categoryType;
    @XmlElement(name = "OwnerID")
    protected Integer ownerID;
    @XmlElement(name = "HeaderContent")
    protected ContentArea headerContent;
    @XmlElement(name = "Layout")
    protected Layout layout;
    @XmlElement(name = "TemplateSubject")
    protected String templateSubject;
    @XmlElement(name = "IsTemplateSubjectLocked")
    protected Boolean isTemplateSubjectLocked;
    @XmlElement(name = "PreHeader")
    protected String preHeader;

    /**
     * Gets the value of the templateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * Sets the value of the templateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateName(String value) {
        this.templateName = value;
    }

    /**
     * Gets the value of the layoutHTML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayoutHTML() {
        return layoutHTML;
    }

    /**
     * Sets the value of the layoutHTML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayoutHTML(String value) {
        this.layoutHTML = value;
    }

    /**
     * Gets the value of the backgroundColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * Sets the value of the backgroundColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackgroundColor(String value) {
        this.backgroundColor = value;
    }

    /**
     * Gets the value of the borderColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderColor() {
        return borderColor;
    }

    /**
     * Sets the value of the borderColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderColor(String value) {
        this.borderColor = value;
    }

    /**
     * Gets the value of the borderWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBorderWidth() {
        return borderWidth;
    }

    /**
     * Sets the value of the borderWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBorderWidth(Integer value) {
        this.borderWidth = value;
    }

    /**
     * Gets the value of the cellpadding property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCellpadding() {
        return cellpadding;
    }

    /**
     * Sets the value of the cellpadding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCellpadding(Integer value) {
        this.cellpadding = value;
    }

    /**
     * Gets the value of the cellspacing property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCellspacing() {
        return cellspacing;
    }

    /**
     * Sets the value of the cellspacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCellspacing(Integer value) {
        this.cellspacing = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWidth(Integer value) {
        this.width = value;
    }

    /**
     * Gets the value of the align property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlign() {
        return align;
    }

    /**
     * Sets the value of the align property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlign(String value) {
        this.align = value;
    }

    /**
     * Gets the value of the activeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActiveFlag() {
        return activeFlag;
    }

    /**
     * Sets the value of the activeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActiveFlag(Integer value) {
        this.activeFlag = value;
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
     * Gets the value of the categoryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryType() {
        return categoryType;
    }

    /**
     * Sets the value of the categoryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryType(String value) {
        this.categoryType = value;
    }

    /**
     * Gets the value of the ownerID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOwnerID() {
        return ownerID;
    }

    /**
     * Sets the value of the ownerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOwnerID(Integer value) {
        this.ownerID = value;
    }

    /**
     * Gets the value of the headerContent property.
     * 
     * @return
     *     possible object is
     *     {@link ContentArea }
     *     
     */
    public ContentArea getHeaderContent() {
        return headerContent;
    }

    /**
     * Sets the value of the headerContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentArea }
     *     
     */
    public void setHeaderContent(ContentArea value) {
        this.headerContent = value;
    }

    /**
     * Gets the value of the layout property.
     * 
     * @return
     *     possible object is
     *     {@link Layout }
     *     
     */
    public Layout getLayout() {
        return layout;
    }

    /**
     * Sets the value of the layout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Layout }
     *     
     */
    public void setLayout(Layout value) {
        this.layout = value;
    }

    /**
     * Gets the value of the templateSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateSubject() {
        return templateSubject;
    }

    /**
     * Sets the value of the templateSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateSubject(String value) {
        this.templateSubject = value;
    }

    /**
     * Gets the value of the isTemplateSubjectLocked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTemplateSubjectLocked() {
        return isTemplateSubjectLocked;
    }

    /**
     * Sets the value of the isTemplateSubjectLocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTemplateSubjectLocked(Boolean value) {
        this.isTemplateSubjectLocked = value;
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

}
