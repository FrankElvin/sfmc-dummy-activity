package com.t1a.sfmc.activity.beans;

import com.t1a.sfmc.activity.config.OauthConfig;
import com.t1a.sfmc.activity.model.SampleRequest;
import com.t1a.sfmc.activity.model.sfmc.JourneyArgument;
import com.t1a.sfmc.activity.model.sfmc.SfmcJourneyPayload;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

@Component
@Slf4j
@AllArgsConstructor
public class Service {

    private OauthConfig oauthConfig;
    private final String TEMPLATE_MESSAGE_FIELD = "messageTemplate";
    private final Pattern REST_HOST = Pattern.compile("^https://[\\w.-]+\\.marketingcloudapis\\.com/?$");

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
            "outArguments", List.of(
                    Map.of("status", "Text")
                ),
            "url", baseUrl,
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

    public String personalizeTemplateFromMessage(SfmcJourneyPayload payload) {

        Map<String, String> params = new HashMap<>();
        for (JourneyArgument argument: payload.getInArguments()) {
            params.putAll( argument.getAdditionalProperties());
        }
        String template = params.get(TEMPLATE_MESSAGE_FIELD);
        params.remove(TEMPLATE_MESSAGE_FIELD);

        log.info("Personalization. Template: {}", template);
        log.info("Parameters for personalization: {}", params);

        String processedMessage = template;
        for (Map.Entry<String, String> entry: params.entrySet()) {
            String placeholder = "[[" + entry.getKey() + "]]";
            if (processedMessage.contains(placeholder)) {
                processedMessage = processedMessage.replace(placeholder, entry.getValue());
            }
        }
        log.info("Personalization result: {}", processedMessage);
        return processedMessage;

    }

    public void checkFrontendPayload(SampleRequest request) {
        boolean ownTenant = request.getRestHost() != null && REST_HOST.matcher(request.getRestHost()).matches();
        if (!ownTenant) {
            throw new IllegalArgumentException("Wrong restHost");
        }
        boolean badToken = request.getToken() == null || request.getToken().isEmpty();
        if (badToken) {
            throw new IllegalArgumentException("Missing token");
        }
    }
}
