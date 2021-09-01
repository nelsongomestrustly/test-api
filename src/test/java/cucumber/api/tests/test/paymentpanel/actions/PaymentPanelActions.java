package cucumber.api.tests.test.paymentpanel.actions;


import com.fasterxml.jackson.core.JsonProcessingException;
import cucumber.api.tests.common.enums.DeviceInfoEnum;
import cucumber.api.tests.common.enums.PaymentProviderEnum;
import cucumber.api.tests.common.enums.WidgetIdEnum;
import cucumber.api.tests.common.mappers.HttpMappers;
import cucumber.api.tests.common.predicates.GenericPredicates;
import cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums;
import cucumber.api.tests.test.merchantdemo.data.dto.MerchantInfoDTO;
import cucumber.api.tests.test.paymentpanel.connectors.PaymentPanelConnector;
import cucumber.api.tests.test.paymentpanel.data.dto.PaymentPanelCreateWidgetDTO;
import cucumber.api.tests.validations.resttemplate.RestTemplateValidations;
import org.springframework.http.ResponseEntity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class PaymentPanelActions {



    public static String getSelectBankRedirectUrl(
            PaymentProviderEnum paymentProviderEnum,
            Integer expectedStatus,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) throws IOException {

        ResponseEntity<String> responseEntity = PaymentPanelConnector.getSelectBankRedirectUrl(paymentProviderEnum, statefulRestTemplateInterceptorKeyEnums);

        RestTemplateValidations.validateStatus(expectedStatus, responseEntity);

        return HttpMappers.readResponse(responseEntity, String.class);


    }

    public static PaymentPanelCreateWidgetDTO getPaymentPanelWidget(
            PaymentPanelCreateWidgetDTO paymentPanelCreateWidgetDTO,
            Integer expectedStatus,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) throws JsonProcessingException {

        ResponseEntity<String> responseEntity = PaymentPanelConnector.getPaymentPanelWidget(
                paymentPanelCreateWidgetDTO,
                statefulRestTemplateInterceptorKeyEnums);

        RestTemplateValidations.validateStatus(expectedStatus, responseEntity);

        return (GenericPredicates.checkIfNullOrEmpty.test(responseEntity.getBody())) ? null : paymentPanelCreateWidgetDTO;

    }



    public static void getPaymentPanel(
            String requestSignature,
            PaymentProviderEnum paymentProviderEnum,
            DeviceInfoEnum deviceInfoEnum,
            List<MerchantInfoDTO> merchantInfoDTOList,
            WidgetIdEnum widgetIdEnum,
            int expectedStatus,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        ResponseEntity<String> responseEntity = PaymentPanelConnector.getPaymentPanel(
                requestSignature,
                paymentProviderEnum,
                deviceInfoEnum,
                merchantInfoDTOList,
                widgetIdEnum,
                statefulRestTemplateInterceptorKeyEnums);

        RestTemplateValidations.validateStatus(expectedStatus, responseEntity);

    }
}
