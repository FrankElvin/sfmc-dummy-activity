
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImportResultsSummary complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ImportResultsSummary">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       <sequence>
 *         <element name="ImportDefinitionCustomerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DestinationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="NumberSuccessful" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="NumberDuplicated" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="NumberRestricted" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="NumberErrors" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="TotalRows" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="ImportType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ImportStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TaskResultID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportResultsSummary", propOrder = {
    "importDefinitionCustomerKey",
    "startDate",
    "endDate",
    "destinationID",
    "numberSuccessful",
    "numberDuplicated",
    "numberRestricted",
    "numberErrors",
    "totalRows",
    "importType",
    "importStatus",
    "taskResultID"
})
public class ImportResultsSummary
    extends APIObject
{

    @XmlElement(name = "ImportDefinitionCustomerKey")
    protected String importDefinitionCustomerKey;
    @XmlElement(name = "StartDate")
    protected String startDate;
    @XmlElement(name = "EndDate")
    protected String endDate;
    @XmlElement(name = "DestinationID")
    protected String destinationID;
    @XmlElement(name = "NumberSuccessful")
    protected Integer numberSuccessful;
    @XmlElement(name = "NumberDuplicated")
    protected Integer numberDuplicated;
    @XmlElement(name = "NumberRestricted")
    protected Integer numberRestricted;
    @XmlElement(name = "NumberErrors")
    protected Integer numberErrors;
    @XmlElement(name = "TotalRows")
    protected Integer totalRows;
    @XmlElement(name = "ImportType")
    protected String importType;
    @XmlElement(name = "ImportStatus")
    protected String importStatus;
    @XmlElement(name = "TaskResultID")
    protected Integer taskResultID;

    /**
     * Gets the value of the importDefinitionCustomerKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportDefinitionCustomerKey() {
        return importDefinitionCustomerKey;
    }

    /**
     * Sets the value of the importDefinitionCustomerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportDefinitionCustomerKey(String value) {
        this.importDefinitionCustomerKey = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the destinationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationID() {
        return destinationID;
    }

    /**
     * Sets the value of the destinationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationID(String value) {
        this.destinationID = value;
    }

    /**
     * Gets the value of the numberSuccessful property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberSuccessful() {
        return numberSuccessful;
    }

    /**
     * Sets the value of the numberSuccessful property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberSuccessful(Integer value) {
        this.numberSuccessful = value;
    }

    /**
     * Gets the value of the numberDuplicated property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberDuplicated() {
        return numberDuplicated;
    }

    /**
     * Sets the value of the numberDuplicated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberDuplicated(Integer value) {
        this.numberDuplicated = value;
    }

    /**
     * Gets the value of the numberRestricted property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberRestricted() {
        return numberRestricted;
    }

    /**
     * Sets the value of the numberRestricted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberRestricted(Integer value) {
        this.numberRestricted = value;
    }

    /**
     * Gets the value of the numberErrors property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberErrors() {
        return numberErrors;
    }

    /**
     * Sets the value of the numberErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberErrors(Integer value) {
        this.numberErrors = value;
    }

    /**
     * Gets the value of the totalRows property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalRows() {
        return totalRows;
    }

    /**
     * Sets the value of the totalRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalRows(Integer value) {
        this.totalRows = value;
    }

    /**
     * Gets the value of the importType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportType() {
        return importType;
    }

    /**
     * Sets the value of the importType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportType(String value) {
        this.importType = value;
    }

    /**
     * Gets the value of the importStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportStatus() {
        return importStatus;
    }

    /**
     * Sets the value of the importStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportStatus(String value) {
        this.importStatus = value;
    }

    /**
     * Gets the value of the taskResultID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTaskResultID() {
        return taskResultID;
    }

    /**
     * Sets the value of the taskResultID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTaskResultID(Integer value) {
        this.taskResultID = value;
    }

}
