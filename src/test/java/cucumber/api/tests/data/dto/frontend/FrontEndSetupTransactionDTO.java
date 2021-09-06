package cucumber.api.tests.data.dto.frontend;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import cucumber.api.tests.common.enums.PaymentTypeEnum;
import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FrontEndSetupTransactionDTO {

    private String id;
    private QueryParametersEnum idKey = QueryParametersEnum.TRANSACTION_ID;

    private String ppId;
    private QueryParametersEnum ppIdKey = QueryParametersEnum.PP_TRANSACTION_ID;

    private String country;
    private QueryParametersEnum countryKey = QueryParametersEnum.COUNTRY;

    private String amount;
    private QueryParametersEnum amountKey = QueryParametersEnum.AMOUNT;

    private boolean generateFp;
    private QueryParametersEnum generateFpKey = QueryParametersEnum.GENERATE_FP;

    private String language;
    private QueryParametersEnum languageKey = QueryParametersEnum.LANGUAGE;

    private boolean widgetEnabled;
    private QueryParametersEnum widgetEnabledKey = QueryParametersEnum.WIDGET_ENABLED;

    private String type;
    private QueryParametersEnum typeKey = QueryParametersEnum.TYPE;

    private String token;
    private QueryParametersEnum tokenKey = QueryParametersEnum.TOKEN;

    private PaymentTypeEnum paymentType;
    private QueryParametersEnum paymentTypeKey = QueryParametersEnum.PAYMENT_TYPE;

    private int loginErrorCount;
    private QueryParametersEnum loginErrorCountKey = QueryParametersEnum.LOGIN_ERROR_COUNT;

    private String reference;
    private QueryParametersEnum referenceKey = QueryParametersEnum.REFERER;

    private boolean accountTypeRequiredMec;
    private QueryParametersEnum accountTypeRequiredMecKey = QueryParametersEnum.ACCOUNT_TYPE_REQUIRE_MAC;

    private String bankId;
    private QueryParametersEnum bankIdKey = QueryParametersEnum.BANK_ID;

    private String institutionName;
    private QueryParametersEnum institutionNameKey = QueryParametersEnum.INSTITUTION_NAME;

    private String currency;
    private QueryParametersEnum currencyKey = QueryParametersEnum.CURRENCY;

    private String fpd;
    private QueryParametersEnum fpdKey = QueryParametersEnum.FPD;

    private boolean blockMecExistingFic;
    private QueryParametersEnum blockMecExistingFicKey = QueryParametersEnum.BLOCK_MEC_EXISTING_FIC;

    @JsonProperty(namespace = "isPSD2")
    private boolean isPSD2;
    private QueryParametersEnum isPSD2Key = QueryParametersEnum.IS_PSF2;

    private String paymentFlow;
    private QueryParametersEnum paymentFlowKey = QueryParametersEnum.PAYMENT_FLOW;

    @JsonIgnore
    private String supportedLanguages;
    @JsonIgnore
    private String permissions;
    @JsonIgnore
    private String events;
    @JsonIgnore
    private String customer;

    public void setPaymentType(String paymentType) {
        this.paymentType = PaymentTypeEnum.fromValue(paymentType);
    }


}
