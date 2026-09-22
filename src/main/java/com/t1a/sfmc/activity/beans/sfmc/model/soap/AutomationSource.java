
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutomationSource complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AutomationSource">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AutomationSourceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="AutomationSourceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutomationSource", propOrder = {
    "automationSourceID",
    "automationSourceType"
})
public class AutomationSource {

    @XmlElement(name = "AutomationSourceID")
    protected String automationSourceID;
    @XmlElement(name = "AutomationSourceType")
    protected String automationSourceType;

    /**
     * Gets the value of the automationSourceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutomationSourceID() {
        return automationSourceID;
    }

    /**
     * Sets the value of the automationSourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutomationSourceID(String value) {
        this.automationSourceID = value;
    }

    /**
     * Gets the value of the automationSourceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutomationSourceType() {
        return automationSourceType;
    }

    /**
     * Sets the value of the automationSourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutomationSourceType(String value) {
        this.automationSourceType = value;
    }

}
