public class ReverseArray {

    public static String[] reverse(String[] strings) {
        String changer = "";
        for (int i = 0; i < strings.length / 2; i++) {
            changer = strings[strings.length - i - 1];
            strings[strings.length - i - 1] = strings[i];
            strings[i] = changer;
        }
        return strings;
    }
}
