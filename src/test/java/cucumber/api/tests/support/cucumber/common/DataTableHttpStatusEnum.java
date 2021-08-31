package cucumber.api.tests.support.cucumber.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DataTableHttpStatusEnum {

    HTTP_EXPECT_STATUS("expectHttpStatus"),

    HTTP_EXPECT_NOT_LOGGED_STATUS("httpStatusNotLogged"),
    HTTP_EXPECT_LOG_IN_STATUS("httpStatusLogin"),
    HTTP_EXPECT_LOGGED_STATUS("httpStatusLogged"),
    HTTP_EXPECT_LOG_OUT_STATUS("httpStatusLogOut"),

    HTTP_EXPECT_MERCHANT_DEMO_STATUS("expectMerchantDemoHttpStatus"),
    HTTP_EXPECT_MERCHANT_DEMO_CREATE_SIGNATURE_STATUS("expectMerchantDemoCreateSignatureHttpStatus"),

    HTTP_EXPECT_MERCHANT_INFO_STATUS("expectMerchantInfoHttpStatus"),

    HTTP_EXPECT_PAYMENT_FLOWS_STATUS("expectPaymentFlowsHttpStatus"),
    HTTP_EXPECT_PAYMENT_PANEL_STATUS("expectPaymentPanelHttpStatus");

    private final String httpStatus;

}