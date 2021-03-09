import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String information = searchAndReplaceDiamonds("1234 1234 <секретные циферки> 1234 <и ещё>", "***");
        System.out.println(information);
    }

    public static String searchAndReplaceDiamonds(String text, String placeholder) {
        Matcher diamonds = Pattern.compile("([<]).*?([>])").matcher(text);
        if (!diamonds.find()) {
            return text;
        }
        text = text.replaceAll("([<]).*?([>])", placeholder);
        return text;
    }
}