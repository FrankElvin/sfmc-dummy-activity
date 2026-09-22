
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutomationTaskInstance complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AutomationTaskInstance">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}AutomationTask">
 *       <sequence>
 *         <element name="StepDefinition" type="{http://exacttarget.com/wsdl/partnerAPI}AutomationTask" minOccurs="0"/>
 *         <element name="AutomationInstance" type="{http://exacttarget.com/wsdl/partnerAPI}AutomationInstance" minOccurs="0"/>
 *         <element name="ActivityInstances" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="ActivityInstance" type="{http://exacttarget.com/wsdl/partnerAPI}AutomationActivityInstance" maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutomationTaskInstance", propOrder = {
    "stepDefinition",
    "automationInstance",
    "activityInstances"
})
public class AutomationTaskInstance
    extends AutomationTask
{

    @XmlElement(name = "StepDefinition")
    protected AutomationTask stepDefinition;
    @XmlElement(name = "AutomationInstance")
    protected AutomationInstance automationInstance;
    @XmlElement(name = "ActivityInstances")
    protected ActivityInstances activityInstances;

    /**
     * Gets the value of the stepDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link AutomationTask }
     *     
     */
    public AutomationTask getStepDefinition() {
        return stepDefinition;
    }

    /**
     * Sets the value of the stepDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutomationTask }
     *     
     */
    public void setStepDefinition(AutomationTask value) {
        this.stepDefinition = value;
    }

    /**
     * Gets the value of the automationInstance property.
     * 
     * @return
     *     possible object is
     *     {@link AutomationInstance }
     *     
     */
    public AutomationInstance getAutomationInstance() {
        return automationInstance;
    }

    /**
     * Sets the value of the automationInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutomationInstance }
     *     
     */
    public void setAutomationInstance(AutomationInstance value) {
        this.automationInstance = value;
    }

    /**
     * Gets the value of the activityInstances property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityInstances }
     *     
     */
    public ActivityInstances getActivityInstances() {
        return activityInstances;
    }

    /**
     * Sets the value of the activityInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityInstances }
     *     
     */
    public void setActivityInstances(ActivityInstances value) {
        this.activityInstances = value;
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
     *         <element name="ActivityInstance" type="{http://exacttarget.com/wsdl/partnerAPI}AutomationActivityInstance" maxOccurs="unbounded" minOccurs="0"/>
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
        "activityInstance"
    })
    public static class ActivityInstances {

        @XmlElement(name = "ActivityInstance")
        protected List<AutomationActivityInstance> activityInstance;

        /**
         * Gets the value of the activityInstance property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the activityInstance property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getActivityInstance().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AutomationActivityInstance }
         * </p>
         * 
         * 
         * @return
         *     The value of the activityInstance property.
         */
        public List<AutomationActivityInstance> getActivityInstance() {
            if (activityInstance == null) {
                activityInstance = new ArrayList<>();
            }
            return this.activityInstance;
        }

    }

}
