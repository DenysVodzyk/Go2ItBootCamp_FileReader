public class Main {
    public static void main(String[] args) {
        Parsing parsing = new Parsing();
        String in = "C:\\Users\\vodzy\\IdeaProjects\\Go2ItBootCamp_FileReader\\EssayParsing.csv";

        String output = parsing.readFromFile(in);
        System.out.println("Text from file: ");
        System.out.println(output);

        int numberOfWords = parsing.determineNumberOfWords(output);
        System.out.println("Number of words in the text is: " + numberOfWords);

        int numberOfSentences = parsing.determineNumberOfSentences(output);
        System.out.println("Number of sentences in the text: " + numberOfSentences);

    }
}
