package cucumber.api.tests.test.bankpanel.common.suppliers;

import cucumber.api.tests.common.enums.PaymentProviderEnum;
import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import cucumber.api.tests.common.predicates.GenericPredicates;
import cucumber.api.tests.data.context.MyTestContext;
import cucumber.api.tests.data.dto.bankpanel.login.BankPanelLoginInfoDTO;
import cucumber.api.tests.data.dto.frontend.FrontEndSetupDTO;
import cucumber.api.tests.data.dto.frontend.FrontEndSetupTransactionDTO;
import cucumber.api.tests.data.dto.merchantdemo.MerchantCreateSignatureDTO;

import java.util.HashMap;

import static cucumber.api.tests.common.suppliers.QueryParamSuppliers.addMapEntryIfNecessary;

public class BankPanelLoginAccountsSupplier {

    //Accept: application/json; app=react
    public static HashMap<QueryParametersEnum, String> getLoginMultiValueMapForHttpRequest(
            String username,
            String password,
            BankPanelLoginInfoDTO bankPanelLoginInfoDTO,
            FrontEndSetupDTO frontEndSetupDTO) {

        HashMap<QueryParametersEnum, String> map = new HashMap<>();

        //From FrontEndSetupTransactionDTO
        map = (addMapEntryIfNecessary(frontEndSetupDTO.getTransaction().getSupportedLanguages().getEn(), frontEndSetupDTO.getTransaction().getSupportedLanguages().getEnKey(), map));
        map = (addMapEntryIfNecessary(frontEndSetupDTO.getTransaction().getPpId(), frontEndSetupDTO.getTransaction().getPpIdKey(), map));
        map = (addMapEntryIfNecessary(frontEndSetupDTO.getTransaction().getBankId(), QueryParametersEnum.FI_CODE, map));
        map = (addMapEntryIfNecessary(frontEndSetupDTO.getTransaction().getToken(), QueryParametersEnum.LT, map));
        map = (addMapEntryIfNecessary(frontEndSetupDTO.getTransaction().getPaymentType().getValue(), frontEndSetupDTO.getTransaction().getPaymentTypeKey(), map));

        //FROM Bank BankPanelLoginInfoDTO
        map = (addMapEntryIfNecessary(bankPanelLoginInfoDTO.getTransaction().getState().replace(" ", ""), bankPanelLoginInfoDTO.getTransaction().getStateKey(), map));

        //ACCESS Details
        map = (addMapEntryIfNecessary(username, QueryParametersEnum.USERNAME, map));
        map = (addMapEntryIfNecessary(password, QueryParametersEnum.PASSWORD, map));
        map = (addMapEntryIfNecessary(username, QueryParametersEnum.PROMPT_USERNAME, map));
        map = (addMapEntryIfNecessary(password, QueryParametersEnum.PROMPT_PASSWORD, map));

        //Defaults TODO CHANGE IN THE FUTURE
        map = (addMapEntryIfNecessary("0", QueryParametersEnum.LOGIN_ERROR_COUNT, map));
        map = (addMapEntryIfNecessary("false", QueryParametersEnum.FORGOT_MY_PASSWORD_CUSTOM_ERROR, map));
        map = (addMapEntryIfNecessary("0", QueryParametersEnum.GR, map));
        map = (addMapEntryIfNecessary("WEST", QueryParametersEnum.TIMEZONE_ABBR, map));
        map = (addMapEntryIfNecessary("60", QueryParametersEnum.TIMEZONE_OFFSET, map));

        return map;

    }


    /**
     *
     * lang: en ----> language frontend
     *
     * ppTransactionId: ptx-c_cwX_XT_nuqMSIODcWBPB5C-NAG ----> ppId frontendsetup
     *
     * state: gA/zaqeEKv8IA191f+WJr8v9P2oAmH0ZPMlGzRI5EGTVsWDR9djyjAfiRmxZ7FMlCA+mS0xuWQuj1zzBWO6VNxkfjmj+UY2sn+QVAUf48+c3zdJYorna8+vOwK6jTncO8t78LZ5aq5oyi8W/nuQapJF6+XTt8K3usdci49SLj4uTeM3fQ7ais23fESag/wmW8myXGlNKdJL1d099VbHqnsGt6rDRR+tNG2rjcjuvkniS/gm39m49xcog4TWfgO4Rk4NnFEABYYRCDyc78+34GkQ2yNVh0W/8srbgkQ65oHGKuo+AczX4twjEsWkQKznYbxFAicX8/2CzBR2nUvwa6VK5TXkocCsSv4LgUeTc3kFE9tBfSOOR74vxBMu69ybYY2V5wHEs68a29oVzCVO1Uju0KOU3J1FlrGEiLuape8p1HgKx+V2UCdeE055YY3MHI+yu4veTxC3sHGrFxSr5VetpQJJw8ry+O78WVLgCwy2/FDCvJy6xawdAGekbnvCSK1aU6QGgd3gPwtkER6/bSnZvur4DwEnwaRRYcgT4JT7qYa7aN8MShXKX0XZQ83m7v5Z/VuyQb0RAR1Gn2RkcpC3zWuAvKVFCDk3kRvIKAm/tTqOG6+KtZN2njLQestIU9ZnVWVgMMdf/l6/en7bhPzYDOn5j5Qimtq3sa2VhS4QuucVs9nB90UUVrBpkfZX2DPp/t4/LY1zVOW6SS9tUK/cFEsB/krlTjpfTt0KxpBj3bAlM7Q32bWukhLlypgFJsv1uT1MLIapLIy8Jd7DUBubB/OG/GL0THbcoeit5RVU=
     * ----> bankPanelLoginInfoDTO state
     *
     * loginErrorCount: 0 ---> always 0
     *
     * principalName: ""
     *
     * principalSignature: ""
     *
     * fiCode: 200005501 ------> bankId: "200005501" frontendsetup
     *
     * forgotMyPasswordCustomError: "false"
     *
     * prompt-username: 222
     *
     * prompt-password: 222
     *
     * gr: "0"
     *
     * username: 222
     *
     * password: 222
     *
     * timezoneAbbr: "WEST"
     *
     * timezoneOffset: "60"
     *
     * lt: 18wL6R5eb/CzO+u7vwu/4A==:initial_load:/establish:1630943778203:1630943779479
     * Token : Front End Setup - token: "18wL6R5eb/CzO+u7vwu/4A==
     *
     */



}
