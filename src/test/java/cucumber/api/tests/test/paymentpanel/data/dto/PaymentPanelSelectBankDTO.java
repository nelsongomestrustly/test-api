package cucumber.api.tests.test.paymentpanel.data.dto;

import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * {
 *
 *   "ppTransactionId": "ptx-33KNrsBjO7bLgZjNKz5WjeGj-NAG",
 *   "merchantId": "110005514",
 *   "orderId": "",
 *   "showManualEntryReason": "",
 *   "lt": "",
 *   "lang": "en",
 *   "paymentProviderId": "200005501",
 *   "transactionId": "1001154801",
 *
 * }
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PaymentPanelSelectBankDTO {

    private String ppTransactionId;
    private QueryParametersEnum ppTransactionIdKey = QueryParametersEnum.PP_TRANSACTION_ID;

    private String merchantId;
    private QueryParametersEnum merchantIdKey = QueryParametersEnum.MERCHANT_ID;

    private String orderId;
    private QueryParametersEnum orderIdKey = QueryParametersEnum.ORDER_ID;

    private String showManualEntryReason;
    private QueryParametersEnum showManualEntryReasonKey = QueryParametersEnum.SHOW_MANUAL_ENTRY_REASON;

    private String lt;
    private QueryParametersEnum ltKey = QueryParametersEnum.LT;

    private String lang;
    private QueryParametersEnum langKey = QueryParametersEnum.LANG;

    private String paymentProviderId;
    private QueryParametersEnum paymentProviderIdKey = QueryParametersEnum.PAYMENT_PROVIDER_ID;

    private String transactionId;
    private QueryParametersEnum transactionIdKey = QueryParametersEnum.TRANSACTION_ID;


}
