import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Main {

    public static void main(String[] args) throws IOException {

            Document doc = Jsoup.connect("https://lenta.ru").get();
            Elements bigImageElements = doc.select("img.card-big__image");
            Elements cardFeatureElements = doc.select("img.card-feature__image");
            Elements miniImageElements = doc.select("img.card-mini__image");
            Elements cardPhotoElements = doc.select("img.card-photo__image");

            StringBuilder builder = new StringBuilder("Список скачанных файлов:\n");

            bigImageElements.forEach(element -> {
                String link = element.absUrl("src");
                String[] buf = link.split("/");
                String fileName = buf[buf.length - 1];

                try (InputStream in = new URL(link).openStream()) {
                    Files.copy(in, Paths.get
                            ("C:\\java_basics\\13_FilesAndNetwork\\homework 13.4\\images\\" + fileName));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                builder.append(fileName).append("\n");
            });

            cardFeatureElements.forEach(element -> {
                String link = element.absUrl("src");
                String[] buf = link.split("/");
                String fileName = buf[buf.length - 1];

                try (InputStream in = new URL(link).openStream()) {
                    Files.copy(in, Paths.get
                            ("C:\\java_basics\\13_FilesAndNetwork\\homework 13.4\\images\\" + fileName));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                builder.append(fileName).append("\n");
            });

            miniImageElements.forEach(element -> {
                String link = element.absUrl("src");
                String[] buf = link.split("/");
                String fileName = buf[buf.length - 1];

                try (InputStream in = new URL(link).openStream()) {
                    Files.copy(in, Paths.get
                            ("C:\\java_basics\\13_FilesAndNetwork\\homework 13.4\\images\\" + fileName));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                builder.append(fileName).append("\n");
            });

            cardPhotoElements.forEach(element -> {
                String link = element.absUrl("src");
                String[] buf = link.split("/");
                String fileName = buf[buf.length - 1];

                try (InputStream in = new URL(link).openStream()) {
                    Files.copy(in, Paths.get
                            ("C:\\java_basics\\13_FilesAndNetwork\\homework 13.4\\images\\" + fileName));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                builder.append(fileName).append("\n");
            });

            System.out.println(builder);
    }
}
