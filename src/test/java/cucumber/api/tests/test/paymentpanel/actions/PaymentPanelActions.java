package cucumber.api.tests.test.paymentpanel.actions;


import cucumber.api.tests.common.enums.DeviceInfoEnum;
import cucumber.api.tests.common.enums.PaymentProviderEnum;
import cucumber.api.tests.common.enums.WidgetIdEnum;
import cucumber.api.tests.common.mappers.HttpMappers;
import cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums;
import cucumber.api.tests.test.merchantdemo.connectors.merchantdemo.MerchantDemoConnector;
import cucumber.api.tests.test.merchantdemo.data.dto.MerchantInfoDTO;
import cucumber.api.tests.test.paymentpanel.connectors.PaymentPanelConnector;
import cucumber.api.tests.validations.resttemplate.RestTemplateValidations;
import org.springframework.http.ResponseEntity;

import java.io.IOException;
import java.util.List;


public class PaymentPanelActions {



    public static String getSelectBankRedirectUrl(
            PaymentProviderEnum paymentProviderEnum,
            Integer expectedStatus,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) throws IOException {

        ResponseEntity<String> responseEntity = PaymentPanelConnector.getSelectBankRedirectUrl(paymentProviderEnum, statefulRestTemplateInterceptorKeyEnums);

        RestTemplateValidations.validateStatus(expectedStatus, responseEntity);

        return null;


    }



    public static void getPaymentPanel(
            PaymentProviderEnum paymentProviderEnum,
            DeviceInfoEnum deviceInfoEnum,
            List<MerchantInfoDTO> merchantInfoDTOList,
            WidgetIdEnum widgetIdEnum,
            int expectedStatus,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        ResponseEntity<String> responseEntity = PaymentPanelConnector.getPaymentPanel(
                paymentProviderEnum,
                deviceInfoEnum,
                merchantInfoDTOList,
                widgetIdEnum,
                statefulRestTemplateInterceptorKeyEnums);

        RestTemplateValidations.validateStatus(expectedStatus, responseEntity);

    }
}
