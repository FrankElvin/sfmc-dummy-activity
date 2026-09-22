
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.*;


/**
 * <p>Java class for DailyRecurrence complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DailyRecurrence">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}Recurrence">
 *       <sequence>
 *         <element name="DailyRecurrencePatternType" type="{http://exacttarget.com/wsdl/partnerAPI}DailyRecurrencePatternTypeEnum" minOccurs="0"/>
 *         <element name="DayInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DailyRecurrence", propOrder = {
    "dailyRecurrencePatternType",
    "dayInterval"
})
public class DailyRecurrence
    extends Recurrence
{

    @XmlElement(name = "DailyRecurrencePatternType")
    @XmlSchemaType(name = "string")
    protected DailyRecurrencePatternTypeEnum dailyRecurrencePatternType;
    @XmlElement(name = "DayInterval")
    protected Integer dayInterval;

    /**
     * Gets the value of the dailyRecurrencePatternType property.
     * 
     * @return
     *     possible object is
     *     {@link DailyRecurrencePatternTypeEnum }
     *     
     */
    public DailyRecurrencePatternTypeEnum getDailyRecurrencePatternType() {
        return dailyRecurrencePatternType;
    }

    /**
     * Sets the value of the dailyRecurrencePatternType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DailyRecurrencePatternTypeEnum }
     *     
     */
    public void setDailyRecurrencePatternType(DailyRecurrencePatternTypeEnum value) {
        this.dailyRecurrencePatternType = value;
    }

    /**
     * Gets the value of the dayInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDayInterval() {
        return dayInterval;
    }

    /**
     * Sets the value of the dayInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDayInterval(Integer value) {
        this.dayInterval = value;
    }

}
