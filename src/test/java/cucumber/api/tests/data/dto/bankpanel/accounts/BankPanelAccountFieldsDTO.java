package cucumber.api.tests.data.dto.bankpanel.accounts;

import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BankPanelAccountFieldsDTO {

    private String number;
    private QueryParametersEnum numberKey  = QueryParametersEnum.NUMBER;

    private boolean hasFunds;
    private QueryParametersEnum hasFundsKey = QueryParametersEnum.HAS_FUNDS;

    private String iban;
    private QueryParametersEnum ibanKey = QueryParametersEnum.IBAN;

    private String name;
    private QueryParametersEnum nameKey = QueryParametersEnum.NAME;

    private int index;
    private QueryParametersEnum indexKey = QueryParametersEnum.INDEX;

    private boolean supported;
    private QueryParametersEnum supportedKey = QueryParametersEnum.SUPPORTED;


}
