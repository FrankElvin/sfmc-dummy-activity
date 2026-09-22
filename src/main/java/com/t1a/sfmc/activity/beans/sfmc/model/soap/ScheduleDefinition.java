
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ScheduleDefinition complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ScheduleDefinition">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       <sequence>
 *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Recurrence" type="{http://exacttarget.com/wsdl/partnerAPI}Recurrence"/>
 *         <element name="RecurrenceType" type="{http://exacttarget.com/wsdl/partnerAPI}RecurrenceTypeEnum" minOccurs="0"/>
 *         <element name="RecurrenceRangeType" type="{http://exacttarget.com/wsdl/partnerAPI}RecurrenceRangeTypeEnum" minOccurs="0"/>
 *         <element name="StartDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="EndDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="Occurrences" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="Keyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TimeZone" type="{http://exacttarget.com/wsdl/partnerAPI}TimeZone" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleDefinition", propOrder = {
    "name",
    "description",
    "recurrence",
    "recurrenceType",
    "recurrenceRangeType",
    "startDateTime",
    "endDateTime",
    "occurrences",
    "keyword",
    "timeZone"
})
public class ScheduleDefinition
    extends APIObject
{

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Recurrence", required = true)
    protected Recurrence recurrence;
    @XmlElement(name = "RecurrenceType")
    @XmlSchemaType(name = "string")
    protected RecurrenceTypeEnum recurrenceType;
    @XmlElement(name = "RecurrenceRangeType")
    @XmlSchemaType(name = "string")
    protected RecurrenceRangeTypeEnum recurrenceRangeType;
    @XmlElement(name = "StartDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDateTime;
    @XmlElement(name = "EndDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDateTime;
    @XmlElement(name = "Occurrences")
    protected Integer occurrences;
    @XmlElement(name = "Keyword")
    protected String keyword;
    @XmlElement(name = "TimeZone")
    protected TimeZone timeZone;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the recurrence property.
     * 
     * @return
     *     possible object is
     *     {@link Recurrence }
     *     
     */
    public Recurrence getRecurrence() {
        return recurrence;
    }

    /**
     * Sets the value of the recurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Recurrence }
     *     
     */
    public void setRecurrence(Recurrence value) {
        this.recurrence = value;
    }

    /**
     * Gets the value of the recurrenceType property.
     * 
     * @return
     *     possible object is
     *     {@link RecurrenceTypeEnum }
     *     
     */
    public RecurrenceTypeEnum getRecurrenceType() {
        return recurrenceType;
    }

    /**
     * Sets the value of the recurrenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurrenceTypeEnum }
     *     
     */
    public void setRecurrenceType(RecurrenceTypeEnum value) {
        this.recurrenceType = value;
    }

    /**
     * Gets the value of the recurrenceRangeType property.
     * 
     * @return
     *     possible object is
     *     {@link RecurrenceRangeTypeEnum }
     *     
     */
    public RecurrenceRangeTypeEnum getRecurrenceRangeType() {
        return recurrenceRangeType;
    }

    /**
     * Sets the value of the recurrenceRangeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurrenceRangeTypeEnum }
     *     
     */
    public void setRecurrenceRangeType(RecurrenceRangeTypeEnum value) {
        this.recurrenceRangeType = value;
    }

    /**
     * Gets the value of the startDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDateTime() {
        return startDateTime;
    }

    /**
     * Sets the value of the startDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDateTime(XMLGregorianCalendar value) {
        this.startDateTime = value;
    }

    /**
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDateTime(XMLGregorianCalendar value) {
        this.endDateTime = value;
    }

    /**
     * Gets the value of the occurrences property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOccurrences() {
        return occurrences;
    }

    /**
     * Sets the value of the occurrences property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOccurrences(Integer value) {
        this.occurrences = value;
    }

    /**
     * Gets the value of the keyword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * Sets the value of the keyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyword(String value) {
        this.keyword = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link TimeZone }
     *     
     */
    public TimeZone getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeZone }
     *     
     */
    public void setTimeZone(TimeZone value) {
        this.timeZone = value;
    }

}
