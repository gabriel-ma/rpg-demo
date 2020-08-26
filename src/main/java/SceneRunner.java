import dto.DialogueDTO;
import dto.ResponseDTO;
import dto.SceneDefinitionDTO;

import java.io.IOException;
import java.util.Optional;
import java.util.Scanner;

public class SceneRunner {
    private SceneDefinitionDTO sceneDefinitionDTO;
    Scanner in = new Scanner(System.in);
    private final GameRunner gameRunner = GameRunner.getInstance();

    public SceneRunner(SceneDefinitionDTO sceneDefinitionDTO) {
        this.sceneDefinitionDTO = sceneDefinitionDTO;
    }

    public void run() {
        System.out.println((char)27 +"[33mYou are at " + sceneDefinitionDTO.getSceneLocation());
        System.out.println((char)27 + "[31m"+ sceneDefinitionDTO.getNpcsInLocation() + " are in the room.");
        for (DialogueDTO dialogue : sceneDefinitionDTO.getDialogues()) {
            System.out.println((char)27 + "[39m"+ dialogue.getDialogueLine());
            String response = in.nextLine();
            Optional<ResponseDTO> first = dialogue.getPossibleResponses()
                    .stream()
                    .filter(responseDTO -> responseDTO.getResponse().equalsIgnoreCase(response))
                    .findFirst();

            if (first.isPresent()) {
                ResponseDTO responseDTO = first.get();
                if (!responseDTO.getContinueDialogueOnFile()) {
                    GameFileReader gameFileReader = new GameFileReader();
                    try {
                        gameRunner.run(gameFileReader.readFileIntoObject(responseDTO.getPathToFollow()));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                }
            }

        }
    }
}
