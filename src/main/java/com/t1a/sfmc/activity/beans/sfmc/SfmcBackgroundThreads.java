package com.t1a.sfmc.activity.beans.sfmc;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.concurrent.CustomizableThreadFactory;
import org.springframework.stereotype.Component;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

@Component
@AllArgsConstructor
@Slf4j
public class SfmcBackgroundThreads {

    @Bean(name = "sfmcBgScheduler")
    public ScheduledExecutorService sfmcBgScheduler() {
        CustomizableThreadFactory bgThreadFactory = new CustomizableThreadFactory();
        bgThreadFactory.setThreadNamePrefix("sfmc-background-");
        log.info("Initialized the 'sfmcBgScheduler' scheduling executor");
        return new ScheduledThreadPoolExecutor(1, bgThreadFactory);
    }
}
