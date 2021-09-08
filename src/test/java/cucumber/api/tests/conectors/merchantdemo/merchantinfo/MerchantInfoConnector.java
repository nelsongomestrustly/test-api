package cucumber.api.tests.conectors.merchantdemo.merchantinfo;

import cucumber.api.tests.common.enums.MerchantTypeEnum;
import cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums;
import cucumber.api.tests.support.common.connectors.resttemplate.RestTemplateHttpConnector;
import org.springframework.http.ResponseEntity;

import java.util.Map;

import static cucumber.api.tests.conectors.merchantdemo.MerchantDemoEndpoint.MERCHANT_DEMO_GET_MERCHANT_LIST_ENDPOINT;

public class MerchantInfoConnector {

    protected static ResponseEntity<String> getMerchantsInfo(
            MerchantTypeEnum merchantTypeEnum,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        return RestTemplateHttpConnector.httpPost(
                MERCHANT_DEMO_GET_MERCHANT_LIST_ENDPOINT.getEndpoint(),
                Map.of(merchantTypeEnum.getKey(), merchantTypeEnum.getType()),
                statefulRestTemplateInterceptorKeyEnums);

    }

}