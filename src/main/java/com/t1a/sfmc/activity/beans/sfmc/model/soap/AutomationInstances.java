
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutomationInstances complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AutomationInstances">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       <sequence>
 *         <element name="InstanceCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="AutomationInstanceCollection" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="AutomationInstance" type="{http://exacttarget.com/wsdl/partnerAPI}AutomationInstance" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "AutomationInstances", propOrder = {
    "instanceCount",
    "automationInstanceCollection"
})
public class AutomationInstances
    extends APIObject
{

    @XmlElement(name = "InstanceCount")
    protected Integer instanceCount;
    @XmlElement(name = "AutomationInstanceCollection")
    protected AutomationInstanceCollection automationInstanceCollection;

    /**
     * Gets the value of the instanceCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }

    /**
     * Sets the value of the instanceCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInstanceCount(Integer value) {
        this.instanceCount = value;
    }

    /**
     * Gets the value of the automationInstanceCollection property.
     * 
     * @return
     *     possible object is
     *     {@link AutomationInstanceCollection }
     *     
     */
    public AutomationInstanceCollection getAutomationInstanceCollection() {
        return automationInstanceCollection;
    }

    /**
     * Sets the value of the automationInstanceCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutomationInstanceCollection }
     *     
     */
    public void setAutomationInstanceCollection(AutomationInstanceCollection value) {
        this.automationInstanceCollection = value;
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
     *         <element name="AutomationInstance" type="{http://exacttarget.com/wsdl/partnerAPI}AutomationInstance" maxOccurs="unbounded" minOccurs="0"/>
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
        "automationInstance"
    })
    public static class AutomationInstanceCollection {

        @XmlElement(name = "AutomationInstance")
        protected List<AutomationInstance> automationInstance;

        /**
         * Gets the value of the automationInstance property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the automationInstance property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getAutomationInstance().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AutomationInstance }
         * </p>
         * 
         * 
         * @return
         *     The value of the automationInstance property.
         */
        public List<AutomationInstance> getAutomationInstance() {
            if (automationInstance == null) {
                automationInstance = new ArrayList<>();
            }
            return this.automationInstance;
        }

    }

}
