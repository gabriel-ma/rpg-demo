package dto;

import java.util.List;

public class DialogueDTO {

    private String dialogueLine;
    private List<ResponseDTO> possibleResponses;

    public String getDialogueLine() {
        return dialogueLine;
    }

    public List<ResponseDTO> getPossibleResponses() {
        return possibleResponses;
    }

    public void setDialogueLine(String dialogueLine) {
        this.dialogueLine = dialogueLine;
    }

    public void setPossibleResponses(List<ResponseDTO> possibleResponses) {
        this.possibleResponses = possibleResponses;
    }

    @Override
    public String toString() {
        return "DialogueDTO{" +
                "dialogueLine='" + dialogueLine + '\'' +
                ", possibleResponses=" + possibleResponses +
                '}';
    }
}
