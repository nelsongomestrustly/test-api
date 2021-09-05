package cucumber.api.tests.test.merchantdemo.common.suppliers.dto.signature;

import cucumber.api.tests.common.predicates.GenericPredicates;
import cucumber.api.tests.data.dto.merchantdemo.MerchantCreateSignatureDTO;
import cucumber.api.tests.data.context.MyTestContext;

import java.util.ArrayList;
import java.util.List;

public class UpdateMerchantCreateSignatureDTOListWithSignature {

    public static List<MerchantCreateSignatureDTO> updateMerchantCreateSignatureDTOListWithSignature(String merchantSignature) {

        List<MerchantCreateSignatureDTO> merchantCreateSignatureDTOList = MyTestContext.getMyTestContext().merchantDemoManager.getMerchantCreateSignatureDTOList();

        if (GenericPredicates.checkIfNullOrEmpty.test(merchantCreateSignatureDTOList)) {

            MerchantCreateSignatureDTO merchantCreateSignatureDTO = new MerchantCreateSignatureDTO();
            merchantCreateSignatureDTO.setSignature(merchantSignature);

            merchantCreateSignatureDTOList = new ArrayList<>();
            merchantCreateSignatureDTOList.add(merchantCreateSignatureDTO);

        } else {

            MerchantCreateSignatureDTO merchantCreateSignatureDTO = merchantCreateSignatureDTOList.get(0);
            merchantCreateSignatureDTO.setSignature(merchantSignature);

            merchantCreateSignatureDTOList.remove(0);
            merchantCreateSignatureDTOList.add(merchantCreateSignatureDTO);

        }

        return merchantCreateSignatureDTOList;

    }

}
