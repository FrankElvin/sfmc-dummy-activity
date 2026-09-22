package com.t1a.sfmc.activity.beans.sfmc.soaptools;

import lombok.extern.slf4j.Slf4j;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.WebServiceClientException;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.context.MessageContext;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

@Slf4j
public class LoggingInterceptor implements ClientInterceptor {
    private void logMessage(WebServiceMessage message) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        try {
            message.writeTo(outputStream);
            String body = outputStream.toString();
            log.trace("Message body: {}", body);
        } catch (IOException e) {
            log.error("Failed to process soap message to log");
            e.printStackTrace();
        }
    }

    @Override
    public boolean handleRequest(MessageContext messageContext) throws WebServiceClientException {
        return true;
    }

    @Override
    public boolean handleResponse(MessageContext messageContext) throws WebServiceClientException {
        return true;
    }

    @Override
    public boolean handleFault(MessageContext messageContext) throws WebServiceClientException {
        return false;
    }

    @Override
    public void afterCompletion(MessageContext messageContext, Exception ex) throws WebServiceClientException {
        log.trace("SOAP completion: request");
        logMessage(messageContext.getRequest());

        log.trace("SOAP completion: response");
        logMessage(messageContext.getResponse());
    }

}
