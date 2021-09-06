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
public class BankPanelAccountPageDTO {

    private String finishButtonLabel;
    private QueryParametersEnum finishButtonLabelKey = QueryParametersEnum.FINISH_BUTTON_LABEL;

}
