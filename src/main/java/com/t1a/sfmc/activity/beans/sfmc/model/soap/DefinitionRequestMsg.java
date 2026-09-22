
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
 *         <element name="DescribeRequests" type="{http://exacttarget.com/wsdl/partnerAPI}ArrayOfObjectDefinitionRequest" minOccurs="0"/>
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
    "describeRequests"
})
@XmlRootElement(name = "DefinitionRequestMsg")
public class DefinitionRequestMsg {

    @XmlElement(name = "DescribeRequests")
    protected ArrayOfObjectDefinitionRequest describeRequests;

    /**
     * Gets the value of the describeRequests property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfObjectDefinitionRequest }
     *     
     */
    public ArrayOfObjectDefinitionRequest getDescribeRequests() {
        return describeRequests;
    }

    /**
     * Sets the value of the describeRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfObjectDefinitionRequest }
     *     
     */
    public void setDescribeRequests(ArrayOfObjectDefinitionRequest value) {
        this.describeRequests = value;
    }

}
