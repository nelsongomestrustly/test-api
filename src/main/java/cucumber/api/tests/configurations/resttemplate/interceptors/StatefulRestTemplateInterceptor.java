package cucumber.api.tests.configurations.resttemplate.interceptors;

import lombok.Setter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;

//If you need more than one cookie in application, create a MAP, and pas something in the headers
@Setter
public class StatefulRestTemplateInterceptor implements ClientHttpRequestInterceptor {

    private String cookie;

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {

        if (cookie != null) {
            request.getHeaders().add(HttpHeaders.COOKIE, cookie);
        }
        ClientHttpResponse response = execution.execute(request, body);

        if (cookie == null) {
            cookie = response.getHeaders().getFirst(HttpHeaders.SET_COOKIE);
        }
        return response;

    }

}
