package cucumber.api.tests.common.suppliers;

import cucumber.api.tests.common.enums.device.DeviceCategoryEnum;
import cucumber.api.tests.common.enums.device.DeviceOsEnum;
import cucumber.api.tests.common.enums.device.DeviceTypeEnum;

import java.text.MessageFormat;
import java.util.UUID;
import java.util.function.Supplier;

public class MerchantSupplier {

    public static Supplier<String> getMerchantReference = () -> UUID.randomUUID().toString();


    public static Supplier<String> getMerchantDeviceType = () -> DeviceCategoryEnum.DESKTOP.getName() + ":" + DeviceOsEnum.MAC_INTEL + ":" + DeviceTypeEnum.WEB.getName();


}
