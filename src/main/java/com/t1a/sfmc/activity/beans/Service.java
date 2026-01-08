package com.t1a.sfmc.activity.beans;

import com.t1a.sfmc.activity.config.OauthConfig;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Slf4j
@AllArgsConstructor
public class Service {

    private OauthConfig oauthConfig;

    public void addSecurityOptions(Map<String, Object> config) {
        if (!oauthConfig.isEnabled()) {
            return;
        }

        config.put(
                "securityOptions", Map.of(
                        "securityType", "securityContext",
                        "securityContextKey", oauthConfig.getContextKey()
                )
        );
    }
}
