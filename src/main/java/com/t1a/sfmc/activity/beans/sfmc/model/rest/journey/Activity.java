
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
    "description",
    "type",
    "outcomes",
    "arguments",
    "configurationArguments",
    "metaData"
})
@Generated("jsonschema2pojo")
public class Activity {

    @JsonProperty("id")
    private String id;
    @JsonProperty("key")
    private String key;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("type")
    private String type;
    @JsonProperty("outcomes")
    private List<Outcome> outcomes;
    @JsonProperty("arguments")
    private Arguments__1 arguments;
    @JsonProperty("configurationArguments")
    private ConfigurationArguments configurationArguments;
    @JsonProperty("metaData")
    private MetaData__1 metaData;

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

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("outcomes")
    public List<Outcome> getOutcomes() {
        return outcomes;
    }

    @JsonProperty("outcomes")
    public void setOutcomes(List<Outcome> outcomes) {
        this.outcomes = outcomes;
    }

    @JsonProperty("arguments")
    public Arguments__1 getArguments() {
        return arguments;
    }

    @JsonProperty("arguments")
    public void setArguments(Arguments__1 arguments) {
        this.arguments = arguments;
    }

    @JsonProperty("configurationArguments")
    public ConfigurationArguments getConfigurationArguments() {
        return configurationArguments;
    }

    @JsonProperty("configurationArguments")
    public void setConfigurationArguments(ConfigurationArguments configurationArguments) {
        this.configurationArguments = configurationArguments;
    }

    @JsonProperty("metaData")
    public MetaData__1 getMetaData() {
        return metaData;
    }

    @JsonProperty("metaData")
    public void setMetaData(MetaData__1 metaData) {
        this.metaData = metaData;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Activity.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("outcomes");
        sb.append('=');
        sb.append(((this.outcomes == null)?"<null>":this.outcomes));
        sb.append(',');
        sb.append("arguments");
        sb.append('=');
        sb.append(((this.arguments == null)?"<null>":this.arguments));
        sb.append(',');
        sb.append("configurationArguments");
        sb.append('=');
        sb.append(((this.configurationArguments == null)?"<null>":this.configurationArguments));
        sb.append(',');
        sb.append("metaData");
        sb.append('=');
        sb.append(((this.metaData == null)?"<null>":this.metaData));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
