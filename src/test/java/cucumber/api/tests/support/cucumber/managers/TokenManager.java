package cucumber.api.tests.support.cucumber.managers;

import cucumber.api.tests.common.enums.TokenEnv;
import cucumber.api.tests.common.security.TokenDTO;
import cucumber.api.tests.test.paymentpanel.data.dto.PaymentPanelCreateWidgetDTO;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Getter
public class TokenManager {


    private List<TokenDTO> tokenDTOList;

    public TokenManager() {
        this.tokenDTOList = new ArrayList<>();
    }

    /**
     * Payment Panel Create Widget DTO
     */

    public void addTokenDTO(TokenDTO tokenDTO) {
        tokenDTOList.add(tokenDTO);
    }

    public void addAllTokenDTO(List<TokenDTO> tokenDTOS) {
        tokenDTOList.addAll(tokenDTOS);
    }

    public TokenDTO getFirstTokenDTO() {
        return tokenDTOList.get(0);
    }

    public TokenDTO getLastTokenDTO() {
        return tokenDTOList.get(tokenDTOList.size() -1);
    }



}
