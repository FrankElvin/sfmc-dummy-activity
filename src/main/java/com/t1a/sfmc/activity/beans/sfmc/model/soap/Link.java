
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for Link complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Link">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       <sequence>
 *         <element name="LastClicked" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TotalClicks" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="UniqueClicks" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Subscribers" type="{http://exacttarget.com/wsdl/partnerAPI}TrackingEvent" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Link", propOrder = {
    "lastClicked",
    "alias",
    "totalClicks",
    "uniqueClicks",
    "url",
    "subscribers",
    "idLong"
})
public class Link
    extends APIObject
{

    @XmlElement(name = "LastClicked")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastClicked;
    @XmlElement(name = "Alias")
    protected String alias;
    @XmlElement(name = "TotalClicks")
    protected Integer totalClicks;
    @XmlElement(name = "UniqueClicks")
    protected Integer uniqueClicks;
    @XmlElement(name = "URL")
    protected String url;
    @XmlElement(name = "Subscribers")
    protected List<TrackingEvent> subscribers;
    @XmlElement(name = "IDLong")
    protected Long idLong;

    /**
     * Gets the value of the lastClicked property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastClicked() {
        return lastClicked;
    }

    /**
     * Sets the value of the lastClicked property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastClicked(XMLGregorianCalendar value) {
        this.lastClicked = value;
    }

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
    }

    /**
     * Gets the value of the totalClicks property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalClicks() {
        return totalClicks;
    }

    /**
     * Sets the value of the totalClicks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalClicks(Integer value) {
        this.totalClicks = value;
    }

    /**
     * Gets the value of the uniqueClicks property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUniqueClicks() {
        return uniqueClicks;
    }

    /**
     * Sets the value of the uniqueClicks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUniqueClicks(Integer value) {
        this.uniqueClicks = value;
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
     * Gets the value of the subscribers property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscribers property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSubscribers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackingEvent }
     * </p>
     * 
     * 
     * @return
     *     The value of the subscribers property.
     */
    public List<TrackingEvent> getSubscribers() {
        if (subscribers == null) {
            subscribers = new ArrayList<>();
        }
        return this.subscribers;
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
