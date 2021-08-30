package cucumber.api.tests.common.suppliers;

import cucumber.api.tests.common.functions.GenericFunctions;

import java.text.MessageFormat;

public class GenericSuppliers {

    private GenericSuppliers() {
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

}
