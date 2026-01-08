package com.t1a.sfmc.activity.beans;

import com.t1a.sfmc.activity.config.OauthConfig;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Slf4j
@AllArgsConstructor
public class Service {

    private OauthConfig oauthConfig;

    private void addSecurityOptions(Map<String, Object> config) {
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

    public Map<String, Object> buildExecuteArgument(String baseUrl) {
        Map<String, Object> result = new HashMap<>( Map.of(
            "inArguments", new Object[]{},
            "outArguments", new Object[]{},
            "url", baseUrl + "/execute",
            "verb", "POST",
            "body", "",
            "header", "",
            "format", "json",
            "useJwt", false, // Set to true if you implement JWT decoding
            "timeout", 10000
        ));
        addSecurityOptions(result);
        return result;
    }
}
