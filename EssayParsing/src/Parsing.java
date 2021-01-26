import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Parsing {

    public static void main(String[] args) {
        String in = "C:\\Users\\vodzy\\IdeaProjects\\Go2ItBootCamp_FileReader\\EssayParsing.csv";
        Parsing parsing = new Parsing();
        System.out.println(parsing.readFromFile(in));

    }

    public String readFromFile(String path) {
        String input = "";
        String neww = "";
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(path))) {

            while ((input = reader.readLine()) != null) {
                neww += input;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return neww;
    }
}
