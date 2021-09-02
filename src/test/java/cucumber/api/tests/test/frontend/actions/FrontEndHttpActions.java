package cucumber.api.tests.test.frontend.actions;

import cucumber.api.tests.common.suppliers.GenericSuppliers;
import cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums;
import cucumber.api.tests.test.frontend.connectors.FrontEndConnector;
import cucumber.api.tests.test.frontend.connectors.FrontEndEndpoint;
import cucumber.api.tests.validations.resttemplate.RestTemplateValidations;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;

import static cucumber.api.tests.test.frontend.connectors.FrontEndEndpoint.FRONT_END_ENDPOINT_SETUP;
import static cucumber.api.tests.test.merchantgatewayserver.connectors.MerchantGatewayServerEndpoint.MERCHANT_GATEWAY_SERVER_V1_ADMIN_ESTABILISH_TRANSACTIONS_ENDPOINT;


@Slf4j
public class FrontEndHttpActions {

    /**
     * CREATE DATA
     */

    public static String setupMerchantDemo(
            Integer expectHttpStatus,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        ResponseEntity<String> responseEntity = FrontEndConnector.setupMerchantDemo(FRONT_END_ENDPOINT_SETUP, statefulRestTemplateInterceptorKeyEnums);

        RestTemplateValidations.validateStatus(expectHttpStatus, responseEntity);

        return responseEntity.getBody();

    }

}
