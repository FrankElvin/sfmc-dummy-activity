
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for SystemStatusResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SystemStatusResult">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}Result">
 *       <sequence>
 *         <element name="SystemStatus" type="{http://exacttarget.com/wsdl/partnerAPI}SystemStatusType"/>
 *         <element name="Outages" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Outage" type="{http://exacttarget.com/wsdl/partnerAPI}SystemOutage" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "SystemStatusResult", propOrder = {
    "systemStatus",
    "outages"
})
public class SystemStatusResult
    extends Result
{

    @XmlElement(name = "SystemStatus", required = true)
    @XmlSchemaType(name = "string")
    protected SystemStatusType systemStatus;
    @XmlElement(name = "Outages")
    protected Outages outages;

    /**
     * Gets the value of the systemStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SystemStatusType }
     *     
     */
    public SystemStatusType getSystemStatus() {
        return systemStatus;
    }

    /**
     * Sets the value of the systemStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemStatusType }
     *     
     */
    public void setSystemStatus(SystemStatusType value) {
        this.systemStatus = value;
    }

    /**
     * Gets the value of the outages property.
     * 
     * @return
     *     possible object is
     *     {@link Outages }
     *     
     */
    public Outages getOutages() {
        return outages;
    }

    /**
     * Sets the value of the outages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Outages }
     *     
     */
    public void setOutages(Outages value) {
        this.outages = value;
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
     *         <element name="Outage" type="{http://exacttarget.com/wsdl/partnerAPI}SystemOutage" maxOccurs="unbounded" minOccurs="0"/>
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
        "outage"
    })
    public static class Outages {

        @XmlElement(name = "Outage")
        protected List<SystemOutage> outage;

        /**
         * Gets the value of the outage property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the outage property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getOutage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SystemOutage }
         * </p>
         * 
         * 
         * @return
         *     The value of the outage property.
         */
        public List<SystemOutage> getOutage() {
            if (outage == null) {
                outage = new ArrayList<>();
            }
            return this.outage;
        }

    }

}
