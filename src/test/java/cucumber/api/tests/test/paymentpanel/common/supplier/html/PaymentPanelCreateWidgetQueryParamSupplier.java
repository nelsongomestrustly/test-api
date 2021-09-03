package cucumber.api.tests.test.paymentpanel.common.supplier.html;

import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import cucumber.api.tests.common.predicates.GenericPredicates;
import cucumber.api.tests.test.paymentpanel.data.dto.PaymentPanelCreateWidgetDTO;

import java.util.HashMap;

public class PaymentPanelCreateWidgetQueryParamSupplier {


    public static HashMap<QueryParametersEnum, String> getLoginMultiValueMapForHttpRequest(PaymentPanelCreateWidgetDTO paymentPanelCreateWidgetDTO) {

        HashMap<QueryParametersEnum, String> map = new HashMap<>();

        map = (addMapEntryIfNecessary(paymentPanelCreateWidgetDTO.getAccessId(), paymentPanelCreateWidgetDTO.getAccessIdKey(), map));
        map = (addMapEntryIfNecessary(paymentPanelCreateWidgetDTO.getCid(), paymentPanelCreateWidgetDTO.getCidKey(), map));
        map = (addMapEntryIfNecessary(paymentPanelCreateWidgetDTO.getCustomerAddressCountry(), paymentPanelCreateWidgetDTO.getCustomerAddressCountryKey(), map));
        map = (addMapEntryIfNecessary(paymentPanelCreateWidgetDTO.getCustomerAddressState(), paymentPanelCreateWidgetDTO.getCustomerAddressStateKey(), map));
        map = (addMapEntryIfNecessary(paymentPanelCreateWidgetDTO.getCustomerExternalId(), paymentPanelCreateWidgetDTO.getCustomerExternalIdKey(), map));
        map = (addMapEntryIfNecessary(paymentPanelCreateWidgetDTO.getDeviceType(), paymentPanelCreateWidgetDTO.getDeviceTypeKey(), map));
        map = (addMapEntryIfNecessary(paymentPanelCreateWidgetDTO.getDynamicWidget(), paymentPanelCreateWidgetDTO.getDynamicWidgetKey(), map));
        map = (addMapEntryIfNecessary(paymentPanelCreateWidgetDTO.getFpd(), paymentPanelCreateWidgetDTO.getFpdKey(), map));
        map = (addMapEntryIfNecessary(paymentPanelCreateWidgetDTO.getGrp(), paymentPanelCreateWidgetDTO.getGrpKey(), map));
        map = (addMapEntryIfNecessary(paymentPanelCreateWidgetDTO.getLang(), paymentPanelCreateWidgetDTO.getLangKey(), map));
        map = (addMapEntryIfNecessary(paymentPanelCreateWidgetDTO.getLastUsed(), paymentPanelCreateWidgetDTO.getLastUsedKey(), map));
        map = (addMapEntryIfNecessary(paymentPanelCreateWidgetDTO.getMerchantId(), paymentPanelCreateWidgetDTO.getMerchantIdKey(), map));
        map = (addMapEntryIfNecessary(paymentPanelCreateWidgetDTO.getMerchantReference(), paymentPanelCreateWidgetDTO.getMerchantReferenceKey(), map));
        map = (addMapEntryIfNecessary(paymentPanelCreateWidgetDTO.getPaymentType(), paymentPanelCreateWidgetDTO.getPaymentTypeKey(), map));
        map = (addMapEntryIfNecessary(paymentPanelCreateWidgetDTO.getStorage(), paymentPanelCreateWidgetDTO.getStorageKey(), map));
        map = (addMapEntryIfNecessary(paymentPanelCreateWidgetDTO.getV(), paymentPanelCreateWidgetDTO.getVKey(), map));


        return map;

    }

    private static HashMap<QueryParametersEnum, String> addMapEntryIfNecessary(Object object, QueryParametersEnum key, HashMap<QueryParametersEnum, String> map) {

        if (GenericPredicates.checkIfNullOrEmpty.negate().test(object)) {
            map.put(key, object.toString());
        }

        return map;

    }


}
