import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class JsonWriter {

    public static void writeStationsByLinesJSON(Map<String, List<String>> stationsByLines, String filePath) {
        JsonObject jsonObject = new JsonObject();

        stationsByLines.forEach((lineNumber, stationList) -> {
            jsonObject.add(String.valueOf(lineNumber), new Gson().toJsonTree(stationList));
        });

        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write(jsonObject.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeStationsJSON(Map<String, Station> allStations, String filePath) {
        JsonArray jsonArray = new JsonArray();

        for (Station station : allStations.values()) {
            JsonObject stationObject = new JsonObject();
           if (station.getName() != null) {
               stationObject.addProperty("name", station.getName());
           }
           if (station.getLine() != null) {
               stationObject.addProperty("line", station.getLine().getLineName());}
            if (station.getDate() != null) {
                stationObject.addProperty("date", station.getDate());
            }
            if (station.getDepth() != null) {
                stationObject.addProperty("depth", station.getDepth());
            }
            if (station.getLine() != null) {
                stationObject.addProperty("hasConnection", station.isHasConnection());
            }
            jsonArray.add(stationObject);
        }

        JsonObject stationsObject = new JsonObject();
        stationsObject.add("stations", jsonArray);

        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write(stationsObject.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
