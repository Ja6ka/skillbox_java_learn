public class Station {

    private static Integer count = 0;
    private String stationName;
    private Line line;

    public Station(String stationName, Line line) {
        this.stationName = stationName;
        this.line = line;
        count++;
    }

    public Station() {
    }

    public String getStationName() {
        return stationName;
    }

    public Line getLine() {
        return line;
    }

    public static Integer getCount() {
        return count;
    }
}
