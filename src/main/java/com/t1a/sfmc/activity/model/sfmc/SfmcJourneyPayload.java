package com.t1a.sfmc.activity.model.sfmc;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "inArguments",
        "outArguments",
        "activityObjectID",
        "journeyId",
        "activityId",
        "definitionInstanceId",
        "activityInstanceId",
        "keyValue",
        "mode"
})
@Generated("jsonschema2pojo")
@Data
public class SfmcJourneyPayload {

    @JsonProperty("inArguments")
    public List<JourneyArgument> inArguments;
    @JsonProperty("outArguments")
    public List<JourneyArgument> outArguments;
    @JsonProperty("activityObjectID")
    public String activityObjectID;
    @JsonProperty("journeyId")
    public String journeyId;
    @JsonProperty("activityId")
    public String activityId;
    @JsonProperty("definitionInstanceId")
    public String definitionInstanceId;
    @JsonProperty("activityInstanceId")
    public String activityInstanceId;
    @JsonProperty("keyValue")
    public String keyValue;
    @JsonProperty("mode")
    public Integer mode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}