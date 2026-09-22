package com.t1a.sfmc.activity.beans.sfmc.model.processor;

import com.t1a.sfmc.activity.model.ProcessingResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SfmcDeAbstractProcessor {

    public ProcessingResult preProcess() {
        log.debug("No pre-processing actions defined");
        return new ProcessingResult(0, 0);
    }

}
