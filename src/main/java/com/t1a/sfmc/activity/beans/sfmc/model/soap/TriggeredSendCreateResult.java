
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for TriggeredSendCreateResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TriggeredSendCreateResult">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}CreateResult">
 *       <sequence>
 *         <element name="SubscriberFailures" type="{http://exacttarget.com/wsdl/partnerAPI}SubscriberResult" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TriggeredSendCreateResult", propOrder = {
    "subscriberFailures"
})
public class TriggeredSendCreateResult
    extends CreateResult
{

    @XmlElement(name = "SubscriberFailures")
    protected List<SubscriberResult> subscriberFailures;

    /**
     * Gets the value of the subscriberFailures property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscriberFailures property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSubscriberFailures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscriberResult }
     * </p>
     * 
     * 
     * @return
     *     The value of the subscriberFailures property.
     */
    public List<SubscriberResult> getSubscriberFailures() {
        if (subscriberFailures == null) {
            subscriberFailures = new ArrayList<>();
        }
        return this.subscriberFailures;
    }

}
