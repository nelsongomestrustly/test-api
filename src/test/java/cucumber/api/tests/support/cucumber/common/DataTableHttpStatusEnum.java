package cucumber.api.tests.support.cucumber.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DataTableHttpStatusEnum {

    HTTP_EXPECT_ADM_CONSOLE_SEARCH_TRANSACTIONS_STATUS("httpStaAdmConSeaTra"),

    HTTP_EXPECT_NOT_LOGGED_STATUS("httpStaNotLogged"),
    HTTP_EXPECT_LOG_IN_STATUS("httpStaLogin"),
    HTTP_EXPECT_LOGGED_STATUS("httpStaLogout"),
    HTTP_EXPECT_LOG_OUT_STATUS("httpStaLogOut"),

    HTTP_EXPECT_MERCHANT_DEMO_STATUS("merDemHttpSta"),
    HTTP_EXPECT_MERCHANT_DEMO_CREATE_SIGNATURE_STATUS("expectMerchantDemoCreateSignatureHttpStatus"),

    HTTP_EXPECT_MERCHANT_INFO_STATUS("expectMerchantInfoHttpStatus"),

    HTTP_EXPECT_PAYMENT_FLOWS_STATUS("expectPaymentFlowsHttpStatus"),
    HTTP_EXPECT_PAYMENT_PANEL_STATUS("expectPaymentPanelHttpStatus");

    private final String httpStatus;

}