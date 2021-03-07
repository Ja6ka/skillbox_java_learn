import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals(" ") || input.equals("")) {
                System.out.println("Введенная строка не является ФИО");
                break;
            }
            String[] s = input.split(" ");
            if (s.length != 3) {
                System.out.println("Введенная строка не является ФИО");
                break;
            }
            Matcher punct = Pattern.compile("[\\p{Punct}&&[^\\-]]").matcher(input);
            if (punct.find()) {
                System.out.println("Введенная строка не является ФИО");
                break;
            }
            Matcher other = Pattern.compile("([a-zA-Z0-9])").matcher(input);
            if (other.find()) {
                System.out.println("Введенная строка не является ФИО");
                break;
            } else {
                System.out.print("Фамилия: " + s[0].trim() + System.lineSeparator() + "Имя: " + s[1].trim() +
                        System.lineSeparator() + "Отчество: " + s[2].trim());
            }
            return;
        }
    }
}