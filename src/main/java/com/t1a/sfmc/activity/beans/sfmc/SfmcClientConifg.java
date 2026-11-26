package com.t1a.sfmc.activity.beans.sfmc;

import com.t1a.sfmc.activity.beans.sfmc.soaptools.LoggingInterceptor;
import com.t1a.sfmc.activity.beans.sfmc.soaptools.SoapConfig;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;

@Component
@AllArgsConstructor
@Slf4j
public class SfmcClientConifg {

    SfmcConnectionConfig config;
    SoapConfig soapLogging;

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.t1a.sfmc.activity.beans.sfmc.model.soap");
        return marshaller;
    }

    @Bean
    public SfmcClient sfmcClient(Jaxb2Marshaller marshaller) {
        SfmcClient sfmcClient = new SfmcClient(config);
        log.info("Initializing sfmc soap client with url: {}", "https://" + config.getSubdomain() + ".soap.marketingcloudapis.com/Service.asmx");
        sfmcClient.setDefaultUri("https://" + config.getSubdomain() + ".soap.marketingcloudapis.com/Service.asmx");
        sfmcClient.setMarshaller(marshaller);
        sfmcClient.setUnmarshaller(marshaller);
        if (soapLogging.isLogging()) {
            log.warn("Soap logging enabled - use only for debug purpose!");
            ClientInterceptor[] interceptors = new ClientInterceptor[]{new LoggingInterceptor()};
            sfmcClient.setInterceptors(interceptors);
        }
        return sfmcClient;
    }

}
