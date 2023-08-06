import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import java.util.*;

public class Station {

    @SerializedName(value = "station_name", alternate = {"name"})
    private String name;
    private String date;
    @SerializedName(value = "depth_meters", alternate = {"depth"})
    private String depth;
    private Line line;
    public boolean hasConnection;
    public static final Map<String, Station> allStations = new TreeMap<>();

    public Station(String name, Line line, boolean hasConnection) {
        this.name = name;
        this.line = line;
        this.hasConnection = hasConnection;
    }

    public Station(String name) {

    }

    public static void addNewStations(List<Station> stations) {
        for (Station station : stations) {
            String name = station.name;
            String date = station.date;
            String depth = station.depth;

            allStations.putIfAbsent(name, station);
            if (depth != null && allStations.containsKey(name)) {
                allStations.get(name).setDepth(depth);
            }
            if (date != null && allStations.containsKey(name)) {
                allStations.get(name).setDate(date);
            }
                allStations.get(name).hasConnection = station.hasConnection;
        }
    }

    public static void printStations() {
        for (Station station : allStations.values()) {
            System.out.println(station.toString());
        }
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

    public boolean isHasConnection() {
        return hasConnection;
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
            stationString.append("Линия: ").append(line).append("\n").append("\t");
        }
        stationString.append("Переход: ").append(hasConnection).append("\n");
        return stationString.toString();
    }

}
