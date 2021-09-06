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
public class BankPanelLoginAuthFieldsDTO {

    private String name;
    private QueryParametersEnum nameKey = QueryParametersEnum.NAME;

    private String options;
    private QueryParametersEnum optionsKey = QueryParametersEnum.OPTIONS;

    private String label;
    private QueryParametersEnum labelKey = QueryParametersEnum.LABEL;

    private String fieldType;
    private QueryParametersEnum fieldTypeKey = QueryParametersEnum.FIELD_TYPE;

    private String value;
    private QueryParametersEnum valueKey = QueryParametersEnum.VALUE;

}
