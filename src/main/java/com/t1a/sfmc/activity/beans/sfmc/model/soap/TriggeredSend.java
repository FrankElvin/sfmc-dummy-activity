
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for TriggeredSend complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TriggeredSend">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       <sequence>
 *         <element name="TriggeredSendDefinition" type="{http://exacttarget.com/wsdl/partnerAPI}TriggeredSendDefinition"/>
 *         <element name="Subscribers" type="{http://exacttarget.com/wsdl/partnerAPI}Subscriber" maxOccurs="unbounded"/>
 *         <element name="Attributes" type="{http://exacttarget.com/wsdl/partnerAPI}Attribute" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TriggeredSend", propOrder = {
    "triggeredSendDefinition",
    "subscribers",
    "attributes"
})
public class TriggeredSend
    extends APIObject
{

    @XmlElement(name = "TriggeredSendDefinition", required = true)
    protected TriggeredSendDefinition triggeredSendDefinition;
    @XmlElement(name = "Subscribers", required = true)
    protected List<Subscriber> subscribers;
    @XmlElement(name = "Attributes")
    protected List<Attribute> attributes;

    /**
     * Gets the value of the triggeredSendDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link TriggeredSendDefinition }
     *     
     */
    public TriggeredSendDefinition getTriggeredSendDefinition() {
        return triggeredSendDefinition;
    }

    /**
     * Sets the value of the triggeredSendDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggeredSendDefinition }
     *     
     */
    public void setTriggeredSendDefinition(TriggeredSendDefinition value) {
        this.triggeredSendDefinition = value;
    }

    /**
     * Gets the value of the subscribers property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscribers property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSubscribers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Subscriber }
     * </p>
     * 
     * 
     * @return
     *     The value of the subscribers property.
     */
    public List<Subscriber> getSubscribers() {
        if (subscribers == null) {
            subscribers = new ArrayList<>();
        }
        return this.subscribers;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributes property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attribute }
     * </p>
     * 
     * 
     * @return
     *     The value of the attributes property.
     */
    public List<Attribute> getAttributes() {
        if (attributes == null) {
            attributes = new ArrayList<>();
        }
        return this.attributes;
    }

}
