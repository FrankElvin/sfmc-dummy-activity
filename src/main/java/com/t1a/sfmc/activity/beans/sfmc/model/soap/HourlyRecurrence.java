
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.*;


/**
 * <p>Java class for HourlyRecurrence complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HourlyRecurrence">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}Recurrence">
 *       <sequence>
 *         <element name="HourlyRecurrencePatternType" type="{http://exacttarget.com/wsdl/partnerAPI}HourlyRecurrencePatternTypeEnum" minOccurs="0"/>
 *         <element name="HourInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HourlyRecurrence", propOrder = {
    "hourlyRecurrencePatternType",
    "hourInterval"
})
public class HourlyRecurrence
    extends Recurrence
{

    @XmlElement(name = "HourlyRecurrencePatternType")
    @XmlSchemaType(name = "string")
    protected HourlyRecurrencePatternTypeEnum hourlyRecurrencePatternType;
    @XmlElement(name = "HourInterval")
    protected Integer hourInterval;

    /**
     * Gets the value of the hourlyRecurrencePatternType property.
     * 
     * @return
     *     possible object is
     *     {@link HourlyRecurrencePatternTypeEnum }
     *     
     */
    public HourlyRecurrencePatternTypeEnum getHourlyRecurrencePatternType() {
        return hourlyRecurrencePatternType;
    }

    /**
     * Sets the value of the hourlyRecurrencePatternType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HourlyRecurrencePatternTypeEnum }
     *     
     */
    public void setHourlyRecurrencePatternType(HourlyRecurrencePatternTypeEnum value) {
        this.hourlyRecurrencePatternType = value;
    }

    /**
     * Gets the value of the hourInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHourInterval() {
        return hourInterval;
    }

    /**
     * Sets the value of the hourInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHourInterval(Integer value) {
        this.hourInterval = value;
    }

}
