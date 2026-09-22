
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.*;


/**
 * <p>Java class for ListSubscriber complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ListSubscriber">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       <sequence>
 *         <element name="Status" type="{http://exacttarget.com/wsdl/partnerAPI}SubscriberStatus" minOccurs="0"/>
 *         <element name="ListID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="SubscriberKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListSubscriber", propOrder = {
    "status",
    "listID",
    "subscriberKey"
})
public class ListSubscriber
    extends APIObject
{

    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    protected SubscriberStatus status;
    @XmlElement(name = "ListID")
    protected Integer listID;
    @XmlElement(name = "SubscriberKey")
    protected String subscriberKey;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberStatus }
     *     
     */
    public SubscriberStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberStatus }
     *     
     */
    public void setStatus(SubscriberStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the listID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getListID() {
        return listID;
    }

    /**
     * Sets the value of the listID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setListID(Integer value) {
        this.listID = value;
    }

    /**
     * Gets the value of the subscriberKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberKey() {
        return subscriberKey;
    }

    /**
     * Sets the value of the subscriberKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberKey(String value) {
        this.subscriberKey = value;
    }

}
