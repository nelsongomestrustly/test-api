package cucumber.api.tests.common.enums;

import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PaymentProviderEnum {

    DEMO_BANK(QueryParametersEnum.PAYMENT_PROVIDER_ID, "200005501"),
    CHASE_BANK(QueryParametersEnum.PAYMENT_PROVIDER_ID, "102001017");

    private final QueryParametersEnum key;
    private final String id;

    public static PaymentProviderEnum fromTypeId(String id) {
        for (PaymentProviderEnum b : PaymentProviderEnum.values()) {
            if (b.id.equalsIgnoreCase(id)) {
                return b;
            }
        }

        return null;
    }

}
