
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtractResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExtractResult">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}Result">
 *       <sequence>
 *         <element name="Request" type="{http://exacttarget.com/wsdl/partnerAPI}ExtractRequest" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtractResult", propOrder = {
    "request"
})
public class ExtractResult
    extends Result
{

    @XmlElement(name = "Request")
    protected ExtractRequest request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link ExtractRequest }
     *     
     */
    public ExtractRequest getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtractRequest }
     *     
     */
    public void setRequest(ExtractRequest value) {
        this.request = value;
    }

}
