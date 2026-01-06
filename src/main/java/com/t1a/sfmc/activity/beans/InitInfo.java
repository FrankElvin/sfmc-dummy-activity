package com.t1a.sfmc.activity.beans;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class InitInfo {

    @PostConstruct
    private void postConstruct() {
        log.info("Application initialized");
    }
}
