import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        String htmlFilePath = "https://skillbox-java.github.io";
        HTMLParser.parseAndPrintLinesAndStations(htmlFilePath);

        String folderPath = "C:\\java_basics\\FilesAndNetwork\\DataCollector\\lib\\data";
        JSONAndCSVFinder.searchForCSVAndJSONFiles(folderPath);
    }
}