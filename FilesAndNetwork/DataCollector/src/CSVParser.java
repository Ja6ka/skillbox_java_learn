import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CSVParser {

    public static List<Station> readCsvFile(String filePath) {
        List<Station> stations = new ArrayList<>();
        Map<String, Station> stationMap = new HashMap<>();

        try (CSVReader reader = new CSVReader(new FileReader(filePath, StandardCharsets.UTF_8))) {
            String[] line;

            while ((line = reader.readNext()) != null) {
                if (line[1].trim().equals("Глубина")) {
                    return csvWithDepths(filePath);
                } else if (line[1].trim().equals("Дата открытия")){
                    return csvWithDates(filePath);
                }
            }
        }
        catch(IOException | CsvValidationException e){
            e.printStackTrace();
        }
        return stations;
    }

    public static List<Station> csvWithDates(String filePath) {

        List<Station> stations = new ArrayList<>();
        Map<String, Station> stationMap = new HashMap<>();

        try (CSVReader reader = new CSVReader(new FileReader(filePath, StandardCharsets.UTF_8))) {
            String[] line;
            boolean isFirstLine = true;

            while ((line = reader.readNext()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }
                String stationName = line[0].trim();
                String date = line[1].trim();

                Station station = stationMap.get(stationName);
                if (station == null) {
                    station = new Station(stationName);
                    stations.add(station);
                    stationMap.put(stationName, station);
                }
                station.setDate(date);
            }
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
        return stations;
    }

    public static List<Station> csvWithDepths(String filePath) {
        List<Station> stations = new ArrayList<>();
        Map<String, Station> stationMap = new HashMap<>();

        try (CSVReader reader = new CSVReader(new FileReader(filePath, StandardCharsets.UTF_8))) {
            String[] line;
            boolean isFirstLine = true;

            while ((line = reader.readNext()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }
                String stationName = line[0].trim();
                String depth = line[1].trim();

                Station station = stationMap.get(stationName);
                if (station == null) {
                    station = new Station(stationName);
                    stations.add(station);
                    stationMap.put(stationName, station);
                }
                station.setDepth(depth);
            }
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
        return stations;
    }
}
