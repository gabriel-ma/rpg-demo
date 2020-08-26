import java.io.IOException;

public class GameInitializer {

    public static void main(String[] args) {
        GameFileReader fileReader = new GameFileReader();

        try {
            System.out.println(fileReader.readFileIntoObject("mainFile.json").toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
