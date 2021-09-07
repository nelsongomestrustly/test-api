package cucumber.api.tests.support.common.connectors.utils;

import cucumber.api.tests.common.enums.headers.HttpHeadersEnum;
import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import cucumber.api.tests.common.predicates.GenericPredicates;
import cucumber.api.tests.data.context.MyTestContext;
import cucumber.api.tests.data.dto.merchantdemo.MerchantBasicInfoDTO;
import cucumber.api.tests.test.merchantdemo.common.suppliers.html.MerchantBasicInfoQueryParamSupplier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RestTemplateUriComponentsBuilderUtils {

    /**
     * HTTP QUERY AND HEADERS PARAMETERS
     * @return
     */

    public static HttpEntity getHttpEntityWithHeadersHttpHeader(
            List<HttpHeadersEnum> headersEnumList) {

        return new HttpEntity(getHttpHeaders(headersEnumList));

    }


    public static UriComponentsBuilder getEndpointWithQueryParamAndHeaders(
            String endpoint,
            boolean replaceSpacesWithPlus,
            Map<QueryParametersEnum, String> queryParam) {

        return getStringStringMultiValueMap(endpoint, replaceSpacesWithPlus, queryParam);

    }

    /**
     * QUERY
     */

    private static UriComponentsBuilder getStringStringMultiValueMap(
            String endpoint,
            boolean replaceSpacesWithPlus,
            Map<QueryParametersEnum, String> queryParam) {

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(endpoint);

        //Received Query Params
        if (GenericPredicates.checkIfNullOrEmpty.negate().test(queryParam)) {
            for (Map.Entry<QueryParametersEnum, String> entry : queryParam.entrySet()) {

                if(replaceSpacesWithPlus) {
                    builder.queryParam(entry.getKey().getKeyName(), entry.getValue().replace(" ", "+"));
                } else {
                    builder.queryParam(entry.getKey().getKeyName(), entry.getValue());
                }

            }
        }

        //Merchant Basic Info Query Params from Context
        for (Map.Entry<QueryParametersEnum, String> entry : getMerchantBasicInfoHeader().entrySet()) {
            builder.queryParam(entry.getKey().getKeyName(), entry.getValue());
        }

        return builder;

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



}
