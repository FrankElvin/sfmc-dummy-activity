
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.*;
import lombok.Setter;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for Options complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Options">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Client" type="{http://exacttarget.com/wsdl/partnerAPI}ClientID" minOccurs="0"/>
 *         <element name="SendResponseTo" type="{http://exacttarget.com/wsdl/partnerAPI}AsyncResponse" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SaveOptions" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="SaveOption" type="{http://exacttarget.com/wsdl/partnerAPI}SaveOption" maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Priority" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
 *         <element name="ConversationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="SequenceCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="CallsInConversation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="ScheduledTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="RequestType" type="{http://exacttarget.com/wsdl/partnerAPI}RequestType" minOccurs="0"/>
 *         <element name="QueuePriority" type="{http://exacttarget.com/wsdl/partnerAPI}Priority" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Options", propOrder = {
    "client",
    "sendResponseTo",
    "saveOptions",
    "priority",
    "conversationID",
    "sequenceCode",
    "callsInConversation",
    "scheduledTime",
    "requestType",
    "queuePriority"
})
@XmlSeeAlso({
    CreateOptions.class,
    UpdateOptions.class,
    DeleteOptions.class,
    ConfigureOptions.class,
    ScheduleOptions.class,
    SystemStatusOptions.class,
    RetrieveSingleOptions.class,
    RetrieveOptions.class,
    PerformOptions.class,
    ExtractOptions.class
})
public abstract class Options {

    @XmlElement(name = "Client")
    protected ClientID client;
    @XmlElement(name = "SendResponseTo")
    protected List<AsyncResponse> sendResponseTo;
    @XmlElement(name = "SaveOptions")
    protected SaveOptions saveOptions;
    @XmlElement(name = "Priority")
    protected Byte priority;
    @XmlElement(name = "ConversationID")
    protected String conversationID;
    @XmlElement(name = "SequenceCode")
    protected Integer sequenceCode;
    @XmlElement(name = "CallsInConversation")
    protected Integer callsInConversation;
    @XmlElement(name = "ScheduledTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledTime;
    @XmlElement(name = "RequestType")
    @XmlSchemaType(name = "string")
    protected RequestType requestType;
    @XmlElement(name = "QueuePriority")
    @XmlSchemaType(name = "string")
    protected Priority queuePriority;

    /**
     * Gets the value of the client property.
     * 
     * @return
     *     possible object is
     *     {@link ClientID }
     *     
     */
    public ClientID getClient() {
        return client;
    }

    /**
     * Sets the value of the client property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientID }
     *     
     */
    public void setClient(ClientID value) {
        this.client = value;
    }

    /**
     * Gets the value of the sendResponseTo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sendResponseTo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSendResponseTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AsyncResponse }
     * </p>
     * 
     * 
     * @return
     *     The value of the sendResponseTo property.
     */
    public List<AsyncResponse> getSendResponseTo() {
        if (sendResponseTo == null) {
            sendResponseTo = new ArrayList<>();
        }
        return this.sendResponseTo;
    }

    /**
     * Gets the value of the saveOptions property.
     * 
     * @return
     *     possible object is
     *     {@link SaveOptions }
     *     
     */
    public SaveOptions getSaveOptions() {
        return saveOptions;
    }

    /**
     * Sets the value of the saveOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaveOptions }
     *     
     */
    public void setSaveOptions(SaveOptions value) {
        this.saveOptions = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setPriority(Byte value) {
        this.priority = value;
    }

    /**
     * Gets the value of the conversationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConversationID() {
        return conversationID;
    }

    /**
     * Sets the value of the conversationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConversationID(String value) {
        this.conversationID = value;
    }

    /**
     * Gets the value of the sequenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequenceCode() {
        return sequenceCode;
    }

    /**
     * Sets the value of the sequenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequenceCode(Integer value) {
        this.sequenceCode = value;
    }

    /**
     * Gets the value of the callsInConversation property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCallsInConversation() {
        return callsInConversation;
    }

    /**
     * Sets the value of the callsInConversation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCallsInConversation(Integer value) {
        this.callsInConversation = value;
    }

    /**
     * Gets the value of the scheduledTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledTime() {
        return scheduledTime;
    }

    /**
     * Sets the value of the scheduledTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledTime(XMLGregorianCalendar value) {
        this.scheduledTime = value;
    }

    /**
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link RequestType }
     *     
     */
    public RequestType getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType }
     *     
     */
    public void setRequestType(RequestType value) {
        this.requestType = value;
    }

    /**
     * Gets the value of the queuePriority property.
     * 
     * @return
     *     possible object is
     *     {@link Priority }
     *     
     */
    public Priority getQueuePriority() {
        return queuePriority;
    }

    /**
     * Sets the value of the queuePriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority }
     *     
     */
    public void setQueuePriority(Priority value) {
        this.queuePriority = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="SaveOption" type="{http://exacttarget.com/wsdl/partnerAPI}SaveOption" maxOccurs="unbounded" minOccurs="0"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "saveOption"
    })
    @Setter
    public static class SaveOptions {

        @XmlElement(name = "SaveOption")
        protected List<SaveOption> saveOption;

        /**
         * Gets the value of the saveOption property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the saveOption property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getSaveOption().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SaveOption }
         * </p>
         * 
         * 
         * @return
         *     The value of the saveOption property.
         */
        public List<SaveOption> getSaveOption() {
            if (saveOption == null) {
                saveOption = new ArrayList<>();
            }
            return this.saveOption;
        }

    }

}
