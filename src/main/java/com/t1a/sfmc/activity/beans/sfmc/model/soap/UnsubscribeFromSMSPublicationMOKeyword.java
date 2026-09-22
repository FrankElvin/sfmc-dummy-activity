
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnsubscribeFromSMSPublicationMOKeyword complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="UnsubscribeFromSMSPublicationMOKeyword">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}BaseMOKeyword">
 *       <sequence>
 *         <element name="NextMOKeyword" type="{http://exacttarget.com/wsdl/partnerAPI}BaseMOKeyword" minOccurs="0"/>
 *         <element name="AllUnsubSuccessMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="InvalidPublicationMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="SingleUnsubSuccessMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnsubscribeFromSMSPublicationMOKeyword", propOrder = {
    "nextMOKeyword",
    "allUnsubSuccessMessage",
    "invalidPublicationMessage",
    "singleUnsubSuccessMessage"
})
public class UnsubscribeFromSMSPublicationMOKeyword
    extends BaseMOKeyword
{

    @XmlElement(name = "NextMOKeyword")
    protected BaseMOKeyword nextMOKeyword;
    @XmlElement(name = "AllUnsubSuccessMessage", required = true)
    protected String allUnsubSuccessMessage;
    @XmlElement(name = "InvalidPublicationMessage", required = true)
    protected String invalidPublicationMessage;
    @XmlElement(name = "SingleUnsubSuccessMessage", required = true)
    protected String singleUnsubSuccessMessage;

    /**
     * Gets the value of the nextMOKeyword property.
     * 
     * @return
     *     possible object is
     *     {@link BaseMOKeyword }
     *     
     */
    public BaseMOKeyword getNextMOKeyword() {
        return nextMOKeyword;
    }

    /**
     * Sets the value of the nextMOKeyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseMOKeyword }
     *     
     */
    public void setNextMOKeyword(BaseMOKeyword value) {
        this.nextMOKeyword = value;
    }

    /**
     * Gets the value of the allUnsubSuccessMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllUnsubSuccessMessage() {
        return allUnsubSuccessMessage;
    }

    /**
     * Sets the value of the allUnsubSuccessMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllUnsubSuccessMessage(String value) {
        this.allUnsubSuccessMessage = value;
    }

    /**
     * Gets the value of the invalidPublicationMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvalidPublicationMessage() {
        return invalidPublicationMessage;
    }

    /**
     * Sets the value of the invalidPublicationMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvalidPublicationMessage(String value) {
        this.invalidPublicationMessage = value;
    }

    /**
     * Gets the value of the singleUnsubSuccessMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSingleUnsubSuccessMessage() {
        return singleUnsubSuccessMessage;
    }

    /**
     * Sets the value of the singleUnsubSuccessMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSingleUnsubSuccessMessage(String value) {
        this.singleUnsubSuccessMessage = value;
    }

}
