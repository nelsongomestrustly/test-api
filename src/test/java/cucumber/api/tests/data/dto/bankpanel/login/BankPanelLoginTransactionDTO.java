package cucumber.api.tests.data.dto.bankpanel.login;

import com.fasterxml.jackson.annotation.JsonIgnore;
import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BankPanelLoginTransactionDTO {

    private String currentPpId;
    private QueryParametersEnum currentPpIdKey = QueryParametersEnum.CURRENT_PP_ID;

    private String institutionForegroundColor;
    private QueryParametersEnum institutionForegroundColorKey = QueryParametersEnum.INSTITUTION_FOREGROUND_COLOR;

    private String resetPasswordUrl;
    private QueryParametersEnum resetPasswordUrlKey = QueryParametersEnum.RESET_PASSWORD_URL;

    private String ppId;
    private QueryParametersEnum ppIdKey = QueryParametersEnum.PP_ID;

    private String institutionLogoUrl;
    private QueryParametersEnum institutionLogoUrlKey = QueryParametersEnum.INSTITUTION_LOGO_URL;

    private String bankId;
    private QueryParametersEnum bankIdKey = QueryParametersEnum.BANK_ID;

    private String originalTransactionId;
    private QueryParametersEnum originalTransactionIdKey = QueryParametersEnum.ORIGINAL_TRANSACTION_ID;

    private String institutionName;
    private QueryParametersEnum institutionNameKey = QueryParametersEnum.INSTITUTION_NAME;

    private String institutionShortName;
    private QueryParametersEnum institutionShortNameKey = QueryParametersEnum.INSTITUTION_SHORT_NAME;

    private boolean hasBusinessAccountSupport;
    private QueryParametersEnum hasBusinessAccountSupportKey = QueryParametersEnum.HAS_BUSINESS_ACCOUNT_SUPPORT;

    private String state;
    private QueryParametersEnum stateKey = QueryParametersEnum.STATE;

    private boolean allowResetPasswordButton;
    private QueryParametersEnum allowResetPasswordButtonKey = QueryParametersEnum.ALLOW_RESET_PASSWORD_BUTTON;

    private String mobileResetPasswordUrl;
    private QueryParametersEnum mobileResetPasswordUrlKey = QueryParametersEnum.MOBILE_RESET_PASSWORD_URL;

    private String institutionColor;
    private QueryParametersEnum institutionColorKey = QueryParametersEnum.INSTITUTION_COLOR;

    private String institutionIconUrl;
    private QueryParametersEnum institutionIconUrlKey = QueryParametersEnum.INSTITUTION_ICON_URL;

    @JsonIgnore
    private String teleCheck;
    private QueryParametersEnum teleCheckKey = QueryParametersEnum.TELE_CHECK;

}
