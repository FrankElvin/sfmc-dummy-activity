
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactEventCreateResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ContactEventCreateResult">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}CreateResult">
 *       <sequence>
 *         <element name="EventInstanceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="AsyncRequestID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactEventCreateResult", propOrder = {
    "eventInstanceID",
    "asyncRequestID"
})
public class ContactEventCreateResult
    extends CreateResult
{

    @XmlElement(name = "EventInstanceID")
    protected String eventInstanceID;
    @XmlElement(name = "AsyncRequestID")
    protected Long asyncRequestID;

    /**
     * Gets the value of the eventInstanceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventInstanceID() {
        return eventInstanceID;
    }

    /**
     * Sets the value of the eventInstanceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventInstanceID(String value) {
        this.eventInstanceID = value;
    }

    /**
     * Gets the value of the asyncRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAsyncRequestID() {
        return asyncRequestID;
    }

    /**
     * Sets the value of the asyncRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAsyncRequestID(Long value) {
        this.asyncRequestID = value;
    }

}
