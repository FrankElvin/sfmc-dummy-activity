
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataExtensionDeleteResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DataExtensionDeleteResult">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}DeleteResult">
 *       <sequence>
 *         <element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="KeyErrors" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="KeyError" type="{http://exacttarget.com/wsdl/partnerAPI}DataExtensionError" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "DataExtensionDeleteResult", propOrder = {
    "errorMessage",
    "keyErrors"
})
public class DataExtensionDeleteResult
    extends DeleteResult
{

    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    @XmlElement(name = "KeyErrors")
    protected KeyErrors keyErrors;

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the keyErrors property.
     * 
     * @return
     *     possible object is
     *     {@link KeyErrors }
     *     
     */
    public KeyErrors getKeyErrors() {
        return keyErrors;
    }

    /**
     * Sets the value of the keyErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyErrors }
     *     
     */
    public void setKeyErrors(KeyErrors value) {
        this.keyErrors = value;
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
     *         <element name="KeyError" type="{http://exacttarget.com/wsdl/partnerAPI}DataExtensionError" maxOccurs="unbounded" minOccurs="0"/>
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
        "keyError"
    })
    public static class KeyErrors {

        @XmlElement(name = "KeyError")
        protected List<DataExtensionError> keyError;

        /**
         * Gets the value of the keyError property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the keyError property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getKeyError().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DataExtensionError }
         * </p>
         * 
         * 
         * @return
         *     The value of the keyError property.
         */
        public List<DataExtensionError> getKeyError() {
            if (keyError == null) {
                keyError = new ArrayList<>();
            }
            return this.keyError;
        }

    }

}
