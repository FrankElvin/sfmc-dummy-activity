
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         <element name="ObjectDefinition" type="{http://exacttarget.com/wsdl/partnerAPI}ObjectDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "objectDefinition",
    "requestID"
})
@XmlRootElement(name = "DefinitionResponseMsg")
public class DefinitionResponseMsg {

    @XmlElement(name = "ObjectDefinition")
    protected List<ObjectDefinition> objectDefinition;
    @XmlElement(name = "RequestID")
    protected String requestID;

    /**
     * Gets the value of the objectDefinition property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectDefinition property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getObjectDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectDefinition }
     * </p>
     * 
     * 
     * @return
     *     The value of the objectDefinition property.
     */
    public List<ObjectDefinition> getObjectDefinition() {
        if (objectDefinition == null) {
            objectDefinition = new ArrayList<>();
        }
        return this.objectDefinition;
    }

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

}
