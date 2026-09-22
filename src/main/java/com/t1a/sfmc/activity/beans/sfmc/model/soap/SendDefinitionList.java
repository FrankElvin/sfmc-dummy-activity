
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendDefinitionList complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SendDefinitionList">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}AudienceItem">
 *       <sequence>
 *         <element name="FilterDefinition" type="{http://exacttarget.com/wsdl/partnerAPI}FilterDefinition" minOccurs="0"/>
 *         <element name="IsTestObject" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="SalesForceObjectID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Parameters" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Parameter" type="{http://exacttarget.com/wsdl/partnerAPI}APIProperty" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "SendDefinitionList", propOrder = {
    "filterDefinition",
    "isTestObject",
    "salesForceObjectID",
    "name",
    "parameters"
})
public class SendDefinitionList
    extends AudienceItem
{

    @XmlElement(name = "FilterDefinition")
    protected FilterDefinition filterDefinition;
    @XmlElement(name = "IsTestObject")
    protected Boolean isTestObject;
    @XmlElement(name = "SalesForceObjectID")
    protected String salesForceObjectID;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Parameters")
    protected Parameters parameters;

    /**
     * Gets the value of the filterDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link FilterDefinition }
     *     
     */
    public FilterDefinition getFilterDefinition() {
        return filterDefinition;
    }

    /**
     * Sets the value of the filterDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterDefinition }
     *     
     */
    public void setFilterDefinition(FilterDefinition value) {
        this.filterDefinition = value;
    }

    /**
     * Gets the value of the isTestObject property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTestObject() {
        return isTestObject;
    }

    /**
     * Sets the value of the isTestObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTestObject(Boolean value) {
        this.isTestObject = value;
    }

    /**
     * Gets the value of the salesForceObjectID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesForceObjectID() {
        return salesForceObjectID;
    }

    /**
     * Sets the value of the salesForceObjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesForceObjectID(String value) {
        this.salesForceObjectID = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link Parameters }
     *     
     */
    public Parameters getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parameters }
     *     
     */
    public void setParameters(Parameters value) {
        this.parameters = value;
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
     *         <element name="Parameter" type="{http://exacttarget.com/wsdl/partnerAPI}APIProperty" maxOccurs="unbounded" minOccurs="0"/>
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
        "parameter"
    })
    public static class Parameters {

        @XmlElement(name = "Parameter")
        protected List<APIProperty> parameter;

        /**
         * Gets the value of the parameter property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the parameter property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getParameter().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link APIProperty }
         * </p>
         * 
         * 
         * @return
         *     The value of the parameter property.
         */
        public List<APIProperty> getParameter() {
            if (parameter == null) {
                parameter = new ArrayList<>();
            }
            return this.parameter;
        }

    }

}
