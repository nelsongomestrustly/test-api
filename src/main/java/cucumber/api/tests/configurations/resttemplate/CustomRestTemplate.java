package cucumber.api.tests.configurations.resttemplate;

import cucumber.api.tests.configurations.resttemplate.interceptors.StatefulRestTemplateInterceptor;
import org.springframework.boot.web.client.RestTemplateCustomizer;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

public class CustomRestTemplate implements RestTemplateCustomizer {

    @Override
    public void customize(RestTemplate restTemplate) {
        restTemplate.setInterceptors(Collections.singletonList(
                new StatefulRestTemplateInterceptor()));
    }

}
