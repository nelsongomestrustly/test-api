package cucumber.api.tests.data.dto.frontend;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FrontEndSetupTransactionDTO {

    private String id;
    private String ppId;

    private String country;
    private String amount;
    private boolean generateFp;
    private String language;
    private boolean widgetEnabled;
    private String type;
    private String token;
    private String paymentType;
    private int loginErrorCount;
    private String reference;
    private boolean accountTypeRequiredMec;
    private String bankId;
    private String institutionName;
    private String currency;
    private String fpd;
    private boolean blockMecExistingFic;

    @JsonProperty(namespace = "isPSD2")
    private boolean isPSD2;

    private String paymentFlow;

    @JsonIgnore
    private String supportedLanguages;
    @JsonIgnore
    private String permissions;
    @JsonIgnore
    private String events;
    @JsonIgnore
    private String customer;

}
