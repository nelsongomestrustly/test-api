package cucumber.api.tests.test.paymentpanel.common.supplier.html;

import cucumber.api.tests.common.enums.PaymentProviderEnum;
import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import cucumber.api.tests.common.predicates.GenericPredicates;
import cucumber.api.tests.data.context.MyTestContext;
import cucumber.api.tests.data.dto.merchantdemo.MerchantCreateSignatureDTO;
import cucumber.api.tests.data.dto.paymentpanel.PaymentPanelCreateWidgetDTO;

import java.util.HashMap;

import static cucumber.api.tests.common.suppliers.QueryParamSuppliers.addMapEntryIfNecessary;

public class PaymentPanelGetPaymentPanelSupplier {




    public static HashMap<QueryParametersEnum, String> getMultiValueMapForHttpRequest(
            PaymentPanelCreateWidgetDTO firstPaymentPanelCreateWidgetDTO,
            MerchantCreateSignatureDTO merchantCreateSignatureDTO) {

        HashMap<QueryParametersEnum, String> map = new HashMap<>();

        //PaymentPanelCreateWidgetDTO
        map = (addMapEntryIfNecessary(firstPaymentPanelCreateWidgetDTO.getFpd(), firstPaymentPanelCreateWidgetDTO.getFpdKey(), map));
        map = (addMapEntryIfNecessary(firstPaymentPanelCreateWidgetDTO.getGrp(), firstPaymentPanelCreateWidgetDTO.getGrpKey(), map));
        map = (addMapEntryIfNecessary(firstPaymentPanelCreateWidgetDTO.getDeviceType(), firstPaymentPanelCreateWidgetDTO.getDeviceTypeKey(), map));
        map = (addMapEntryIfNecessary(firstPaymentPanelCreateWidgetDTO.getStorage(), firstPaymentPanelCreateWidgetDTO.getStorageKey(), map));
        map = (addMapEntryIfNecessary(firstPaymentPanelCreateWidgetDTO.getV(), firstPaymentPanelCreateWidgetDTO.getVKey(), map));
        map = (addMapEntryIfNecessary(firstPaymentPanelCreateWidgetDTO.getCid(), firstPaymentPanelCreateWidgetDTO.getCidMetaDataKey(), map));
        map = (addMapEntryIfNecessary(firstPaymentPanelCreateWidgetDTO.getCid(), firstPaymentPanelCreateWidgetDTO.getCidKey(), map));
        map = (addMapEntryIfNecessary(firstPaymentPanelCreateWidgetDTO.getDynamicWidget(), firstPaymentPanelCreateWidgetDTO.getDynamicWidgetKey(), map));


        //MerchantCreateSignatureDTO
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getGrp(), merchantCreateSignatureDTO.getGrpKey(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getPaymentType().getValue(), merchantCreateSignatureDTO.getPaymentTypeKey(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getCurrency(), merchantCreateSignatureDTO.getCurrencyKey(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getReturnUrl(), merchantCreateSignatureDTO.getReturnUrlKey(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getAmount(), merchantCreateSignatureDTO.getAmountKey(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getGlobexLang(), merchantCreateSignatureDTO.getGlobexLangKey(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getCancelUrl(), merchantCreateSignatureDTO.getCancelUrlKey(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getPaymentProviderId(), merchantCreateSignatureDTO.getPaymentProviderIdKey(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getSignature(), merchantCreateSignatureDTO.getRequestSignatureKey(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getWidgetId(), merchantCreateSignatureDTO.getWidgetIdKey(), map));


        //Customer Info from MerchantCreateSignatureDTO
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getCustomerAddressAddress1(), merchantCreateSignatureDTO.getCustomerAddressAddress1Key(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getCustomerAddressAddress2(), merchantCreateSignatureDTO.getCustomerAddressAddress2Key(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getCustomerAddressCity(), merchantCreateSignatureDTO.getCustomerAddressCityKey(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getCustomerAddressCountry(), merchantCreateSignatureDTO.getCustomerAddressCountryKey(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getCustomerAddressState(), merchantCreateSignatureDTO.getCustomerAddressStateKey(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getCustomerAddressZip(), merchantCreateSignatureDTO.getCustomerAddressZipKey(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getCustomerDriverLicenseNumber(), merchantCreateSignatureDTO.getCustomerDriverLicenseNumberKey(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getCustomerDriverLicenseState(), merchantCreateSignatureDTO.getCustomerDriverLicenseStateKey(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getCustomerEmail(), merchantCreateSignatureDTO.getCustomerEmailKey(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getCustomerName(), merchantCreateSignatureDTO.getCustomerNameKey(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getCustomerPhone(), merchantCreateSignatureDTO.getCustomerPhoneKey(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getCustomerTaxId(), merchantCreateSignatureDTO.getCustomerTaxIdKey(), map));

        //Manually
        map = (addMapEntryIfNecessary("en_US", QueryParametersEnum.LANG, map));
        map = (addMapEntryIfNecessary("en_US", QueryParametersEnum.METADATA_LANG_PARAM, map));
        map = (addMapEntryIfNecessary("true", QueryParametersEnum.WIDGET_LOADED, map));

        //Missing
        //map = (addMapEntryIfNecessary("error", QueryParametersEnum.TIMESTAMP, map));

        //Default
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getDescription(), merchantCreateSignatureDTO.getDescriptionKey(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getMerchantId(), merchantCreateSignatureDTO.getMerchantIdKey(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getMerchantReference(), merchantCreateSignatureDTO.getMerchantReferenceKey(), map));


        return map;

    }


}
