package cucumber.api.tests.test.merchantgatewayserver.connectors;

import cucumber.api.tests.common.enums.PaymentProviderEnum;
import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import cucumber.api.tests.common.suppliers.GenericSuppliers;
import cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums;
import cucumber.api.tests.support.common.connectors.resttemplate.RestTemplateHttpConnector;
import cucumber.api.tests.support.cucumber.context.MyTestContext;
import cucumber.api.tests.test.merchantdemo.common.suppliers.html.CreateSignatureQueryParamSupplier;
import cucumber.api.tests.test.merchantdemo.data.dto.MerchantCreateSignatureDTO;
import cucumber.api.tests.test.merchantgatewayserver.data.dto.EstabilishDataDTO;
import cucumber.api.tests.test.paymentpanel.common.enums.html.CreatePaymentPanelWidgetSupplier;
import cucumber.api.tests.test.paymentpanel.data.dto.PaymentPanelCreateWidgetDTO;
import io.cucumber.java.sl.In;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static cucumber.api.tests.test.merchantgatewayserver.connectors.MerchantGatewayServerEndpoint.MERCHANT_GATEWAY_SERVER_V1_ADMIN_ESTABILISH_TRANSACTIONS_ENDPOINT;
import static cucumber.api.tests.test.paymentpanel.connectors.PaymentPanelEndpoint.PAYMENT_PANEL_SELECT_BANK_ENDPOINT;
import static cucumber.api.tests.test.paymentpanel.connectors.PaymentPanelEndpoint.PAYMENT_PANEL_SELECT_BANK_SELECT_BANK_ENDPOINT;
import static cucumber.api.tests.test.paymentpanel.connectors.PaymentPanelEndpoint.PAYMENT_PANEL_SELECT_BANK_WIDGET_ENDPOINT;

public class MerchantGatewayServerConnector {


    public static ResponseEntity<String> estabilishTransactions(
            EstabilishDataDTO estabilishDataDTO,
            boolean createTransaction,
            Integer grp,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        //Adding Query Parameter
        //Adding Headers Maybe
        //Adding Esta

        String url = GenericSuppliers.getStringFormatted(MERCHANT_GATEWAY_SERVER_V1_ADMIN_ESTABILISH_TRANSACTIONS_ENDPOINT.getEndpoint(), String.valueOf(createTransaction), String.valueOf(grp));

        RestTemplateHttpConnector.testeForObject(
                url,
                estabilishDataDTO,
                statefulRestTemplateInterceptorKeyEnums);

        return null;

    }



}
