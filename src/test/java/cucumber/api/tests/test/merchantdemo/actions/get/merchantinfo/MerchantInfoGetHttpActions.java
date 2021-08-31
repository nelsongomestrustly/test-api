package cucumber.api.tests.test.merchantdemo.actions.get.merchantinfo;


import cucumber.api.tests.common.enums.MerchantTypeEnum;
import cucumber.api.tests.common.mappers.HttpMappers;
import cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums;
import cucumber.api.tests.test.merchantdemo.connectors.merchantinfo.MerchantInfoConnector;
import cucumber.api.tests.test.merchantdemo.data.dto.MerchantInfoDTO;
import cucumber.api.tests.validations.resttemplate.RestTemplateValidations;
import org.springframework.http.ResponseEntity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class MerchantInfoGetHttpActions {


    public static List<MerchantInfoDTO> getMerchantsInfo(
            MerchantTypeEnum merchantTypeEnum,
            Integer expectedStatus,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) throws IOException {

        ResponseEntity<String> responseEntity = MerchantInfoConnector.getMerchantsInfo(merchantTypeEnum, statefulRestTemplateInterceptorKeyEnums);

        RestTemplateValidations.validateStatus(expectedStatus, responseEntity);

        return HttpMappers.readResponse(responseEntity);


    }




}
