
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for RetrieveRequest complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RetrieveRequest">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ClientIDs" type="{http://exacttarget.com/wsdl/partnerAPI}ClientID" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ObjectType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Properties" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Filter" type="{http://exacttarget.com/wsdl/partnerAPI}FilterPart" minOccurs="0"/>
 *         <element name="RespondTo" type="{http://exacttarget.com/wsdl/partnerAPI}AsyncResponse" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PartnerProperties" type="{http://exacttarget.com/wsdl/partnerAPI}APIProperty" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ContinueRequest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="QueryAllAccounts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="RetrieveAllSinceLastBatch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="RepeatLastResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Retrieves" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Request" type="{http://exacttarget.com/wsdl/partnerAPI}Request" maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Options" type="{http://exacttarget.com/wsdl/partnerAPI}RetrieveOptions" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveRequest", propOrder = {
    "clientIDs",
    "objectType",
    "properties",
    "filter",
    "respondTo",
    "partnerProperties",
    "continueRequest",
    "queryAllAccounts",
    "retrieveAllSinceLastBatch",
    "repeatLastResult",
    "retrieves",
    "options"
})
public class RetrieveRequest {

    @XmlElement(name = "ClientIDs")
    protected List<ClientID> clientIDs;
    @XmlElement(name = "ObjectType", required = true)
    protected String objectType;
    @XmlElement(name = "Properties")
    protected List<String> properties;
    @XmlElement(name = "Filter")
    protected FilterPart filter;
    @XmlElement(name = "RespondTo")
    protected List<AsyncResponse> respondTo;
    @XmlElement(name = "PartnerProperties")
    protected List<APIProperty> partnerProperties;
    @XmlElement(name = "ContinueRequest")
    protected String continueRequest;
    @XmlElement(name = "QueryAllAccounts")
    protected Boolean queryAllAccounts;
    @XmlElement(name = "RetrieveAllSinceLastBatch")
    protected Boolean retrieveAllSinceLastBatch;
    @XmlElement(name = "RepeatLastResult")
    protected Boolean repeatLastResult;
    @XmlElement(name = "Retrieves")
    protected Retrieves retrieves;
    @XmlElement(name = "Options")
    protected RetrieveOptions options;

    /**
     * Gets the value of the clientIDs property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clientIDs property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getClientIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClientID }
     * </p>
     * 
     * 
     * @return
     *     The value of the clientIDs property.
     */
    public List<ClientID> getClientIDs() {
        if (clientIDs == null) {
            clientIDs = new ArrayList<>();
        }
        return this.clientIDs;
    }

    /**
     * Gets the value of the objectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * Sets the value of the objectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectType(String value) {
        this.objectType = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the properties property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getProperties().add(newItem);
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
     *     The value of the properties property.
     */
    public List<String> getProperties() {
        if (properties == null) {
            properties = new ArrayList<>();
        }
        return this.properties;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link FilterPart }
     *     
     */
    public FilterPart getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterPart }
     *     
     */
    public void setFilter(FilterPart value) {
        this.filter = value;
    }

    /**
     * Gets the value of the respondTo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the respondTo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRespondTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AsyncResponse }
     * </p>
     * 
     * 
     * @return
     *     The value of the respondTo property.
     */
    public List<AsyncResponse> getRespondTo() {
        if (respondTo == null) {
            respondTo = new ArrayList<>();
        }
        return this.respondTo;
    }

    /**
     * Gets the value of the partnerProperties property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerProperties property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPartnerProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link APIProperty }
     * </p>
     * 
     * 
     * @return
     *     The value of the partnerProperties property.
     */
    public List<APIProperty> getPartnerProperties() {
        if (partnerProperties == null) {
            partnerProperties = new ArrayList<>();
        }
        return this.partnerProperties;
    }

    /**
     * Gets the value of the continueRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContinueRequest() {
        return continueRequest;
    }

    /**
     * Sets the value of the continueRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContinueRequest(String value) {
        this.continueRequest = value;
    }

    /**
     * Gets the value of the queryAllAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQueryAllAccounts() {
        return queryAllAccounts;
    }

    /**
     * Sets the value of the queryAllAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQueryAllAccounts(Boolean value) {
        this.queryAllAccounts = value;
    }

    /**
     * Gets the value of the retrieveAllSinceLastBatch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRetrieveAllSinceLastBatch() {
        return retrieveAllSinceLastBatch;
    }

    /**
     * Sets the value of the retrieveAllSinceLastBatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetrieveAllSinceLastBatch(Boolean value) {
        this.retrieveAllSinceLastBatch = value;
    }

    /**
     * Gets the value of the repeatLastResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRepeatLastResult() {
        return repeatLastResult;
    }

    /**
     * Sets the value of the repeatLastResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRepeatLastResult(Boolean value) {
        this.repeatLastResult = value;
    }

    /**
     * Gets the value of the retrieves property.
     * 
     * @return
     *     possible object is
     *     {@link Retrieves }
     *     
     */
    public Retrieves getRetrieves() {
        return retrieves;
    }

    /**
     * Sets the value of the retrieves property.
     * 
     * @param value
     *     allowed object is
     *     {@link Retrieves }
     *     
     */
    public void setRetrieves(Retrieves value) {
        this.retrieves = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveOptions }
     *     
     */
    public RetrieveOptions getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveOptions }
     *     
     */
    public void setOptions(RetrieveOptions value) {
        this.options = value;
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
     *         <element name="Request" type="{http://exacttarget.com/wsdl/partnerAPI}Request" maxOccurs="unbounded" minOccurs="0"/>
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
        "request"
    })
    public static class Retrieves {

        @XmlElement(name = "Request")
        protected List<Request> request;

        /**
         * Gets the value of the request property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the request property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getRequest().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Request }
         * </p>
         * 
         * 
         * @return
         *     The value of the request property.
         */
        public List<Request> getRequest() {
            if (request == null) {
                request = new ArrayList<>();
            }
            return this.request;
        }

    }

}
