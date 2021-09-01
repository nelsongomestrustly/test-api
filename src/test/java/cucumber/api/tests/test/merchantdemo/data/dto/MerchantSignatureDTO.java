package cucumber.api.tests.test.merchantdemo.data.dto;

import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
public class MerchantSignatureDTO {

    private String signature;
    private QueryParametersEnum requestSignatureKey = QueryParametersEnum.REQUEST_SIGNATURE;

}
