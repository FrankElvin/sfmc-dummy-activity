
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
 *         <element name="Options" type="{http://exacttarget.com/wsdl/partnerAPI}CreateOptions"/>
 *         <element name="Objects" type="{http://exacttarget.com/wsdl/partnerAPI}APIObject" maxOccurs="unbounded"/>
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
    "objects"
})
@XmlRootElement(name = "CreateRequest")
public class CreateRequest {

    @XmlElement(name = "Options", required = true)
    protected CreateOptions options;
    @XmlElement(name = "Objects", required = true)
    protected List<APIObject> objects;

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link CreateOptions }
     *     
     */
    public CreateOptions getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateOptions }
     *     
     */
    public void setOptions(CreateOptions value) {
        this.options = value;
    }

    /**
     * Gets the value of the objects property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objects property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getObjects().add(newItem);
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
     *     The value of the objects property.
     */
    public List<APIObject> getObjects() {
        if (objects == null) {
            objects = new ArrayList<>();
        }
        return this.objects;
    }

}
