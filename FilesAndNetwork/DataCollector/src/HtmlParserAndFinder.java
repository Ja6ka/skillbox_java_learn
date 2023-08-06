import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.*;

public class HtmlParserAndFinder {
    public static Map<String, List<String>> parse(String url) {
        Map<String, List<String>> stationsByLines = new LinkedHashMap<>();
        try {
            Document doc = Jsoup.connect(url).get();

            Elements lines = doc.select("div.js-metro-stations");
            Elements lineNames = doc.select("div.js-toggle-depend");
            int lineSelector = 0;

            for (Element line : lines) {
                List<String> stationsListForMap = new ArrayList<>();
                List<Station> stationsList = new ArrayList<>();
                String lineNumber = line.attr("data-line");
                String lineName = lineNames.get(lineSelector).select("span.js-metro-line").text();
                //System.out.println("Линия: " + lineName + " (" + lineNumber + ")");
                Line tempLine = new Line(lineName, lineNumber);
                Elements stations = line.select("p.single-station");
                for (Element station : stations) {
                    String connection = station.select("span.t-icon-metroln").attr("title");
                    String stationName = station.select("span.name").text();
                    stationsListForMap.add(stationName);
                    stationsList.add(new Station(stationName, tempLine, connection.length() > 1));
                    //System.out.println("\tСтанция: " + stationName);
                    if (connection.length() > 1) {
                        //System.out.println("\t\t" + connection);
                    }
                }
                lineSelector++;
                stationsByLines.put(lineName + " " + lineNumber, stationsListForMap);
                Station.addNewStations(stationsList);
                System.out.println("--------------------------------------------------------" + stationsList);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stationsByLines;
    }
}
