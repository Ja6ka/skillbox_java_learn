import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import com.google.gson.*;


import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder builder = new StringBuilder();
        Document doc = Jsoup.connect("https://skillbox-java.github.io").get();
        Elements linesAndStations = doc.select("span.js-metro-line,p,[title^=переход]");

        linesAndStations.forEach(element -> {
            if (element.hasAttr("data-line")) {
                new Line(element.text(), element.attr("data-line"));
                builder.append("!\s").append(element.attr("data-line")).append("\s").append(element.text()).append("\n");
            }

            if (element.hasClass("single-station")) {
                builder.append("\t").append(element.text()).append("\n");
            }

            if (element.hasClass("t-icon-metroln ln-2")) {
                builder.append("\t\t").append(element.attr("title")).append("\n");
            }
        });
        System.out.println(builder);
        System.out.println(linesAndStations);
        System.out.println(Line.getCount());
    }
}
