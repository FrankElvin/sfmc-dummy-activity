
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JsonWebKey complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="JsonWebKey">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="KeyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="KeyModulus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="KeyExponent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="KeyAlgorithm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="KeyUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="KeyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JsonWebKey", propOrder = {
    "keyType",
    "keyModulus",
    "keyExponent",
    "keyAlgorithm",
    "keyUse",
    "keyId"
})
public class JsonWebKey {

    @XmlElement(name = "KeyType")
    protected String keyType;
    @XmlElement(name = "KeyModulus")
    protected String keyModulus;
    @XmlElement(name = "KeyExponent")
    protected String keyExponent;
    @XmlElement(name = "KeyAlgorithm")
    protected String keyAlgorithm;
    @XmlElement(name = "KeyUse")
    protected String keyUse;
    @XmlElement(name = "KeyId")
    protected String keyId;

    /**
     * Gets the value of the keyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyType() {
        return keyType;
    }

    /**
     * Sets the value of the keyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyType(String value) {
        this.keyType = value;
    }

    /**
     * Gets the value of the keyModulus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyModulus() {
        return keyModulus;
    }

    /**
     * Sets the value of the keyModulus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyModulus(String value) {
        this.keyModulus = value;
    }

    /**
     * Gets the value of the keyExponent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyExponent() {
        return keyExponent;
    }

    /**
     * Sets the value of the keyExponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyExponent(String value) {
        this.keyExponent = value;
    }

    /**
     * Gets the value of the keyAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyAlgorithm() {
        return keyAlgorithm;
    }

    /**
     * Sets the value of the keyAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyAlgorithm(String value) {
        this.keyAlgorithm = value;
    }

    /**
     * Gets the value of the keyUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyUse() {
        return keyUse;
    }

    /**
     * Sets the value of the keyUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyUse(String value) {
        this.keyUse = value;
    }

    /**
     * Gets the value of the keyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * Sets the value of the keyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyId(String value) {
        this.keyId = value;
    }

}
