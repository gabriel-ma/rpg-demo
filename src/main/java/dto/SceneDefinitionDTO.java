package dto;

import java.util.List;
import java.util.stream.Collectors;


public class SceneDefinitionDTO {
    private String sceneName;
    private String sceneLocation;
    private List<String> npcsInLocation;
    private List<DialogueDTO> dialogues;

    public void setSceneName(String sceneName) {
        this.sceneName = sceneName;
    }

    public void setSceneLocation(String sceneLocation) {
        this.sceneLocation = sceneLocation;
    }

    public void setNpcsInLocation(List<String> npcsInLocation) {
        this.npcsInLocation = npcsInLocation;
    }

    public void setDialogues(List<DialogueDTO> dialogues) {
        this.dialogues = dialogues;
    }

    public String getSceneName() {
        return sceneName;
    }

    public String getSceneLocation() {
        return sceneLocation;
    }

    public String getNpcsInLocation() {
        return String.join(", ", npcsInLocation);
    }

    public List<DialogueDTO> getDialogues() {
        return dialogues;
    }


    @Override
    public String toString() {
        return "SceneDefinitionDTO{" +
                "sceneName='" + sceneName + '\'' +
                ", sceneLocation='" + sceneLocation + '\'' +
                ", npcsInLocation=" + npcsInLocation +
                ", dialogues=" + dialogues +
                '}';
    }
}
