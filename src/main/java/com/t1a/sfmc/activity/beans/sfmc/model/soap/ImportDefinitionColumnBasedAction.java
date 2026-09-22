
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.*;


/**
 * <p>Java class for ImportDefinitionColumnBasedAction complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ImportDefinitionColumnBasedAction">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Action" type="{http://exacttarget.com/wsdl/partnerAPI}ImportDefinitionColumnBasedActionType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportDefinitionColumnBasedAction", propOrder = {
    "value",
    "action"
})
public class ImportDefinitionColumnBasedAction {

    @XmlElement(name = "Value")
    protected String value;
    @XmlElement(name = "Action")
    @XmlSchemaType(name = "string")
    protected ImportDefinitionColumnBasedActionType action;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link ImportDefinitionColumnBasedActionType }
     *     
     */
    public ImportDefinitionColumnBasedActionType getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportDefinitionColumnBasedActionType }
     *     
     */
    public void setAction(ImportDefinitionColumnBasedActionType value) {
        this.action = value;
    }

}
