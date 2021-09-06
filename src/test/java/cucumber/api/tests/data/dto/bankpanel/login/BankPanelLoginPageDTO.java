package cucumber.api.tests.data.dto.bankpanel.login;

import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BankPanelLoginPageDTO {

    private boolean mfa;
    private QueryParametersEnum mfaKey = QueryParametersEnum.MFA;

}
