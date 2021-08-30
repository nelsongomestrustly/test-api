package cucumber.api.tests.support.cucumber.parses;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//TODO VALIDATE MOVE TO MAIN PROJECT
public enum SupportedAliasEnum {
    COMPANY("company"),
    USER("user"),
    CARGO_PARTICIPANTS("cargoParticipants"),
    BARGES_TRADE("bargesTrade"),
    RANDOM("random"),
    CONFIGURATION("configuration"),
    NOMINATION("nomination"),
    MOVEMENT("movement"),
    MOVEMENTOLD("movementOLD");

    private String value;

    SupportedAliasEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static List<String> getAsList() {
        return Stream.of(SupportedAliasEnum.values())
                .map(SupportedAliasEnum::getValue)
                .collect(Collectors.toList());
    }

    public static SupportedAliasEnum fromValue(String value) {
        for (SupportedAliasEnum b : SupportedAliasEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}
