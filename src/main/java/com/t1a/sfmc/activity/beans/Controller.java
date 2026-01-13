package com.t1a.sfmc.activity.beans;

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

    @GetMapping("/config.json")
    public Map<String, Object> getConfig() {
        log.info("/config.json method executed");
        String baseUrl = ServletUriComponentsBuilder.fromCurrentContextPath().build().toUriString();
        log.info("Calculated base url: {}", baseUrl);


        return new HashMap<>(Map.of(
                "workflowApiVersion", "1.1",
                "metaData", Map.of(
                        "icon", "images/icon.png",
                        "iconSmall", "images/icon-small.png",
                        "category", "Custom"
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
                        "execute", service.buildExecuteArgument(baseUrl)
                ),
                "configurationArguments", Map.of(
                        "save", Map.of("url", baseUrl + "/save", "verb", "POST"),
                        "publish", Map.of("url", baseUrl + "/publish", "verb", "POST"),
                        "validate", Map.of("url", baseUrl + "/validate", "verb", "POST"),
                        "stop", Map.of("url", baseUrl + "/stop", "verb", "POST")
                )
        ));
    }

    // --- Lifecycle Endpoints ---

    @PostMapping("/execute")
    public Map<String, String> execute(@RequestBody SfmcJourneyPayload payload, @RequestHeader Map<String, String> headers) {
        log.info(">>> EXECUTE REQUEST RECEIVED");
        log.info("Headers: {}", headers);
        log.info("Payload: {}", payload);

        String outMessage = service.personalizeTemplateFromMessage(payload);

        return Map.of("status", "ok");
    }

    @PostMapping("/save")
    public Map<String, String> save(@RequestBody Map<String, Object> payload) {
        log.info(">>> SAVE REQUEST: {}", payload);
        return Map.of("status", "ok");
    }

    @PostMapping("/publish")
    public Map<String, String> publish(@RequestBody Map<String, Object> payload) {
        log.info(">>> PUBLISH REQUEST: {}", payload);
        return Map.of("status", "ok");
    }

    @PostMapping("/validate")
    public Map<String, String> validate(@RequestBody Map<String, Object> payload) {
        log.info(">>> VALIDATE REQUEST: {}", payload);
        return Map.of("status", "ok");
    }

    @PostMapping("/stop")
    public Map<String, String> stop(@RequestBody Map<String, Object> payload) {
        log.info(">>> STOP REQUEST: {}", payload);
        return Map.of("status", "ok");
    }

}
