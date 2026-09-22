
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ContentValidationTaskResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ContentValidationTaskResult">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}TaskResult">
 *       <sequence>
 *         <element name="ValidationResults" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="ValidationResult" type="{http://exacttarget.com/wsdl/partnerAPI}ValidationResult" maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentValidationTaskResult", propOrder = {
    "validationResults"
})
public class ContentValidationTaskResult
    extends TaskResult
{

    @XmlElement(name = "ValidationResults")
    protected ValidationResults validationResults;

    /**
     * Gets the value of the validationResults property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationResults }
     *     
     */
    public ValidationResults getValidationResults() {
        return validationResults;
    }

    /**
     * Sets the value of the validationResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationResults }
     *     
     */
    public void setValidationResults(ValidationResults value) {
        this.validationResults = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="ValidationResult" type="{http://exacttarget.com/wsdl/partnerAPI}ValidationResult" maxOccurs="unbounded" minOccurs="0"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "validationResult"
    })
    public static class ValidationResults {

        @XmlElement(name = "ValidationResult")
        protected List<ValidationResult> validationResult;

        /**
         * Gets the value of the validationResult property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the validationResult property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getValidationResult().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ValidationResult }
         * </p>
         * 
         * 
         * @return
         *     The value of the validationResult property.
         */
        public List<ValidationResult> getValidationResult() {
            if (validationResult == null) {
                validationResult = new ArrayList<>();
            }
            return this.validationResult;
        }

    }

}
