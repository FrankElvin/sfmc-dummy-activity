
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.*;


/**
 * <p>Java class for TaskResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TaskResult">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="StatusMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="OrdinalID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TblAsyncID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="InteractionObjectID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskResult", propOrder = {
    "statusCode",
    "statusMessage",
    "ordinalID",
    "errorCode",
    "id",
    "tblAsyncID",
    "interactionObjectID"
})
@XmlSeeAlso({
    ContentValidationTaskResult.class
})
public class TaskResult {

    @XmlElement(name = "StatusCode", required = true)
    protected String statusCode;
    @XmlElement(name = "StatusMessage", required = true)
    protected String statusMessage;
    @XmlElement(name = "OrdinalID")
    protected Integer ordinalID;
    @XmlElement(name = "ErrorCode")
    protected Integer errorCode;
    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "TblAsyncID")
    protected Integer tblAsyncID;
    @XmlElement(name = "InteractionObjectID")
    protected String interactionObjectID;

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the statusMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * Sets the value of the statusMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusMessage(String value) {
        this.statusMessage = value;
    }

    /**
     * Gets the value of the ordinalID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrdinalID() {
        return ordinalID;
    }

    /**
     * Sets the value of the ordinalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrdinalID(Integer value) {
        this.ordinalID = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setErrorCode(Integer value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the tblAsyncID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTblAsyncID() {
        return tblAsyncID;
    }

    /**
     * Sets the value of the tblAsyncID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTblAsyncID(Integer value) {
        this.tblAsyncID = value;
    }

    /**
     * Gets the value of the interactionObjectID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInteractionObjectID() {
        return interactionObjectID;
    }

    /**
     * Sets the value of the interactionObjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInteractionObjectID(String value) {
        this.interactionObjectID = value;
    }

}
