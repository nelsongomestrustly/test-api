package cucumber.api.tests.data.manager;

import cucumber.api.tests.data.dto.bank.BankRedirectUrlDTO;
import cucumber.api.tests.data.dto.paymentpanel.PaymentPanelCreateWidgetDTO;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Data
public class BankManager {

    private List<BankRedirectUrlDTO> bankRedirectUrlDTOList;

    public BankManager() {
        this.bankRedirectUrlDTOList = new ArrayList<>();
    }

    /**
     * Bank Redirect Url DTO
     */

    public void addBankRedirectUrlDTO(BankRedirectUrlDTO bankRedirectUrlDTO) {
        bankRedirectUrlDTOList.add(bankRedirectUrlDTO);
    }

    public void addAllBankRedirectUrlDTO(List<BankRedirectUrlDTO> bankRedirectUrlDTOS) {
        bankRedirectUrlDTOList.addAll(bankRedirectUrlDTOS);
    }

    public BankRedirectUrlDTO getFirstBankRedirectUrlDTO() {
        return bankRedirectUrlDTOList.get(0);
    }

    public BankRedirectUrlDTO getLastBankRedirectUrlDTO() {
        return bankRedirectUrlDTOList.get(bankRedirectUrlDTOList.size() -1);
    }

}
