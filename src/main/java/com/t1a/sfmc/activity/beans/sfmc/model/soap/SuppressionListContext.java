
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.*;


/**
 * <p>Java class for SuppressionListContext complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SuppressionListContext">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       <sequence>
 *         <element name="Context" type="{http://exacttarget.com/wsdl/partnerAPI}SuppressionListContextEnum" minOccurs="0"/>
 *         <element name="SendClassificationType" type="{http://exacttarget.com/wsdl/partnerAPI}SendClassificationTypeEnum" minOccurs="0"/>
 *         <element name="SendClassification" type="{http://exacttarget.com/wsdl/partnerAPI}SendClassification" minOccurs="0"/>
 *         <element name="Send" type="{http://exacttarget.com/wsdl/partnerAPI}Send" minOccurs="0"/>
 *         <element name="Definition" type="{http://exacttarget.com/wsdl/partnerAPI}SuppressionListDefinition" minOccurs="0"/>
 *         <element name="AppliesToAllSends" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="SenderProfile" type="{http://exacttarget.com/wsdl/partnerAPI}SenderProfile" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuppressionListContext", propOrder = {
    "context",
    "sendClassificationType",
    "sendClassification",
    "send",
    "definition",
    "appliesToAllSends",
    "senderProfile"
})
public class SuppressionListContext
    extends APIObject
{

    @XmlElement(name = "Context")
    @XmlSchemaType(name = "string")
    protected SuppressionListContextEnum context;
    @XmlElement(name = "SendClassificationType")
    @XmlSchemaType(name = "string")
    protected SendClassificationTypeEnum sendClassificationType;
    @XmlElement(name = "SendClassification")
    protected SendClassification sendClassification;
    @XmlElement(name = "Send")
    protected Send send;
    @XmlElement(name = "Definition")
    protected SuppressionListDefinition definition;
    @XmlElement(name = "AppliesToAllSends")
    protected Boolean appliesToAllSends;
    @XmlElement(name = "SenderProfile")
    protected SenderProfile senderProfile;

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link SuppressionListContextEnum }
     *     
     */
    public SuppressionListContextEnum getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuppressionListContextEnum }
     *     
     */
    public void setContext(SuppressionListContextEnum value) {
        this.context = value;
    }

    /**
     * Gets the value of the sendClassificationType property.
     * 
     * @return
     *     possible object is
     *     {@link SendClassificationTypeEnum }
     *     
     */
    public SendClassificationTypeEnum getSendClassificationType() {
        return sendClassificationType;
    }

    /**
     * Sets the value of the sendClassificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendClassificationTypeEnum }
     *     
     */
    public void setSendClassificationType(SendClassificationTypeEnum value) {
        this.sendClassificationType = value;
    }

    /**
     * Gets the value of the sendClassification property.
     * 
     * @return
     *     possible object is
     *     {@link SendClassification }
     *     
     */
    public SendClassification getSendClassification() {
        return sendClassification;
    }

    /**
     * Sets the value of the sendClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendClassification }
     *     
     */
    public void setSendClassification(SendClassification value) {
        this.sendClassification = value;
    }

    /**
     * Gets the value of the send property.
     * 
     * @return
     *     possible object is
     *     {@link Send }
     *     
     */
    public Send getSend() {
        return send;
    }

    /**
     * Sets the value of the send property.
     * 
     * @param value
     *     allowed object is
     *     {@link Send }
     *     
     */
    public void setSend(Send value) {
        this.send = value;
    }

    /**
     * Gets the value of the definition property.
     * 
     * @return
     *     possible object is
     *     {@link SuppressionListDefinition }
     *     
     */
    public SuppressionListDefinition getDefinition() {
        return definition;
    }

    /**
     * Sets the value of the definition property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuppressionListDefinition }
     *     
     */
    public void setDefinition(SuppressionListDefinition value) {
        this.definition = value;
    }

    /**
     * Gets the value of the appliesToAllSends property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAppliesToAllSends() {
        return appliesToAllSends;
    }

    /**
     * Sets the value of the appliesToAllSends property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAppliesToAllSends(Boolean value) {
        this.appliesToAllSends = value;
    }

    /**
     * Gets the value of the senderProfile property.
     * 
     * @return
     *     possible object is
     *     {@link SenderProfile }
     *     
     */
    public SenderProfile getSenderProfile() {
        return senderProfile;
    }

    /**
     * Sets the value of the senderProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link SenderProfile }
     *     
     */
    public void setSenderProfile(SenderProfile value) {
        this.senderProfile = value;
    }

}
