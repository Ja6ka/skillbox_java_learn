import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class HTMLParser {
    public static void main(String[] args) {
        try {
            String url = "https://skillbox-java.github.io";
            Document doc = Jsoup.connect(url).get();

            Elements lines = doc.select("div[data-line]");

            for (Element line : lines) {
                String lineNumber = line.attr("data-line");
                String lineName = line.select("h2").text();
                System.out.println("Линия: " + lineName + " (" + lineNumber + ")");

                Elements stations = line.select("span.name");
                for (Element station : stations) {
                    String stationName = station.text();
                    System.out.println("\tСтанция: " + stationName);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
