
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for SimpleFilterPart complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SimpleFilterPart">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}FilterPart">
 *       <sequence>
 *         <element name="Property" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="SimpleOperator" type="{http://exacttarget.com/wsdl/partnerAPI}SimpleOperators"/>
 *         <element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DateValue" type="{http://www.w3.org/2001/XMLSchema}dateTime" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleFilterPart", propOrder = {
    "property",
    "simpleOperator",
    "value",
    "dateValue"
})
public class SimpleFilterPart
    extends FilterPart
{

    @XmlElement(name = "Property", required = true)
    protected String property;
    @XmlElement(name = "SimpleOperator", required = true)
    @XmlSchemaType(name = "string")
    protected SimpleOperators simpleOperator;
    @XmlElement(name = "Value")
    protected List<String> value;
    @XmlElement(name = "DateValue")
    @XmlSchemaType(name = "dateTime")
    protected List<XMLGregorianCalendar> dateValue;

    /**
     * Gets the value of the property property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperty() {
        return property;
    }

    /**
     * Sets the value of the property property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperty(String value) {
        this.property = value;
    }

    /**
     * Gets the value of the simpleOperator property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleOperators }
     *     
     */
    public SimpleOperators getSimpleOperator() {
        return simpleOperator;
    }

    /**
     * Sets the value of the simpleOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleOperators }
     *     
     */
    public void setSimpleOperator(SimpleOperators value) {
        this.simpleOperator = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the value property.
     */
    public List<String> getValue() {
        if (value == null) {
            value = new ArrayList<>();
        }
        return this.value;
    }

    /**
     * Gets the value of the dateValue property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateValue property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDateValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * </p>
     * 
     * 
     * @return
     *     The value of the dateValue property.
     */
    public List<XMLGregorianCalendar> getDateValue() {
        if (dateValue == null) {
            dateValue = new ArrayList<>();
        }
        return this.dateValue;
    }

}
