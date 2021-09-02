package cucumber.api.tests.configurations.resttemplate.interceptors;

import cucumber.api.tests.common.predicates.GenericPredicates;
import cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

//If you need more than one cookie in application, create a MAP, and pas something in the headers
@Setter
@Getter
public class StatefulRestTemplateInterceptor implements ClientHttpRequestInterceptor {

    private Map<StatefulRestTemplateInterceptorKeyEnums, String> cookieMap;

    public static StatefulRestTemplateInterceptorKeyEnums cookieMapKey;

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {

        if (GenericPredicates.checkIfNullOrEmpty.negate().test(cookieMap)) {

            String cookieFromMap = getCookieFromMap();

            if (GenericPredicates.checkIfNullOrEmpty.negate().test(cookieFromMap)) {
                request.getHeaders().add(HttpHeaders.COOKIE, getCookieFromMap());
            }

        }

        ClientHttpResponse response = execution.execute(request, body);

        addCookieToMap(response);

        return response;

    }

    private String getCookieFromMap() {

        return cookieMap.get(cookieMapKey);

    }

    private void addCookieToMap(ClientHttpResponse response) {

        if (GenericPredicates.checkIfNullOrEmpty.test(cookieMap)) {
            cookieMap = new HashMap<>();
        }

        cookieMap.put(cookieMapKey, response.getHeaders().getFirst(HttpHeaders.SET_COOKIE));

    }

}
