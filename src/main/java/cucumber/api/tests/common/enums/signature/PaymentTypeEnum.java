package cucumber.api.tests.common.enums.signature;

import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

import static cucumber.api.tests.common.enums.queries.QueryParametersEnum.PAYMENT_TYPE;

@AllArgsConstructor
@Getter
public enum PaymentTypeEnum {

    INSTANT(PAYMENT_TYPE, "Instant"),
    DEFERRED(PAYMENT_TYPE, "Deferred"),
    RETRIEVAL(PAYMENT_TYPE, "Retrieval"),
    DISBURSEMENT(PAYMENT_TYPE, "Disbursement"),
    RECURRING(PAYMENT_TYPE, "Recurring");

    private final QueryParametersEnum key;
    private final String value;

    public static PaymentTypeEnum fromValue(String value) {
        for (PaymentTypeEnum b : PaymentTypeEnum.values()) {
            if (b.getValue().equalsIgnoreCase(value)) {
                return b;
            }
        }
        return null;
    }


}
