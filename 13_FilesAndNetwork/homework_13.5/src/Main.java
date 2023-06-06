import org.json.simple.JSONArray;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://skillbox-java.github.io").maxBodySize(0).get();
        Elements lines = doc.select("span[data-line]");
        Elements stations = doc.select("p.single-station");
//        linesElements.forEach(System.out::println);
//        stationsElements.forEach(System.out::println);
        System.out.println(getStringWithStations(stations));


    }

    private static String getStringWithStations(Elements stations) {
        String regex = "([^0-9\\w]+)([0-9]{1,2})";
        String[] stationsString = stations.text().split("\\.");
        StringBuilder builder = new StringBuilder(stationsString[0]);

        for (int i = 1; i < stationsString.length; i++) {
            String st = stationsString[i];
            int length = st.length();
            if (stationsString[i].matches(regex)) {
                builder.append(st, 0, length - 2).append("\n");
                builder.append(st, length - 2, length);
            } else {
                builder.append(st);
            }
        }
        return builder.toString();
    }
}
