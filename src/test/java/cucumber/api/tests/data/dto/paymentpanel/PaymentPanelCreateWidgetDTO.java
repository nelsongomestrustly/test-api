package cucumber.api.tests.data.dto.paymentpanel;

import com.fasterxml.jackson.annotation.JsonProperty;
import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * {
 *     "accessId": "A48B73F694C4C8EE6306",
 *     "name": "Globex (demo)",
 *     "id": "110005514",
 *     "logoUrl": "{0}/images/tp/m/globex.png"
 * }
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PaymentPanelCreateWidgetDTO {

    private String deviceType;
    private QueryParametersEnum deviceTypeKey = QueryParametersEnum.DEVICE_TYPE;

    private String grp;
    private QueryParametersEnum grpKey = QueryParametersEnum.GRP;

    @JsonProperty("customer.externalId")
    private String customerExternalId;
    private QueryParametersEnum customerExternalIdKey = QueryParametersEnum.CUSTOMER_EXTERNAL_DOT_ID;

    private String storage;
    private QueryParametersEnum storageKey = QueryParametersEnum.STORAGE;

    @JsonProperty("customer.address.state")
    private String customerAddressState;
    private QueryParametersEnum customerAddressStateKey = QueryParametersEnum.CUSTOMER_ADDRESS_STATE_DOT;

    private String paymentType;
    private QueryParametersEnum paymentTypeKey = QueryParametersEnum.PAYMENT_TYPE;

    private String accessId;
    private QueryParametersEnum accessIdKey = QueryParametersEnum.ACCESS_ID;

    private String lastUsed;
    private QueryParametersEnum lastUsedKey = QueryParametersEnum.LAST_USED;

    private String dynamicWidget;
    private QueryParametersEnum dynamicWidgetKey = QueryParametersEnum.DYNAMIC_WIDGET;

    private String merchantId;
    private QueryParametersEnum merchantIdKey = QueryParametersEnum.MERCHANT_ID;

    private String v;
    private QueryParametersEnum vKey = QueryParametersEnum.V;

    @JsonProperty("customer.address.country")
    private String customerAddressCountry;
    private QueryParametersEnum customerAddressCountryKey = QueryParametersEnum.CUSTOMER_ADDRESS_COUNTRY_DOT;

    private String fpd;
    private QueryParametersEnum fpdKey = QueryParametersEnum.FPD;

    private String lang;
    private QueryParametersEnum langKey = QueryParametersEnum.LANG;

    private String merchantReference;
    private QueryParametersEnum merchantReferenceKey = QueryParametersEnum.MERCHANT_REFERENCE;

    private String cid;
    private QueryParametersEnum cidKey = QueryParametersEnum.CID;
    private QueryParametersEnum cidMetaDataKey = QueryParametersEnum.METADATA_LANG_CID;



}
