package cucumber.api.tests.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DeviceTypeEnum {

    WEB("web");

    private final String name;

    public static DeviceTypeEnum fromName(String name) {
        for (DeviceTypeEnum b : DeviceTypeEnum.values()) {
            if (b.name.equalsIgnoreCase(name)) {
                return b;
            }
        }

        return null;
    }

}
