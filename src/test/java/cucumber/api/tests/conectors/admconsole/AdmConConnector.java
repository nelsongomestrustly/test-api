package cucumber.api.tests.conectors.admconsole;



import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import cucumber.api.tests.common.admconsole.suppliers.html.AdmConSearchForTransactionsSupplier2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import cucumber.api.tests.support.common.connectors.resttemplate.RestTemplateHttpConnector;
import cucumber.api.tests.data.dto.admconsole.AdmConSearchTransactionsDTO;

import java.io.IOException;
import java.util.HashMap;

import static cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums.ADMIN_CONSOLE_INTERCEPTOR_MAP_KEY;
import static cucumber.api.tests.conectors.admconsole.endpoints.AdmConEndpoint.ADM_CON_TRANSACTIONS_ENDPOINT;

@Slf4j
public class AdmConConnector {


    protected static ResponseEntity<String> searchAllTransactionsInAdminConsole() throws IOException {

        return RestTemplateHttpConnector.httpGet_Return_String(ADM_CON_TRANSACTIONS_ENDPOINT.getEndpoint(), ADMIN_CONSOLE_INTERCEPTOR_MAP_KEY);

    }


    protected static ResponseEntity<String> searchTransactionsInAdminConsole(
            AdmConSearchTransactionsDTO admConSearchTransactionsDTO) throws IOException {

        HashMap<QueryParametersEnum, String> searchForTransactionsUrl1 = AdmConSearchForTransactionsSupplier2.getSearchForTransactionsUrl(admConSearchTransactionsDTO);

        return RestTemplateHttpConnector.httpGet_Return_String(
                ADM_CON_TRANSACTIONS_ENDPOINT.getEndpoint(),
                searchForTransactionsUrl1,
                null,
                ADMIN_CONSOLE_INTERCEPTOR_MAP_KEY);

    }



}
