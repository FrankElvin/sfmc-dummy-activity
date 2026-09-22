package com.t1a.sfmc.activity.beans.sfmc.service;

import com.t1a.sfmc.activity.beans.sfmc.model.rest.journey.SfmcJourneyDetails;

import java.util.UUID;

public interface SfmcService {

    SfmcJourneyDetails loadJourneyDetails(UUID definitionId, Integer interactionVersion);
}
