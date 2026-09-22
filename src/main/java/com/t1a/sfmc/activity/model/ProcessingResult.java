package com.t1a.sfmc.activity.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProcessingResult {
    private long processedRecords;
    private long badRecords;

    public void addResult(ProcessingResult result) {
        processedRecords += result.getProcessedRecords();
        badRecords += result.getBadRecords();
    }

}
