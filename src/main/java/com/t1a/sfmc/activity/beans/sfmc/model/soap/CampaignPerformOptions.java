
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampaignPerformOptions complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CampaignPerformOptions">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}PerformOptions">
 *       <sequence>
 *         <element name="OccurrenceIDs" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OccurrenceIDsIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampaignPerformOptions", propOrder = {
    "occurrenceIDs",
    "occurrenceIDsIndex"
})
public class CampaignPerformOptions
    extends PerformOptions
{

    @XmlElement(name = "OccurrenceIDs")
    protected List<String> occurrenceIDs;
    @XmlElement(name = "OccurrenceIDsIndex")
    protected Integer occurrenceIDsIndex;

    /**
     * Gets the value of the occurrenceIDs property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the occurrenceIDs property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOccurrenceIDs().add(newItem);
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
     *     The value of the occurrenceIDs property.
     */
    public List<String> getOccurrenceIDs() {
        if (occurrenceIDs == null) {
            occurrenceIDs = new ArrayList<>();
        }
        return this.occurrenceIDs;
    }

    /**
     * Gets the value of the occurrenceIDsIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOccurrenceIDsIndex() {
        return occurrenceIDsIndex;
    }

    /**
     * Sets the value of the occurrenceIDsIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOccurrenceIDsIndex(Integer value) {
        this.occurrenceIDsIndex = value;
    }

}
