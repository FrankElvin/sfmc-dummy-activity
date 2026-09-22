
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.*;


/**
 * Maybe add verb here...
 * 
 * <p>Java class for BaseMOKeyword complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BaseMOKeyword">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       <sequence>
 *         <element name="IsDefaultKeyword" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseMOKeyword", propOrder = {
    "isDefaultKeyword"
})
@XmlSeeAlso({
    SendSMSMOKeyword.class,
    UnsubscribeFromSMSPublicationMOKeyword.class,
    DoubleOptInMOKeyword.class,
    HelpMOKeyword.class,
    SendEmailMOKeyword.class
})
public class BaseMOKeyword
    extends APIObject
{

    @XmlElement(name = "IsDefaultKeyword")
    protected Boolean isDefaultKeyword;

    /**
     * Gets the value of the isDefaultKeyword property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDefaultKeyword() {
        return isDefaultKeyword;
    }

    /**
     * Sets the value of the isDefaultKeyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDefaultKeyword(Boolean value) {
        this.isDefaultKeyword = value;
    }

}
