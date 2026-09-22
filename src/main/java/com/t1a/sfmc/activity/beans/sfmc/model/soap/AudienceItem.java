
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.*;


/**
 * <p>Java class for AudienceItem complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AudienceItem">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       <sequence>
 *         <element name="List" type="{http://exacttarget.com/wsdl/partnerAPI}List" minOccurs="0"/>
 *         <element name="SendDefinitionListType" type="{http://exacttarget.com/wsdl/partnerAPI}SendDefinitionListTypeEnum" minOccurs="0"/>
 *         <element name="CustomObjectID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DataSourceTypeID" type="{http://exacttarget.com/wsdl/partnerAPI}DataSourceTypeEnum" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudienceItem", propOrder = {
    "list",
    "sendDefinitionListType",
    "customObjectID",
    "dataSourceTypeID"
})
@XmlSeeAlso({
    TriggeredSendExclusionList.class,
    SendDefinitionList.class
})
public class AudienceItem
    extends APIObject
{

    @XmlElement(name = "List")
    protected List list;
    @XmlElement(name = "SendDefinitionListType")
    @XmlSchemaType(name = "string")
    protected SendDefinitionListTypeEnum sendDefinitionListType;
    @XmlElement(name = "CustomObjectID")
    protected String customObjectID;
    @XmlElement(name = "DataSourceTypeID")
    @XmlSchemaType(name = "string")
    protected DataSourceTypeEnum dataSourceTypeID;

    /**
     * Gets the value of the list property.
     * 
     * @return
     *     possible object is
     *     {@link List }
     *     
     */
    public List getList() {
        return list;
    }

    /**
     * Sets the value of the list property.
     * 
     * @param value
     *     allowed object is
     *     {@link List }
     *     
     */
    public void setList(List value) {
        this.list = value;
    }

    /**
     * Gets the value of the sendDefinitionListType property.
     * 
     * @return
     *     possible object is
     *     {@link SendDefinitionListTypeEnum }
     *     
     */
    public SendDefinitionListTypeEnum getSendDefinitionListType() {
        return sendDefinitionListType;
    }

    /**
     * Sets the value of the sendDefinitionListType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendDefinitionListTypeEnum }
     *     
     */
    public void setSendDefinitionListType(SendDefinitionListTypeEnum value) {
        this.sendDefinitionListType = value;
    }

    /**
     * Gets the value of the customObjectID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomObjectID() {
        return customObjectID;
    }

    /**
     * Sets the value of the customObjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomObjectID(String value) {
        this.customObjectID = value;
    }

    /**
     * Gets the value of the dataSourceTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link DataSourceTypeEnum }
     *     
     */
    public DataSourceTypeEnum getDataSourceTypeID() {
        return dataSourceTypeID;
    }

    /**
     * Sets the value of the dataSourceTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSourceTypeEnum }
     *     
     */
    public void setDataSourceTypeID(DataSourceTypeEnum value) {
        this.dataSourceTypeID = value;
    }

}
