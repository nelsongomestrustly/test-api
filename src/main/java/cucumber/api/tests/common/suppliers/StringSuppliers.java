package cucumber.api.tests.common.suppliers;

import cucumber.api.tests.common.functions.GenericFunctions;

import java.text.MessageFormat;

import static cucumber.api.tests.common.constants.QueryParamSymbols.URL_SPLIT_SYMBOL;

public class StringSuppliers {

    private StringSuppliers() {
        throw new IllegalStateException("Utility class");
    } //SonarLint Alert

    public static String getStringFormatted(String string, String... params) {
        return MessageFormat.format(string, params);
    }

    public static String getBetweenStrings(String string, String start, String end) {

        int startIndex = string.indexOf(start);
        int startLength = start.length();
        int endIndex = string.indexOf(end);

        String betweenStrings = string.substring(startIndex, endIndex);

        return GenericFunctions.removeFirstXChar.apply(betweenStrings, startLength);

    }

    public static String removeLastCharIfNecessary(String url) {

        if (url.endsWith(URL_SPLIT_SYMBOL)) {
            return GenericFunctions.removeLastChar.apply(url);
        }

        return url;


    }

}
