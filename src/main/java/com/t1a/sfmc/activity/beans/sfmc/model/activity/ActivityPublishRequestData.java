package com.t1a.sfmc.activity.beans.sfmc.model.activity;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;
import java.util.UUID;

/**
 * ActivityPublishRequestData
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-06-24T16:41:54.920953127+02:00[Europe/Belgrade]")
public class ActivityPublishRequestData {

  private UUID activityObjectID;

  private UUID interactionId;

  private UUID originalDefinitionId;

  private UUID interactionKey;

  private Integer interactionVersion;

  private Boolean isPublished;

  public ActivityPublishRequestData() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ActivityPublishRequestData(UUID activityObjectID, UUID interactionId, UUID originalDefinitionId, UUID interactionKey, Integer interactionVersion, Boolean isPublished) {
    this.activityObjectID = activityObjectID;
    this.interactionId = interactionId;
    this.originalDefinitionId = originalDefinitionId;
    this.interactionKey = interactionKey;
    this.interactionVersion = interactionVersion;
    this.isPublished = isPublished;
  }

  public ActivityPublishRequestData activityObjectID(UUID activityObjectID) {
    this.activityObjectID = activityObjectID;
    return this;
  }

  /**
   * Get activityObjectID
   * @return activityObjectID
  */
  @NotNull @Valid 
  @Schema(name = "activityObjectID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("activityObjectID")
  public UUID getActivityObjectID() {
    return activityObjectID;
  }

  public void setActivityObjectID(UUID activityObjectID) {
    this.activityObjectID = activityObjectID;
  }

  public ActivityPublishRequestData interactionId(UUID interactionId) {
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

  public ActivityPublishRequestData originalDefinitionId(UUID originalDefinitionId) {
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

  public ActivityPublishRequestData interactionKey(UUID interactionKey) {
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

  public ActivityPublishRequestData interactionVersion(Integer interactionVersion) {
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

  public ActivityPublishRequestData isPublished(Boolean isPublished) {
    this.isPublished = isPublished;
    return this;
  }

  /**
   * Get isPublished
   * @return isPublished
  */
  @NotNull 
  @Schema(name = "isPublished", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("isPublished")
  public Boolean getIsPublished() {
    return isPublished;
  }

  public void setIsPublished(Boolean isPublished) {
    this.isPublished = isPublished;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityPublishRequestData activityPublishRequestData = (ActivityPublishRequestData) o;
    return Objects.equals(this.activityObjectID, activityPublishRequestData.activityObjectID) &&
        Objects.equals(this.interactionId, activityPublishRequestData.interactionId) &&
        Objects.equals(this.originalDefinitionId, activityPublishRequestData.originalDefinitionId) &&
        Objects.equals(this.interactionKey, activityPublishRequestData.interactionKey) &&
        Objects.equals(this.interactionVersion, activityPublishRequestData.interactionVersion) &&
        Objects.equals(this.isPublished, activityPublishRequestData.isPublished);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityObjectID, interactionId, originalDefinitionId, interactionKey, interactionVersion, isPublished);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityPublishRequestData {\n");
    sb.append("    activityObjectID: ").append(toIndentedString(activityObjectID)).append("\n");
    sb.append("    interactionId: ").append(toIndentedString(interactionId)).append("\n");
    sb.append("    originalDefinitionId: ").append(toIndentedString(originalDefinitionId)).append("\n");
    sb.append("    interactionKey: ").append(toIndentedString(interactionKey)).append("\n");
    sb.append("    interactionVersion: ").append(toIndentedString(interactionVersion)).append("\n");
    sb.append("    isPublished: ").append(toIndentedString(isPublished)).append("\n");
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

