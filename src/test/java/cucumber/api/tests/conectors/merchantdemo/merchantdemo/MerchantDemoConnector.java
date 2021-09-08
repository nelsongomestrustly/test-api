package cucumber.api.tests.conectors.merchantdemo.merchantdemo;

import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums;
import cucumber.api.tests.data.dto.merchantdemo.MerchantCreateSignatureDTO;
import cucumber.api.tests.support.common.connectors.resttemplate.RestTemplateHttpConnector;
import cucumber.api.tests.common.merchantdemo.suppliers.html.CreateSignatureSupplier;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;

import static cucumber.api.tests.conectors.merchantdemo.MerchantDemoEndpoint.MERCHANT_DEMO_GET_SIGNATURE_ENDPOINT;
import static cucumber.api.tests.conectors.merchantdemo.MerchantDemoEndpoint.MERCHANT_DEMO_GLOBEX_ENDPOINT;

public class MerchantDemoConnector {

    protected static ResponseEntity<String> getMerchantDemo(
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        return RestTemplateHttpConnector.httpGet_Return_String(
                MERCHANT_DEMO_GLOBEX_ENDPOINT.getEndpoint(),
                statefulRestTemplateInterceptorKeyEnums);

    }


    protected static ResponseEntity<String> getMerchantDemoSignature(
            MerchantCreateSignatureDTO merchantCreateSignatureDTO,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        HashMap<QueryParametersEnum, String> loginMultiValueMapForHttpRequest = CreateSignatureSupplier.getLoginMultiValueMapForHttpRequest(merchantCreateSignatureDTO);

        return RestTemplateHttpConnector.httpPost(
                MERCHANT_DEMO_GET_SIGNATURE_ENDPOINT.getEndpoint(),
                loginMultiValueMapForHttpRequest,
                statefulRestTemplateInterceptorKeyEnums);

    }



}
