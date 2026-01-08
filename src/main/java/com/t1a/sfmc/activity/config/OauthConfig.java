package com.t1a.sfmc.activity.config;

import jakarta.annotation.PostConstruct;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@ConfigurationProperties(prefix = "app.security.oauth")
@Data
public class OauthConfig {

    private boolean enabled;
    private String contextKey;

    @PostConstruct
    private void postConstruct() {
        log.info("Security oauth enabled by config: {}", enabled);
    }

}
