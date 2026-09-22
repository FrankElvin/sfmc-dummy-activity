
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryDefinition complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="QueryDefinition">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}InteractionDefinition">
 *       <sequence>
 *         <element name="QueryText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TargetType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DataExtensionTarget" type="{http://exacttarget.com/wsdl/partnerAPI}InteractionBaseObject" minOccurs="0"/>
 *         <element name="TargetUpdateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="FileSpec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="FileType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CategoryID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryDefinition", propOrder = {
    "queryText",
    "targetType",
    "dataExtensionTarget",
    "targetUpdateType",
    "fileSpec",
    "fileType",
    "status",
    "categoryID"
})
public class QueryDefinition
    extends InteractionDefinition
{

    @XmlElement(name = "QueryText")
    protected String queryText;
    @XmlElement(name = "TargetType")
    protected String targetType;
    @XmlElement(name = "DataExtensionTarget")
    protected InteractionBaseObject dataExtensionTarget;
    @XmlElement(name = "TargetUpdateType")
    protected String targetUpdateType;
    @XmlElement(name = "FileSpec")
    protected String fileSpec;
    @XmlElement(name = "FileType")
    protected String fileType;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "CategoryID")
    protected Integer categoryID;

    /**
     * Gets the value of the queryText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryText() {
        return queryText;
    }

    /**
     * Sets the value of the queryText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryText(String value) {
        this.queryText = value;
    }

    /**
     * Gets the value of the targetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetType() {
        return targetType;
    }

    /**
     * Sets the value of the targetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetType(String value) {
        this.targetType = value;
    }

    /**
     * Gets the value of the dataExtensionTarget property.
     * 
     * @return
     *     possible object is
     *     {@link InteractionBaseObject }
     *     
     */
    public InteractionBaseObject getDataExtensionTarget() {
        return dataExtensionTarget;
    }

    /**
     * Sets the value of the dataExtensionTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link InteractionBaseObject }
     *     
     */
    public void setDataExtensionTarget(InteractionBaseObject value) {
        this.dataExtensionTarget = value;
    }

    /**
     * Gets the value of the targetUpdateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetUpdateType() {
        return targetUpdateType;
    }

    /**
     * Sets the value of the targetUpdateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetUpdateType(String value) {
        this.targetUpdateType = value;
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
     * Gets the value of the fileType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * Sets the value of the fileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileType(String value) {
        this.fileType = value;
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

}
