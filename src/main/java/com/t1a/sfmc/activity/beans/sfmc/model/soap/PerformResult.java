
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PerformResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PerformResult">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}Result">
 *       <sequence>
 *         <element name="Object" type="{http://exacttarget.com/wsdl/partnerAPI}APIObject"/>
 *         <element name="Task" type="{http://exacttarget.com/wsdl/partnerAPI}TaskResult"/>
 *         <element name="ProgramActivityInstanceId" type="{http://exacttarget.com/wsdl/partnerAPI}instanceid" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformResult", propOrder = {
    "object",
    "task",
    "programActivityInstanceId"
})
@XmlSeeAlso({
    ContentValidationResult.class
})
public class PerformResult
    extends Result
{

    @XmlElement(name = "Object", required = true)
    protected APIObject object;
    @XmlElement(name = "Task", required = true)
    protected TaskResult task;
    @XmlElement(name = "ProgramActivityInstanceId")
    protected String programActivityInstanceId;

    /**
     * Gets the value of the object property.
     * 
     * @return
     *     possible object is
     *     {@link APIObject }
     *     
     */
    public APIObject getObject() {
        return object;
    }

    /**
     * Sets the value of the object property.
     * 
     * @param value
     *     allowed object is
     *     {@link APIObject }
     *     
     */
    public void setObject(APIObject value) {
        this.object = value;
    }

    /**
     * Gets the value of the task property.
     * 
     * @return
     *     possible object is
     *     {@link TaskResult }
     *     
     */
    public TaskResult getTask() {
        return task;
    }

    /**
     * Sets the value of the task property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskResult }
     *     
     */
    public void setTask(TaskResult value) {
        this.task = value;
    }

    /**
     * Gets the value of the programActivityInstanceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramActivityInstanceId() {
        return programActivityInstanceId;
    }

    /**
     * Sets the value of the programActivityInstanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramActivityInstanceId(String value) {
        this.programActivityInstanceId = value;
    }

}
