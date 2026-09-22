
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImportFileDestination complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ImportFileDestination">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       <sequence>
 *         <element name="TemplateCustomObject" type="{http://exacttarget.com/wsdl/partnerAPI}DataExtension" minOccurs="0"/>
 *         <element name="FileTransferLocation" type="{http://exacttarget.com/wsdl/partnerAPI}FileTransferLocation" minOccurs="0"/>
 *         <element name="FileSpec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="EncodingCodePage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="HasColumnHeader" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="FieldDelimiter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="RowDelimiter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="NullValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="BooleanFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DateTimeFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="StringIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="EscapeSequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportFileDestination", propOrder = {
    "templateCustomObject",
    "fileTransferLocation",
    "fileSpec",
    "encodingCodePage",
    "hasColumnHeader",
    "fieldDelimiter",
    "rowDelimiter",
    "nullValue",
    "booleanFormat",
    "dateTimeFormat",
    "stringIdentifier",
    "escapeSequence"
})
public class ImportFileDestination
    extends APIObject
{

    @XmlElement(name = "TemplateCustomObject")
    protected DataExtension templateCustomObject;
    @XmlElement(name = "FileTransferLocation")
    protected FileTransferLocation fileTransferLocation;
    @XmlElement(name = "FileSpec")
    protected String fileSpec;
    @XmlElement(name = "EncodingCodePage")
    protected Integer encodingCodePage;
    @XmlElement(name = "HasColumnHeader")
    protected Boolean hasColumnHeader;
    @XmlElement(name = "FieldDelimiter")
    protected String fieldDelimiter;
    @XmlElement(name = "RowDelimiter")
    protected String rowDelimiter;
    @XmlElement(name = "NullValue")
    protected String nullValue;
    @XmlElement(name = "BooleanFormat")
    protected String booleanFormat;
    @XmlElement(name = "DateTimeFormat")
    protected String dateTimeFormat;
    @XmlElement(name = "StringIdentifier")
    protected String stringIdentifier;
    @XmlElement(name = "EscapeSequence")
    protected String escapeSequence;

    /**
     * Gets the value of the templateCustomObject property.
     * 
     * @return
     *     possible object is
     *     {@link DataExtension }
     *     
     */
    public DataExtension getTemplateCustomObject() {
        return templateCustomObject;
    }

    /**
     * Sets the value of the templateCustomObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataExtension }
     *     
     */
    public void setTemplateCustomObject(DataExtension value) {
        this.templateCustomObject = value;
    }

    /**
     * Gets the value of the fileTransferLocation property.
     * 
     * @return
     *     possible object is
     *     {@link FileTransferLocation }
     *     
     */
    public FileTransferLocation getFileTransferLocation() {
        return fileTransferLocation;
    }

    /**
     * Sets the value of the fileTransferLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileTransferLocation }
     *     
     */
    public void setFileTransferLocation(FileTransferLocation value) {
        this.fileTransferLocation = value;
    }

    /**
     * Gets the value of the fileSpec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileSpec() {
        return fileSpec;
    }

    /**
     * Sets the value of the fileSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileSpec(String value) {
        this.fileSpec = value;
    }

    /**
     * Gets the value of the encodingCodePage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEncodingCodePage() {
        return encodingCodePage;
    }

    /**
     * Sets the value of the encodingCodePage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEncodingCodePage(Integer value) {
        this.encodingCodePage = value;
    }

    /**
     * Gets the value of the hasColumnHeader property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasColumnHeader() {
        return hasColumnHeader;
    }

    /**
     * Sets the value of the hasColumnHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasColumnHeader(Boolean value) {
        this.hasColumnHeader = value;
    }

    /**
     * Gets the value of the fieldDelimiter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldDelimiter() {
        return fieldDelimiter;
    }

    /**
     * Sets the value of the fieldDelimiter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldDelimiter(String value) {
        this.fieldDelimiter = value;
    }

    /**
     * Gets the value of the rowDelimiter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowDelimiter() {
        return rowDelimiter;
    }

    /**
     * Sets the value of the rowDelimiter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowDelimiter(String value) {
        this.rowDelimiter = value;
    }

    /**
     * Gets the value of the nullValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNullValue() {
        return nullValue;
    }

    /**
     * Sets the value of the nullValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNullValue(String value) {
        this.nullValue = value;
    }

    /**
     * Gets the value of the booleanFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBooleanFormat() {
        return booleanFormat;
    }

    /**
     * Sets the value of the booleanFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBooleanFormat(String value) {
        this.booleanFormat = value;
    }

    /**
     * Gets the value of the dateTimeFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTimeFormat() {
        return dateTimeFormat;
    }

    /**
     * Sets the value of the dateTimeFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTimeFormat(String value) {
        this.dateTimeFormat = value;
    }

    /**
     * Gets the value of the stringIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringIdentifier() {
        return stringIdentifier;
    }

    /**
     * Sets the value of the stringIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringIdentifier(String value) {
        this.stringIdentifier = value;
    }

    /**
     * Gets the value of the escapeSequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscapeSequence() {
        return escapeSequence;
    }

    /**
     * Sets the value of the escapeSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscapeSequence(String value) {
        this.escapeSequence = value;
    }

}
