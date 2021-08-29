package cucumber.api.tests.common.functions;

import cucumber.api.tests.common.functionalinterfaces.TriFunction;

import java.text.MessageFormat;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class GenericFunctions {

    private GenericFunctions() {
        throw new IllegalStateException("Utility class");
    } //SonarLint Alert

    public static Function<String, String> removeLastChar = str -> str.substring(0, str.length() - 1);

    public static BiFunction<String, Integer, String> removeLastXChar = (str, numRemove) -> str.substring(0, str.length() - numRemove);

    public static BiFunction<String, Integer, String> removeFirstXChar = (str, numRemove) -> str.substring(numRemove, str.length());

}
