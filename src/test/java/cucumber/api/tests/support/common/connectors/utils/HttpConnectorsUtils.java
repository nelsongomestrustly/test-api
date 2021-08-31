package cucumber.api.tests.support.common.connectors.utils;

import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Map;

public class HttpConnectorsUtils {

    /**
     * HTTP ENTITY , AND HTTP HEADERS
     */

    public static String getEndpointWithQueryParam(String endpoint, Map<QueryParametersEnum, String> queryParam) {

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(endpoint);

        for (Map.Entry<QueryParametersEnum, String> entry : queryParam.entrySet()) {
            builder.queryParam(entry.getKey().getKeyName(), entry.getValue());
        }

        return builder.toUriString();

    }

    public static HttpEntity<String> getHttpEntityRequest() {

        return new HttpEntity<>(getRequestHeaders());

    }


    public static HttpHeaders getRequestHeaders() {

        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.setContentType(MediaType.APPLICATION_JSON);

        return requestHeaders;

    }

}
