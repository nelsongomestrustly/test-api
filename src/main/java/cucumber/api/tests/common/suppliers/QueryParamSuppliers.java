package cucumber.api.tests.common.suppliers;

import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import cucumber.api.tests.common.functions.GenericFunctions;
import cucumber.api.tests.common.predicates.GenericPredicates;

import java.util.HashMap;
import java.util.Map;

import static cucumber.api.tests.common.constants.QueryParamSymbols.EQUAL_SYMBOL;
import static cucumber.api.tests.common.constants.QueryParamSymbols.URL_SPLIT_SYMBOL;

public class QueryParamSuppliers {


    public static String getSearchFormatByField(Map.Entry<QueryParametersEnum, String> mapEntry) {

        StringBuilder sb = new StringBuilder();

        if (GenericPredicates.checkIfNullOrEmpty.negate().test(mapEntry.getValue())) {
            sb.append(getSearchFormatWithValue(mapEntry.getKey(), mapEntry.getValue()));
        } else {
            sb.append(getSearchFormatWithoutValue(mapEntry.getKey()));
        }

        return sb.toString();

    }


    public static String getSearchFormatByField(Object object, QueryParametersEnum queryParametersEnum) {

        StringBuilder sb = new StringBuilder();

        if (GenericPredicates.checkIfNullOrEmpty.negate().test(object)) {
            sb.append(getSearchFormatWithValue(queryParametersEnum, String.valueOf(object)));
        } else {
            sb.append(getSearchFormatWithoutValue(queryParametersEnum));
        }

        return sb.toString();

    }




    private static String getSearchFormatWithValue(QueryParametersEnum queryParametersEnum, String fieldValue) {

        StringBuilder sbSearchFormat = new StringBuilder();

        /**
         * Need to Replace Empty Spaces, with "+" signal
         * customerName=Mary+Smith
         * mctCustomerName=John+Smith
         */
        sbSearchFormat.append(queryParametersEnum.getKeyName());
        sbSearchFormat.append(EQUAL_SYMBOL);
        sbSearchFormat.append(fieldValue.replace(" ", "+"));
        sbSearchFormat.append(URL_SPLIT_SYMBOL);

        return sbSearchFormat.toString();

    }

    private static String getSearchFormatWithoutValue(QueryParametersEnum queryParametersEnum) {

        StringBuilder sbSearchFormat = new StringBuilder();

        sbSearchFormat.append(queryParametersEnum.getKeyName());
        sbSearchFormat.append(EQUAL_SYMBOL);
        sbSearchFormat.append(URL_SPLIT_SYMBOL);

        return sbSearchFormat.toString();

    }


    /**
     *
     */

    public static HashMap<QueryParametersEnum, String> addMapEntryIfNecessary(Object object, QueryParametersEnum key, HashMap<QueryParametersEnum, String> map) {

        if (GenericPredicates.checkIfNullOrEmpty.negate().test(object)) {
            map.put(key, object.toString());
        }

        return map;

    }


}
