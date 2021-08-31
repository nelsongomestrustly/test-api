package cucumber.api.tests.support.cucumber.managers;

import cucumber.api.tests.test.admconsole.data.dto.AdmConSearchTransactionsDTO;
import cucumber.api.tests.test.merchantdemo.data.dto.MerchantInfoDTO;
import cucumber.api.tests.test.merchantdemo.data.dto.PaymentFlowDTO;
import cucumber.api.tests.test.merchantdemo.data.dto.PaymentFlowsDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Getter
@Setter
public class MerchantDemoManager {

    private List<MerchantInfoDTO> merchantInfoDTOList;

    private List<PaymentFlowsDTO> paymentFlowsDTOList;

    private List<PaymentFlowDTO> paymentFlowDTOS;

    public MerchantDemoManager() {
        this.merchantInfoDTOList = new ArrayList<>();
        this.paymentFlowsDTOList = new ArrayList<>();
        this.paymentFlowDTOS = new ArrayList<>();
    }


    /**
     * MerchantInfoDTO
     */

    public void addMerchantInfoDTO(MerchantInfoDTO merchantInfoDTO) {
        merchantInfoDTOList.add(merchantInfoDTO);
    }

    public void addAllMerchantInfoDTO(List<MerchantInfoDTO> merchantInfoDTOS) {
        merchantInfoDTOList.addAll(merchantInfoDTOS);
    }

    public MerchantInfoDTO getFirstMerchantInfoDTO() {
        return merchantInfoDTOList.get(0);
    }

    public MerchantInfoDTO getLastMerchantInfoDTO() {
        return merchantInfoDTOList.get(merchantInfoDTOList.size() -1);
    }

    /**
     * PaymentFlowsDTO
     */

    public void addPaymentFlowsDTO(PaymentFlowsDTO paymentFlowsDTO) {
        paymentFlowsDTOList.add(paymentFlowsDTO);
    }

    public void addAllPaymentFlowsDTO(List<PaymentFlowsDTO> paymentFlowsDTOS) {
        paymentFlowsDTOList.addAll(paymentFlowsDTOS);
    }

    public PaymentFlowsDTO getFirstPaymentFlowsDTO() {
        return paymentFlowsDTOList.get(0);
    }

    public PaymentFlowsDTO getLastPaymentFlowsDTO() {
        return paymentFlowsDTOList.get(paymentFlowsDTOList.size() -1);
    }


    /**
     * PaymentFlowDTO
     */

    public void addPaymentFlowDTO(PaymentFlowDTO paymentFlowDTO) {
        paymentFlowDTOS.add(paymentFlowDTO);
    }

    public void addAllPaymentFlowDTO(List<PaymentFlowDTO> paymentFlowDTOS) {
        paymentFlowDTOS.addAll(paymentFlowDTOS);
    }

    public PaymentFlowDTO getFirstPaymentFlowDTO() {
        return paymentFlowDTOS.get(0);
    }

    public PaymentFlowDTO getLastPaymentFlowDTO() {
        return paymentFlowDTOS.get(paymentFlowDTOS.size() -1);
    }


}
