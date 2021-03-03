import net.sf.saxon.style.XSLOutput;

public class Diamonds {

    public static void main(String[] args) {
        String safe = searchAndReplaceDiamonds("Номер кредитной карты <1234 6748 4638> 4654", "***");
        System.out.println(safe);
    }

    public static String searchAndReplaceDiamonds(String text, String placeholder) {
        if (!text.contains("<") || !text.contains(">") || text.contains("<<") || text.contains(">>")) {
            System.out.println(text);
            return text;
        }
        int firstDiamond = text.indexOf("<");
        int secondDiamond = text.indexOf(">");
        text = text.substring(0, firstDiamond) + placeholder + text.substring(secondDiamond + 1);
        return text;
    }
}
