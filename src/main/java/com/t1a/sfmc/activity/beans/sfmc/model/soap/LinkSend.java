
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinkSend complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LinkSend">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       <sequence>
 *         <element name="SendID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="Link" type="{http://exacttarget.com/wsdl/partnerAPI}Link" minOccurs="0"/>
 *         <element name="IDLong" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkSend", propOrder = {
    "sendID",
    "link",
    "idLong"
})
public class LinkSend
    extends APIObject
{

    @XmlElement(name = "SendID")
    protected Integer sendID;
    @XmlElement(name = "Link")
    protected Link link;
    @XmlElement(name = "IDLong")
    protected Long idLong;

    /**
     * Gets the value of the sendID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSendID() {
        return sendID;
    }

    /**
     * Sets the value of the sendID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSendID(Integer value) {
        this.sendID = value;
    }

    /**
     * Gets the value of the link property.
     * 
     * @return
     *     possible object is
     *     {@link Link }
     *     
     */
    public Link getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     * 
     * @param value
     *     allowed object is
     *     {@link Link }
     *     
     */
    public void setLink(Link value) {
        this.link = value;
    }

    /**
     * Gets the value of the idLong property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIDLong() {
        return idLong;
    }

    /**
     * Sets the value of the idLong property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIDLong(Long value) {
        this.idLong = value;
    }

}
