
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for UserMap complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="UserMap">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}APIProperty">
 *       <sequence>
 *         <element name="ETAccountUser" type="{http://exacttarget.com/wsdl/partnerAPI}AccountUser"/>
 *         <element name="AdditionalData" type="{http://exacttarget.com/wsdl/partnerAPI}APIProperty" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserMap", propOrder = {
    "etAccountUser",
    "additionalData"
})
public class UserMap
    extends APIProperty
{

    @XmlElement(name = "ETAccountUser", required = true)
    protected AccountUser etAccountUser;
    @XmlElement(name = "AdditionalData")
    protected List<APIProperty> additionalData;

    /**
     * Gets the value of the etAccountUser property.
     * 
     * @return
     *     possible object is
     *     {@link AccountUser }
     *     
     */
    public AccountUser getETAccountUser() {
        return etAccountUser;
    }

    /**
     * Sets the value of the etAccountUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountUser }
     *     
     */
    public void setETAccountUser(AccountUser value) {
        this.etAccountUser = value;
    }

    /**
     * Gets the value of the additionalData property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalData property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAdditionalData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link APIProperty }
     * </p>
     * 
     * 
     * @return
     *     The value of the additionalData property.
     */
    public List<APIProperty> getAdditionalData() {
        if (additionalData == null) {
            additionalData = new ArrayList<>();
        }
        return this.additionalData;
    }

}
