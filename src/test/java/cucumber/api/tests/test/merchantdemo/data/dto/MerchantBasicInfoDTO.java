package cucumber.api.tests.test.merchantdemo.data.dto;

import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * {
 *     "accessId": "A48B73F694C4C8EE6306",
 *     "name": "Globex (demo)",
 *     "description": "Globex (demo)",
 *     "id": "110005514",
 *     "merchantId": "110005514",
 *     "logoUrl": "{0}/images/tp/m/globex.png"
 * }
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MerchantBasicInfoDTO {

    private String accessId;
    private QueryParametersEnum accessIdKey = QueryParametersEnum.ACCESS_ID;

    //Same as Name
    private String description;
    private QueryParametersEnum descriptionKey = QueryParametersEnum.DESCRIPTION;

    private String name;
    private QueryParametersEnum nameKey = QueryParametersEnum.NAME;

    //Same as Id
    private String merchantId;
    private QueryParametersEnum merchantIdKey = QueryParametersEnum.MERCHANT_ID;

    private Integer id;
    private QueryParametersEnum idKey = QueryParametersEnum.ID;

    private String logoUrl;
    private QueryParametersEnum logoUrlKey = QueryParametersEnum.LOGO_URL;

    private String grp;
    private QueryParametersEnum grpKey = QueryParametersEnum.GRP;

    private String widgetId;
    private QueryParametersEnum widgetIdKey = QueryParametersEnum.WIDGET_ID;

    private String v;
    private QueryParametersEnum vKey = QueryParametersEnum.V;

    private String deviceType;
    private QueryParametersEnum deviceTypeKey = QueryParametersEnum.DEVICE_TYPE;


}
