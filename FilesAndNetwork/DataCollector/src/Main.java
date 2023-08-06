import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        String htmlFilePath = "https://skillbox-java.github.io";
        Map<String, List<String>> stationsByLines;
        stationsByLines = HtmlParserAndFinder.parse(htmlFilePath);

        String folderPath = "C:\\java_basics\\FilesAndNetwork\\DataCollector\\lib\\data";

        List<String> parsedFilesFromCsvAndJson = new ArrayList<>(JSONAndCSVFinder.searchForCSVAndJSONFiles(folderPath));
        for (String parsedFile : parsedFilesFromCsvAndJson) {
            Station.addNewStations(CSVParser.readCsvFile(parsedFile));
            Station.addNewStations(JSONParser.readJsonFile(parsedFile));
        }

        JsonWriter.writeStationsByLinesJSON(stationsByLines, "C:\\java_basics\\FilesAndNetwork\\DataCollector\\lib\\data\\stationsByLines.json");
        JsonWriter.writeStationsJSON(Station.allStations, "C:\\\\java_basics\\\\FilesAndNetwork\\\\DataCollector\\\\lib\\\\data\\\\stations.json");
    }
}