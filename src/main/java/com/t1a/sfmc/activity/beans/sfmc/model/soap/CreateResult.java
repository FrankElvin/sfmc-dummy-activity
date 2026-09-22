
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for CreateResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CreateResult">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}Result">
 *       <sequence>
 *         <element name="NewID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="NewObjectID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="PartnerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Object" type="{http://exacttarget.com/wsdl/partnerAPI}APIObject" minOccurs="0"/>
 *         <element name="CreateResults" type="{http://exacttarget.com/wsdl/partnerAPI}CreateResult" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "CreateResult", propOrder = {
    "newID",
    "newObjectID",
    "partnerKey",
    "object",
    "createResults",
    "parentPropertyName"
})
@XmlSeeAlso({
    TriggeredSendCreateResult.class,
    DataExtensionCreateResult.class,
    ContactEventCreateResult.class
})
public class CreateResult
    extends Result
{

    @XmlElement(name = "NewID")
    protected int newID;
    @XmlElement(name = "NewObjectID")
    protected String newObjectID;
    @XmlElement(name = "PartnerKey")
    protected String partnerKey;
    @XmlElement(name = "Object")
    protected APIObject object;
    @XmlElement(name = "CreateResults")
    protected List<CreateResult> createResults;
    @XmlElement(name = "ParentPropertyName")
    protected String parentPropertyName;

    /**
     * Gets the value of the newID property.
     * 
     */
    public int getNewID() {
        return newID;
    }

    /**
     * Sets the value of the newID property.
     * 
     */
    public void setNewID(int value) {
        this.newID = value;
    }

    /**
     * Gets the value of the newObjectID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewObjectID() {
        return newObjectID;
    }

    /**
     * Sets the value of the newObjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewObjectID(String value) {
        this.newObjectID = value;
    }

    /**
     * Gets the value of the partnerKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerKey() {
        return partnerKey;
    }

    /**
     * Sets the value of the partnerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerKey(String value) {
        this.partnerKey = value;
    }

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
     * Gets the value of the createResults property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the createResults property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCreateResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreateResult }
     * </p>
     * 
     * 
     * @return
     *     The value of the createResults property.
     */
    public List<CreateResult> getCreateResults() {
        if (createResults == null) {
            createResults = new ArrayList<>();
        }
        return this.createResults;
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
