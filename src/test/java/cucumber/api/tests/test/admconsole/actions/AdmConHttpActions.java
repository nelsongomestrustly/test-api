package cucumber.api.tests.test.admconsole.actions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import cucumber.api.tests.test.admconsole.connectors.AdmConConnector;
import cucumber.api.tests.data.dto.admconsole.AdmConSearchTransactionsDTO;
import cucumber.api.tests.validations.resttemplate.RestTemplateValidations;

import java.io.IOException;


@Slf4j
public class AdmConHttpActions {

    /**
     * SEARCH ALL
     */

    public static String getAdminConsoleAllTransactions(
            Integer expectHttpStatus) throws IOException {

        ResponseEntity<String> responseEntity = AdmConConnector.searchAllTransactionsInAdminConsole();

        RestTemplateValidations.validateStatus(expectHttpStatus, responseEntity);

        return responseEntity.getBody();

    }


    /**
     * SEARCH BY NAME
     */

    public static String getAdminConsoleTransactionsByName(
            AdmConSearchTransactionsDTO admConSearchTransactionsDTO,
            Integer expectHttpStatus) throws IOException {

        ResponseEntity<String> responseEntity = AdmConConnector.searchTransactionsInAdminConsole(admConSearchTransactionsDTO);

        RestTemplateValidations.validateStatus(expectHttpStatus, responseEntity);

        return responseEntity.getBody();

    }

}
