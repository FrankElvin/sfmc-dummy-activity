
package com.t1a.sfmc.activity.beans.sfmc.model.rest.journey;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "save",
    "testSave",
    "publish",
    "testPublish",
    "unpublish",
    "stop",
    "testStop",
    "testUnpublish",
    "partnerActivityId",
    "validate",
    "testValidate",
    "executeSchema",
    "applicationExtensionKey"
})
@Generated("jsonschema2pojo")
public class ConfigurationArguments {

    @JsonProperty("save")
    private Save save;
    @JsonProperty("testSave")
    private String testSave;
    @JsonProperty("publish")
    private Publish publish;
    @JsonProperty("testPublish")
    private String testPublish;
    @JsonProperty("unpublish")
    private String unpublish;
    @JsonProperty("stop")
    private Stop stop;
    @JsonProperty("testStop")
    private String testStop;
    @JsonProperty("testUnpublish")
    private String testUnpublish;
    @JsonProperty("partnerActivityId")
    private String partnerActivityId;
    @JsonProperty("validate")
    private Validate validate;
    @JsonProperty("testValidate")
    private String testValidate;
    @JsonProperty("executeSchema")
    private String executeSchema;
    @JsonProperty("applicationExtensionKey")
    private String applicationExtensionKey;

    @JsonProperty("save")
    public Save getSave() {
        return save;
    }

    @JsonProperty("save")
    public void setSave(Save save) {
        this.save = save;
    }

    @JsonProperty("testSave")
    public String getTestSave() {
        return testSave;
    }

    @JsonProperty("testSave")
    public void setTestSave(String testSave) {
        this.testSave = testSave;
    }

    @JsonProperty("publish")
    public Publish getPublish() {
        return publish;
    }

    @JsonProperty("publish")
    public void setPublish(Publish publish) {
        this.publish = publish;
    }

    @JsonProperty("testPublish")
    public String getTestPublish() {
        return testPublish;
    }

    @JsonProperty("testPublish")
    public void setTestPublish(String testPublish) {
        this.testPublish = testPublish;
    }

    @JsonProperty("unpublish")
    public String getUnpublish() {
        return unpublish;
    }

    @JsonProperty("unpublish")
    public void setUnpublish(String unpublish) {
        this.unpublish = unpublish;
    }

    @JsonProperty("stop")
    public Stop getStop() {
        return stop;
    }

    @JsonProperty("stop")
    public void setStop(Stop stop) {
        this.stop = stop;
    }

    @JsonProperty("testStop")
    public String getTestStop() {
        return testStop;
    }

    @JsonProperty("testStop")
    public void setTestStop(String testStop) {
        this.testStop = testStop;
    }

    @JsonProperty("testUnpublish")
    public String getTestUnpublish() {
        return testUnpublish;
    }

    @JsonProperty("testUnpublish")
    public void setTestUnpublish(String testUnpublish) {
        this.testUnpublish = testUnpublish;
    }

    @JsonProperty("partnerActivityId")
    public String getPartnerActivityId() {
        return partnerActivityId;
    }

    @JsonProperty("partnerActivityId")
    public void setPartnerActivityId(String partnerActivityId) {
        this.partnerActivityId = partnerActivityId;
    }

    @JsonProperty("validate")
    public Validate getValidate() {
        return validate;
    }

    @JsonProperty("validate")
    public void setValidate(Validate validate) {
        this.validate = validate;
    }

    @JsonProperty("testValidate")
    public String getTestValidate() {
        return testValidate;
    }

    @JsonProperty("testValidate")
    public void setTestValidate(String testValidate) {
        this.testValidate = testValidate;
    }

    @JsonProperty("executeSchema")
    public String getExecuteSchema() {
        return executeSchema;
    }

    @JsonProperty("executeSchema")
    public void setExecuteSchema(String executeSchema) {
        this.executeSchema = executeSchema;
    }

    @JsonProperty("applicationExtensionKey")
    public String getApplicationExtensionKey() {
        return applicationExtensionKey;
    }

    @JsonProperty("applicationExtensionKey")
    public void setApplicationExtensionKey(String applicationExtensionKey) {
        this.applicationExtensionKey = applicationExtensionKey;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ConfigurationArguments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("save");
        sb.append('=');
        sb.append(((this.save == null)?"<null>":this.save));
        sb.append(',');
        sb.append("testSave");
        sb.append('=');
        sb.append(((this.testSave == null)?"<null>":this.testSave));
        sb.append(',');
        sb.append("publish");
        sb.append('=');
        sb.append(((this.publish == null)?"<null>":this.publish));
        sb.append(',');
        sb.append("testPublish");
        sb.append('=');
        sb.append(((this.testPublish == null)?"<null>":this.testPublish));
        sb.append(',');
        sb.append("unpublish");
        sb.append('=');
        sb.append(((this.unpublish == null)?"<null>":this.unpublish));
        sb.append(',');
        sb.append("stop");
        sb.append('=');
        sb.append(((this.stop == null)?"<null>":this.stop));
        sb.append(',');
        sb.append("testStop");
        sb.append('=');
        sb.append(((this.testStop == null)?"<null>":this.testStop));
        sb.append(',');
        sb.append("testUnpublish");
        sb.append('=');
        sb.append(((this.testUnpublish == null)?"<null>":this.testUnpublish));
        sb.append(',');
        sb.append("partnerActivityId");
        sb.append('=');
        sb.append(((this.partnerActivityId == null)?"<null>":this.partnerActivityId));
        sb.append(',');
        sb.append("validate");
        sb.append('=');
        sb.append(((this.validate == null)?"<null>":this.validate));
        sb.append(',');
        sb.append("testValidate");
        sb.append('=');
        sb.append(((this.testValidate == null)?"<null>":this.testValidate));
        sb.append(',');
        sb.append("executeSchema");
        sb.append('=');
        sb.append(((this.executeSchema == null)?"<null>":this.executeSchema));
        sb.append(',');
        sb.append("applicationExtensionKey");
        sb.append('=');
        sb.append(((this.applicationExtensionKey == null)?"<null>":this.applicationExtensionKey));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
