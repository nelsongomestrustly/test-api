package cucumber.api.tests.test.admconsole.connectors;



import cucumber.api.tests.common.suppliers.GenericSuppliers;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import cucumber.api.tests.support.common.connectors.resttemplate.RestTemplateHttpConnector;
import cucumber.api.tests.test.admconsole.common.suppliers.AdmConSearchForTransactionsSupplier;
import cucumber.api.tests.test.admconsole.data.dto.AdmConSearchTransactionsDTO;

import java.io.IOException;

import static cucumber.api.tests.test.admconsole.connectors.AdmConEndpoint.ADM_CON_TRANSACTIONS_SEARCH_ENDPOINT;

@Slf4j
public class AdmConConnector {

    public static ResponseEntity<String> searchTransactionsInAdminConsole(AdmConSearchTransactionsDTO admConSearchTransactionsDTO) throws IOException {

        //Get Search URL
        String searchForTransactionsUrl = AdmConSearchForTransactionsSupplier.getSearchForTransactionsUrl(admConSearchTransactionsDTO);

        //Add default URL With Search Parameters
        String url = GenericSuppliers.getStringFormatted(ADM_CON_TRANSACTIONS_SEARCH_ENDPOINT.getEndpoint(), searchForTransactionsUrl);

        return RestTemplateHttpConnector.httpGet_Return_String(url);

    }



}