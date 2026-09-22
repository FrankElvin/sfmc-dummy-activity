
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SaveOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SaveOption">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PropertyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="SaveAction" type="{http://exacttarget.com/wsdl/partnerAPI}SaveAction"/>
 *         <element name="TrackChanges" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveOption", propOrder = {
    "propertyName",
    "saveAction",
    "trackChanges"
})
public class SaveOption {

    @XmlElement(name = "PropertyName", required = true)
    protected String propertyName;
    @XmlElement(name = "SaveAction", required = true)
    @XmlSchemaType(name = "string")
    protected SaveAction saveAction;
    @XmlElement(name = "TrackChanges")
    protected Boolean trackChanges;

    /**
     * Gets the value of the propertyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * Sets the value of the propertyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyName(String value) {
        this.propertyName = value;
    }

    /**
     * Gets the value of the saveAction property.
     * 
     * @return
     *     possible object is
     *     {@link SaveAction }
     *     
     */
    public SaveAction getSaveAction() {
        return saveAction;
    }

    /**
     * Sets the value of the saveAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaveAction }
     *     
     */
    public void setSaveAction(SaveAction value) {
        this.saveAction = value;
    }

    /**
     * Gets the value of the trackChanges property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrackChanges() {
        return trackChanges;
    }

    /**
     * Sets the value of the trackChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrackChanges(Boolean value) {
        this.trackChanges = value;
    }

}
