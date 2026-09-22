
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutomationInstance complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AutomationInstance">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}Automation">
 *       <sequence>
 *         <element name="AutomationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="StatusMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="StatusLastUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="TaskInstances" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="AutomationTaskInstance" type="{http://exacttarget.com/wsdl/partnerAPI}AutomationTaskInstance" maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="CompletedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutomationInstance", propOrder = {
    "automationID",
    "statusMessage",
    "statusLastUpdate",
    "taskInstances",
    "startTime",
    "completedTime"
})
public class AutomationInstance
    extends Automation
{

    @XmlElement(name = "AutomationID")
    protected String automationID;
    @XmlElement(name = "StatusMessage")
    protected String statusMessage;
    @XmlElement(name = "StatusLastUpdate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusLastUpdate;
    @XmlElement(name = "TaskInstances")
    protected TaskInstances taskInstances;
    @XmlElement(name = "StartTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "CompletedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar completedTime;

    /**
     * Gets the value of the automationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutomationID() {
        return automationID;
    }

    /**
     * Sets the value of the automationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutomationID(String value) {
        this.automationID = value;
    }

    /**
     * Gets the value of the statusMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * Sets the value of the statusMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusMessage(String value) {
        this.statusMessage = value;
    }

    /**
     * Gets the value of the statusLastUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusLastUpdate() {
        return statusLastUpdate;
    }

    /**
     * Sets the value of the statusLastUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatusLastUpdate(XMLGregorianCalendar value) {
        this.statusLastUpdate = value;
    }

    /**
     * Gets the value of the taskInstances property.
     * 
     * @return
     *     possible object is
     *     {@link TaskInstances }
     *     
     */
    public TaskInstances getTaskInstances() {
        return taskInstances;
    }

    /**
     * Sets the value of the taskInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskInstances }
     *     
     */
    public void setTaskInstances(TaskInstances value) {
        this.taskInstances = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the completedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompletedTime() {
        return completedTime;
    }

    /**
     * Sets the value of the completedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompletedTime(XMLGregorianCalendar value) {
        this.completedTime = value;
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
     *         <element name="AutomationTaskInstance" type="{http://exacttarget.com/wsdl/partnerAPI}AutomationTaskInstance" maxOccurs="unbounded" minOccurs="0"/>
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
        "automationTaskInstance"
    })
    public static class TaskInstances {

        @XmlElement(name = "AutomationTaskInstance")
        protected List<AutomationTaskInstance> automationTaskInstance;

        /**
         * Gets the value of the automationTaskInstance property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the automationTaskInstance property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getAutomationTaskInstance().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AutomationTaskInstance }
         * </p>
         * 
         * 
         * @return
         *     The value of the automationTaskInstance property.
         */
        public List<AutomationTaskInstance> getAutomationTaskInstance() {
            if (automationTaskInstance == null) {
                automationTaskInstance = new ArrayList<>();
            }
            return this.automationTaskInstance;
        }

    }

}
