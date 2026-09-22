
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for YearlyRecurrence complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="YearlyRecurrence">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}Recurrence">
 *       <sequence>
 *         <element name="YearlyRecurrencePatternType" type="{http://exacttarget.com/wsdl/partnerAPI}YearlyRecurrencePatternTypeEnum" minOccurs="0"/>
 *         <element name="ScheduledDay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="ScheduledWeek" type="{http://exacttarget.com/wsdl/partnerAPI}WeekOfMonthEnum" minOccurs="0"/>
 *         <element name="ScheduledMonth" type="{http://exacttarget.com/wsdl/partnerAPI}MonthOfYearEnum" minOccurs="0"/>
 *         <element name="ScheduledDayOfWeek" type="{http://exacttarget.com/wsdl/partnerAPI}DayOfWeekEnum" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "YearlyRecurrence", propOrder = {
    "yearlyRecurrencePatternType",
    "scheduledDay",
    "scheduledWeek",
    "scheduledMonth",
    "scheduledDayOfWeek"
})
public class YearlyRecurrence
    extends Recurrence
{

    @XmlElement(name = "YearlyRecurrencePatternType")
    @XmlSchemaType(name = "string")
    protected YearlyRecurrencePatternTypeEnum yearlyRecurrencePatternType;
    @XmlElement(name = "ScheduledDay")
    protected Integer scheduledDay;
    @XmlElement(name = "ScheduledWeek")
    @XmlSchemaType(name = "string")
    protected WeekOfMonthEnum scheduledWeek;
    @XmlElement(name = "ScheduledMonth")
    @XmlSchemaType(name = "string")
    protected MonthOfYearEnum scheduledMonth;
    @XmlElement(name = "ScheduledDayOfWeek")
    @XmlSchemaType(name = "string")
    protected DayOfWeekEnum scheduledDayOfWeek;

    /**
     * Gets the value of the yearlyRecurrencePatternType property.
     * 
     * @return
     *     possible object is
     *     {@link YearlyRecurrencePatternTypeEnum }
     *     
     */
    public YearlyRecurrencePatternTypeEnum getYearlyRecurrencePatternType() {
        return yearlyRecurrencePatternType;
    }

    /**
     * Sets the value of the yearlyRecurrencePatternType property.
     * 
     * @param value
     *     allowed object is
     *     {@link YearlyRecurrencePatternTypeEnum }
     *     
     */
    public void setYearlyRecurrencePatternType(YearlyRecurrencePatternTypeEnum value) {
        this.yearlyRecurrencePatternType = value;
    }

    /**
     * Gets the value of the scheduledDay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScheduledDay() {
        return scheduledDay;
    }

    /**
     * Sets the value of the scheduledDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScheduledDay(Integer value) {
        this.scheduledDay = value;
    }

    /**
     * Gets the value of the scheduledWeek property.
     * 
     * @return
     *     possible object is
     *     {@link WeekOfMonthEnum }
     *     
     */
    public WeekOfMonthEnum getScheduledWeek() {
        return scheduledWeek;
    }

    /**
     * Sets the value of the scheduledWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeekOfMonthEnum }
     *     
     */
    public void setScheduledWeek(WeekOfMonthEnum value) {
        this.scheduledWeek = value;
    }

    /**
     * Gets the value of the scheduledMonth property.
     * 
     * @return
     *     possible object is
     *     {@link MonthOfYearEnum }
     *     
     */
    public MonthOfYearEnum getScheduledMonth() {
        return scheduledMonth;
    }

    /**
     * Sets the value of the scheduledMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthOfYearEnum }
     *     
     */
    public void setScheduledMonth(MonthOfYearEnum value) {
        this.scheduledMonth = value;
    }

    /**
     * Gets the value of the scheduledDayOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeekEnum }
     *     
     */
    public DayOfWeekEnum getScheduledDayOfWeek() {
        return scheduledDayOfWeek;
    }

    /**
     * Sets the value of the scheduledDayOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeekEnum }
     *     
     */
    public void setScheduledDayOfWeek(DayOfWeekEnum value) {
        this.scheduledDayOfWeek = value;
    }

}
