public class AlphabetCodes {

    public static void main(String[] args) {
        System.out.println("Кодировки английского алфавита");
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int t = 0; t < alphabet.length(); t++) {
            System.out.println(alphabet.charAt(t) + " - " + (int) alphabet.charAt(t));
        }
        System.out.println("Кодировки русского алфавита");
        String rusAlphabet = "абвгдеёжзийклмнопрстуфхцчшщЪыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩъЫЬЭЮЯ";
        for (int t = 0; t < rusAlphabet.length(); t++) {
            System.out.println(rusAlphabet.charAt(t) + " - " + (int) rusAlphabet.charAt(t));
        }

    }
}
