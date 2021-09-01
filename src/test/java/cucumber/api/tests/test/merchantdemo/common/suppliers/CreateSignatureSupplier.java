package cucumber.api.tests.test.merchantdemo.common.suppliers;

import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import cucumber.api.tests.common.predicates.GenericPredicates;
import cucumber.api.tests.support.common.users.data.TestParticipantDTO;
import cucumber.api.tests.test.merchantdemo.data.dto.CreateSignatureDTO;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

public class CreateSignatureSupplier {


    public static MultiValueMap<String, String> getLoginMultiValueMapForHttpRequest(CreateSignatureDTO createSignatureDTO) {

        MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();

        map = (addMapEntryIfNecessary(createSignatureDTO.getAccessId(), createSignatureDTO.getAccessIdKey(), map));
        map = (addMapEntryIfNecessary(createSignatureDTO.getAmount(), createSignatureDTO.getAmountKey(), map));
        map = (addMapEntryIfNecessary(createSignatureDTO.getCancelUrl(), createSignatureDTO.getCancelUrlKey(), map));
        map = (addMapEntryIfNecessary(createSignatureDTO.getCurrency(), createSignatureDTO.getCurrencyKey(), map));
        map = (addMapEntryIfNecessary(createSignatureDTO.getCustomerAddressAddress1(), createSignatureDTO.getCustomerAddressAddress1Key(), map));
        map = (addMapEntryIfNecessary(createSignatureDTO.getCustomerAddressAddress2(), createSignatureDTO.getCustomerAddressAddress2Key(), map));
        map = (addMapEntryIfNecessary(createSignatureDTO.getCustomerAddressCity(), createSignatureDTO.getCustomerAddressCityKey(), map));
        map = (addMapEntryIfNecessary(createSignatureDTO.getCustomerAddressCountry(), createSignatureDTO.getCustomerAddressCountryKey(), map));
        map = (addMapEntryIfNecessary(createSignatureDTO.getCustomerAddressState(), createSignatureDTO.getCustomerAddressStateKey(), map));
        map = (addMapEntryIfNecessary(createSignatureDTO.getCustomerAddressZip(), createSignatureDTO.getCustomerAddressZipKey(), map));
        map = (addMapEntryIfNecessary(createSignatureDTO.getCustomerDriverLicenseNumber(), createSignatureDTO.getCustomerDriverLicenseNumberKey(), map));
        map = (addMapEntryIfNecessary(createSignatureDTO.getCustomerDriverLicenseState(), createSignatureDTO.getCustomerDriverLicenseStateKey(), map));
        map = (addMapEntryIfNecessary(createSignatureDTO.getCustomerEmail(), createSignatureDTO.getCustomerEmailKey(), map));
        map = (addMapEntryIfNecessary(createSignatureDTO.getCustomerName(), createSignatureDTO.getCustomerNameKey(), map));
        map = (addMapEntryIfNecessary(createSignatureDTO.getCustomerPhone(), createSignatureDTO.getCustomerPhoneKey(), map));
        map = (addMapEntryIfNecessary(createSignatureDTO.getCustomerTaxId(), createSignatureDTO.getCustomerTaxIdKey(), map));
        map = (addMapEntryIfNecessary(createSignatureDTO.getDescription(), createSignatureDTO.getDescriptionKey(), map));
        map = (addMapEntryIfNecessary(createSignatureDTO.getGlobexDescription(), createSignatureDTO.getGlobexDescriptionKey(), map));
        map = (addMapEntryIfNecessary(createSignatureDTO.getGlobexLang(), createSignatureDTO.getGlobexLangKey(), map));
        map = (addMapEntryIfNecessary(createSignatureDTO.getGrp(), createSignatureDTO.getGrpKey(), map));
        map = (addMapEntryIfNecessary(createSignatureDTO.getMerchantId(), createSignatureDTO.getMerchantIdKey(), map));
        map = (addMapEntryIfNecessary(createSignatureDTO.getMetadataLang(), createSignatureDTO.getMetadataLangKey(), map));
        map = (addMapEntryIfNecessary(createSignatureDTO.getMetadataSkinCode(), createSignatureDTO.getMetadataSkinCodeKey(), map));
        map = (addMapEntryIfNecessary(createSignatureDTO.getMerchantReference(), createSignatureDTO.getMerchantReferenceKey(), map));
        map = (addMapEntryIfNecessary(createSignatureDTO.getMetadataSkinCode(), createSignatureDTO.getMetadataSkinCodeKey(), map));
        map = (addMapEntryIfNecessary(createSignatureDTO.getPaymentProviderId(), createSignatureDTO.getPaymentProviderIdKey(), map));
        map = (addMapEntryIfNecessary(createSignatureDTO.getPaymentType(), createSignatureDTO.getPaymentTypeKey(), map));
        map = (addMapEntryIfNecessary(createSignatureDTO.getRecurrence(), createSignatureDTO.getRecurrenceKey(), map));
        map = (addMapEntryIfNecessary(createSignatureDTO.getRecurrenceAmount(), createSignatureDTO.getRecurrenceAmountKey(), map));
        map = (addMapEntryIfNecessary(createSignatureDTO.getRecurrenceAutomaticCapture(), createSignatureDTO.getRecurrenceAutomaticCaptureKey(), map));
        map = (addMapEntryIfNecessary(createSignatureDTO.getRecurrenceEndDate(), createSignatureDTO.getRecurrenceEndDateKey(), map));
        map = (addMapEntryIfNecessary(createSignatureDTO.getRecurrenceFrequency(), createSignatureDTO.getRecurrenceFrequencyKey(), map));
        map = (addMapEntryIfNecessary(createSignatureDTO.getRecurrenceFrequencyUnit(), createSignatureDTO.getRecurrenceFrequencyUnitKey(), map));
        map = (addMapEntryIfNecessary(createSignatureDTO.getRecurrenceFrequencyUnitType(), createSignatureDTO.getRecurrenceFrequencyUnitTypeKey(), map));
        map = (addMapEntryIfNecessary(createSignatureDTO.getRecurrenceStartDate(), createSignatureDTO.getRecurrenceStartDateKey(), map));
        map = (addMapEntryIfNecessary(createSignatureDTO.getReturnUrl(), createSignatureDTO.getReturnUrlKey(), map));

        return map;

    }

    private static MultiValueMap<String, String> addMapEntryIfNecessary(Object object, QueryParametersEnum key, MultiValueMap<String, String> map) {

        if (GenericPredicates.checkIfNullOrEmpty.negate().test(object)) {
            map.add(key.getKeyName(), object.toString());
        }

        return map;

    }


}
