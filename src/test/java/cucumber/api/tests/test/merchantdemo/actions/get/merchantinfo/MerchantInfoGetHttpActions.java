package cucumber.api.tests.test.merchantdemo.actions.get.merchantinfo;


import com.fasterxml.jackson.core.type.TypeReference;
import cucumber.api.tests.common.enums.MerchantTypeEnum;
import cucumber.api.tests.common.mappers.HttpMappers;
import cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums;
import cucumber.api.tests.data.dto.merchantdemo.MerchantBasicInfoDTO;
import cucumber.api.tests.test.merchantdemo.connectors.merchantinfo.MerchantInfoConnector;
import cucumber.api.tests.validations.resttemplate.RestTemplateValidations;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;

import java.io.IOException;
import java.util.List;

@Slf4j
public class MerchantInfoGetHttpActions {


    public static List<MerchantBasicInfoDTO> getMerchantsInfo(
            MerchantTypeEnum merchantTypeEnum,
            Integer expectedStatus,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) throws IOException {

        ResponseEntity<String> responseEntity = MerchantInfoConnector.getMerchantsInfo(merchantTypeEnum, statefulRestTemplateInterceptorKeyEnums);

        RestTemplateValidations.validateStatus(expectedStatus, responseEntity);

        return HttpMappers.readListResponse(responseEntity, new TypeReference<>() {});


    }




}
