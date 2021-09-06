package cucumber.api.tests.data.dto.bankpanel.login;

import com.fasterxml.jackson.annotation.JsonIgnore;
import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * {
 *     "accessId": "A48B73F694C4C8EE6306",
 *     "name": "Globex (demo)",
 *     "id": "110005514",
 *     "logoUrl": "{0}/images/tp/m/globex.png"
 * }
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BankPanelLoginInfoDTO {

    //Strings

    private String stepId;
    private QueryParametersEnum stepIdKey = QueryParametersEnum.STEP_ID;

    private String errorMessage;
    private QueryParametersEnum errorMessageKey = QueryParametersEnum.ERROR_MESSAGE;

    //Other Lists Objects

    private List<BankPanelLoginAuthFieldsDTO> authFields;
    private QueryParametersEnum authFieldsKey = QueryParametersEnum.AUTH_FIELDS;

    //Other Objects

    @JsonIgnore
    private BankPanelLoginBankDictionaryDTO bankDictionary;
    private QueryParametersEnum bankDictionaryKey = QueryParametersEnum.BANK_DICTIONARY;

    private BankPanelLoginPageDTO page;
    private QueryParametersEnum pageKey = QueryParametersEnum.PAGE;

    private BankPanelLoginTransactionDTO transaction;
    private QueryParametersEnum transactionKey = QueryParametersEnum.TRANSACTION;


}
