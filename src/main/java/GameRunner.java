import dto.SceneDefinitionDTO;

public class GameRunner {

    private static GameRunner instance = null;

    public static GameRunner getInstance (){
        return instance == null ? new GameRunner() : instance;
    }

    private GameRunner() {
    }

    public void run(SceneDefinitionDTO sceneDefinitionDTO) {
        new SceneRunner(sceneDefinitionDTO).run();
    }
}
