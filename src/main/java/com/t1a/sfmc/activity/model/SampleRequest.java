package com.t1a.sfmc.activity.model;

import lombok.Data;

@Data
public class SampleRequest {
    private String eventDefinitionKey;
    private String token;
    private String restHost;
}
