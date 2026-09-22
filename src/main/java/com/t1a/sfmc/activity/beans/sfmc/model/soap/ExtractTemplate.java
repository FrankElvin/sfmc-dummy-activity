
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.*;


/**
 * <p>Java class for ExtractTemplate complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExtractTemplate">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       <sequence>
 *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ConfigurationPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="PackageKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtractTemplate", propOrder = {
    "name",
    "configurationPage",
    "packageKey"
})
@XmlSeeAlso({
    ExtractDescription.class,
    ExtractDefinition.class
})
public class ExtractTemplate
    extends APIObject
{

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "ConfigurationPage")
    protected String configurationPage;
    @XmlElement(name = "PackageKey")
    protected String packageKey;

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
     * Gets the value of the configurationPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigurationPage() {
        return configurationPage;
    }

    /**
     * Sets the value of the configurationPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigurationPage(String value) {
        this.configurationPage = value;
    }

    /**
     * Gets the value of the packageKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageKey() {
        return packageKey;
    }

    /**
     * Sets the value of the packageKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageKey(String value) {
        this.packageKey = value;
    }

}
