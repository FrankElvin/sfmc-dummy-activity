package com.t1a.sfmc.activity.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "app.url")
@Data
public class UrlConfig {

    private String execute;

}
