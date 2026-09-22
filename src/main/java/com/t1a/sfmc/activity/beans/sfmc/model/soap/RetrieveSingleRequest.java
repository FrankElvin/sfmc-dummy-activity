
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveSingleRequest complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RetrieveSingleRequest">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}Request">
 *       <sequence>
 *         <element name="RequestedObject" type="{http://exacttarget.com/wsdl/partnerAPI}APIObject"/>
 *         <element name="RetrieveOption" type="{http://exacttarget.com/wsdl/partnerAPI}Options" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveSingleRequest", propOrder = {
    "requestedObject",
    "retrieveOption"
})
public class RetrieveSingleRequest
    extends Request
{

    @XmlElement(name = "RequestedObject", required = true)
    protected APIObject requestedObject;
    @XmlElement(name = "RetrieveOption")
    protected Options retrieveOption;

    /**
     * Gets the value of the requestedObject property.
     * 
     * @return
     *     possible object is
     *     {@link APIObject }
     *     
     */
    public APIObject getRequestedObject() {
        return requestedObject;
    }

    /**
     * Sets the value of the requestedObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link APIObject }
     *     
     */
    public void setRequestedObject(APIObject value) {
        this.requestedObject = value;
    }

    /**
     * Gets the value of the retrieveOption property.
     * 
     * @return
     *     possible object is
     *     {@link Options }
     *     
     */
    public Options getRetrieveOption() {
        return retrieveOption;
    }

    /**
     * Sets the value of the retrieveOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Options }
     *     
     */
    public void setRetrieveOption(Options value) {
        this.retrieveOption = value;
    }

}
