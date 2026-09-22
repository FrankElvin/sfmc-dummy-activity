package com.t1a.sfmc.activity.beans.sfmc.model.activity;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;
import java.util.UUID;

/**
 * ActivityValidateRequestData
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-06-24T16:41:54.920953127+02:00[Europe/Belgrade]")
public class ActivityValidateRequestData {

    private UUID activityObjectID;

    private UUID interactionId;

    private UUID originalDefinitionId;

    private UUID interactionKey;

    private Integer interactionVersion;

    public ActivityValidateRequestData() {
        super();
    }

    public ActivityValidateRequestData activityObjectID(UUID activityObjectID) {
        this.activityObjectID = activityObjectID;
        return this;
    }

    /**
     * Get activityObjectID
     * @return activityObjectID
     */
    @NotNull
    @Valid
    @Schema(name = "activityObjectID", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("activityObjectID")
    public UUID getActivityObjectID() {
        return activityObjectID;
    }

    public void setActivityObjectID(UUID activityObjectID) {
        this.activityObjectID = activityObjectID;
    }

    public ActivityValidateRequestData interactionId(UUID interactionId) {
        this.interactionId = interactionId;
        return this;
    }

    /**
     * Get interactionId
     * @return interactionId
     */
    @NotNull @Valid
    @Schema(name = "interactionId", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("interactionId")
    public UUID getInteractionId() {
        return interactionId;
    }

    public void setInteractionId(UUID interactionId) {
        this.interactionId = interactionId;
    }

    public ActivityValidateRequestData originalDefinitionId(UUID originalDefinitionId) {
        this.originalDefinitionId = originalDefinitionId;
        return this;
    }

    /**
     * Get originalDefinitionId
     * @return originalDefinitionId
     */
    @NotNull @Valid
    @Schema(name = "originalDefinitionId", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("originalDefinitionId")
    public UUID getOriginalDefinitionId() {
        return originalDefinitionId;
    }

    public void setOriginalDefinitionId(UUID originalDefinitionId) {
        this.originalDefinitionId = originalDefinitionId;
    }

    public ActivityValidateRequestData interactionKey(UUID interactionKey) {
        this.interactionKey = interactionKey;
        return this;
    }

    /**
     * Get interactionKey
     * @return interactionKey
     */
    @NotNull @Valid
    @Schema(name = "interactionKey", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("interactionKey")
    public UUID getInteractionKey() {
        return interactionKey;
    }

    public void setInteractionKey(UUID interactionKey) {
        this.interactionKey = interactionKey;
    }

    public ActivityValidateRequestData interactionVersion(Integer interactionVersion) {
        this.interactionVersion = interactionVersion;
        return this;
    }

    /**
     * Get interactionVersion
     * @return interactionVersion
     */
    @NotNull
    @Schema(name = "interactionVersion", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("interactionVersion")
    public Integer getInteractionVersion() {
        return interactionVersion;
    }

    public void setInteractionVersion(Integer interactionVersion) {
        this.interactionVersion = interactionVersion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActivityValidateRequestData activityValidateRequestData = (ActivityValidateRequestData) o;
        return Objects.equals(this.activityObjectID, activityValidateRequestData.activityObjectID) &&
                Objects.equals(this.interactionId, activityValidateRequestData.interactionId) &&
                Objects.equals(this.originalDefinitionId, activityValidateRequestData.originalDefinitionId) &&
                Objects.equals(this.interactionKey, activityValidateRequestData.interactionKey) &&
                Objects.equals(this.interactionVersion, activityValidateRequestData.interactionVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(activityObjectID, interactionId, originalDefinitionId, interactionKey, interactionVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActivityValidateRequestData {\n");
        sb.append("    activityObjectID: ").append(toIndentedString(activityObjectID)).append("\n");
        sb.append("    interactionId: ").append(toIndentedString(interactionId)).append("\n");
        sb.append("    originalDefinitionId: ").append(toIndentedString(originalDefinitionId)).append("\n");
        sb.append("    interactionKey: ").append(toIndentedString(interactionKey)).append("\n");
        sb.append("    interactionVersion: ").append(toIndentedString(interactionVersion)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
