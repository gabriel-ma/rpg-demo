import dto.SceneDefinitionDTO;

import java.io.IOException;

public class GameInitializer {

    public static void main(String[] args) {
        GameFileReader fileReader = new GameFileReader();

        try {
            SceneDefinitionDTO sceneDefinitionDTO = fileReader.readFileIntoObject("mainFile.json");

            GameRunner.getInstance().run(sceneDefinitionDTO);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
