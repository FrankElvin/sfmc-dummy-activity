
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScheduleResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ScheduleResult">
 *   <complexContent>
 *     <extension base="{http://exacttarget.com/wsdl/partnerAPI}Result">
 *       <sequence>
 *         <element name="Object" type="{http://exacttarget.com/wsdl/partnerAPI}ScheduleDefinition"/>
 *         <element name="Task" type="{http://exacttarget.com/wsdl/partnerAPI}TaskResult"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleResult", propOrder = {
    "object",
    "task"
})
public class ScheduleResult
    extends Result
{

    @XmlElement(name = "Object", required = true)
    protected ScheduleDefinition object;
    @XmlElement(name = "Task", required = true)
    protected TaskResult task;

    /**
     * Gets the value of the object property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleDefinition }
     *     
     */
    public ScheduleDefinition getObject() {
        return object;
    }

    /**
     * Sets the value of the object property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleDefinition }
     *     
     */
    public void setObject(ScheduleDefinition value) {
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

}
