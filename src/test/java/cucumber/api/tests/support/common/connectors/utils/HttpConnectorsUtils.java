package cucumber.api.tests.support.common.connectors.utils;

import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import cucumber.api.tests.common.predicates.GenericPredicates;
import cucumber.api.tests.support.cucumber.context.MyTestContext;
import cucumber.api.tests.test.merchantdemo.common.suppliers.html.MerchantBasicInfoQueryParamSupplier;
import cucumber.api.tests.test.merchantdemo.data.dto.MerchantBasicInfoDTO;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HttpConnectorsUtils {

    /**
     * HTTP ENTITY , AND HTTP HEADERS
     */

    public static String getEndpointWithQueryParam(String endpoint, Map<QueryParametersEnum, String> queryParam) {

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(endpoint);

        //Received Query Params
        if (GenericPredicates.checkIfNullOrEmpty.negate().test(queryParam)) {

            for (Map.Entry<QueryParametersEnum, String> entry : queryParam.entrySet()) {
                builder.queryParam(entry.getKey().getKeyName(), entry.getValue());
            }

        }

        //Merchant Basic Info Query Params from Context
        for (Map.Entry<QueryParametersEnum, String> entry : getMerchantBasicInfoHeader().entrySet()) {
            builder.queryParam(entry.getKey().getKeyName(), entry.getValue());
        }

        return builder.toUriString();

    }

    public static HttpEntity<String> getHttpEntityRequest() {

        return new HttpEntity<>(getRequestHeaders());

    }


    private static HttpHeaders getRequestHeaders() {

        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.setContentType(MediaType.APPLICATION_JSON);

        return requestHeaders;

    }

    private static HashMap<QueryParametersEnum, String> getMerchantBasicInfoHeader() {

        List<MerchantBasicInfoDTO> merchantBasicInfoDTOList = MyTestContext.getMyTestContext().merchantDemoManager.getMerchantBasicInfoDTOList();

        return MerchantBasicInfoQueryParamSupplier.getLoginMultiValueMapForHttpRequest(merchantBasicInfoDTOList.get(0));

    }

    /**
     * Adding Token to URL
     */

    public static String getEndpointWithTokenQueryParam(String token, String url) {

        token = "O2z4XFIEfj35QNJXMpra56gPuNJ9vRLKdsIK4CJSnD0iDsoLm392av6x6VbmJbiNUWYVbTXEajJit6b83oJhIzg4oF9zR4SoZIODRVwGlaEV5PVMzUD1ejACj0WkfH9KvEBUK%2B91u3F%2FOiKsFJ6%2BTV%2FDCguGkSEROjAQreH5QEeG3WxmHB7ehMWpHbKMgIhF%2Bib%2F8wosy7JNX0dD9mEL7ixNiK9vYJaN4OVj%2B5S3xf3PilVfrkuORmzUXMFHXJj%2FRG0ewxBkUfBinhKOMvTuxlCww2cpVkMsmqWgNiQw8%2BCa0iDiR4WgV0qhOhQi1bhYdjO4BM3JTA%2FmqhTs2PkRAt1QBdX1pqvWsraCGHWzj84WRfXKAv5nLJn4tIP2PN0QrExsHkwUcxPfEwkkKvPJ9d0dDKvmdL%2BzKsRGjpZsxfC2hz8V%2Blf3yZILegsx6ViA";

        StringBuilder sb = new StringBuilder();
        sb.append(url);
        sb.append("?");
        sb.append(QueryParametersEnum.TOKEN.getKeyName());
        sb.append("=");
        sb.append(token);

        return sb.toString();

    }
}
