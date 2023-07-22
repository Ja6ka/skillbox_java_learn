import com.google.gson.internal.bind.util.ISO8601Utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        String htmlFilePath = "https://skillbox-java.github.io";
        HTMLParser.parseLinesAndStations(htmlFilePath);

        String folderPath = "C:\\java_basics\\FilesAndNetwork\\DataCollector\\lib\\data";
       String jsonFilePath = "C:\\java_basics\\FilesAndNetwork\\DataCollector\\lib\\data\\data\\0\\5\\dates-2.json";
       List<Station> stationsJSON = Station.readJsonFile(jsonFilePath);

        List<String> parsedFiles = new ArrayList<>(JSONAndCSVFinder.searchForCSVAndJSONFiles(folderPath));
        for (String parsedFile : parsedFiles) {
            Station.addNewStations(CSVParser.readCsvFile(parsedFile));
        }
        Station.printStations();
    }
}