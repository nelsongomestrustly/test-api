package cucumber.api.tests.common.enums.signature;

import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.common.enums.queries.QueryParametersEnum.CUSTOMER_COUNTRY_NAME_PARAM;


@AllArgsConstructor
@Getter
public enum CountryEnum {

    CA(CUSTOMER_COUNTRY_NAME_PARAM, "CA"),
    US(CUSTOMER_COUNTRY_NAME_PARAM, "US"),
    DE(CUSTOMER_COUNTRY_NAME_PARAM, "DE"),
    AU(CUSTOMER_COUNTRY_NAME_PARAM, "AU"),
    CZ(CUSTOMER_COUNTRY_NAME_PARAM, "CZ"),
    EE(CUSTOMER_COUNTRY_NAME_PARAM, "DK"),
    HU(CUSTOMER_COUNTRY_NAME_PARAM, "HU"),
    NO(CUSTOMER_COUNTRY_NAME_PARAM, "NO"),
    PT(CUSTOMER_COUNTRY_NAME_PARAM, "PT"),
    SE(CUSTOMER_COUNTRY_NAME_PARAM, "SE"),
    FR(CUSTOMER_COUNTRY_NAME_PARAM, "FR"),
    IT(CUSTOMER_COUNTRY_NAME_PARAM, "IT"),
    ES(CUSTOMER_COUNTRY_NAME_PARAM, "ES"),
    IE(CUSTOMER_COUNTRY_NAME_PARAM, "IE"),
    GB(CUSTOMER_COUNTRY_NAME_PARAM, "GB");

    private final QueryParametersEnum key;
    private final String value;

    public static CountryEnum fromValue(String value) {
        for (CountryEnum b : CountryEnum.values()) {
            if (b.getValue().equalsIgnoreCase(value)) {
                return b;
            }
        }
        return null;
    }


}
