package cucumber.api.tests.test.paymentpanel.common.supplier.html;

import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import cucumber.api.tests.common.predicates.GenericPredicates;
import cucumber.api.tests.data.dto.merchantdemo.MerchantCreateSignatureDTO;
import cucumber.api.tests.data.dto.paymentpanel.PaymentPanelSelectBankDTO;

import java.util.HashMap;

public class PaymentPanelSelectBankQueryParamSupplier {


    public static HashMap<QueryParametersEnum, String> getLoginMultiValueMapForHttpRequest(
            MerchantCreateSignatureDTO merchantCreateSignatureDTO,
            PaymentPanelSelectBankDTO paymentPanelSelectBankDTO) {

        HashMap<QueryParametersEnum, String> map = new HashMap<>();

        map = (addMapEntryIfNecessary(paymentPanelSelectBankDTO.getPpTransactionId(), paymentPanelSelectBankDTO.getPpTransactionIdKey(), map));
        map = (addMapEntryIfNecessary(paymentPanelSelectBankDTO.getOrderId(), paymentPanelSelectBankDTO.getOrderIdKey(), map));
        map = (addMapEntryIfNecessary(paymentPanelSelectBankDTO.getShowManualEntryReason(), paymentPanelSelectBankDTO.getShowManualEntryReasonKey(), map));
        map = (addMapEntryIfNecessary(paymentPanelSelectBankDTO.getLt(), paymentPanelSelectBankDTO.getLtKey(), map));
        map = (addMapEntryIfNecessary(paymentPanelSelectBankDTO.getTransactionId(), paymentPanelSelectBankDTO.getTransactionIdKey(), map));

        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getPaymentProviderId(), paymentPanelSelectBankDTO.getPaymentProviderIdKey(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getMerchantId(), paymentPanelSelectBankDTO.getMerchantIdKey(), map));

        return map;

    }

    private static HashMap<QueryParametersEnum, String> addMapEntryIfNecessary(Object object, QueryParametersEnum key, HashMap<QueryParametersEnum, String> map) {

        if (GenericPredicates.checkIfNullOrEmpty.negate().test(object)) {
            map.put(key, object.toString());
        }

        return map;

    }


}
