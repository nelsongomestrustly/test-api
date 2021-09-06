package cucumber.api.tests.data.manager;

import cucumber.api.tests.data.dto.frontend.FrontEndSetupDTO;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Getter
public class FrontEndManager {


    private List<FrontEndSetupDTO> frontEndSetupDTOList;

    public FrontEndManager() {
        this.frontEndSetupDTOList = new ArrayList<>();
    }

    /**
     * Payment Panel Create Widget DTO
     */

    public void addFrontEndSetupDTO(FrontEndSetupDTO frontEndSetupDTO) {
        frontEndSetupDTOList.add(frontEndSetupDTO);
    }

    public void addAllFrontEndSetupDTO(List<FrontEndSetupDTO> frontEndSetupDTOS) {
        frontEndSetupDTOList.addAll(frontEndSetupDTOS);
    }

    public FrontEndSetupDTO getFirstFrontEndSetupDTO() {
        return frontEndSetupDTOList.get(0);
    }

    public FrontEndSetupDTO getLastFrontEndSetupDTO() {
        return frontEndSetupDTOList.get(frontEndSetupDTOList.size() -1);
    }



}
