package cucumber.api.tests.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DeviceOsEnum {

    MAC_INTEL("macintel");

    private final String name;

    public static DeviceOsEnum fromName(String name) {
        for (DeviceOsEnum b : DeviceOsEnum.values()) {
            if (b.name.equalsIgnoreCase(name)) {
                return b;
            }
        }

        return null;
    }

}
