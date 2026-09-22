
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Thumbnail complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Thumbnail">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ThumbnailHtml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ThumbnailImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ThumbnailUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Thumbnail", propOrder = {
    "thumbnailHtml",
    "thumbnailImage",
    "thumbnailUrl"
})
public class Thumbnail {

    @XmlElement(name = "ThumbnailHtml")
    protected String thumbnailHtml;
    @XmlElement(name = "ThumbnailImage")
    protected String thumbnailImage;
    @XmlElement(name = "ThumbnailUrl")
    protected String thumbnailUrl;

    /**
     * Gets the value of the thumbnailHtml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThumbnailHtml() {
        return thumbnailHtml;
    }

    /**
     * Sets the value of the thumbnailHtml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThumbnailHtml(String value) {
        this.thumbnailHtml = value;
    }

    /**
     * Gets the value of the thumbnailImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThumbnailImage() {
        return thumbnailImage;
    }

    /**
     * Sets the value of the thumbnailImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThumbnailImage(String value) {
        this.thumbnailImage = value;
    }

    /**
     * Gets the value of the thumbnailUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    /**
     * Sets the value of the thumbnailUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThumbnailUrl(String value) {
        this.thumbnailUrl = value;
    }

}
