import java.util.ArrayList;
import java.util.List;

public class Line {

    private static Integer count = 0;
    private final String lineName;
    private String lineNumber;
    private List<Station> stationList;
    public static List <Line> allLines = new ArrayList<>();

    public Line(String lineName, String lineNumber) {
        this.lineName = lineName;
        this.lineNumber = lineNumber;
        stationList = new ArrayList<>();;
        count++;
    }

    public Line(String lineName) {
        this.lineName = lineName;
    }

    @Override
    public String toString() {
        return lineName;
    }

    public String getLineName() {
        return lineName;
    }

    public String getLineNumber() {
        return lineNumber;
    }

    public List<Station> getStationList() {
        return stationList;
    }

    public void addStation(Station station) {
        stationList.add(station);
    }

    public static Integer getCount() {
        return count;
    }

}
