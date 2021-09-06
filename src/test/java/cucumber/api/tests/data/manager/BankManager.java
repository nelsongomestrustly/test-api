package cucumber.api.tests.data.manager;

import cucumber.api.tests.data.dto.bankpanel.BankPanelRedirectUrlDTO;
import cucumber.api.tests.data.dto.bankpanel.accounts.BankPanelAccountLoginDTO;
import cucumber.api.tests.data.dto.bankpanel.login.BankPanelLoginHomePageDTO;
import cucumber.api.tests.data.dto.bankpanel.login.BankPanelLoginInfoDTO;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Data
public class BankManager {

    private List<BankPanelRedirectUrlDTO> bankPanelRedirectUrlDTOList;
    private List<BankPanelLoginInfoDTO> bankPanelLoginInfoDTOList;
    private List<BankPanelLoginHomePageDTO> bankPanelLoginHomePageDTOList;
    private List<BankPanelAccountLoginDTO> bankPanelAccountLoginDTOList;

    public BankManager() {
        this.bankPanelRedirectUrlDTOList = new ArrayList<>();
        this.bankPanelLoginInfoDTOList = new ArrayList<>();
        this.bankPanelLoginHomePageDTOList = new ArrayList<>();
        this.bankPanelAccountLoginDTOList = new ArrayList<>();
    }

    /**
     * Bank Redirect Url DTO
     */

    public void addBankRedirectUrlDTO(BankPanelRedirectUrlDTO bankPanelRedirectUrlDTO) {
        bankPanelRedirectUrlDTOList.add(bankPanelRedirectUrlDTO);
    }

    public void addAllBankRedirectUrlDTO(List<BankPanelRedirectUrlDTO> bankPanelRedirectUrlDTOS) {
        bankPanelRedirectUrlDTOList.addAll(bankPanelRedirectUrlDTOS);
    }

    public BankPanelRedirectUrlDTO getFirstBankRedirectUrlDTO() {
        return bankPanelRedirectUrlDTOList.get(0);
    }

    public BankPanelRedirectUrlDTO getLastBankRedirectUrlDTO() {
        return bankPanelRedirectUrlDTOList.get(bankPanelRedirectUrlDTOList.size() -1);
    }

    /**
     * Bank Panel Login Info DTO
     */

    public void addBankPanelLoginInfoDTO(BankPanelLoginInfoDTO bankPanelLoginInfoDTO) {
        bankPanelLoginInfoDTOList.add(bankPanelLoginInfoDTO);
    }

    public void addAllBankPanelLoginInfoDTO(List<BankPanelLoginInfoDTO> bankPanelRedirectUrlDTOS) {
        bankPanelLoginInfoDTOList.addAll(bankPanelRedirectUrlDTOS);
    }

    public BankPanelLoginInfoDTO getFirstBankPanelLoginInfoDTO() {
        return bankPanelLoginInfoDTOList.get(0);
    }

    public BankPanelLoginInfoDTO getLastBankPanelLoginInfoDTO() {
        return bankPanelLoginInfoDTOList.get(bankPanelLoginInfoDTOList.size() -1);
    }


    /**
     * Bank Panel Login Home Page DTO
     */

    public void addBankPanelLoginHomePageDTO(BankPanelLoginHomePageDTO bankPanelLoginHomePageDTO) {
        bankPanelLoginHomePageDTOList.add(bankPanelLoginHomePageDTO);
    }

    public void addAllBankPanelLoginHomePageDTO(List<BankPanelLoginHomePageDTO> bankPanelRedirectUrlDTOS) {
        bankPanelLoginHomePageDTOList.addAll(bankPanelRedirectUrlDTOS);
    }

    public BankPanelLoginHomePageDTO getFirstBankPanelLoginHomePageDTO() {
        return bankPanelLoginHomePageDTOList.get(0);
    }

    public BankPanelLoginHomePageDTO getLastBankPanelLoginHomePageDTO() {
        return bankPanelLoginHomePageDTOList.get(bankPanelLoginHomePageDTOList.size() -1);
    }

    /**
     * Bank Panel Account Login DTO
     */

    public void addBankPanelAccountLoginDTO(BankPanelAccountLoginDTO bankPanelLoginInfoDTO) {
        bankPanelAccountLoginDTOList.add(bankPanelLoginInfoDTO);
    }

    public void addAllBankPanelAccountLoginDTO(List<BankPanelAccountLoginDTO> bankPanelRedirectUrlDTOS) {
        bankPanelAccountLoginDTOList.addAll(bankPanelRedirectUrlDTOS);
    }

    public BankPanelAccountLoginDTO getFirstBankPanelAccountLoginDTO() {
        return bankPanelAccountLoginDTOList.get(0);
    }

    public BankPanelAccountLoginDTO getLastBankPanelAccountLoginDTO() {
        return bankPanelAccountLoginDTOList.get(bankPanelAccountLoginDTOList.size() -1);
    }


}
