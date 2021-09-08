package cucumber.api.tests.scenarios.merchantdemo.merchantdemo;

import cucumber.api.tests.CucumberTest;
import cucumber.api.tests.common.predicates.GenericPredicates;
import cucumber.api.tests.data.dto.merchantdemo.MerchantCreateSignatureDTO;
import cucumber.api.tests.data.dto.merchantdemo.MerchantSignatureDTO;
import cucumber.api.tests.data.context.MyTestContext;
import cucumber.api.tests.conectors.merchantdemo.merchantdemo.MerchantDemoGetHttpActions;
import cucumber.api.tests.samplefiles.merchantdemo.suppliers.MerchantDemoCreateSignatureDTOFileSampleSupplier;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;

import java.io.IOException;

import static cucumber.api.tests.configurations.resttemplate.common.enums.StatefulRestTemplateInterceptorKeyEnums.MERCHANT_DEMO_INTERCEPTOR_MAP_KEY;

@Slf4j
public class MerchantDemoSignature_FileNames_FT extends CucumberTest {


    //TODO GET METCHANT INFO FROM CONTEXT
    //Merchant-Demo
    //GlobexDemoController
    //createSignature
    @When("Access Merchant Demo and Create using {string} a Valid Signature {string}")
    public void accessMerchantDemoAndCreateUsingAValidSignature(String fileName, String expectMerchantDemoCreateSignatureHttpStatus) throws IOException {

        //Get AdminConsoleSearchTransactionsDTO from Sample Files
        MerchantCreateSignatureDTO merchantCreateSignatureDTO
                = MerchantDemoCreateSignatureDTOFileSampleSupplier.getSampleMerchantCreateSignatureDTO(fileName);

        //Get Merchant Signature from Server
        MerchantSignatureDTO merchantDemoSignature = MerchantDemoGetHttpActions.getMerchantDemoSignature(
                merchantCreateSignatureDTO,
                Integer.parseInt(expectMerchantDemoCreateSignatureHttpStatus),
                MERCHANT_DEMO_INTERCEPTOR_MAP_KEY);

        //Update With Signature
        merchantCreateSignatureDTO.setSignature(merchantDemoSignature.getSignature());

        //Put in Context
        MyTestContext.getMyTestContext().merchantDemoManager.addMerchantCreateSignatureDTO(merchantCreateSignatureDTO);

    }


    @Then("The user should have a Valid Signature")
    public void theUserShouldHaveAValidSignature() {

        Assertions.assertTrue(GenericPredicates.checkIfNullOrEmpty.negate().test(MyTestContext.getMyTestContext().merchantDemoManager.getMerchantCreateSignatureDTOList().get(0).getSignature()));

    }

}
