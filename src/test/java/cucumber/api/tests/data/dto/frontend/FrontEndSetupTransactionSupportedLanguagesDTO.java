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
public class FrontEndSetupTransactionSupportedLanguagesDTO {

    private String en;
    private QueryParametersEnum enKey = QueryParametersEnum.EN;

}
