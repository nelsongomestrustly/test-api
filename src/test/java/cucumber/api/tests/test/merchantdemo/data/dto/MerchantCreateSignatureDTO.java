package cucumber.api.tests.test.merchantdemo.data.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import cucumber.api.tests.common.constants.env.Ports;
import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import cucumber.api.tests.common.suppliers.UrlSuppliers;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import static cucumber.api.tests.common.constants.env.Ports.MERCHANT_DEMO_PORT;


/**
 * accessId=A48B73F694C4C8EE6306&returnUrl=http%3A%2F%2F192.168.1.49%3A7000%2Fmerchant-demo%2Fglobex%2F%3Fsuccess%3Dtrue&cancelUrl=http%3A%2F%2F192.168.1.49%3A7000%2Fmerchant-demo%2Fglobex%2F%3Fcancel%3Dtrue&merchantId=110005514&description=Globex+Demo&merchantReference=37A73EEBC13C13C0&amount=50.00&recurrence=&paymentType=Disbursement&customer%5Bname%5D=Freddie+Mercury&customer%5Baddress%5D%5Baddress1%5D=96725+Champlin+Shoal&customer%5Baddress%5D%5Baddress2%5D=%2386&customer%5Baddress%5D%5Bcity%5D=London&customer%5Baddress%5D%5Bstate%5D=London&customer%5Baddress%5D%5Bzip%5D=DZ03+1WN&customer%5Baddress%5D%5Bcountry%5D=GB&customer%5Bphone%5D=%2B44+123456789&customer%5Bemail%5D=freddie.mercury%40email.com&currency=GBP&globex%5Blang%5D=en_GB&metadata%5Blang%5D=en_GB&metadata%5BskinCode%5D=051000017&paymentProviderId=&grp=1&globexDescription=
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MerchantCreateSignatureDTO {

      private String accessId;
      private QueryParametersEnum accessIdKey = QueryParametersEnum.ACCESS_ID;

      private String amount;
      private QueryParametersEnum amountKey = QueryParametersEnum.AMOUNT;

      private String cancelUrl;
      private QueryParametersEnum cancelUrlKey = QueryParametersEnum.CANCEL_URL;

      private String currency;
      private QueryParametersEnum currencyKey = QueryParametersEnum.CURRENCY;

      @JsonProperty("customer[address][address1]")
      private String customerAddressAddress1;
      private QueryParametersEnum customerAddressAddress1Key = QueryParametersEnum.CUSTOMER_ADDRESS_1_PARAM;

      @JsonProperty("customer[address][address2]")
      private String customerAddressAddress2;
      private QueryParametersEnum customerAddressAddress2Key = QueryParametersEnum.CUSTOMER_ADDRESS_2_PARAM;

      @JsonProperty("customer[address][city]")
      private String customerAddressCity;
      private QueryParametersEnum customerAddressCityKey = QueryParametersEnum.CUSTOMER_ADDRESS_CITY_PARAM;

      @JsonProperty("customer[address][state]")
      private String customerAddressState;
      private QueryParametersEnum customerAddressStateKey = QueryParametersEnum.CUSTOMER_ADDRESS_STATE_PARAM;

      @JsonProperty("customer[address][zip]")
      private String customerAddressZip;
      private QueryParametersEnum customerAddressZipKey = QueryParametersEnum.CUSTOMER_ADDRESS_ZIP_PARAM;

      @JsonProperty("customer[address][country]")
      private String customerAddressCountry;
      private QueryParametersEnum customerAddressCountryKey = QueryParametersEnum.CUSTOMER_ADDRESS_COUNTRY_PARAM;

      @JsonProperty("customer[driverLicense][number]")
      private String customerDriverLicenseNumber;
      private QueryParametersEnum customerDriverLicenseNumberKey = QueryParametersEnum.CUSTOMER_DRIVER_LICENSE_NUMBER_PARAM;

      @JsonProperty("customer[driverLicense][state]")
      private String customerDriverLicenseState;
      private QueryParametersEnum customerDriverLicenseStateKey = QueryParametersEnum.CUSTOMER_DRIVER_LICENSE_STATE_PARAM;

      @JsonProperty("customer[email]")
      private String customerEmail;
      private QueryParametersEnum customerEmailKey = QueryParametersEnum.CUSTOMER_EMAIL_PARAM;

      @JsonProperty("customer[name]")
      private String customerName;
      private QueryParametersEnum customerNameKey = QueryParametersEnum.CUSTOMER_NAME_PARAM;

      @JsonProperty("customer[phone]")
      private String customerPhone;
      private QueryParametersEnum customerPhoneKey = QueryParametersEnum.CUSTOMER_PHONE;

      @JsonProperty("customer[taxId]")
      private String customerTaxId;
      private QueryParametersEnum customerTaxIdKey = QueryParametersEnum.CUSTOMER_TAX_ID;

      private String description;
      private QueryParametersEnum descriptionKey = QueryParametersEnum.DESCRIPTION;

      private String globexDescription;
      private QueryParametersEnum globexDescriptionKey = QueryParametersEnum.GLOBEX_DESCRIPTION;

      @JsonProperty("globex[lang]")
      private String globexLang;
      private QueryParametersEnum globexLangKey = QueryParametersEnum.GLOBEX_LANG_PARAM;

      private String grp;
      private QueryParametersEnum grpKey = QueryParametersEnum.GRP;

      private String merchantId;
      private QueryParametersEnum merchantIdKey = QueryParametersEnum.MERCHANT_ID;

      private String merchantReference;
      private QueryParametersEnum merchantReferenceKey = QueryParametersEnum.MERCHANT_REFERENCE;

      @JsonProperty("metadata[lang]")
      private String metadataLang;
      private QueryParametersEnum metadataLangKey = QueryParametersEnum.METADATA_LANG_PARAM;

      @JsonProperty("metadata[skinCode]")
      private String metadataSkinCode;
      private QueryParametersEnum metadataSkinCodeKey = QueryParametersEnum.METADATA_SKIN_CODE_PARAM;

      private String paymentProviderId;
      private QueryParametersEnum paymentProviderIdKey = QueryParametersEnum.PAYMENT_PROVIDER_ID;

      private String paymentType;
      private QueryParametersEnum paymentTypeKey = QueryParametersEnum.PAYMENT_TYPE;

      private String recurrence;
      private QueryParametersEnum recurrenceKey = QueryParametersEnum.RECURRENCE;

      @JsonProperty("recurrence[automaticCapture]")
      private String recurrenceAutomaticCapture;
      private QueryParametersEnum recurrenceAutomaticCaptureKey = QueryParametersEnum.RECURRENCE_AUTOMATIC_CAPTURE_PARAM;

      @JsonProperty("recurrence[endDate]")
      private String recurrenceEndDate;
      private QueryParametersEnum recurrenceEndDateKey = QueryParametersEnum.RECURRENCE_END_DATE_PARAM;

      @JsonProperty("recurrence[frequency]")
      private String recurrenceFrequency;
      private QueryParametersEnum recurrenceFrequencyKey = QueryParametersEnum.RECURRENCE_FREQUENCY_PARAM;

      @JsonProperty("recurrence[frequencyUnit]")
      private String recurrenceFrequencyUnit;
      private QueryParametersEnum recurrenceFrequencyUnitKey = QueryParametersEnum.RECURRENCE_FREQUENCY_UNIT_PARAM;

      @JsonProperty("recurrence[frequencyUnitType]")
      private String recurrenceFrequencyUnitType;
      private QueryParametersEnum recurrenceFrequencyUnitTypeKey = QueryParametersEnum.RECURRENCE_FREQUENCY_UNIT_TYPE_PARAM;

      @JsonProperty("recurrence[recurringAmount]")
      private String recurrenceAmount;
      private QueryParametersEnum recurrenceAmountKey = QueryParametersEnum.RECURRENCE_RECURRING_AMOUNT_PARAM;

      @JsonProperty("recurrence[startDate]")
      private String recurrenceStartDate;
      private QueryParametersEnum recurrenceStartDateKey = QueryParametersEnum.RECURRENCE_START_DATE_PARAM;

      private String returnUrl;
      private QueryParametersEnum returnUrlKey = QueryParametersEnum.RETURN_URL;

      //"Received after create process
      @JsonIgnore
      private String signature;
      private QueryParametersEnum requestSignatureKey = QueryParametersEnum.REQUEST_SIGNATURE;

      public void setCancelUrl(String cancelUrl) {
            this.cancelUrl = UrlSuppliers.getEnvUrl(cancelUrl, MERCHANT_DEMO_PORT);
      }

      public void setReturnUrl(String returnUrl) {
            this.returnUrl = UrlSuppliers.getEnvUrl(returnUrl, MERCHANT_DEMO_PORT);
      }
}
