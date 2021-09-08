package cucumber.api.tests.scenarios.myenv;

import cucumber.api.tests.CucumberTest;
import cucumber.api.tests.data.dto.merchantdemo.MerchantBasicInfoDTO;
import cucumber.api.tests.data.context.MyTestContext;
import cucumber.api.tests.samplefiles.merchantdemo.suppliers.MerchantDemoBasicInfoDTOSampleSupplier;
import cucumber.api.tests.validations.object.GenericObjectValidations;
import io.cucumber.java.en.Then;

import java.io.IOException;
import java.util.List;

public class MyMerchant_FT extends CucumberTest {

    @Then("Add {string} Information to the Context")
    public void addInformationToTheContext(String fileName) throws IOException {

        MerchantBasicInfoDTO sampleMerchantBasicInfoDTO = MerchantDemoBasicInfoDTOSampleSupplier.getSampleMerchantBasicInfoDTO(fileName);

        GenericObjectValidations.validateIfAllFieldAreNotNullNotEmpty(List.of(sampleMerchantBasicInfoDTO));

        MyTestContext.getMyTestContext().merchantDemoManager.addMerchantInfoDTO(sampleMerchantBasicInfoDTO);

    }

}
