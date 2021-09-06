package cucumber.api.tests.test.bankpanel.actions;

import cucumber.api.tests.common.mappers.HttpMappers;
import cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums;
import cucumber.api.tests.data.dto.bankpanel.BankPanelRedirectUrlDTO;
import cucumber.api.tests.data.dto.bankpanel.login.BankPanelLoginHomePageDTO;
import cucumber.api.tests.data.dto.bankpanel.login.BankPanelLoginInfoDTO;
import cucumber.api.tests.test.bankpanel.connectors.BankPanelConnector;
import cucumber.api.tests.validations.resttemplate.RestTemplateValidations;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;

import java.io.IOException;


@Slf4j
public class BankPanelHttpActions {

    /**
     * Login Info - Bank Panel
     */

    public static BankPanelLoginInfoDTO getBankPanelLoginInfoDTO(
            BankPanelRedirectUrlDTO bankPanelRedirectUrlDTO,
            Integer expectHttpStatus,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) throws IOException {

        ResponseEntity<String> responseEntity = BankPanelConnector.getBankPanelLoginInfoDTO(bankPanelRedirectUrlDTO, statefulRestTemplateInterceptorKeyEnums);

        RestTemplateValidations.validateStatus(expectHttpStatus, responseEntity);

        return HttpMappers.readResponse(responseEntity, BankPanelLoginInfoDTO.class);

    }


    /**
     * Login Home Page  - Bank Panel
     */

    public static BankPanelLoginHomePageDTO getBankPanelLoginHomePageDTO(
            BankPanelRedirectUrlDTO bankPanelRedirectUrlDTO,
            Integer expectHttpStatus,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) throws IOException {

        ResponseEntity<String> responseEntity = BankPanelConnector.getBankPanelLoginHomePageDTO(bankPanelRedirectUrlDTO, statefulRestTemplateInterceptorKeyEnums);

        RestTemplateValidations.validateStatus(expectHttpStatus, responseEntity);

        return BankPanelLoginHomePageDTO
                .builder()
                .bankPanelLoginHomePage(responseEntity.getBody())
                .build();

    }



}