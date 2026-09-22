package com.t1a.sfmc.activity.beans.sfmc.model.processor;


import com.t1a.sfmc.activity.beans.sfmc.model.soap.RetrieveResponseMsg;
import com.t1a.sfmc.activity.model.ProcessingResult;

import java.util.List;

public interface SfmcDeProcessor {

    List<String> getDeFields();

    ProcessingResult process(RetrieveResponseMsg msg);

}
