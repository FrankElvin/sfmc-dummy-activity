package com.t1a.sfmc.activity.model.exception;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"status", "errorDesc"})
public class ExceptionData {

    @JsonProperty("status")
    private String status;
    @JsonProperty("errorDesc")
    private String errorDesc;

}
