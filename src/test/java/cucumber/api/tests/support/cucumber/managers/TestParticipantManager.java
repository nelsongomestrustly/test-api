package cucumber.api.tests.support.cucumber.managers;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import cucumber.api.tests.support.common.users.data.TestParticipantDTO;

@Slf4j
public class TestParticipantManager {

    private List<TestParticipantDTO> testParticipantDTOList;

    public TestParticipantManager() {
        testParticipantDTOList = new ArrayList<>();
    }

    public void add(TestParticipantDTO testParticipantDTO) {
        testParticipantDTOList.add(testParticipantDTO);
    }

    public TestParticipantDTO getFirst() {
        return testParticipantDTOList.get(0);
    }

    public int getSize() {
        return testParticipantDTOList.size();
    }

    public TestParticipantDTO getLast() {
        return testParticipantDTOList.get(testParticipantDTOList.size() -1);
    }

    public TestParticipantDTO getByIndex(int index) {
        //Get the by index (zero-based index)
        return testParticipantDTOList.get(index-1);
    }

    public int getIndex(TestParticipantDTO testParticipantDTO) {
        //Get the index of the object (zero-based index)
        return testParticipantDTOList.indexOf(testParticipantDTO) + 1;
    }


}
