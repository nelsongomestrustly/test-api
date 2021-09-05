package cucumber.api.tests.test.merchantdemo.actions.get.paymentflows;


import com.fasterxml.jackson.core.type.TypeReference;
import cucumber.api.tests.common.mappers.HttpMappers;
import cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums;
import cucumber.api.tests.test.merchantdemo.connectors.paymentflows.MerchantPaymentFlowsConnector;
import cucumber.api.tests.data.dto.paymentflows.PaymentFlowsDTO;
import cucumber.api.tests.validations.resttemplate.RestTemplateValidations;
import org.springframework.http.ResponseEntity;

import java.io.IOException;
import java.util.List;


public class PaymentFlowsGetHttpActions {



    public static List<PaymentFlowsDTO> getMerchantPaymentFlows(
            Integer expectedStatus,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) throws IOException {

        ResponseEntity<String> responseEntity =  MerchantPaymentFlowsConnector.getMerchantPaymentFlows(statefulRestTemplateInterceptorKeyEnums);

        RestTemplateValidations.validateStatus(expectedStatus, responseEntity);

        return HttpMappers.readListResponse(responseEntity, new TypeReference<>() {});

    }





}
