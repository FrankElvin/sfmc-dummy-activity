
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


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
 *         <element name="Options" type="{http://exacttarget.com/wsdl/partnerAPI}ScheduleOptions" minOccurs="0"/>
 *         <element name="Action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Schedule" type="{http://exacttarget.com/wsdl/partnerAPI}ScheduleDefinition" minOccurs="0"/>
 *         <element name="Interactions" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Interaction" type="{http://exacttarget.com/wsdl/partnerAPI}APIObject" maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
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
    "options",
    "action",
    "schedule",
    "interactions"
})
@XmlRootElement(name = "ScheduleRequestMsg")
public class ScheduleRequestMsg {

    @XmlElement(name = "Options")
    protected ScheduleOptions options;
    @XmlElement(name = "Action")
    protected String action;
    @XmlElement(name = "Schedule")
    protected ScheduleDefinition schedule;
    @XmlElement(name = "Interactions")
    protected Interactions interactions;

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleOptions }
     *     
     */
    public ScheduleOptions getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleOptions }
     *     
     */
    public void setOptions(ScheduleOptions value) {
        this.options = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleDefinition }
     *     
     */
    public ScheduleDefinition getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleDefinition }
     *     
     */
    public void setSchedule(ScheduleDefinition value) {
        this.schedule = value;
    }

    /**
     * Gets the value of the interactions property.
     * 
     * @return
     *     possible object is
     *     {@link Interactions }
     *     
     */
    public Interactions getInteractions() {
        return interactions;
    }

    /**
     * Sets the value of the interactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Interactions }
     *     
     */
    public void setInteractions(Interactions value) {
        this.interactions = value;
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
     *         <element name="Interaction" type="{http://exacttarget.com/wsdl/partnerAPI}APIObject" maxOccurs="unbounded" minOccurs="0"/>
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
        "interaction"
    })
    public static class Interactions {

        @XmlElement(name = "Interaction")
        protected List<APIObject> interaction;

        /**
         * Gets the value of the interaction property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the interaction property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getInteraction().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link APIObject }
         * </p>
         * 
         * 
         * @return
         *     The value of the interaction property.
         */
        public List<APIObject> getInteraction() {
            if (interaction == null) {
                interaction = new ArrayList<>();
            }
            return this.interaction;
        }

    }

}
