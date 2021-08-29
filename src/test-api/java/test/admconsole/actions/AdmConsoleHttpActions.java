package test.admconsole.actions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import test.admconsole.connectors.AdmConsoleConnector;
import test.admconsole.data.dto.AdminConsoleSearchTransactionsDTO;
import validations.resttemplate.RestTemplateValidations;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


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
