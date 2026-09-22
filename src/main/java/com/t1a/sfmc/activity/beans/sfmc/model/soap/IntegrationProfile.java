
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntegrationProfile complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="IntegrationProfile">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       <sequence>
 *         <element name="ProfileID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="SubscriberKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ExternalID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ExternalType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntegrationProfile", propOrder = {
    "profileID",
    "subscriberKey",
    "externalID",
    "externalType"
})
public class IntegrationProfile
    extends APIObject
{

    @XmlElement(name = "ProfileID", required = true)
    protected String profileID;
    @XmlElement(name = "SubscriberKey", required = true)
    protected String subscriberKey;
    @XmlElement(name = "ExternalID", required = true)
    protected String externalID;
    @XmlElement(name = "ExternalType", required = true)
    protected String externalType;

    /**
     * Gets the value of the profileID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileID() {
        return profileID;
    }

    /**
     * Sets the value of the profileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileID(String value) {
        this.profileID = value;
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

    /**
     * Gets the value of the externalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalID() {
        return externalID;
    }

    /**
     * Sets the value of the externalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalID(String value) {
        this.externalID = value;
    }

    /**
     * Gets the value of the externalType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalType() {
        return externalType;
    }

    /**
     * Sets the value of the externalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalType(String value) {
        this.externalType = value;
    }

}
