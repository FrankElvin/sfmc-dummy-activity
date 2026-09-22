
package com.t1a.sfmc.activity.beans.sfmc.model.rest.journey;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "executionMode",
    "definitionId",
    "activityId",
    "contactKey",
    "testExecute",
    "startActivityKey",
    "definitionInstanceId",
    "requestObjectId"
})
@Generated("jsonschema2pojo")
public class Arguments__1 {

    @JsonProperty("executionMode")
    private String executionMode;
    @JsonProperty("definitionId")
    private String definitionId;
    @JsonProperty("activityId")
    private String activityId;
    @JsonProperty("contactKey")
    private String contactKey;
    @JsonProperty("testExecute")
    private String testExecute;
    @JsonProperty("startActivityKey")
    private String startActivityKey;
    @JsonProperty("definitionInstanceId")
    private String definitionInstanceId;
    @JsonProperty("requestObjectId")
    private String requestObjectId;

    @JsonProperty("executionMode")
    public String getExecutionMode() {
        return executionMode;
    }

    @JsonProperty("executionMode")
    public void setExecutionMode(String executionMode) {
        this.executionMode = executionMode;
    }

    @JsonProperty("definitionId")
    public String getDefinitionId() {
        return definitionId;
    }

    @JsonProperty("definitionId")
    public void setDefinitionId(String definitionId) {
        this.definitionId = definitionId;
    }

    @JsonProperty("activityId")
    public String getActivityId() {
        return activityId;
    }

    @JsonProperty("activityId")
    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    @JsonProperty("contactKey")
    public String getContactKey() {
        return contactKey;
    }

    @JsonProperty("contactKey")
    public void setContactKey(String contactKey) {
        this.contactKey = contactKey;
    }

    @JsonProperty("testExecute")
    public String getTestExecute() {
        return testExecute;
    }

    @JsonProperty("testExecute")
    public void setTestExecute(String testExecute) {
        this.testExecute = testExecute;
    }

    @JsonProperty("startActivityKey")
    public String getStartActivityKey() {
        return startActivityKey;
    }

    @JsonProperty("startActivityKey")
    public void setStartActivityKey(String startActivityKey) {
        this.startActivityKey = startActivityKey;
    }

    @JsonProperty("definitionInstanceId")
    public String getDefinitionInstanceId() {
        return definitionInstanceId;
    }

    @JsonProperty("definitionInstanceId")
    public void setDefinitionInstanceId(String definitionInstanceId) {
        this.definitionInstanceId = definitionInstanceId;
    }

    @JsonProperty("requestObjectId")
    public String getRequestObjectId() {
        return requestObjectId;
    }

    @JsonProperty("requestObjectId")
    public void setRequestObjectId(String requestObjectId) {
        this.requestObjectId = requestObjectId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Arguments__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("executionMode");
        sb.append('=');
        sb.append(((this.executionMode == null)?"<null>":this.executionMode));
        sb.append(',');
        sb.append("definitionId");
        sb.append('=');
        sb.append(((this.definitionId == null)?"<null>":this.definitionId));
        sb.append(',');
        sb.append("activityId");
        sb.append('=');
        sb.append(((this.activityId == null)?"<null>":this.activityId));
        sb.append(',');
        sb.append("contactKey");
        sb.append('=');
        sb.append(((this.contactKey == null)?"<null>":this.contactKey));
        sb.append(',');
        sb.append("testExecute");
        sb.append('=');
        sb.append(((this.testExecute == null)?"<null>":this.testExecute));
        sb.append(',');
        sb.append("startActivityKey");
        sb.append('=');
        sb.append(((this.startActivityKey == null)?"<null>":this.startActivityKey));
        sb.append(',');
        sb.append("definitionInstanceId");
        sb.append('=');
        sb.append(((this.definitionInstanceId == null)?"<null>":this.definitionInstanceId));
        sb.append(',');
        sb.append("requestObjectId");
        sb.append('=');
        sb.append(((this.requestObjectId == null)?"<null>":this.requestObjectId));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
