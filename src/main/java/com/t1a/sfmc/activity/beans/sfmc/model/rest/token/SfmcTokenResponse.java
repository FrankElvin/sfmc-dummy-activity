package com.t1a.sfmc.activity.beans.sfmc.model.rest.token;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import javax.annotation.processing.Generated;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "access_token",
        "expires_in",
        "token_type",
        "rest_instance_url",
        "soap_instance_url",
        "scope"
})
@Generated("jsonschema2pojo")
public class SfmcTokenResponse {

    @JsonProperty("access_token")
    public String accessToken;
    @JsonProperty("expires_in")
    public Integer expiresIn;
    @JsonProperty("token_type")
    public String tokenType;
    @JsonProperty("rest_instance_url")
    public String restInstanceUrl;
    @JsonProperty("soap_instance_url")
    public String soapInstanceUrl;
    @JsonProperty("scope")
    public String scope;
}