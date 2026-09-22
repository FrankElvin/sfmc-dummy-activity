
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ContentValidation complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ContentValidation">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       <sequence>
 *         <element name="ValidationAction" type="{http://exacttarget.com/wsdl/partnerAPI}ValidationAction" minOccurs="0"/>
 *         <element name="Email" type="{http://exacttarget.com/wsdl/partnerAPI}Email" minOccurs="0"/>
 *         <element name="Subscribers" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Subscriber" type="{http://exacttarget.com/wsdl/partnerAPI}Subscriber" maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentValidation", propOrder = {
    "validationAction",
    "email",
    "subscribers"
})
public class ContentValidation
    extends APIObject
{

    @XmlElement(name = "ValidationAction")
    protected ValidationAction validationAction;
    @XmlElement(name = "Email")
    protected Email email;
    @XmlElement(name = "Subscribers")
    protected Subscribers subscribers;

    /**
     * Gets the value of the validationAction property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationAction }
     *     
     */
    public ValidationAction getValidationAction() {
        return validationAction;
    }

    /**
     * Sets the value of the validationAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationAction }
     *     
     */
    public void setValidationAction(ValidationAction value) {
        this.validationAction = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link Email }
     *     
     */
    public Email getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link Email }
     *     
     */
    public void setEmail(Email value) {
        this.email = value;
    }

    /**
     * Gets the value of the subscribers property.
     * 
     * @return
     *     possible object is
     *     {@link Subscribers }
     *     
     */
    public Subscribers getSubscribers() {
        return subscribers;
    }

    /**
     * Sets the value of the subscribers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Subscribers }
     *     
     */
    public void setSubscribers(Subscribers value) {
        this.subscribers = value;
    }


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
     *         <element name="Subscriber" type="{http://exacttarget.com/wsdl/partnerAPI}Subscriber" maxOccurs="unbounded" minOccurs="0"/>
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
        "subscriber"
    })
    public static class Subscribers {

        @XmlElement(name = "Subscriber")
        protected List<Subscriber> subscriber;

        /**
         * Gets the value of the subscriber property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subscriber property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getSubscriber().add(newItem);
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
         *     The value of the subscriber property.
         */
        public List<Subscriber> getSubscriber() {
            if (subscriber == null) {
                subscriber = new ArrayList<>();
            }
            return this.subscriber;
        }

    }

}
