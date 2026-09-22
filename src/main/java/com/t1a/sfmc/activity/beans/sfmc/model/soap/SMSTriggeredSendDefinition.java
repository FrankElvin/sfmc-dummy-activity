
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SMSTriggeredSendDefinition complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SMSTriggeredSendDefinition">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}SendDefinition">
 *       <sequence>
 *         <element name="Publication" type="{http://exacttarget.com/wsdl/partnerAPI}List" minOccurs="0"/>
 *         <element name="DataExtension" type="{http://exacttarget.com/wsdl/partnerAPI}DataExtension" minOccurs="0"/>
 *         <element name="Content" type="{http://exacttarget.com/wsdl/partnerAPI}ContentArea" minOccurs="0"/>
 *         <element name="SendToList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SMSTriggeredSendDefinition", propOrder = {
    "publication",
    "dataExtension",
    "content",
    "sendToList"
})
public class SMSTriggeredSendDefinition
    extends SendDefinition
{

    @XmlElement(name = "Publication")
    protected List publication;
    @XmlElement(name = "DataExtension")
    protected DataExtension dataExtension;
    @XmlElement(name = "Content")
    protected ContentArea content;
    @XmlElement(name = "SendToList")
    protected Boolean sendToList;

    /**
     * Gets the value of the publication property.
     * 
     * @return
     *     possible object is
     *     {@link List }
     *     
     */
    public List getPublication() {
        return publication;
    }

    /**
     * Sets the value of the publication property.
     * 
     * @param value
     *     allowed object is
     *     {@link List }
     *     
     */
    public void setPublication(List value) {
        this.publication = value;
    }

    /**
     * Gets the value of the dataExtension property.
     * 
     * @return
     *     possible object is
     *     {@link DataExtension }
     *     
     */
    public DataExtension getDataExtension() {
        return dataExtension;
    }

    /**
     * Sets the value of the dataExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataExtension }
     *     
     */
    public void setDataExtension(DataExtension value) {
        this.dataExtension = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link ContentArea }
     *     
     */
    public ContentArea getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentArea }
     *     
     */
    public void setContent(ContentArea value) {
        this.content = value;
    }

    /**
     * Gets the value of the sendToList property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendToList() {
        return sendToList;
    }

    /**
     * Sets the value of the sendToList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendToList(Boolean value) {
        this.sendToList = value;
    }

}
