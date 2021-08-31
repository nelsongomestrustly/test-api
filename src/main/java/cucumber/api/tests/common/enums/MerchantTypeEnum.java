package cucumber.api.tests.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum MerchantTypeEnum {

    GLOBEX_DEMO("type", "12");

    private final String typeKey;
    private final String type;

    public static MerchantTypeEnum fromTypeId(String fileName) {
        for (MerchantTypeEnum b : MerchantTypeEnum.values()) {
            if (b.type.equalsIgnoreCase(fileName)) {
                return b;
            }
        }

        return null;
    }

}
