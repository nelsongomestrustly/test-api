package cucumber.api.tests.common.enums.device;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DeviceCategoryEnum {

    DESKTOP("desktop");

    private final String name;

    public static DeviceCategoryEnum fromName(String name) {
        for (DeviceCategoryEnum b : DeviceCategoryEnum.values()) {
            if (b.name.equalsIgnoreCase(name)) {
                return b;
            }
        }

        return null;
    }

}
