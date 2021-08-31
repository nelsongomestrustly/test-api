package cucumber.api.tests.test.merchantdemo.connectors.merchantinfo;

import cucumber.api.tests.common.enums.MerchantTypeEnum;
import cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums;
import cucumber.api.tests.support.common.connectors.resttemplate.RestTemplateHttpConnector;
import cucumber.api.tests.test.merchantdemo.data.dto.MerchantInfoDTO;
import org.springframework.http.ResponseEntity;

import java.util.Map;

import static cucumber.api.tests.test.merchantdemo.connectors.MerchantDemoEndpoint.MERCHANT_DEMO_GET_MERCHANT_LIST_ENDPOINT;

public class MerchantInfoConnector {

    public static ResponseEntity<String> getMerchantsInfo(
            MerchantTypeEnum merchantTypeEnum,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        return RestTemplateHttpConnector.httpPostForObject(
                MERCHANT_DEMO_GET_MERCHANT_LIST_ENDPOINT.getEndpoint(),
                Map.of(merchantTypeEnum.getTypeKey(), merchantTypeEnum.getType()),
                statefulRestTemplateInterceptorKeyEnums);

    }

}
