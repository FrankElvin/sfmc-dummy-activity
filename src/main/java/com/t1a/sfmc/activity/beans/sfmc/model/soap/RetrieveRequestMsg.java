
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.*;


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
 *         <element name="RetrieveRequest" type="{http://exacttarget.com/wsdl/partnerAPI}RetrieveRequest"/>
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
    "retrieveRequest"
})
@XmlRootElement(name = "RetrieveRequestMsg")
public class RetrieveRequestMsg {

    @XmlElement(name = "RetrieveRequest", required = true)
    protected RetrieveRequest retrieveRequest;

    /**
     * Gets the value of the retrieveRequest property.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveRequest }
     *     
     */
    public RetrieveRequest getRetrieveRequest() {
        return retrieveRequest;
    }

    /**
     * Sets the value of the retrieveRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveRequest }
     *     
     */
    public void setRetrieveRequest(RetrieveRequest value) {
        this.retrieveRequest = value;
    }

}
