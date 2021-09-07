package cucumber.api.tests.support.common.connectors.utils;

import cucumber.api.tests.common.enums.headers.HttpHeadersEnum;
import cucumber.api.tests.common.predicates.GenericPredicates;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import java.util.List;

public class BackupRestUtils {

    public static HttpEntity<String> getHttpEntityRequest(List<HttpHeadersEnum> headersEnumList) {

        return new HttpEntity<>(getRequestHeaders(headersEnumList));

    }


    private static HttpHeaders getRequestHeaders(List<HttpHeadersEnum> headersEnumList) {

        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.setContentType(MediaType.APPLICATION_JSON);
        requestHeaders.add("Transfer-Encoding", "chunked");

        return addAdditionalHeaders(requestHeaders, headersEnumList);

    }

    private static HttpHeaders addAdditionalHeaders(HttpHeaders requestHeaders, List<HttpHeadersEnum> headersEnumList) {

        if (GenericPredicates.checkIfNullOrEmpty.negate().test(headersEnumList)) {
            headersEnumList.forEach(headersEnum -> requestHeaders.add(headersEnum.getKey(), headersEnum.getValue()));
        }

        return requestHeaders;

    }

}
