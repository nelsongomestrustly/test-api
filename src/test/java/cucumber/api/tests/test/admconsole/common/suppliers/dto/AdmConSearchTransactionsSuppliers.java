package cucumber.api.tests.test.admconsole.common.suppliers.dto;

import cucumber.api.tests.common.suppliers.StringSuppliers;
import org.junit.jupiter.api.Assertions;

import static cucumber.api.tests.test.admconsole.common.constants.AdmConSearchTransactionsConstants.ADM_CON_SEARCH_TRANSACTIONS_END_HTML_SEARCH_RESULT;
import static cucumber.api.tests.test.admconsole.common.constants.AdmConSearchTransactionsConstants.ADM_CON_SEARCH_TRANSACTIONS_START_HTML_SEARCH_RESULT;

public class AdmConSearchTransactionsSuppliers {

    public static String getNumberOfResults(String resultHTMLBody) {

        return StringSuppliers.getBetweenStrings(resultHTMLBody, ADM_CON_SEARCH_TRANSACTIONS_START_HTML_SEARCH_RESULT, ADM_CON_SEARCH_TRANSACTIONS_END_HTML_SEARCH_RESULT);

    }

}
