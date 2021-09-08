package cucumber.api.tests.validations.admconsole;

import cucumber.api.tests.common.suppliers.StringSuppliers;
import org.junit.jupiter.api.Assertions;

import static cucumber.api.tests.common.admconsole.constants.AdmConSearchTransactionsConstants.ADM_CON_SEARCH_TRANSACTIONS_END_HTML_SEARCH_RESULT;
import static cucumber.api.tests.common.admconsole.constants.AdmConSearchTransactionsConstants.ADM_CON_SEARCH_TRANSACTIONS_START_HTML_SEARCH_RESULT;

public class AdmConSearchTransactionsValidations {

    public static void validateNumberOfSearchResults(String resultHTMLBody, String numberOfExpectSearchResults) {

        String numSearchResults = StringSuppliers.getBetweenStrings(resultHTMLBody, ADM_CON_SEARCH_TRANSACTIONS_START_HTML_SEARCH_RESULT, ADM_CON_SEARCH_TRANSACTIONS_END_HTML_SEARCH_RESULT);

        Assertions.assertEquals(numberOfExpectSearchResults, numSearchResults);

    }

    public static void validateMoreThanNumberOfSearchResults(String resultHTMLBody, String numberOfExpectSearchResults) {

        String numSearchResults = StringSuppliers.getBetweenStrings(resultHTMLBody, ADM_CON_SEARCH_TRANSACTIONS_START_HTML_SEARCH_RESULT, ADM_CON_SEARCH_TRANSACTIONS_END_HTML_SEARCH_RESULT);

        Assertions.assertTrue(Integer.parseInt(numSearchResults) >= Integer.parseInt(numberOfExpectSearchResults));

    }

    public static String getNumberOfResults(String resultHTMLBody) {

        return StringSuppliers.getBetweenStrings(resultHTMLBody, ADM_CON_SEARCH_TRANSACTIONS_START_HTML_SEARCH_RESULT, ADM_CON_SEARCH_TRANSACTIONS_END_HTML_SEARCH_RESULT);

    }



}
