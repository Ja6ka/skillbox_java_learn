public class Station {

    private String stationName;
    private Line line;

    public Station(String stationName, Line line) {
        this.stationName = stationName;
        this.line = line;
    }

    public Station() {
    }

    public String getStationName() {
        return stationName;
    }

    public Line getLine() {
        return line;
    }
}
