package com.t1a.sfmc.activity.beans.sfmc.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.t1a.sfmc.activity.beans.sfmc.model.rest.journey.SfmcJourneyDetails;

import java.util.UUID;

public interface SfmcService {

    SfmcJourneyDetails loadJourneyDetails(UUID definitionId, Integer interactionVersion);

    JsonNode getEventDefinition(String eventDefinitionKey, String token);

    JsonNode getDeSample(String deKey, int sampleSize, String token);

    String getDECustomerKey(String deName);

}
