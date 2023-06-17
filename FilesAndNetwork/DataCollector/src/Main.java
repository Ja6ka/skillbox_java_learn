import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String htmlFilePath = "https://skillbox-java.github.io";
        HTMLParser.parseAndPrintLinesAndStations(htmlFilePath);

        String folderPath = "C:\\java_basics\\FilesAndNetwork\\DataCollector\\lib\\data";
        JSONAndCSVFinder.searchForCSVAndJSONFiles(folderPath);

        String jsonFilePath = "C:\\java_basics\\FilesAndNetwork\\DataCollector\\lib\\data\\data\\0\\5\\dates-2.json";
        List<Station> stations = Station.readJsonFile(jsonFilePath);
        if (stations != null) {
            for (Station station : stations) {
                System.out.println("Название станции: " + station.getName());
                System.out.println("Дата открытия: " + station.getDate());
                System.out.println();
            }
        }
    }
}