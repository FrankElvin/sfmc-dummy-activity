
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for QueryRequest complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="QueryRequest">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ClientIDs" type="{http://exacttarget.com/wsdl/partnerAPI}ClientID" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Query" type="{http://exacttarget.com/wsdl/partnerAPI}Query"/>
 *         <element name="RespondTo" type="{http://exacttarget.com/wsdl/partnerAPI}AsyncResponse" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PartnerProperties" type="{http://exacttarget.com/wsdl/partnerAPI}APIProperty" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ContinueRequest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="QueryAllAccounts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="RetrieveAllSinceLastBatch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryRequest", propOrder = {
    "clientIDs",
    "query",
    "respondTo",
    "partnerProperties",
    "continueRequest",
    "queryAllAccounts",
    "retrieveAllSinceLastBatch"
})
public class QueryRequest {

    @XmlElement(name = "ClientIDs")
    protected List<ClientID> clientIDs;
    @XmlElement(name = "Query", required = true)
    protected Query query;
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
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link Query }
     *     
     */
    public Query getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link Query }
     *     
     */
    public void setQuery(Query value) {
        this.query = value;
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

}
