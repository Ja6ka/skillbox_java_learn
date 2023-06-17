import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;


public class HTMLParser {
    public static void parseAndPrintLinesAndStations(String htmlFilePath) throws IOException {
        Document doc = Jsoup.connect(htmlFilePath).get();
        Elements lines = doc.select("div[data-line]");
        ArrayList<Line> metroLines = new ArrayList<>();

        for (Element line : lines) {
            String lineNumber = line.attr("data-line");
            String lineName = line.select("h2").text();
            Line metroLine = new Line(lineName, lineNumber);
            Elements stations = line.select("span.name");
            for (Element station : stations) {
                Station metroStation = new Station(station.text(), metroLine);
                metroLine.addStation(metroStation);
            }
            metroLines.add(metroLine);
        }

        for (Line line : metroLines) {
            System.out.println(line.getLineName() + " (" + line.getLineNumber() + ")");
            for (Station station : line.getStationList()) {
                System.out.println("\t" + station.getStationName());
            }
        }
    }
}
