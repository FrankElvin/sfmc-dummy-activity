
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrivateLabel complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PrivateLabel">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ColorPaletteXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="LogoFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Delete" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="SetActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrivateLabel", propOrder = {
    "id",
    "name",
    "colorPaletteXML",
    "logoFile",
    "delete",
    "setActive"
})
public class PrivateLabel {

    @XmlElement(name = "ID", required = true, type = Integer.class, nillable = true)
    protected Integer id;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "ColorPaletteXML")
    protected String colorPaletteXML;
    @XmlElement(name = "LogoFile")
    protected String logoFile;
    @XmlElement(name = "Delete")
    protected int delete;
    @XmlElement(name = "SetActive")
    protected Boolean setActive;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setID(Integer value) {
        this.id = value;
    }

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

    /**
     * Gets the value of the logoFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoFile() {
        return logoFile;
    }

    /**
     * Sets the value of the logoFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoFile(String value) {
        this.logoFile = value;
    }

    /**
     * Gets the value of the delete property.
     * 
     */
    public int getDelete() {
        return delete;
    }

    /**
     * Sets the value of the delete property.
     * 
     */
    public void setDelete(int value) {
        this.delete = value;
    }

    /**
     * Gets the value of the setActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSetActive() {
        return setActive;
    }

    /**
     * Sets the value of the setActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSetActive(Boolean value) {
        this.setActive = value;
    }

}
