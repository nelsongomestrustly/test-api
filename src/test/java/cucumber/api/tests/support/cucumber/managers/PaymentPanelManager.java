package cucumber.api.tests.support.cucumber.managers;

import cucumber.api.tests.test.paymentpanel.data.dto.PaymentPanelCreateWidgetDTO;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Data
public class PaymentPanelManager {

    private String bankRedirectUrl;
    private List<PaymentPanelCreateWidgetDTO> paymentPanelCreateWidgetDTOList;

    public PaymentPanelManager() {
        this.bankRedirectUrl = "";
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
