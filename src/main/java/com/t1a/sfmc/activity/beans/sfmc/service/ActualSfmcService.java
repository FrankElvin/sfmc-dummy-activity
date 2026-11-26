package com.t1a.sfmc.activity.beans.sfmc.service;

import com.t1a.sfmc.activity.beans.sfmc.SfmcClient;
import com.t1a.sfmc.activity.beans.sfmc.SfmcConnectionConfig;
import com.t1a.sfmc.activity.beans.sfmc.model.activity.ActivityPublishRequestData;
import com.t1a.sfmc.activity.beans.sfmc.model.rest.journey.SfmcJourneyDetails;
import com.t1a.sfmc.activity.beans.sfmc.model.rest.token.SfmcTokenRequest;
import com.t1a.sfmc.activity.beans.sfmc.model.rest.token.SfmcTokenResponse;
import com.t1a.sfmc.activity.beans.sfmc.model.soap.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@Component
@Slf4j
@EnableScheduling
@ConditionalOnProperty(
        value = "sfmc.enabled",
        havingValue = "true"
)
public class ActualSfmcService implements SfmcService {

    SfmcConnectionConfig config;
    SfmcClient client;
    private final AtomicReference<String> sfmcToken = new AtomicReference<>();

    private final RestTemplate restTemplate;

    ActualSfmcService(SfmcConnectionConfig connectionConfig, SfmcClient sfmcClient) {
        this.config = connectionConfig;
        this.client = sfmcClient;
        HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
        factory.setConnectionRequestTimeout(5_000);
        this.restTemplate = new RestTemplate(factory);

        log.info("Initial authenticating in SFMC");
        authorize();
        log.info("SFMC service successfully initialized");
    }

    @Scheduled(fixedRateString = "15", initialDelayString = "5", timeUnit = TimeUnit.MINUTES, scheduler = "sfmcBgScheduler")
    void updateToken() {
        log.debug("Refreshing SFMC token");
        authorize();
    }

    @Recover
    private void authorizeRecover(Exception e) {
        log.error("SFMC token refresh failed after all retries: token may be stale", e);
    }

    @Retryable(maxAttempts = 3, backoff = @Backoff(delay=5000), retryFor = Exception.class)
    private void authorize() {
        SfmcTokenRequest request = new SfmcTokenRequest();
        request.setClient_id(config.getClientId());
        request.setClient_secret(config.getClientSecret());
        request.setGrant_type("client_credentials");
        String loginUrl = "https://" + config.getSubdomain() + ".auth.marketingcloudapis.com/v2/token";
        SfmcTokenResponse response = restTemplate.postForObject(loginUrl, request, SfmcTokenResponse.class);

        log.debug("Successfully authenticated in SFMC {}", config.getSubdomain());
        this.sfmcToken.set(response.getAccessToken());
    }

    public SfmcJourneyDetails loadJourneyDetails(ActivityPublishRequestData publishRequestData) {
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(this.sfmcToken.get());
        HttpEntity<Void> entity = new HttpEntity<>(headers);

        String serviceUrl =
                "https://" + config.getSubdomain() + ".rest.marketingcloudapis.com/interaction/v1/interactions/" +
                        publishRequestData.getOriginalDefinitionId() + "?versionNumber=" +
                        publishRequestData.getInteractionVersion() +"&extras=all";
        return restTemplate.exchange(serviceUrl, HttpMethod.GET, entity, SfmcJourneyDetails.class).getBody();
    }

    public SfmcJourneyDetails loadJourneyDetails(UUID definitionId, Integer interactionVersion) {
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(this.sfmcToken.get());
        HttpEntity<Void> entity = new HttpEntity<>(headers);

        String serviceUrl =
                "https://" + config.getSubdomain() + ".rest.marketingcloudapis.com/interaction/v1/interactions/" +
                        definitionId + "?versionNumber=" +
                        interactionVersion +"&extras=all";
        return restTemplate.exchange(serviceUrl, HttpMethod.GET, entity, SfmcJourneyDetails.class).getBody();
    }

    public String getDECustomerKey(String deName) {
        log.info("Getting customer key for {} data extension", deName);
        RetrieveRequest retrieveRequest = new RetrieveRequest();
        retrieveRequest.setObjectType("DataExtension");

        List<String> properties = retrieveRequest.getProperties();
        properties.add("ObjectID");
        properties.add("CustomerKey");
        properties.add("Name");

        SimpleFilterPart filterPart = new SimpleFilterPart();
        filterPart.setProperty("Name");
        filterPart.setSimpleOperator(SimpleOperators.EQUALS);
        List<String> filterValue = filterPart.getValue();
        filterValue.add(deName);
        retrieveRequest.setFilter(filterPart);

        RetrieveRequestMsg requestMsg = new RetrieveRequestMsg();
        requestMsg.setRetrieveRequest(retrieveRequest);

        RetrieveResponseMsg responseMsg = client.retrieve(requestMsg, this.sfmcToken.get());
        APIObject result = responseMsg.getResults().getFirst();
        return result.getCustomerKey();
    }

    @Override
    public String getEventDefinition(String eventDefinitionKey, String token) {
        return client.restGet("/interaction/v1/eventDefinitions/key:" + eventDefinitionKey, String.class, token);
    }

    public UpdateResponse pushDataToDe(UpdateRequest request) {
        log.info("Pushing data to DE: {} records", request.getObjects().size());
        return client.update(request, this.sfmcToken.get());
    }

}
