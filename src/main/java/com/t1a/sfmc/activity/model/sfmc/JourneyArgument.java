package com.t1a.sfmc.activity.model.sfmc;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.processing.Generated;
import java.util.LinkedHashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("jsonschema2pojo")
@ToString
public class JourneyArgument {

    @JsonIgnore
    private Map<String, String> additionalProperties = new LinkedHashMap<String, String>();

    @JsonAnyGetter
    public Map<String, String> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, String value) {
        this.additionalProperties.put(name, value);
    }

}