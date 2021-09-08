package cucumber.api.tests.conectors.frontend;

import cucumber.api.tests.common.mappers.HttpMappers;
import cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums;
import cucumber.api.tests.data.dto.frontend.FrontEndSetupDTO;
import cucumber.api.tests.conectors.frontend.FrontEndConnector;
import cucumber.api.tests.validations.resttemplate.RestTemplateValidations;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;

import java.io.IOException;

import static cucumber.api.tests.conectors.frontend.FrontEndEndpoint.FRONT_END_ENDPOINT_BUILD_BANK_PANEL;


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


    public static FrontEndSetupDTO setupPanelInMerchantDemo(Integer expectHttpStatus) throws IOException {

        String htmlBody = FrontEndConnector.setupBankPanelInMerchantDemo();

        return HttpMappers.readResponse(htmlBody, FrontEndSetupDTO.class);

    }


}
