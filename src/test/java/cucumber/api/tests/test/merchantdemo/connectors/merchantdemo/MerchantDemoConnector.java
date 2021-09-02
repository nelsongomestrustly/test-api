package cucumber.api.tests.test.merchantdemo.connectors.merchantdemo;

import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums;
import cucumber.api.tests.support.common.connectors.resttemplate.RestTemplateHttpConnector;
import cucumber.api.tests.test.merchantdemo.common.suppliers.html.CreateSignatureQueryParamSupplier;
import cucumber.api.tests.test.merchantdemo.data.dto.MerchantCreateSignatureDTO;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;

import static cucumber.api.tests.test.merchantdemo.connectors.MerchantDemoEndpoint.MERCHANT_DEMO_GET_SIGNATURE_ENDPOINT;
import static cucumber.api.tests.test.merchantdemo.connectors.MerchantDemoEndpoint.MERCHANT_DEMO_GLOBEX_ENDPOINT;

public class MerchantDemoConnector {

    public static ResponseEntity<String> getMerchantDemo(
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        return RestTemplateHttpConnector.httpGet_Return_String(
                MERCHANT_DEMO_GLOBEX_ENDPOINT.getEndpoint(),
                statefulRestTemplateInterceptorKeyEnums);

    }


    public static ResponseEntity<String> getMerchantDemoSignature(
            MerchantCreateSignatureDTO merchantCreateSignatureDTO,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        HashMap<QueryParametersEnum, String> loginMultiValueMapForHttpRequest = CreateSignatureQueryParamSupplier.getLoginMultiValueMapForHttpRequest(merchantCreateSignatureDTO);

        return RestTemplateHttpConnector.httpPost(
                MERCHANT_DEMO_GET_SIGNATURE_ENDPOINT.getEndpoint(),
                loginMultiValueMapForHttpRequest,
                statefulRestTemplateInterceptorKeyEnums);

    }



}
