package cucumber.api.tests.common.security;

import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;

@Slf4j
public class TokenUtils {

    private String getLoginMerchantDemoToken(
            String merchantId,
            String transactionId) {

        HashMap<String, Object> parameters = new HashMap<>();
        parameters.put(QueryParametersEnum.CREATE_AT.getKeyName(), String.valueOf(System.currentTimeMillis()));
        parameters.put(QueryParametersEnum.MERCHANT_ID.getKeyName(), merchantId);
        parameters.put(QueryParametersEnum.TRANSACTION_ID.getKeyName(), transactionId);

        //String token = SecureJson.encrypt(parameters);

        //log.info ("Login Merchant Demo Token : " + token);

        return null;

    }


}
