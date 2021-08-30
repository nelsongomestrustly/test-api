package cucumber.api.tests.test.admconsole.connectors;



import cucumber.api.tests.common.suppliers.GenericSuppliers;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import cucumber.api.tests.support.common.connectors.resttemplate.RestTemplateHttpConnector;
import cucumber.api.tests.test.admconsole.common.suppliers.AdminConsoleSearchForTransactionsSupplier;
import cucumber.api.tests.test.admconsole.data.dto.AdminConsoleSearchTransactionsDTO;

import java.io.IOException;

import static cucumber.api.tests.test.admconsole.connectors.AdmConsoleEndpoint.ADMIN_CONSOLE_TRANSACTIONS_SEARCH_HP;

@Slf4j
public class AdmConsoleConnector {

    public static ResponseEntity<String> searchTransactionsInAdminConsole(AdminConsoleSearchTransactionsDTO adminConsoleSearchTransactionsDTO) throws IOException {

        //Get Search URL
        String searchForTransactionsUrl = AdminConsoleSearchForTransactionsSupplier.getSearchForTransactionsUrl(adminConsoleSearchTransactionsDTO);

        log.info("Search searchForTransactionsUrl : " + searchForTransactionsUrl);
        log.info("Search searchForTransactionsUrl : " + searchForTransactionsUrl);
        log.info("Search searchForTransactionsUrl : " + searchForTransactionsUrl);
        log.info("Search searchForTransactionsUrl : " + searchForTransactionsUrl);
        log.info("Search searchForTransactionsUrl : " + searchForTransactionsUrl);

        //Add default URL With Search Parameters
        String url = GenericSuppliers.getUrlFormatted(ADMIN_CONSOLE_TRANSACTIONS_SEARCH_HP.getEndpoint(), searchForTransactionsUrl);

        log.info("Search URL : " + url);
        log.info("Search URL : " + url);
        log.info("Search URL : " + url);
        log.info("Search URL : " + url);
        log.info("Search URL : " + url);

        return RestTemplateHttpConnector.httpGet_Return_String(url);

    }



}
