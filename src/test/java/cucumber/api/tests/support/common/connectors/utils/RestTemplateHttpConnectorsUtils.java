package cucumber.api.tests.support.common.connectors.utils;

import cucumber.api.tests.common.enums.headers.HttpHeadersEnum;
import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import cucumber.api.tests.common.predicates.GenericPredicates;
import cucumber.api.tests.common.suppliers.StringSuppliers;
import cucumber.api.tests.data.context.MyTestContext;
import cucumber.api.tests.data.dto.merchantdemo.MerchantBasicInfoDTO;
import cucumber.api.tests.test.merchantdemo.common.suppliers.html.MerchantBasicInfoQueryParamSupplier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static cucumber.api.tests.common.suppliers.QueryParamSuppliers.getSearchFormatByField;

public class RestTemplateHttpConnectorsUtils {

    /**
     * HTTP QUERY AND HEADERS PARAMETERS
     */

    public static HttpEntity<MultiValueMap<String, String>> getEndpointWithQueryParamAndHeaders(
            List<HttpHeadersEnum> headersEnumList,
            Map<QueryParametersEnum, String> queryParam) {

        HttpHeaders headers = getHttpHeaders(headersEnumList);

        MultiValueMap<String, String> map = getStringStringMultiValueMap(queryParam);

        return new HttpEntity<MultiValueMap<String, String>>(map, headers);


    }

    /**
     * QUERY
     */

    private static MultiValueMap<String, String> getStringStringMultiValueMap(Map<QueryParametersEnum, String> queryParam) {
        MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();

        //Received Query Params
        if (GenericPredicates.checkIfNullOrEmpty.negate().test(queryParam)) {
            for (Map.Entry<QueryParametersEnum, String> entry : queryParam.entrySet()) {
                map.add(entry.getKey().getKeyName(), entry.getValue());
            }
        }

        //Merchant Basic Info Query Params from Context
        for (Map.Entry<QueryParametersEnum, String> entry : getMerchantBasicInfoHeader().entrySet()) {
            map.add(entry.getKey().getKeyName(), entry.getValue());
        }
        return map;
    }


    /**
     * HEADERS
     */

    private static HttpHeaders getHttpHeaders(List<HttpHeadersEnum> headersEnumList) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        if (GenericPredicates.checkIfNullOrEmpty.negate().test(headersEnumList)) {
            headersEnumList.forEach(
                    x -> headers.add(x.getKey(), x.getValue()));
        } else {
            headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        }
        return headers;
    }

    private static HashMap<QueryParametersEnum, String> getMerchantBasicInfoHeader() {

        List<MerchantBasicInfoDTO> merchantBasicInfoDTOList = MyTestContext.getMyTestContext().merchantDemoManager.getMerchantBasicInfoDTOList();

        return MerchantBasicInfoQueryParamSupplier.getLoginMultiValueMapForHttpRequest(merchantBasicInfoDTOList.get(0));

    }

    /**
     * BACKUP
     * TODO REMOVE
     */

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
