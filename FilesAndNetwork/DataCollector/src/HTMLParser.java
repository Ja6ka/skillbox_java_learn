import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HTMLParser {
    public static void main(String[] args) {
        try {
            String url = "https://skillbox-java.github.io";
            Document doc = Jsoup.connect(url).get();

            Elements lines = doc.select("div.js-metro-stations");
            Elements lineNames = doc.select("div.js-toggle-depend");
            int lineSelector = 0;

            for (Element line : lines) {

                String lineNumber = line.attr("data-line");
                String lineName = lineNames.get(lineSelector).select("span.js-metro-line").text();
                System.out.println("Линия: " + lineName + " (" + lineNumber + ")");

                Elements stations = line.select("span.name");
                for (Element station : stations) {
                    String stationName = station.text();
                    System.out.println("\tСтанция: " + stationName);
                }
                lineSelector++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
