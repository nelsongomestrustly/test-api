package cucumber.api.tests.test.paymentpanel.common.supplier.dto;

import cucumber.api.tests.data.dto.merchantdemo.MerchantCreateSignatureDTO;
import cucumber.api.tests.data.dto.paymentpanel.PaymentPanelSelectBankDTO;

public class PaymentPanelCreateSelectBankDTO {

    public static PaymentPanelSelectBankDTO getPaymentPanelSelectBankDTO (MerchantCreateSignatureDTO merchantCreateSignatureDTO) {

        PaymentPanelSelectBankDTO paymentPanelSelectBankDTO = new PaymentPanelSelectBankDTO();

        paymentPanelSelectBankDTO.setPaymentProviderId("");
        paymentPanelSelectBankDTO.setPpTransactionId("");
        paymentPanelSelectBankDTO.setLang("en"); //can be default

        //Can be Null
        paymentPanelSelectBankDTO.setLt("");
        paymentPanelSelectBankDTO.setOrderId("");
        paymentPanelSelectBankDTO.setShowManualEntryReason("");

        //Not Null
        paymentPanelSelectBankDTO.setPaymentProviderId(merchantCreateSignatureDTO.getPaymentProviderId());
        paymentPanelSelectBankDTO.setMerchantId(merchantCreateSignatureDTO.getMerchantId());

        return paymentPanelSelectBankDTO;

    }

}
