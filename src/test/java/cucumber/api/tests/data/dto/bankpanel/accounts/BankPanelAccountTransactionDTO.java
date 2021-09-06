package cucumber.api.tests.data.dto.bankpanel.accounts;

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
public class BankPanelAccountTransactionDTO {

    private String authorizationTextToken;
    private QueryParametersEnum authorizationTextTokenKey = QueryParametersEnum.AUTHORIZATION_TEST_TOKEN;

    private String principalName;
    private QueryParametersEnum principalNameKey = QueryParametersEnum.SUPPORTED;

    private String principalSignature;
    private QueryParametersEnum principalSignatureKey = QueryParametersEnum.SUPPORTED;

    private String state;
    private QueryParametersEnum stateKey = QueryParametersEnum.SUPPORTED;

    private String authorizationText;
    private QueryParametersEnum authorizationTextKey = QueryParametersEnum.SUPPORTED;

    private String authorizationTimestamp;
    private QueryParametersEnum authorizationTimestampKey = QueryParametersEnum.SUPPORTED;

    private String ppId;
    private QueryParametersEnum ppIdKey = QueryParametersEnum.SUPPORTED;

}
