package cucumber.api.tests.test.merchantdemo.actions.get.merchantdemo;


import com.fasterxml.jackson.core.JsonProcessingException;
import cucumber.api.tests.common.mappers.HttpMappers;
import cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums;
import cucumber.api.tests.test.merchantdemo.connectors.merchantdemo.MerchantDemoConnector;
import cucumber.api.tests.test.merchantdemo.data.dto.MerchantCreateSignatureDTO;
import cucumber.api.tests.test.merchantdemo.data.dto.MerchantSignatureDTO;
import cucumber.api.tests.validations.resttemplate.RestTemplateValidations;
import org.springframework.http.ResponseEntity;


public class MerchantDemoGetHttpActions {


    public static void getMerchantDemo(
            Integer expectedStatus,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums)  {

        ResponseEntity<String> responseEntity = MerchantDemoConnector.getMerchantDemo(statefulRestTemplateInterceptorKeyEnums);

        RestTemplateValidations.validateStatus(expectedStatus, responseEntity);

    }


    public static MerchantSignatureDTO getMerchantDemoSignature(
            MerchantCreateSignatureDTO merchantCreateSignatureDTO,
            Integer expectedStatus,
            StatefulRestTemplateInterceptorKeyEnums statefulRestTemplateInterceptorKeyEnums) throws JsonProcessingException {

        ResponseEntity<String> responseEntity = MerchantDemoConnector.getMerchantDemoSignature(
                merchantCreateSignatureDTO,
                statefulRestTemplateInterceptorKeyEnums);

        RestTemplateValidations.validateStatus(expectedStatus, responseEntity);

        return HttpMappers.readResponse(responseEntity, MerchantSignatureDTO.class);

    }




}
