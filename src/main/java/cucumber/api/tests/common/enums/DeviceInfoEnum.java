package cucumber.api.tests.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DeviceInfoEnum {

    DESKTOP_WEB("desktop", "macintel", "web");

    private final String deviceCategory;
    private final String deviceOs;
    private final String deviceType;

}
