package cucumber.api.tests.common.enums;

import cucumber.api.tests.common.enums.queries.QueryParametersEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum WidgetIdEnum {

    WIDGET_1(QueryParametersEnum.WIDGET_ID, "1");

    private final QueryParametersEnum key;
    private final String widgetId;

    public static WidgetIdEnum fromWidgetIdKey(String widgetId) {
        for (WidgetIdEnum b : WidgetIdEnum.values()) {
            if (b.widgetId.equalsIgnoreCase(widgetId)) {
                return b;
            }
        }

        return null;
    }

}
