import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        String htmlFilePath = "https://skillbox-java.github.io";


        String folderPath = "C:\\java_basics\\FilesAndNetwork\\DataCollector\\lib\\data";
        String jsonFilePath = "C:\\java_basics\\FilesAndNetwork\\DataCollector\\lib\\data\\data\\4\\6\\depths-3.json";

        List<String> parsedFilesFromCsv = new ArrayList<>(JSONAndCSVFinder.searchForCSVAndJSONFiles(folderPath));
        for (String parsedFile : parsedFilesFromCsv) {
            Station.addNewStations(CSVParser.readCsvFile(parsedFile));
            Station.addNewStations(JSONParser.readJsonFile(parsedFile));
            Station.printStations();
        }
    }
}