import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        String folderPath = "C:\\java_basics\\FilesAndNetwork\\DataCollector\\lib\\data";
        String jsonFilePath = "C:\\java_basics\\FilesAndNetwork\\DataCollector\\lib\\data\\data\\4\\6\\depths-3.json";

        List<String> parsedFilesFromCsv = new ArrayList<>(JSONAndCSVFinder.searchForCSVAndJSONFiles(folderPath));
        for (String parsedFile : parsedFilesFromCsv) {
            Station.addNewStations(CSVParser.readCsvFile(parsedFile));
            Station.addNewStations(JSONParser.readJsonFile(parsedFile));
            Station.printStations();
        }

        String htmlFilePath = "https://skillbox-java.github.io";
        Map<String, List<String>> stationsByLines;
        stationsByLines = HtmlParserAndFinder.parse(htmlFilePath);
        System.out.println(HtmlParserAndFinder.parse(htmlFilePath));
        JsonWriter.writeStationsByLinesJSON(stationsByLines, "C:\\java_basics\\FilesAndNetwork\\DataCollector\\lib\\data\\stationsByLines.json");
    }
}