
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.*;


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
 *         <element name="IncludeVersionHistory" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "includeVersionHistory"
})
@XmlRootElement(name = "VersionInfoRequestMsg")
public class VersionInfoRequestMsg {

    @XmlElement(name = "IncludeVersionHistory")
    protected boolean includeVersionHistory;

    /**
     * Gets the value of the includeVersionHistory property.
     * 
     */
    public boolean isIncludeVersionHistory() {
        return includeVersionHistory;
    }

    /**
     * Sets the value of the includeVersionHistory property.
     * 
     */
    public void setIncludeVersionHistory(boolean value) {
        this.includeVersionHistory = value;
    }

}
