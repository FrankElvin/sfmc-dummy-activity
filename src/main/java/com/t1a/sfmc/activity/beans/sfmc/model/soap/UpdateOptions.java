
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateOptions complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="UpdateOptions">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}Options">
 *       <sequence>
 *         <element name="Container" type="{http://exacttarget.com/wsdl/partnerAPI}ContainerID" minOccurs="0"/>
 *         <element name="Action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateOptions", propOrder = {
    "container",
    "action"
})
public class UpdateOptions
    extends Options
{

    @XmlElement(name = "Container")
    protected ContainerID container;
    @XmlElement(name = "Action")
    protected String action;

    /**
     * Gets the value of the container property.
     * 
     * @return
     *     possible object is
     *     {@link ContainerID }
     *     
     */
    public ContainerID getContainer() {
        return container;
    }

    /**
     * Sets the value of the container property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContainerID }
     *     
     */
    public void setContainer(ContainerID value) {
        this.container = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

}
