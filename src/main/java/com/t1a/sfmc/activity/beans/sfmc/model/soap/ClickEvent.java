
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClickEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClickEvent">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}TrackingEvent">
 *       <sequence>
 *         <element name="URLID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="URLIDLong" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClickEvent", propOrder = {
    "urlid",
    "url",
    "urlidLong"
})
public class ClickEvent
    extends TrackingEvent
{

    @XmlElement(name = "URLID")
    protected Integer urlid;
    @XmlElement(name = "URL")
    protected String url;
    @XmlElement(name = "URLIDLong")
    protected Long urlidLong;

    /**
     * Gets the value of the urlid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getURLID() {
        return urlid;
    }

    /**
     * Sets the value of the urlid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setURLID(Integer value) {
        this.urlid = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the urlidLong property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getURLIDLong() {
        return urlidLong;
    }

    /**
     * Sets the value of the urlidLong property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setURLIDLong(Long value) {
        this.urlidLong = value;
    }

}
