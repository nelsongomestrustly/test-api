package cucumber.api.tests.test.admconsole.actions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import cucumber.api.tests.test.admconsole.connectors.AdmConsoleConnector;
import cucumber.api.tests.test.admconsole.data.dto.AdminConsoleSearchTransactionsDTO;
import cucumber.api.tests.validations.resttemplate.RestTemplateValidations;

import java.io.IOException;


@Slf4j
public class AdmConsoleHttpActions {

    /**
     * CREATE DATA
     */

    public static String getAdminConsoleTransactionsByName(
            AdminConsoleSearchTransactionsDTO adminConsoleSearchTransactionsDTO,
            Integer expectHttpStatus) throws IOException {

        ResponseEntity<String> responseEntity = AdmConsoleConnector.searchTransactionsInAdminConsole(adminConsoleSearchTransactionsDTO);

        RestTemplateValidations.validateStatus(expectHttpStatus, responseEntity);

        return responseEntity.getBody();

    }

}
