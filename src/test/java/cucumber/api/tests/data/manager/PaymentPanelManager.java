package cucumber.api.tests.data.manager;

import cucumber.api.tests.data.dto.bank.BankRedirectUrlDTO;
import cucumber.api.tests.data.dto.paymentpanel.PaymentPanelCreateWidgetDTO;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Data
public class PaymentPanelManager {

    private List<PaymentPanelCreateWidgetDTO> paymentPanelCreateWidgetDTOList;

    public PaymentPanelManager() {
        this.paymentPanelCreateWidgetDTOList = new ArrayList<>();
    }

    /**
     * Payment Panel Create Widget DTO
     */

    public void addPaymentPanelCreateWidgetDTO(PaymentPanelCreateWidgetDTO panelCreateWidgetDTO) {
        paymentPanelCreateWidgetDTOList.add(panelCreateWidgetDTO);
    }

    public void addAllPaymentPanelCreateWidgetDTO(List<PaymentPanelCreateWidgetDTO> panelCreateWidgetDTO) {
        paymentPanelCreateWidgetDTOList.addAll(panelCreateWidgetDTO);
    }

    public PaymentPanelCreateWidgetDTO getFirstPaymentPanelCreateWidgetDTO() {
        return paymentPanelCreateWidgetDTOList.get(0);
    }

    public PaymentPanelCreateWidgetDTO getLastPaymentPanelCreateWidgetDTO() {
        return paymentPanelCreateWidgetDTOList.get(paymentPanelCreateWidgetDTOList.size() -1);
    }

}
