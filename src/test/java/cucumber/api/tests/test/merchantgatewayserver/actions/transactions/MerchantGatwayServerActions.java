package cucumber.api.tests.test.merchantgatewayserver.actions.transactions;


import cucumber.api.tests.common.mappers.HttpMappers;
import cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums;
import cucumber.api.tests.conectors.merchantgatewayserver.MerchantGatewayServerConnector;
import cucumber.api.tests.data.dto.merchantgatewayserver.EstabilishDataDTO;
import cucumber.api.tests.validations.resttemplate.RestTemplateValidations;
import org.springframework.http.ResponseEntity;

import java.io.IOException;


public class MerchantGatwayServerActions {

    public static String estabilishTransactions(
            EstabilishDataDTO estabilishDataDTO,
            Integer expectedStatus,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) throws IOException {

        ResponseEntity<String> responseEntity = MerchantGatewayServerConnector.estabilishTransactions(
                estabilishDataDTO,
                true,
                1,
                statefulRestTemplateInterceptorKeyEnums);

        RestTemplateValidations.validateStatus(expectedStatus, responseEntity);

        return HttpMappers.readResponse(responseEntity, String.class);


    }


}
