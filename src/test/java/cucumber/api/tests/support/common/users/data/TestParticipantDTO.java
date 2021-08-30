package cucumber.api.tests.support.common.users.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import cucumber.api.tests.support.common.users.common.enums.PasswordsEnum;
import cucumber.api.tests.support.common.users.common.enums.UsersEnum;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class TestParticipantDTO {

    private UsersEnum userName;
    private PasswordsEnum userPassword;

}
