package com.t1a.sfmc.activity.beans.sfmc;

import com.t1a.sfmc.activity.beans.sfmc.model.soap.RetrieveRequestMsg;
import com.t1a.sfmc.activity.beans.sfmc.model.soap.RetrieveResponseMsg;
import com.t1a.sfmc.activity.beans.sfmc.model.soap.UpdateRequest;
import com.t1a.sfmc.activity.beans.sfmc.model.soap.UpdateResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.web.client.RestTemplate;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.xml.transform.StringSource;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;

@Slf4j
public class SfmcClient extends WebServiceGatewaySupport {

    private final SfmcConnectionConfig sfmcConnectionConfig;
    private final RestTemplate restTemplate;

    public SfmcClient(SfmcConnectionConfig connectionConfig) {
        sfmcConnectionConfig = connectionConfig;
        restTemplate = new RestTemplate();
    }

    @Retryable(maxAttempts = 3, backoff = @Backoff(delay = 100))
    public <T> T restGet(String method, Class<T> type, String token) {
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(token);
        String url = "https://" + sfmcConnectionConfig.getSubdomain() + ".rest.marketingcloudapis.com" + method;
        return restTemplate.exchange(url, HttpMethod.GET, new HttpEntity<>(headers), type).getBody();
    }

    @Retryable(maxAttempts = 3, backoff = @Backoff(delay=1000))
    public RetrieveResponseMsg retrieve(RetrieveRequestMsg request, String token) {
        return (RetrieveResponseMsg) getWebServiceTemplate()
                .marshalSendAndReceive(request, new WebServiceMessageCallback() {
                    @Override
                    public void doWithMessage(WebServiceMessage message) throws TransformerException {
                        SoapMessage soapMessage = (SoapMessage) message;
                        soapMessage.setSoapAction("Retrieve");
                        SoapHeader header = soapMessage.getSoapHeader();
                        StringSource headerSource = new StringSource(
                                "<fueloauth xmlns=\"http://exacttarget.com\">" + token + "</fueloauth>");
                        Transformer transformer = TransformerFactory.newInstance().newTransformer();
                        transformer.transform(headerSource, header.getResult());
                    }
                });
    }

    @Retryable(maxAttempts = 3, backoff = @Backoff(delay = 1000))
    public UpdateResponse update(UpdateRequest request, String token) {
        return (UpdateResponse) getWebServiceTemplate()
                .marshalSendAndReceive(request, new WebServiceMessageCallback() {
                    @Override
                    public void doWithMessage(WebServiceMessage message) throws TransformerException {
                        SoapMessage soapMessage = (SoapMessage) message;
                        soapMessage.setSoapAction("Update");
                        SoapHeader header = soapMessage.getSoapHeader();
                        StringSource headerSource = new StringSource(
                                "<fueloauth xmlns=\"http://exacttarget.com\">" + token + "</fueloauth>");
                        Transformer transformer = TransformerFactory.newInstance().newTransformer();
                        transformer.transform(headerSource, header.getResult());
                    }
                });
    }
}
