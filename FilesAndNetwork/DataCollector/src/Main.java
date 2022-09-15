import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder builder = new StringBuilder();
        Document doc = Jsoup.connect("https://skillbox-java.github.io").get();
        Elements linesAndStations = doc.select("span.js-metro-line,p,[title^=переход]");
        linesAndStations.forEach(element -> {
            if (element.hasAttr("data-line")) {
                builder.append(element.attr("data-line")).append("\s").append(element.text()).append("\n");
            } else if (element.hasClass("single-station")) {
                builder.append("\t").append(element.text()).append("\n");
            } else if (element.hasAttr("title")) {
                builder.append("\t\t").append(element.attr("title")).append("\n");
            }
        });
        System.out.println(builder);
    }
}
