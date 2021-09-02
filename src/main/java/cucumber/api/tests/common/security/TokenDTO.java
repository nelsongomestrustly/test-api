package cucumber.api.tests.common.security;

import cucumber.api.tests.common.enums.TokenEnv;
import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import cucumber.api.tests.common.suppliers.QueryParamSuppliers;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TokenDTO {

    private TokenEnv tokenEnv;

    private String token;
    private QueryParametersEnum tokenKey = QueryParametersEnum.TOKEN;

    private String http;
    private QueryParametersEnum httpKey = QueryParametersEnum.HTTP;

    private String cancelUrl;
    private QueryParametersEnum cancelUrlKey = QueryParametersEnum.CANCEL_URL;

    private String lt;
    private QueryParametersEnum ltKey = QueryParametersEnum.LT;

}
