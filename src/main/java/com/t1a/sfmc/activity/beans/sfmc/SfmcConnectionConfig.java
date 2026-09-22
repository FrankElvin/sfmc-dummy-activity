package com.t1a.sfmc.activity.beans.sfmc;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "sfmc.connection")
@Data
public class SfmcConnectionConfig {

    private String subdomain;
    private String clientId;
    private String clientSecret;

}
