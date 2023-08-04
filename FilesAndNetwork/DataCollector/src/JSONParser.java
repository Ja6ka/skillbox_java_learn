import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class JSONParser {
    public static List<Station> readJsonFile(String filePath) {
        if (!isJsonFile(filePath)) {
            return new ArrayList<>();
        }
        List<Station> stations = new ArrayList<>();
        Map<String, Station> stationMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath, StandardCharsets.UTF_8))) {
            Gson gson = new GsonBuilder().create();
            Station[] stationArray = gson.fromJson(reader, Station[].class);


            for (Station station : stationArray) {
                String stationName = station.getName();
                String depth = station.getDepth();
                String date = station.getDate();

                Station existingStation = stationMap.get(stationName);
                if (existingStation == null) {
                    station = new Station(stationName);
                    stations.add(station);
                    stationMap.put(stationName, station);
                }
                station.setDepth(depth);
                station.setName(stationName);
                station.setDate(date);
            }
        } catch (IOException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        return stations;
    }

    private static boolean isJsonFile(String filePath) {
        Path path = Paths.get(filePath);
        String fileExtension = path.getFileName().toString().toLowerCase();
        return fileExtension.endsWith(".json");
    }
}
