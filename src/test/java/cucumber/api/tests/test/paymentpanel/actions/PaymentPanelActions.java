package cucumber.api.tests.test.paymentpanel.actions;


import com.fasterxml.jackson.core.JsonProcessingException;
import cucumber.api.tests.common.enums.PaymentProviderEnum;
import cucumber.api.tests.common.mappers.HttpMappers;
import cucumber.api.tests.common.predicates.GenericPredicates;
import cucumber.api.tests.common.security.TokenDTO;
import cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums;
import cucumber.api.tests.test.merchantdemo.data.dto.MerchantCreateSignatureDTO;
import cucumber.api.tests.test.frontend.common.suppliers.MerchantDemoFrontEndTokenManagerSupplier;
import cucumber.api.tests.test.paymentpanel.connectors.PaymentPanelConnector;
import cucumber.api.tests.test.paymentpanel.data.dto.PaymentPanelCreateWidgetDTO;
import cucumber.api.tests.test.paymentpanel.data.dto.PaymentPanelSelectBankDTO;
import cucumber.api.tests.validations.resttemplate.RestTemplateValidations;
import org.springframework.http.ResponseEntity;

import java.io.IOException;


public class PaymentPanelActions {


    //PaymentPanelSelectBankSelectBank_FT
    public static String getSelectBankRedirectUrl(
            MerchantCreateSignatureDTO merchantCreateSignatureDTO,
            PaymentPanelSelectBankDTO paymentPanelSelectBankDTO,
            Integer expectedStatus,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) throws IOException {

        ResponseEntity<String> responseEntity = PaymentPanelConnector.getSelectBankRedirectUrl
                (merchantCreateSignatureDTO, paymentPanelSelectBankDTO, statefulRestTemplateInterceptorKeyEnums);

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


    public static TokenDTO getMerchantTransactionToken(
            MerchantCreateSignatureDTO merchantCreateSignatureDTO,
            int expectedStatus,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        ResponseEntity<String> responseEntity = PaymentPanelConnector.getPaymentPanel(
                merchantCreateSignatureDTO,
                statefulRestTemplateInterceptorKeyEnums);

        RestTemplateValidations.validateStatus(expectedStatus, responseEntity);

        return MerchantDemoFrontEndTokenManagerSupplier.getMerchantDemoFrontEndTokenManager(responseEntity.toString());

    }
}
