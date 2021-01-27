import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Parsing {

    public String readFromFile(String path) {
        String lineReader;
        String output = "";
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(path))) {
            while ((lineReader = reader.readLine()) != null) {
                output += lineReader;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return output;
    }


    public String[] splitStringIntoArray(String input) {
        return input.split("\\s+");
    }


    public int determineNumberOfWords(String input) {
        if (input.isEmpty()) {
            return 0;
        }
        String[] words = splitStringIntoArray(input);
        return words.length;
    }

    public int determineNumberOfSentences(String input) {
        int numberOfSentences = 0;
        if (input.isEmpty()) {
            return numberOfSentences;
        }
        String[] words = splitStringIntoArray(input);

        for (String word : words) {
            if (word.charAt(word.length() - 1) == '!' || word.charAt(word.length() - 1) == '.' || word.charAt(word.length() - 1) == '?') {
                numberOfSentences++;
            }
        }
        return numberOfSentences;
    }


}
