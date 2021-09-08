package cucumber.api.tests.conectors.merchantgatewayserver;

import cucumber.api.tests.common.suppliers.StringSuppliers;
import cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums;
import cucumber.api.tests.support.common.connectors.resttemplate.RestTemplateHttpConnector;
import cucumber.api.tests.data.dto.merchantgatewayserver.EstabilishDataDTO;
import org.springframework.http.ResponseEntity;

import static cucumber.api.tests.conectors.merchantgatewayserver.MerchantGatewayServerEndpoint.MERCHANT_GATEWAY_SERVER_V1_ADMIN_ESTABILISH_TRANSACTIONS_ENDPOINT;

public class MerchantGatewayServerConnector {


    protected static ResponseEntity<String> estabilishTransactions(
            EstabilishDataDTO estabilishDataDTO,
            boolean createTransaction,
            Integer grp,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) {

        //Adding Query Parameter
        //Adding Headers Maybe
        //Adding Esta

        String url = StringSuppliers.getStringFormatted(MERCHANT_GATEWAY_SERVER_V1_ADMIN_ESTABILISH_TRANSACTIONS_ENDPOINT.getEndpoint(), String.valueOf(createTransaction), String.valueOf(grp));

        RestTemplateHttpConnector.testeForObject(
                url,
                estabilishDataDTO,
                statefulRestTemplateInterceptorKeyEnums);

        return null;

    }



}
