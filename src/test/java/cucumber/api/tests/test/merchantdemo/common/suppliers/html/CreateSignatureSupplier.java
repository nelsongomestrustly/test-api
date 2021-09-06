package cucumber.api.tests.test.merchantdemo.common.suppliers.html;

import cucumber.api.tests.common.enums.PaymentProviderEnum;
import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import cucumber.api.tests.common.predicates.GenericPredicates;
import cucumber.api.tests.data.dto.merchantdemo.MerchantCreateSignatureDTO;
import cucumber.api.tests.data.context.MyTestContext;

import java.util.HashMap;

import static cucumber.api.tests.common.suppliers.QueryParamSuppliers.addMapEntryIfNecessary;

public class CreateSignatureSupplier {


    public static MerchantCreateSignatureDTO populateMerchantCreateSignatureDTOWithPaymentProviderId(String bankName) {

        MerchantCreateSignatureDTO merchantCreateSignatureDTO
                = MyTestContext.getMyTestContext().merchantDemoManager.getMerchantCreateSignatureDTOList().get(0);

        PaymentProviderEnum bankEnum = PaymentProviderEnum.valueOf(bankName);

        merchantCreateSignatureDTO.setPaymentProviderId(bankEnum.getId());
        merchantCreateSignatureDTO.setPaymentProviderIdKey(bankEnum.getKey());

        return merchantCreateSignatureDTO;

    }


    public static HashMap<QueryParametersEnum, String> getLoginMultiValueMapForHttpRequest(MerchantCreateSignatureDTO merchantCreateSignatureDTO) {

        HashMap<QueryParametersEnum, String> map = new HashMap<>();

        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getAccessId(), merchantCreateSignatureDTO.getAccessIdKey(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getAmount(), merchantCreateSignatureDTO.getAmountKey(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getCancelUrl(), merchantCreateSignatureDTO.getCancelUrlKey(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getCurrency(), merchantCreateSignatureDTO.getCurrencyKey(), map));
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
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getDescription(), merchantCreateSignatureDTO.getDescriptionKey(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getGlobexDescription(), merchantCreateSignatureDTO.getGlobexDescriptionKey(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getGlobexLang(), merchantCreateSignatureDTO.getGlobexLangKey(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getGrp(), merchantCreateSignatureDTO.getGrpKey(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getMerchantId(), merchantCreateSignatureDTO.getMerchantIdKey(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getMetadataLang(), merchantCreateSignatureDTO.getMetadataLangKey(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getMetadataSkinCode(), merchantCreateSignatureDTO.getMetadataSkinCodeKey(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getMerchantReference(), merchantCreateSignatureDTO.getMerchantReferenceKey(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getMetadataSkinCode(), merchantCreateSignatureDTO.getMetadataSkinCodeKey(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getPaymentProviderId(), merchantCreateSignatureDTO.getPaymentProviderIdKey(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getPaymentType().getValue(), merchantCreateSignatureDTO.getPaymentTypeKey(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getRecurrence(), merchantCreateSignatureDTO.getRecurrenceKey(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getRecurrenceAmount(), merchantCreateSignatureDTO.getRecurrenceAmountKey(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getRecurrenceAutomaticCapture(), merchantCreateSignatureDTO.getRecurrenceAutomaticCaptureKey(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getRecurrenceEndDate(), merchantCreateSignatureDTO.getRecurrenceEndDateKey(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getRecurrenceFrequency(), merchantCreateSignatureDTO.getRecurrenceFrequencyKey(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getRecurrenceFrequencyUnit(), merchantCreateSignatureDTO.getRecurrenceFrequencyUnitKey(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getRecurrenceFrequencyUnitType(), merchantCreateSignatureDTO.getRecurrenceFrequencyUnitTypeKey(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getRecurrenceStartDate(), merchantCreateSignatureDTO.getRecurrenceStartDateKey(), map));
        map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getReturnUrl(), merchantCreateSignatureDTO.getReturnUrlKey(), map));

        if (GenericPredicates.checkIfNullOrEmpty.negate().test(merchantCreateSignatureDTO.getSignature())) {
            map = (addMapEntryIfNecessary(merchantCreateSignatureDTO.getSignature(), merchantCreateSignatureDTO.getRequestSignatureKey(), map));
        }

        return map;

    }


}
