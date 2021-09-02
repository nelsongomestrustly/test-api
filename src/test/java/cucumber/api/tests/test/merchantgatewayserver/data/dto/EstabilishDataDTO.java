package cucumber.api.tests.test.merchantgatewayserver.data.dto;

import cucumber.api.tests.common.enums.PaymentTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//Create Query Parameters
public class EstabilishDataDTO {

    private String amount;
    private String cancelUrl;
    private String currency;
    private String description;
    private String ip;
    private String merchantId;
    private String merchantReference;

    private PaymentTypeEnum paymentType2;
    private String paymentType;
    private String returnUrl;
    private String deviceCategory;
    private String deviceOs;
    private String deviceType;

    private String transactionId;

    //Backup

    private String timeZone;
    private String version;
    private Integer paymentFlowAlreadyUsed;
    private String uri;
    private String minimumBalance;
    private String displayAmount;
    private String data;
    private String accessId;
    private String requestSignature;
    private String environment;
    private String userAgent;
    private Long widgetPaymentProviderId;
    private String internalFingerprint;
    private String paymentProviderId;
    private Boolean storageSupported;
    private String referer;
    private Integer integrationPlatform;
    private String integrationPlatformVersion;
    private List<String> dynamicStringsId;
    private String integrationScriptLocation;

}
