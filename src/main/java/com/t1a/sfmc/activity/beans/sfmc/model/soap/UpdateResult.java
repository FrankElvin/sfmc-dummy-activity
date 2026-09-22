
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for UpdateResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="UpdateResult">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}Result">
 *       <sequence>
 *         <element name="Object" type="{http://exacttarget.com/wsdl/partnerAPI}APIObject"/>
 *         <element name="UpdateResults" type="{http://exacttarget.com/wsdl/partnerAPI}UpdateResult" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ParentPropertyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateResult", propOrder = {
    "object",
    "updateResults",
    "parentPropertyName"
})
@XmlSeeAlso({
    DataExtensionUpdateResult.class
})
public class UpdateResult
    extends Result
{

    @XmlElement(name = "Object", required = true)
    protected APIObject object;
    @XmlElement(name = "UpdateResults")
    protected List<UpdateResult> updateResults;
    @XmlElement(name = "ParentPropertyName")
    protected String parentPropertyName;

    /**
     * Gets the value of the object property.
     * 
     * @return
     *     possible object is
     *     {@link APIObject }
     *     
     */
    public APIObject getObject() {
        return object;
    }

    /**
     * Sets the value of the object property.
     * 
     * @param value
     *     allowed object is
     *     {@link APIObject }
     *     
     */
    public void setObject(APIObject value) {
        this.object = value;
    }

    /**
     * Gets the value of the updateResults property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updateResults property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getUpdateResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdateResult }
     * </p>
     * 
     * 
     * @return
     *     The value of the updateResults property.
     */
    public List<UpdateResult> getUpdateResults() {
        if (updateResults == null) {
            updateResults = new ArrayList<>();
        }
        return this.updateResults;
    }

    /**
     * Gets the value of the parentPropertyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentPropertyName() {
        return parentPropertyName;
    }

    /**
     * Sets the value of the parentPropertyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentPropertyName(String value) {
        this.parentPropertyName = value;
    }

}
