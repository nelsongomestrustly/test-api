package cucumber.api.tests.support.cucumber.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DataTableHttpStatusEnum {

    HTTP_EXPECT_STATUS("expectHttpStatus"),

    HTTP_STATUS_NOT_LOGGED("httpStatusNotLogged"),
    HTTP_STATUS_LOG_IN("httpStatusLogin"),
    HTTP_STATUS_LOGGED("httpStatusLogged"),
    HTTP_STATUS_LOG_OUT("httpStatusLogOut"),

    HTTP_EXPECT_MERCHANT_DEMO_STATUS("expectMerchantDemoHttpStatus"),
    HTTP_EXPECT_MERCHANT_INFO_STATUS("expectMerchantInfoHttpStatus"),
    HTTP_EXPECT_PAYMENT_FLOWS_STATUS("expectPaymentFlowsHttpStatus");

    private final String httpStatus;

}