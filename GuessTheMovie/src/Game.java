import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class Game {
     String file = String.valueOf(new File("movie.txt"));
     public String getRandomTitle(String path) {
        List<String> lines;
        try {
            lines = Files.readAllLines(Paths.get(path));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        Random random = new Random();
        return lines.get(random.nextInt(lines.size()));
    }
}

