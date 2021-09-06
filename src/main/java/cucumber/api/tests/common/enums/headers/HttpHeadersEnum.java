package cucumber.api.tests.common.enums.headers;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum HttpHeadersEnum {

    ACCEPT_APPLICATION_JSON_APP_REACT("Accept", "application/json; app=react");

    private final String key;
    private final String value;

    public static HttpHeadersEnum fromKey(String key) {
        for (HttpHeadersEnum b : HttpHeadersEnum.values()) {
            if (b.key.equalsIgnoreCase(key)) {
                return b;
            }
        }

        return null;
    }

    public static HttpHeadersEnum fromValue(String value) {
        for (HttpHeadersEnum b : HttpHeadersEnum.values()) {
            if (b.value.equalsIgnoreCase(value)) {
                return b;
            }
        }

        return null;
    }

}
