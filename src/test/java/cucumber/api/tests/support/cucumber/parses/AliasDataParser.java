package cucumber.api.tests.support.cucumber.parses;

import cucumber.api.tests.common.utils.Utilities;
import io.cucumber.datatable.DataTable;
import cucumber.api.tests.data.context.BaseCucumberContext;

import java.util.*;


//TODO VALIDATE MOVE TO MAIN PROJECT
public class AliasDataParser {

    public static Map<String, Object> parse(DataTable dataTable, BaseCucumberContext context) {

        Map<String, String> source = dataTable.asMap(String.class, String.class);
        Map<String, Object> target = new HashMap<>();

        for (Map.Entry<String, String> entrySet : source.entrySet()) {

            AbstractMap.SimpleEntry<String, String> pairSourceValue = parseRawValue(entrySet.getValue());

            if (pairSourceValue != null) {
                target.put(entrySet.getKey(), getValue(pairSourceValue.getKey(), pairSourceValue.getValue(), context));
            } else {
                target.put(entrySet.getKey(), entrySet.getValue());
            }
        }
        return target;
    }

    private static AbstractMap.SimpleEntry parseRawValue(String rawValue) {
        boolean separator = rawValue.contains(".");
        String parsedSource = separator ? rawValue.substring(0, rawValue.indexOf(".")) : rawValue;
        List<String> supportedAlias = SupportedAliasEnum.getAsList();

        if (separator && supportedAlias.contains(parsedSource)) {
            String parsedValue = rawValue.substring(rawValue.indexOf(".") + 1);

            return new AbstractMap.SimpleEntry<>(parsedSource, parsedValue);
        }

        return null;
    }





    private static Object getValue(String source, String value, BaseCucumberContext context) {
        Object object = null;

        SupportedAliasEnum supportedAliasEnum = SupportedAliasEnum.fromValue(source);

        switch (supportedAliasEnum) {

            case RANDOM:
                String randomType = value;
                String randomTypeLength = "";

                if (value.contains("(") && value.contains(")")) {
                    randomTypeLength = value.substring(value.indexOf("(") + 1, value.indexOf(")"));
                    randomType = value.substring(0, value.indexOf("("));
                }

                switch (randomType) {
                    case "alphaNumeric":
                        int lengthRandom = Integer.parseInt(randomTypeLength);
                        object = Utilities.getRandomAlphanumericString(lengthRandom);
                        break;
                    case "doubleInRange":
                        final String[] doubleRangeValues = randomTypeLength.split(",");
                        int doubleMin = Integer.parseInt(doubleRangeValues[0]);
                        int doubleMax = Integer.parseInt(doubleRangeValues[1]);

                        object = Utilities.getRandomDoubleInRange(doubleMin, doubleMax);
                        break;
                    case "intInRange":
                        final String[] intValues = randomTypeLength.split(",");
                        int intMin = Integer.parseInt(intValues[0]);
                        int intMax = Integer.parseInt(intValues[1]);

                        object = Utilities.getRandomIntInRange(intMin, intMax);
                        break;
                    case "uuid":
                        object = UUID.randomUUID().toString();
                        break;
                    default:
                        throw new RuntimeException("Unexpected randomType '" + randomType);
                }
                break;

            default:
                object = value;
        }

        return object;
    }



}

