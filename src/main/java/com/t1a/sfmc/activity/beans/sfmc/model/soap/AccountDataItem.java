
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.*;


/**
 * <p>Java class for AccountDataItem complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AccountDataItem">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ChildAccountID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="BrandID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="PrivateLabelID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="AccountType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountDataItem", propOrder = {
    "childAccountID",
    "brandID",
    "privateLabelID",
    "accountType"
})
public class AccountDataItem {

    @XmlElement(name = "ChildAccountID")
    protected Integer childAccountID;
    @XmlElementRef(name = "BrandID", namespace = "http://exacttarget.com/wsdl/partnerAPI", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> brandID;
    @XmlElementRef(name = "PrivateLabelID", namespace = "http://exacttarget.com/wsdl/partnerAPI", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> privateLabelID;
    @XmlElementRef(name = "AccountType", namespace = "http://exacttarget.com/wsdl/partnerAPI", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> accountType;

    /**
     * Gets the value of the childAccountID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChildAccountID() {
        return childAccountID;
    }

    /**
     * Sets the value of the childAccountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChildAccountID(Integer value) {
        this.childAccountID = value;
    }

    /**
     * Gets the value of the brandID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBrandID() {
        return brandID;
    }

    /**
     * Sets the value of the brandID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBrandID(JAXBElement<Integer> value) {
        this.brandID = value;
    }

    /**
     * Gets the value of the privateLabelID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPrivateLabelID() {
        return privateLabelID;
    }

    /**
     * Sets the value of the privateLabelID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPrivateLabelID(JAXBElement<Integer> value) {
        this.privateLabelID = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAccountType(JAXBElement<Integer> value) {
        this.accountType = value;
    }

}
