package cucumber.api.tests.test.merchantdemo.data.dto;

import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * "accessId" -> {String[1]@8377} ["A48B73F694C4C8E..."]
 * "grp" -> {String[1]@8378} ["1"]
 * "widgetId" -> {String[1]@8379} ["1"]
 * "v" -> {String[1]@8380} ["1.122-SNAPSHOT"]
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MerchantGlobexStartDTO {

    private String accessId;
    private QueryParametersEnum accessIdKey = QueryParametersEnum.ACCESS_ID;

    private String grp;
    private QueryParametersEnum grpKey = QueryParametersEnum.GRP;

    private String widgetId;
    private QueryParametersEnum widgetIdKey = QueryParametersEnum.WIDGET_ID;

    private String v;
    private QueryParametersEnum vKey = QueryParametersEnum.V;

}
