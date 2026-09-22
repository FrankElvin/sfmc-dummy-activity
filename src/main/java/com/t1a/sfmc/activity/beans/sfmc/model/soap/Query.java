
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Query complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Query">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Object" type="{http://exacttarget.com/wsdl/partnerAPI}QueryObject"/>
 *         <element name="Filter" type="{http://exacttarget.com/wsdl/partnerAPI}FilterPart" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Query", propOrder = {
    "object",
    "filter"
})
public class Query {

    @XmlElement(name = "Object", required = true)
    protected QueryObject object;
    @XmlElement(name = "Filter")
    protected FilterPart filter;

    /**
     * Gets the value of the object property.
     * 
     * @return
     *     possible object is
     *     {@link QueryObject }
     *     
     */
    public QueryObject getObject() {
        return object;
    }

    /**
     * Sets the value of the object property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryObject }
     *     
     */
    public void setObject(QueryObject value) {
        this.object = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link FilterPart }
     *     
     */
    public FilterPart getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterPart }
     *     
     */
    public void setFilter(FilterPart value) {
        this.filter = value;
    }

}
