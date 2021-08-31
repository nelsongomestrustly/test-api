package cucumber.api.tests.test.merchantdemo.data.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateSignatureDTO {

      private String accessId;
      private String accessIdKey = "accessIdKey";

      private String returnUrl;
      private String returnUrlKey = "returnUrl";

      private String cancelUrl;
      private String cancelUrlKey = "cancelUrl";

      private String merchantId;
      private String merchantIdKey = "merchantId";

      private String description;
      private String descriptionKey = "description";

      private String merchantReference;
      private String merchantReferenceKey = "merchantReference";

      private String amount;
      private String amountKey = "amount";

      private String paymentType;
      private String paymentTypeKey = "paymentType";

      private String currency;
      private String currencyKey = "currency";

      @JsonProperty("globex[lang]")
      private String globexLang;
      private String globexLangKey = "globex[lang]";

      @JsonProperty("metadata[lang]")
      private String metadataLang;
      private String metadataLangKey = "metadata[lang]";

      private String paymentProviderId;
      private String paymentProviderIdKey = "paymentProviderId";

      private String grp;
      private String grpKey = "grp";

      private String globexDescription;
      private String globexDescriptionKey = "globexDescription";

      @JsonProperty("metadata[skinCode]")
      private String metadataSkinCode;
      private String metadataSkinCodeKey = "metadata[skinCode]";

      @JsonProperty("customer[name]")
      private String customerName;
      private String customerNameKey = "customer[name]";

      @JsonProperty("customer[address][address1]")
      private String customerAddressAddress1;
      private String customerAddressAddress1Key = "customer[address][address1]";

      @JsonProperty("customer[address][address2]")
      private String customerAddressAddress2;
      private String customerAddressAddress2Key = "customer[address][address2]";

      @JsonProperty("customer[address][city]")
      private String customerAddressCity;
      private String customerAddressCityKey = "customer[address][city]";

      @JsonProperty("customer[address][state]")
      private String customerAddressState;
      private String customerAddressStateKey = "customer[address][state]";

      @JsonProperty("customer[address][zip]")
      private String customerAddressZip;
      private String customerAddressZipKey = "customer[address][zip]";

      @JsonProperty("customer[address][country]")
      private String customerAddressCountry;
      private String customerAddressCountryKey = "customer[address][country]";

      @JsonProperty("customer[phone]")
      private String customerPhone;
      private String customerPhoneKey = "customer[phone]";

      @JsonProperty("customer[email]")
      private String customerEmail;
      private String customerEmailKey = "customer[email]";

      @JsonProperty("customer[taxId]")
      private String customerTaxId;
      private String customerTaxIdKey = "customer[taxId]";

      @JsonProperty("customer[driverLicense][number]")
      private String customerDriverLicenseNumber;
      private String customerDriverLicenseNumberKey = "customer[driverLicense][number]";

      @JsonProperty("customer[driverLicense][state]")
      private String customerDriverLicenseState;
      private String customerDriverLicenseStateKey = "customer[driverLicense][state]";

      private String recurrence;
      private String recurrenceKey = "recurrence";

      @JsonProperty("recurrence[startDate]")
      private String recurrenceStartDate;
      private String recurrenceStartDateKey = "recurrence[startDate]";

      @JsonProperty("recurrence[endDate]")
      private String recurrenceEndDate;
      private String recurrenceEndDateKey = "recurrence[endDate]";

      @JsonProperty("recurrence[frequency]")
      private String recurrenceFrequency;
      private String recurrenceFrequencyKey = "recurrence[frequency]";

      @JsonProperty("recurrence[frequencyUnit]")
      private String recurrenceFrequencyUnit;
      private String recurrenceFrequencyUnitKey = "recurrence[frequencyUnit]";

      @JsonProperty("recurrence[frequencyUnitType]")
      private String recurrenceFrequencyUnitType;
      private String recurrenceFrequencyUnitTypeKey = "recurrence[frequencyUnitType]";

      @JsonProperty("recurrence[recurringAmount]")
      private String recurrenceAmount;
      private String recurrenceAmountKey = "recurrence[recurringAmount]";

      @JsonProperty("recurrence[automaticCapture]")
      private String recurrenceAutomaticCapture;
      private String recurrenceAutomaticCaptureKey = "recurrence[automaticCapture]";


}
