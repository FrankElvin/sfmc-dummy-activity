package com.t1a.sfmc.activity.beans.sfmc.soaptools;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "sfmc.soap")
@Data
public class SoapConfig {

    private boolean logging = false;

}
