
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuditLogUserContext complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AuditLogUserContext">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InitiatingUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="InitiatingUserIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditLogUserContext", propOrder = {
    "initiatingUserName",
    "initiatingUserIpAddress"
})
public class AuditLogUserContext {

    @XmlElement(name = "InitiatingUserName")
    protected String initiatingUserName;
    @XmlElement(name = "InitiatingUserIpAddress")
    protected String initiatingUserIpAddress;

    /**
     * Gets the value of the initiatingUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitiatingUserName() {
        return initiatingUserName;
    }

    /**
     * Sets the value of the initiatingUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitiatingUserName(String value) {
        this.initiatingUserName = value;
    }

    /**
     * Gets the value of the initiatingUserIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitiatingUserIpAddress() {
        return initiatingUserIpAddress;
    }

    /**
     * Sets the value of the initiatingUserIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitiatingUserIpAddress(String value) {
        this.initiatingUserIpAddress = value;
    }

}
