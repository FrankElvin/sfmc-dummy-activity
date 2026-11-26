package com.t1a.sfmc.activity.beans;

import com.fasterxml.jackson.databind.JsonNode;
import com.t1a.sfmc.activity.beans.sfmc.model.activity.ActivityPublishRequestData;
import com.t1a.sfmc.activity.beans.sfmc.model.activity.ActivityValidateRequestData;
import com.t1a.sfmc.activity.beans.sfmc.model.rest.journey.Activity;
import com.t1a.sfmc.activity.beans.sfmc.model.rest.journey.SfmcJourneyDetails;
import com.t1a.sfmc.activity.beans.sfmc.service.SfmcService;
import com.t1a.sfmc.activity.config.UrlConfig;
import com.t1a.sfmc.activity.model.SampleRequest;
import com.t1a.sfmc.activity.model.exception.MyHardException;
import com.t1a.sfmc.activity.model.exception.MySoftException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
@Slf4j
@AllArgsConstructor
public class Controller {

    private Service service;
    private SfmcService sfmcService;
    private UrlConfig urlConfig;

    private void logHeaders(Map<String, String> headers) {
        log.info("Headers: {}", headers);
    }

    @GetMapping("/config.json")
    public Map<String, Object> getConfig() {
        log.info("/config.json method executed");
        String baseUrl = ServletUriComponentsBuilder.fromCurrentContextPath().build().toUriString();
        log.info("Calculated base url: {}", baseUrl);


        return new HashMap<>(Map.of(
                "workflowApiVersion", "1.1",
                "metaData", Map.of(
                        "icon", "images/ineco-icon-plain.svg",
                        "iconSmall", "images/ineco-icon-plain.svg",
                        "category", "Messages",
                        "backgroundColor", "#2596be"
                ),
                "type", "REST",
                "lang", "en-US",
                "userInterfaces", Map.of(
                        "configModal", Map.of(
                                "height", 500,
                                "width", 800,
                                "fullscreen", false,
                                "url", baseUrl + "/index.html"
                        )
                ),
                "arguments", Map.of(
                        "execute", service.buildExecuteArgument(urlConfig.getExecute())
                ),
                "configurationArguments", Map.of(
                        "save", Map.of("url", baseUrl + "/save", "verb", "POST"),
                        "publish", Map.of("url", baseUrl + "/publish", "verb", "POST"),
                        "validate", Map.of("url", baseUrl + "/validate", "verb", "POST"),
                        "stop", Map.of("url", baseUrl + "/stop", "verb", "POST")
                )
        ));
    }

    // --- Actual Endpoints ---

    @PostMapping("/execute")
    public Map<String, String> execute(@RequestBody String payload, @RequestHeader Map<String, String> headers) {
        log.info(">>> EXECUTE REQUEST RECEIVED");
        log.info("Payload: {}", payload);
//        logHeaders(headers);
//        throw new MyHardException("My hard exception");
        throw new MySoftException("My soft exception");

//        return Map.of("status", "ok");
    }

    @PostMapping("/execute-debug")
    public Map<String, String> executeDebug(@RequestBody String journeyPayload,
                                       @RequestHeader Map<String, String> headers) {
        log.info(">>> EXECUTE-DEBUG REQUEST RECEIVED");
        log.info("Body: {}", journeyPayload);
        logHeaders(headers);
        return Map.of("status", "ok");
    }

    @GetMapping("/version")
    public String getVersion(@RequestBody String payload, @RequestHeader Map<String, String> headers) {
        log.info(">>> /version REQUEST RECEIVED");

        return "with / services";
    }

    // --- Lifecycle Endpoints ---

    @PostMapping("/save")
    public Map<String, String> save(@RequestBody Map<String, Object> payload,
                                    @RequestHeader Map<String, String> headers) {
        log.info(">>> SAVE REQUEST: {}", payload);
        logHeaders(headers);
        return Map.of("status", "ok");
    }

    @PostMapping("/publish")
        public Map<String, String> publish(@RequestBody ActivityPublishRequestData payload) {
        log.info(">>> PUBLISH REQUEST: {}", payload);
        return Map.of("status", "ok");
    }

    @PostMapping("/validate")
    public Map<String, String> validate(@RequestBody ActivityValidateRequestData payload) {
        log.info(">>> VALIDATE REQUEST: {}", payload);
        SfmcJourneyDetails journeyDetails = sfmcService.loadJourneyDetails(payload.getOriginalDefinitionId(), payload.getInteractionVersion());
        if (journeyDetails == null) {
            log.warn("Got null journey details: considering it a disabled sfmcService. Returning success");
            return Map.of("status", "ok");
        }

        String activityId = payload.getActivityObjectID().toString();
        Activity activity = journeyDetails.getActivities().stream()
                .filter(a -> activityId.equalsIgnoreCase(a.getId()))
                .findFirst()
                .orElseThrow(() -> new MyHardException("Activity not found in journey definition"));

        if (activity.getName() == null || activity.getName().isBlank()) {
            throw new MyHardException("Activity name is required");
        }
        return Map.of("status", "ok");
    }

    @PostMapping("/backend/sample")
    public Map<String, String> sample(@RequestBody SampleRequest payload) {
        log.info(">>> SAMPLE REQUEST: {}", payload);
        service.checkFrontendPayload(payload);
        JsonNode eventDefKey = sfmcService.getEventDefinition(payload.getEventDefinitionKey(), payload.getToken());
        log.info("Got event def key: {}", eventDefKey);
        String eventType = eventDefKey.path("category").asText();
        if (!eventType.equals("Audience")) {
            throw new RuntimeException("Journey got invalid input object for this node");
        }
        String deId = eventDefKey.path("dataExtensionId").asText();
        String deName = eventDefKey.path("dataExtensionName").asText();
        log.info("Input DE name found: {}", deName);
        JsonNode dataSample = sfmcService.getDeSample(deId, 100, payload.getToken());
        log.info("Got input data sample: {}", dataSample);
        return Map.of("status", "ok");
    }

    @PostMapping("/stop")
    public Map<String, String> stop(@RequestBody Map<String, Object> payload,
                                    @RequestHeader Map<String, String> headers) {
        log.info(">>> STOP REQUEST: {}", payload);
        logHeaders(headers);
        return Map.of("status", "ok");
    }

}
