package com.t1a.sfmc.activity.beans;

import com.t1a.sfmc.activity.config.UrlConfig;
import com.t1a.sfmc.activity.model.sfmc.SfmcJourneyPayload;
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
        logHeaders(headers);
        return Map.of("status", "ok");
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
    public Map<String, String> publish(@RequestBody Map<String, Object> payload,
                                       @RequestHeader Map<String, String> headers) {
        log.info(">>> PUBLISH REQUEST: {}", payload);
        logHeaders(headers);
        return Map.of("status", "ok");
    }

    @PostMapping("/validate")
    public Map<String, String> validate(@RequestBody Map<String, Object> payload,
                                        @RequestHeader Map<String, String> headers) {
        log.info(">>> VALIDATE REQUEST: {}", payload);
        logHeaders(headers);
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
