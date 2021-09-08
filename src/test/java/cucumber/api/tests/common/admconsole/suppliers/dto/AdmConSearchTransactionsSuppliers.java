package cucumber.api.tests.common.admconsole.suppliers.dto;

import cucumber.api.tests.common.suppliers.StringSuppliers;

import static cucumber.api.tests.common.admconsole.constants.AdmConSearchTransactionsConstants.ADM_CON_SEARCH_TRANSACTIONS_END_HTML_SEARCH_RESULT;
import static cucumber.api.tests.common.admconsole.constants.AdmConSearchTransactionsConstants.ADM_CON_SEARCH_TRANSACTIONS_START_HTML_SEARCH_RESULT;

public class AdmConSearchTransactionsSuppliers {

    public static String getNumberOfResults(String resultHTMLBody) {

        return StringSuppliers.getBetweenStrings(resultHTMLBody, ADM_CON_SEARCH_TRANSACTIONS_START_HTML_SEARCH_RESULT, ADM_CON_SEARCH_TRANSACTIONS_END_HTML_SEARCH_RESULT);

    }

}
