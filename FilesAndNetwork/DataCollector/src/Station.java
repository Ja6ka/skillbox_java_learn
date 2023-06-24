import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Station {

    private String name;
    private String date;
    private String depth;
    private Line line;

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

    public static List<Station> readJsonFile(String filePath) {
        try (FileReader reader = new FileReader(filePath,  StandardCharsets.UTF_8)) {
            Gson gson = new Gson();
            Type listType = new TypeToken<ArrayList<Station>>() {}.getType();
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
        this.date=date;
    }

    public void setDepth(String depth) {
        this.depth=depth;
    }
}
