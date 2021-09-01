package cucumber.api.tests.common.enums.signature;

import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.common.enums.queries.QueryParametersEnum.CUSTOMER_ADDRESS_COUNTRY_PARAM;


@AllArgsConstructor
@Getter
public enum CountryEnum {

    CA(CUSTOMER_ADDRESS_COUNTRY_PARAM, "CA"),
    US(CUSTOMER_ADDRESS_COUNTRY_PARAM, "US"),
    DE(CUSTOMER_ADDRESS_COUNTRY_PARAM, "DE"),
    AU(CUSTOMER_ADDRESS_COUNTRY_PARAM, "AU"),
    CZ(CUSTOMER_ADDRESS_COUNTRY_PARAM, "CZ"),
    EE(CUSTOMER_ADDRESS_COUNTRY_PARAM, "DK"),
    HU(CUSTOMER_ADDRESS_COUNTRY_PARAM, "HU"),
    NO(CUSTOMER_ADDRESS_COUNTRY_PARAM, "NO"),
    PT(CUSTOMER_ADDRESS_COUNTRY_PARAM, "PT"),
    SE(CUSTOMER_ADDRESS_COUNTRY_PARAM, "SE"),
    FR(CUSTOMER_ADDRESS_COUNTRY_PARAM, "FR"),
    IT(CUSTOMER_ADDRESS_COUNTRY_PARAM, "IT"),
    ES(CUSTOMER_ADDRESS_COUNTRY_PARAM, "ES"),
    IE(CUSTOMER_ADDRESS_COUNTRY_PARAM, "IE"),
    GB(CUSTOMER_ADDRESS_COUNTRY_PARAM, "GB");

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
