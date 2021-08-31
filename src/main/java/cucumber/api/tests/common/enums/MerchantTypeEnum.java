package cucumber.api.tests.common.enums;

import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum MerchantTypeEnum {

    GLOBEX_DEMO(QueryParametersEnum.TYPE, "12");

    private final QueryParametersEnum key;
    private final String type;

    public static MerchantTypeEnum fromTypeId(String typeId) {
        for (MerchantTypeEnum b : MerchantTypeEnum.values()) {
            if (b.type.equalsIgnoreCase(typeId)) {
                return b;
            }
        }

        return null;
    }

}
