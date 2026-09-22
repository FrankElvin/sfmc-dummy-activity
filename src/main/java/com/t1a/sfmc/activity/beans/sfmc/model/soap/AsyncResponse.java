
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.*;


/**
 * <p>Java class for AsyncResponse complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AsyncResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ResponseType" type="{http://exacttarget.com/wsdl/partnerAPI}AsyncResponseType"/>
 *         <element name="ResponseAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="RespondWhen" type="{http://exacttarget.com/wsdl/partnerAPI}RespondWhen" minOccurs="0"/>
 *         <element name="IncludeResults" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="IncludeObjects" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="OnlyIncludeBase" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AsyncResponse", propOrder = {
    "responseType",
    "responseAddress",
    "respondWhen",
    "includeResults",
    "includeObjects",
    "onlyIncludeBase"
})
public class AsyncResponse {

    @XmlElement(name = "ResponseType", required = true)
    @XmlSchemaType(name = "string")
    protected AsyncResponseType responseType;
    @XmlElement(name = "ResponseAddress", required = true)
    protected String responseAddress;
    @XmlElement(name = "RespondWhen")
    @XmlSchemaType(name = "string")
    protected RespondWhen respondWhen;
    @XmlElement(name = "IncludeResults")
    protected Boolean includeResults;
    @XmlElement(name = "IncludeObjects")
    protected Boolean includeObjects;
    @XmlElement(name = "OnlyIncludeBase")
    protected Boolean onlyIncludeBase;

    /**
     * Gets the value of the responseType property.
     * 
     * @return
     *     possible object is
     *     {@link AsyncResponseType }
     *     
     */
    public AsyncResponseType getResponseType() {
        return responseType;
    }

    /**
     * Sets the value of the responseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AsyncResponseType }
     *     
     */
    public void setResponseType(AsyncResponseType value) {
        this.responseType = value;
    }

    /**
     * Gets the value of the responseAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseAddress() {
        return responseAddress;
    }

    /**
     * Sets the value of the responseAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseAddress(String value) {
        this.responseAddress = value;
    }

    /**
     * Gets the value of the respondWhen property.
     * 
     * @return
     *     possible object is
     *     {@link RespondWhen }
     *     
     */
    public RespondWhen getRespondWhen() {
        return respondWhen;
    }

    /**
     * Sets the value of the respondWhen property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespondWhen }
     *     
     */
    public void setRespondWhen(RespondWhen value) {
        this.respondWhen = value;
    }

    /**
     * Gets the value of the includeResults property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeResults() {
        return includeResults;
    }

    /**
     * Sets the value of the includeResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeResults(Boolean value) {
        this.includeResults = value;
    }

    /**
     * Gets the value of the includeObjects property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeObjects() {
        return includeObjects;
    }

    /**
     * Sets the value of the includeObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeObjects(Boolean value) {
        this.includeObjects = value;
    }

    /**
     * Gets the value of the onlyIncludeBase property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnlyIncludeBase() {
        return onlyIncludeBase;
    }

    /**
     * Sets the value of the onlyIncludeBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnlyIncludeBase(Boolean value) {
        this.onlyIncludeBase = value;
    }

}
