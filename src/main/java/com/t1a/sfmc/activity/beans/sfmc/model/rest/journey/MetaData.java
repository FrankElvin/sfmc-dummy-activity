
package com.t1a.sfmc.activity.beans.sfmc.model.rest.journey;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "invalid"
})
@Generated("jsonschema2pojo")
public class MetaData {

    @JsonProperty("invalid")
    private Boolean invalid;

    @JsonProperty("invalid")
    public Boolean getInvalid() {
        return invalid;
    }

    @JsonProperty("invalid")
    public void setInvalid(Boolean invalid) {
        this.invalid = invalid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MetaData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("invalid");
        sb.append('=');
        sb.append(((this.invalid == null)?"<null>":this.invalid));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
