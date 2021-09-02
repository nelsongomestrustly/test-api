package cucumber.api.tests.test.frontend.actions;

import cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums;
import cucumber.api.tests.test.frontend.connectors.FrontEndConnector;
import cucumber.api.tests.validations.resttemplate.RestTemplateValidations;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;

import static cucumber.api.tests.test.frontend.connectors.FrontEndEndpoint.FRONT_END_ENDPOINT_BUILD_BANK_PANEL;


@Slf4j
public class FrontEndHttpActions {

    /**
     * CREATE DATA
     */

    public static String buildBankPanelInMerchantDemo(
            Integer expectHttpStatus,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        ResponseEntity<String> responseEntity = FrontEndConnector.buildBankPanelInMerchantDemo(FRONT_END_ENDPOINT_BUILD_BANK_PANEL, statefulRestTemplateInterceptorKeyEnums);

        RestTemplateValidations.validateStatus(expectHttpStatus, responseEntity);

        return responseEntity.getBody();

    }

}
