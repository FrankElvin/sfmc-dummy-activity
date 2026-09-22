
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.*;


/**
 * <p>Java class for ResultItem complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ResultItem">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       <sequence>
 *         <element name="RequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ConversationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="StatusMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="OrdinalID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="RequestType" type="{http://exacttarget.com/wsdl/partnerAPI}RequestType" minOccurs="0"/>
 *         <element name="RequestObjectType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultItem", propOrder = {
    "requestID",
    "conversationID",
    "statusCode",
    "statusMessage",
    "ordinalID",
    "errorCode",
    "requestType",
    "requestObjectType"
})
public class ResultItem
    extends APIObject
{

    @XmlElement(name = "RequestID")
    protected String requestID;
    @XmlElement(name = "ConversationID")
    protected String conversationID;
    @XmlElement(name = "StatusCode", required = true)
    protected String statusCode;
    @XmlElement(name = "StatusMessage", required = true)
    protected String statusMessage;
    @XmlElement(name = "OrdinalID")
    protected Integer ordinalID;
    @XmlElement(name = "ErrorCode")
    protected Integer errorCode;
    @XmlElement(name = "RequestType")
    @XmlSchemaType(name = "string")
    protected RequestType requestType;
    @XmlElement(name = "RequestObjectType")
    protected String requestObjectType;

    /**
     * Gets the value of the requestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestID() {
        return requestID;
    }

    /**
     * Sets the value of the requestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestID(String value) {
        this.requestID = value;
    }

    /**
     * Gets the value of the conversationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConversationID() {
        return conversationID;
    }

    /**
     * Sets the value of the conversationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConversationID(String value) {
        this.conversationID = value;
    }

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
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link RequestType }
     *     
     */
    public RequestType getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType }
     *     
     */
    public void setRequestType(RequestType value) {
        this.requestType = value;
    }

    /**
     * Gets the value of the requestObjectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestObjectType() {
        return requestObjectType;
    }

    /**
     * Sets the value of the requestObjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestObjectType(String value) {
        this.requestObjectType = value;
    }

}
