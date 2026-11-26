package com.t1a.sfmc.activity.beans.sfmc.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.t1a.sfmc.activity.beans.sfmc.model.rest.journey.SfmcJourneyDetails;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Slf4j
@ConditionalOnProperty(
        value = "sfmc.enabled",
        havingValue = "false"
)
public class DummySfmcService implements SfmcService {

    @PostConstruct
    private void postConstruct() {
        logWarnUnimplemented();
    }

    private void logWarnUnimplemented() {
        log.warn("SFMC service is disabled by configuration");
    }

    @Override
    public SfmcJourneyDetails loadJourneyDetails(UUID definitionId, Integer interactionVersion) {
        logWarnUnimplemented();
        return null;
    }

    @Override
    public JsonNode getEventDefinition(String eventDefinitionKey, String token) {
        logWarnUnimplemented();
        return null;
    }

    @Override
    public JsonNode getDeSample(String deKey, int sampleSize, String token) {
        logWarnUnimplemented();
        return null;
    }

    @Override
    public String getDECustomerKey(String deName) {
        logWarnUnimplemented();
        return null;
    }

}
