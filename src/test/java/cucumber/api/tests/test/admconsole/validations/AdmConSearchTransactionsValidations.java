package cucumber.api.tests.test.admconsole.validations;

import cucumber.api.tests.common.suppliers.GenericSuppliers;
import org.junit.jupiter.api.Assertions;

import static cucumber.api.tests.test.admconsole.common.constants.AdmConSearchTransactionsConstants.ADM_CON_SEARCH_TRANSACTIONS_END_HTML_SEARCH_RESULT;
import static cucumber.api.tests.test.admconsole.common.constants.AdmConSearchTransactionsConstants.ADM_CON_SEARCH_TRANSACTIONS_START_HTML_SEARCH_RESULT;

public class AdmConSearchTransactionsValidations {

    public static void validateNumberOfSearchResults(String resultHTMLBody, String numberOfExpectSearchResults) {

        String numSearchResults = GenericSuppliers.getBetweenStrings(resultHTMLBody, ADM_CON_SEARCH_TRANSACTIONS_START_HTML_SEARCH_RESULT, ADM_CON_SEARCH_TRANSACTIONS_END_HTML_SEARCH_RESULT);

        Assertions.assertEquals(numberOfExpectSearchResults, numSearchResults);

    }

    public static void validateMoreThanNumberOfSearchResults(String resultHTMLBody, String numberOfExpectSearchResults) {

        String numSearchResults = GenericSuppliers.getBetweenStrings(resultHTMLBody, ADM_CON_SEARCH_TRANSACTIONS_START_HTML_SEARCH_RESULT, ADM_CON_SEARCH_TRANSACTIONS_END_HTML_SEARCH_RESULT);

        Assertions.assertTrue(Integer.parseInt(numSearchResults) >= Integer.parseInt(numberOfExpectSearchResults));

    }
}
