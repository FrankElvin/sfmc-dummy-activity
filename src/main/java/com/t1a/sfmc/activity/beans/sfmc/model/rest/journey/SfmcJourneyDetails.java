
package com.t1a.sfmc.activity.beans.sfmc.model.rest.journey;

import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "key",
    "name",
    "lastPublishedDate",
    "description",
    "version",
    "workflowApiVersion",
    "createdDate",
    "modifiedDate",
    "tags",
    "activities",
    "metaData",
    "status",
    "definitionId",
    "scheduledStatus"
})
@Generated("jsonschema2pojo")
public class SfmcJourneyDetails {

    @JsonProperty("id")
    private String id;
    @JsonProperty("key")
    private String key;
    @JsonProperty("name")
    private String name;
    @JsonProperty("lastPublishedDate")
    private String lastPublishedDate;
    @JsonProperty("description")
    private String description;
    @JsonProperty("version")
    private Integer version;
    @JsonProperty("workflowApiVersion")
    private Double workflowApiVersion;
    @JsonProperty("createdDate")
    private String createdDate;
    @JsonProperty("modifiedDate")
    private String modifiedDate;
    @JsonProperty("activities")
    private List<Activity> activities;
    @JsonProperty("tags")
    private List<Tag> tags;
    @JsonProperty("metaData")
    private MetaData__2 metaData;
    @JsonProperty("status")
    private String status;
    @JsonProperty("definitionId")
    private String definitionId;
    @JsonProperty("scheduledStatus")
    private String scheduledStatus;


    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("lastPublishedDate")
    public String getLastPublishedDate() {
        return lastPublishedDate;
    }

    @JsonProperty("lastPublishedDate")
    public void setLastPublishedDate(String lastPublishedDate) {
        this.lastPublishedDate = lastPublishedDate;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("version")
    public Integer getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(Integer version) {
        this.version = version;
    }

    @JsonProperty("workflowApiVersion")
    public Double getWorkflowApiVersion() {
        return workflowApiVersion;
    }

    @JsonProperty("workflowApiVersion")
    public void setWorkflowApiVersion(Double workflowApiVersion) {
        this.workflowApiVersion = workflowApiVersion;
    }

    @JsonProperty("createdDate")
    public String getCreatedDate() {
        return createdDate;
    }

    @JsonProperty("createdDate")
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    @JsonProperty("modifiedDate")
    public String getModifiedDate() {
        return modifiedDate;
    }

    @JsonProperty("modifiedDate")
    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @JsonProperty("activities")
    public List<Activity> getActivities() {
        return activities;
    }

    @JsonProperty("activities")
    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

    @JsonProperty("tags")
    public List<Tag> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @JsonProperty("metaData")
    public MetaData__2 getMetaData() {
        return metaData;
    }

    @JsonProperty("metaData")
    public void setMetaData(MetaData__2 metaData) {
        this.metaData = metaData;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("definitionId")
    public String getDefinitionId() {
        return definitionId;
    }

    @JsonProperty("definitionId")
    public void setDefinitionId(String definitionId) {
        this.definitionId = definitionId;
    }

    @JsonProperty("scheduledStatus")
    public String getScheduledStatus() {
        return scheduledStatus;
    }

    @JsonProperty("scheduledStatus")
    public void setScheduledStatus(String scheduledStatus) {
        this.scheduledStatus = scheduledStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SfmcJourneyDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("key");
        sb.append('=');
        sb.append(((this.key == null)?"<null>":this.key));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("lastPublishedDate");
        sb.append('=');
        sb.append(((this.lastPublishedDate == null)?"<null>":this.lastPublishedDate));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("workflowApiVersion");
        sb.append('=');
        sb.append(((this.workflowApiVersion == null)?"<null>":this.workflowApiVersion));
        sb.append(',');
        sb.append("createdDate");
        sb.append('=');
        sb.append(((this.createdDate == null)?"<null>":this.createdDate));
        sb.append(',');
        sb.append("modifiedDate");
        sb.append('=');
        sb.append(((this.modifiedDate == null)?"<null>":this.modifiedDate));
        sb.append(',');
        sb.append("activities");
        sb.append('=');
        sb.append(((this.activities == null)?"<null>":this.activities));
        sb.append(',');
        sb.append("metaData");
        sb.append('=');
        sb.append(((this.metaData == null)?"<null>":this.metaData));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("definitionId");
        sb.append('=');
        sb.append(((this.definitionId == null)?"<null>":this.definitionId));
        sb.append(',');
        sb.append("scheduledStatus");
        sb.append('=');
        sb.append(((this.scheduledStatus == null)?"<null>":this.scheduledStatus));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
