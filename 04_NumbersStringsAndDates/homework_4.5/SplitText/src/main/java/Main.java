import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String string = splitTextIntoWords("With' it's New York reopening after nearly a year, cinema operators hope that Los Angeles will follow. That might convince the film studios to stop postponing the release dates for the big Hollywood movies that are such a big draw for audiences.\n" +
                "\n" +
                "\"New York theatres opening is huge,\" says Paul Serwitz, president of Landmark Theatres, a chain of 45 theatres focused on independent films, which will reopen its New York venue, Quad Cinema, on Friday.\n" +
                "\n" +
                "Mr Serwitz is not expecting an instant rebound - especially with current rules in New York limiting capacity to 25%, or less than 50 people, per screen.\n" +
                "\n" +
                "The company closed its other New York location last summer, without clear plans to reopen. In other cities, traffic at the company's open theatres remains \"paltry\" - down 90% or more compared to what it was before the pandemic.\n" +
                "\n" +
                "\"The hope is to start driving business and to get people back in the habit and enjoying the experience and realising that it's safe and keeping our losses to a minimum until business conditions allow for a more sustainable operation,\" he says.\n" +
                "\n" +
                "\"We've had a lot of false starts and hopes being thwarted around people returning to leisure activities and the movie theatre specifically,\" he adds. \"I have hopes that by the time we get to mid- to late-spring, we will see a different reality.");
    }

    public static String splitTextIntoWords(String text) {
        if (text.length() == 0) {
            return "";
        }
        Matcher matcher = Pattern.compile("([a-zA-Z&&[^0-9]])+(’[a-zA-Z&&[^0-9]])?").matcher(text);
        String newText = "";
        StringBuilder textBuilder = new StringBuilder(newText);
        while (matcher.find()) {
            textBuilder.append(matcher.group()).append(System.lineSeparator());
        }
        System.out.println(textBuilder);
        String finalText = textBuilder.toString();
        return finalText.substring(0, finalText.length() - 1);
    }
}
