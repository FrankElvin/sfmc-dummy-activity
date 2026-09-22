
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtractRequest complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExtractRequest">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}Request">
 *       <sequence>
 *         <element name="Client" type="{http://exacttarget.com/wsdl/partnerAPI}ClientID" minOccurs="0"/>
 *         <element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Options" type="{http://exacttarget.com/wsdl/partnerAPI}ExtractOptions"/>
 *         <element name="Parameters" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Parameter" type="{http://exacttarget.com/wsdl/partnerAPI}ExtractParameter" maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <choice minOccurs="0">
 *           <element name="Description" type="{http://exacttarget.com/wsdl/partnerAPI}ExtractDescription"/>
 *           <element name="Definition" type="{http://exacttarget.com/wsdl/partnerAPI}ExtractDefinition"/>
 *         </choice>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtractRequest", propOrder = {
    "client",
    "id",
    "options",
    "parameters",
    "description",
    "definition"
})
public class ExtractRequest
    extends Request
{

    @XmlElement(name = "Client")
    protected ClientID client;
    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(name = "Options", required = true)
    protected ExtractOptions options;
    @XmlElement(name = "Parameters")
    protected Parameters parameters;
    @XmlElement(name = "Description")
    protected ExtractDescription description;
    @XmlElement(name = "Definition")
    protected ExtractDefinition definition;

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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link ExtractOptions }
     *     
     */
    public ExtractOptions getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtractOptions }
     *     
     */
    public void setOptions(ExtractOptions value) {
        this.options = value;
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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link ExtractDescription }
     *     
     */
    public ExtractDescription getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtractDescription }
     *     
     */
    public void setDescription(ExtractDescription value) {
        this.description = value;
    }

    /**
     * Gets the value of the definition property.
     * 
     * @return
     *     possible object is
     *     {@link ExtractDefinition }
     *     
     */
    public ExtractDefinition getDefinition() {
        return definition;
    }

    /**
     * Sets the value of the definition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtractDefinition }
     *     
     */
    public void setDefinition(ExtractDefinition value) {
        this.definition = value;
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
     *         <element name="Parameter" type="{http://exacttarget.com/wsdl/partnerAPI}ExtractParameter" maxOccurs="unbounded" minOccurs="0"/>
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
        protected List<ExtractParameter> parameter;

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
         * {@link ExtractParameter }
         * </p>
         * 
         * 
         * @return
         *     The value of the parameter property.
         */
        public List<ExtractParameter> getParameter() {
            if (parameter == null) {
                parameter = new ArrayList<>();
            }
            return this.parameter;
        }

    }

}
