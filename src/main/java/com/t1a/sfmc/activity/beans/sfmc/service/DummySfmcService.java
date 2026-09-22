package com.t1a.sfmc.activity.beans.sfmc.service;

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
        log.warn("SFMC service is disabled by configuration. Adding a dummy one to the context");
    }

    @Override
    public SfmcJourneyDetails loadJourneyDetails(UUID definitionId, Integer interactionVersion) {
        log.warn("Loading journey details but the SFMC service is disabled");
        return null;
    }
}
