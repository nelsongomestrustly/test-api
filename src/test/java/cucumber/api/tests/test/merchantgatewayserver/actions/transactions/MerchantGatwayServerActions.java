package cucumber.api.tests.test.merchantgatewayserver.actions.transactions;


import com.fasterxml.jackson.core.JsonProcessingException;
import cucumber.api.tests.common.enums.PaymentProviderEnum;
import cucumber.api.tests.common.mappers.HttpMappers;
import cucumber.api.tests.common.predicates.GenericPredicates;
import cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums;
import cucumber.api.tests.test.merchantdemo.data.dto.MerchantCreateSignatureDTO;
import cucumber.api.tests.test.merchantgatewayserver.connectors.MerchantGatewayServerConnector;
import cucumber.api.tests.test.merchantgatewayserver.data.dto.EstabilishDataDTO;
import cucumber.api.tests.test.paymentpanel.connectors.PaymentPanelConnector;
import cucumber.api.tests.test.paymentpanel.data.dto.PaymentPanelCreateWidgetDTO;
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
