
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Deprecated.
 * 
 * <p>Java class for MessagingVendorKind complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MessagingVendorKind">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       <sequence>
 *         <element name="Vendor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Kind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="IsUsernameRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="IsPasswordRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="IsProfileRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessagingVendorKind", propOrder = {
    "vendor",
    "kind",
    "isUsernameRequired",
    "isPasswordRequired",
    "isProfileRequired"
})
public class MessagingVendorKind
    extends APIObject
{

    @XmlElement(name = "Vendor", required = true)
    protected String vendor;
    @XmlElement(name = "Kind", required = true)
    protected String kind;
    @XmlElement(name = "IsUsernameRequired")
    protected boolean isUsernameRequired;
    @XmlElement(name = "IsPasswordRequired")
    protected boolean isPasswordRequired;
    @XmlElement(name = "IsProfileRequired")
    protected boolean isProfileRequired;

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendor(String value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKind(String value) {
        this.kind = value;
    }

    /**
     * Gets the value of the isUsernameRequired property.
     * 
     */
    public boolean isIsUsernameRequired() {
        return isUsernameRequired;
    }

    /**
     * Sets the value of the isUsernameRequired property.
     * 
     */
    public void setIsUsernameRequired(boolean value) {
        this.isUsernameRequired = value;
    }

    /**
     * Gets the value of the isPasswordRequired property.
     * 
     */
    public boolean isIsPasswordRequired() {
        return isPasswordRequired;
    }

    /**
     * Sets the value of the isPasswordRequired property.
     * 
     */
    public void setIsPasswordRequired(boolean value) {
        this.isPasswordRequired = value;
    }

    /**
     * Gets the value of the isProfileRequired property.
     * 
     */
    public boolean isIsProfileRequired() {
        return isProfileRequired;
    }

    /**
     * Sets the value of the isProfileRequired property.
     * 
     */
    public void setIsProfileRequired(boolean value) {
        this.isProfileRequired = value;
    }

}
