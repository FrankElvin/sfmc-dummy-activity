
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for Publication complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Publication">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       <sequence>
 *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="SendClassification" type="{http://exacttarget.com/wsdl/partnerAPI}SendClassification" minOccurs="0"/>
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
 *         <element name="Category" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Publication", propOrder = {
    "name",
    "isActive",
    "sendClassification",
    "subscribers",
    "category"
})
public class Publication
    extends APIObject
{

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "IsActive")
    protected Boolean isActive;
    @XmlElement(name = "SendClassification")
    protected SendClassification sendClassification;
    @XmlElement(name = "Subscribers")
    protected Subscribers subscribers;
    @XmlElement(name = "Category")
    protected Integer category;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the sendClassification property.
     * 
     * @return
     *     possible object is
     *     {@link SendClassification }
     *     
     */
    public SendClassification getSendClassification() {
        return sendClassification;
    }

    /**
     * Sets the value of the sendClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendClassification }
     *     
     */
    public void setSendClassification(SendClassification value) {
        this.sendClassification = value;
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
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCategory(Integer value) {
        this.category = value;
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
