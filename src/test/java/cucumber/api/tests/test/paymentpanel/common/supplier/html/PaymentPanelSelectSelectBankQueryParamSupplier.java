package cucumber.api.tests.test.paymentpanel.common.supplier.html;

import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import cucumber.api.tests.common.predicates.GenericPredicates;
import cucumber.api.tests.data.dto.frontend.FrontEndSetupDTO;
import cucumber.api.tests.data.dto.merchantdemo.MerchantCreateSignatureDTO;
import cucumber.api.tests.data.dto.token.TokenDTO;

import java.util.HashMap;

import static cucumber.api.tests.common.suppliers.QueryParamSuppliers.addMapEntryIfNecessary;

public class PaymentPanelSelectSelectBankQueryParamSupplier {


    /**
     *
     * Payment Panel
     * SelectBankController
     * selectBank()
     *
     * Expect
     * "ppTransactionId" -> {String[1]@8024} ["ptx-Z2KgxR0sg9S..."]
     * "transactionId" -> {String[1]@8038} ["1001156981"]
     *
     * "merchantId" -> {String[1]@8026} ["110005514"]
     * "paymentProviderId" -> {String[1]@8036} ["200005501"]
     *
     * "lt" -> {String[1]@8032} [""]
     *
     * "orderId" -> {String[1]@8028} [""]
     * "showManualEntryReason" -> {String[1]@8030} [""]
     * "lang" -> {String[1]@8034} ["en"]
     *
     * paymentType = null
     * merchantReference = null
     * cancelUrl = null
     *
     *
     */
    public static HashMap<QueryParametersEnum, String> getLoginMultiValueMapForHttpRequest(
            MerchantCreateSignatureDTO merchantCreateSignatureDTO,
            FrontEndSetupDTO frontEndSetupDTO,
            TokenDTO tokenDTO) {

        HashMap<QueryParametersEnum, String> map = new HashMap<>();

        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getMerchantId(), merchantCreateSignatureDTO.getMerchantIdKey(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getPaymentProviderId(), merchantCreateSignatureDTO.getPaymentProviderIdKey(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getMerchantReference(), merchantCreateSignatureDTO.getMerchantReferenceKey(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getCancelUrl(), merchantCreateSignatureDTO.getCancelUrlKey(), map));

        map = (addMapEntryIfNecessary(frontEndSetupDTO.getTransaction().getId(), frontEndSetupDTO.getTransaction().getIdKey(), map));
        map = (addMapEntryIfNecessary(frontEndSetupDTO.getTransaction().getPpId(), frontEndSetupDTO.getTransaction().getPpIdKey(), map));
        map = (addMapEntryIfNecessary(frontEndSetupDTO.getTransaction().getPaymentType().getValue(), frontEndSetupDTO.getTransaction().getPaymentTypeKey(), map));

        map = (addMapEntryIfNecessary(tokenDTO.getLt(), tokenDTO.getLtKey(), map));

        map = (addMapEntryIfNecessary("", QueryParametersEnum.ORDER_ID, map));
        map = (addMapEntryIfNecessary("", QueryParametersEnum.SHOW_MANUAL_ENTRY_REASON, map));
        map = (addMapEntryIfNecessary("en", QueryParametersEnum.LANG, map));

        return map;

    }



}
