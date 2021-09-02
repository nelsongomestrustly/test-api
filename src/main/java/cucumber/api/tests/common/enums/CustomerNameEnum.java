package cucumber.api.tests.common.enums;

import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.common.enums.queries.QueryParametersEnum.CUSTOMER_NAME_PARAM;

@AllArgsConstructor
@Getter
public enum CustomerNameEnum {

    JOHN_SMITH(CUSTOMER_NAME_PARAM, "John Smith"),
    ALANIS_JOHNSON(CUSTOMER_NAME_PARAM, "Alanis Johnson"),
    FREDDIE_MERCURY(CUSTOMER_NAME_PARAM, "Freddie Mercury");

    private final QueryParametersEnum key;
    private final String value;

    public static CustomerNameEnum fromValue(String value) {
        for (CustomerNameEnum b : CustomerNameEnum.values()) {
            if (b.getValue().equalsIgnoreCase(value)) {
                return b;
            }
        }
        return null;
    }


}
