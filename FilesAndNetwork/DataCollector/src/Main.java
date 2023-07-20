import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
//        String htmlFilePath = "https://skillbox-java.github.io";
//        HTMLParser.parseAndPrintLinesAndStations(htmlFilePath);
//
//        String folderPath = "C:\\java_basics\\FilesAndNetwork\\DataCollector\\lib\\data";
//        JSONAndCSVFinder.searchForCSVAndJSONFiles(folderPath);
//
//        String jsonFilePath = "C:\\java_basics\\FilesAndNetwork\\DataCollector\\lib\\data\\data\\0\\5\\dates-2.json";
//        List<Station> stationsJSON = Station.readJsonFile(jsonFilePath);
//        if (stationsJSON != null) {
//            for (Station station : stationsJSON) {
//                System.out.println("Название станции: " + station.getName());
//                System.out.println("Дата открытия: " + station.getDate());
//                System.out.println();
//            }
//        }

        String csvFilePath = "C:\\java_basics\\FilesAndNetwork\\DataCollector\\lib\\data\\data\\4\\6\\dates-1.csv";
        Station.addNewStations(CSVParser.readCsvFile(csvFilePath));
        List<Station> testList = new ArrayList<>();
        testList.add(new Station("Бибирево", "31.12.1992"));
        Station.addNewStations(testList);
        Station.printStations();

    }
}