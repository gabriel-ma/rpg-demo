import com.fasterxml.jackson.databind.ObjectMapper;
import dto.SceneDefinitionDTO;

import java.io.IOException;
import java.io.InputStream;

public class GameFileReader {

    public SceneDefinitionDTO readFileIntoObject(String file) throws IOException {
        InputStream inputStream = getClass()
                .getClassLoader().getResourceAsStream(file);

        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(inputStream, SceneDefinitionDTO.class);
    }
}
