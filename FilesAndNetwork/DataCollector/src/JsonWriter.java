import com.google.gson.Gson;
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
}
