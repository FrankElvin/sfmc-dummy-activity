
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountPrivateLabel complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AccountPrivateLabel">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       <sequence>
 *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="OwnerMemberID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="ColorPaletteXML" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountPrivateLabel", propOrder = {
    "name",
    "ownerMemberID",
    "colorPaletteXML"
})
public class AccountPrivateLabel
    extends APIObject
{

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "OwnerMemberID")
    protected int ownerMemberID;
    @XmlElement(name = "ColorPaletteXML", required = true)
    protected String colorPaletteXML;

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
     * Gets the value of the ownerMemberID property.
     * 
     */
    public int getOwnerMemberID() {
        return ownerMemberID;
    }

    /**
     * Sets the value of the ownerMemberID property.
     * 
     */
    public void setOwnerMemberID(int value) {
        this.ownerMemberID = value;
    }

    /**
     * Gets the value of the colorPaletteXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorPaletteXML() {
        return colorPaletteXML;
    }

    /**
     * Sets the value of the colorPaletteXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorPaletteXML(String value) {
        this.colorPaletteXML = value;
    }

}
