
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmailAddress complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EmailAddress">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}SubscriberAddress">
 *       <sequence>
 *         <element name="Type" type="{http://exacttarget.com/wsdl/partnerAPI}EmailType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmailAddress", propOrder = {
    "type"
})
public class EmailAddress
    extends SubscriberAddress
{

    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected EmailType type;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link EmailType }
     *     
     */
    public EmailType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailType }
     *     
     */
    public void setType(EmailType value) {
        this.type = value;
    }

}
