package test.admconsole.validations;

import cucumber.api.tests.common.suppliers.GenericSuppliers;
import org.junit.jupiter.api.Assertions;

import static test.admconsole.common.constants.AdminConsoleSearchTransactionsConstants.ADMIN_CONSOLE_SEARCH_TRANSACTIONS_END_HTML_SEARCH_RESULT;
import static test.admconsole.common.constants.AdminConsoleSearchTransactionsConstants.ADMIN_CONSOLE_SEARCH_TRANSACTIONS_START_HTML_SEARCH_RESULT;

public class AdminConsoleSearchTransactionsValidations {

    public static void validateNumberOfSearchResults(String resultHTMLBody, String numberOfExpectSearchResults) {

        String numSearchResults = GenericSuppliers.getBetweenStrings(resultHTMLBody, ADMIN_CONSOLE_SEARCH_TRANSACTIONS_START_HTML_SEARCH_RESULT, ADMIN_CONSOLE_SEARCH_TRANSACTIONS_END_HTML_SEARCH_RESULT);

        Assertions.assertEquals(numberOfExpectSearchResults, numSearchResults);

    }

    public static void validateMoreThanNumberOfSearchResults(String resultHTMLBody, String numberOfExpectSearchResults) {

        String numSearchResults = GenericSuppliers.getBetweenStrings(resultHTMLBody, ADMIN_CONSOLE_SEARCH_TRANSACTIONS_START_HTML_SEARCH_RESULT, ADMIN_CONSOLE_SEARCH_TRANSACTIONS_END_HTML_SEARCH_RESULT);

        Assertions.assertTrue(Integer.parseInt(numSearchResults) > Integer.parseInt(numberOfExpectSearchResults));

    }
}
