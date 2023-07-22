import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Station {

    private String name;
    private String date;
    private String depth;
    private Line line;
    private static final Map<String, Station> allStations = new TreeMap<>();

    public Station(String name, Line line) {
        this.name = name;
        this.line = line;
    }

    public Station(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public Station() {
    }

    public Station(String name) {

    }

    public static void addNewStations(List<Station> stations) {
        for (Station station : stations) {
            String name = station.getName();
            String date = station.getDate();
            String depth = station.getDepth();

            allStations.putIfAbsent(name, station);
            if (depth != null && allStations.containsKey(name)) {
                allStations.get(name).setDepth(depth);
            }
            if (date != null && allStations.containsKey(name)) {
                allStations.get(name).setDate(date);
            }
        }
    }

    public static void printStations() {
        for (Station station : allStations.values()) {
            System.out.println(station.toString());
        }
    }

    public static List<Station> readJsonFile(String filePath) {
        try (FileReader reader = new FileReader(filePath, StandardCharsets.UTF_8)) {
            Gson gson = new Gson();
            Type listType = new TypeToken<ArrayList<Station>>() {
            }.getType();
            return gson.fromJson(reader, listType);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getDepth() {
        return depth;
    }

    public Line getLine() {
        return line;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder stationString = new StringBuilder(name + "\n" + "\t");
        if (date != null) {
            stationString.append("Дата открытия: ").append(date).append("\n").append("\t");
        }
        if (depth != null) {
            stationString.append("Глубина: ").append(depth).append("\n").append("\t");
        }
        if (line != null) {
            stationString.append("Линия: ").append(line).append("\n");
        }
        return stationString.toString();
    }
}
