import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            Matcher letter = Pattern.compile("[a-zA-z]").matcher(input);
            if (letter.find()) {
                System.out.println("Неверный формат номера");
                break;
            }
            StringBuilder number = new StringBuilder();
            Matcher digits = Pattern.compile("\\d+").matcher(input);
            while (digits.find()) {
                number.append(digits.group());
            }
            String[] s = number.toString().split("");
            if (number.length() == 11 && s[0].equals("7")) {
                System.out.println(number);
            } else if (number.length() == 11 && s[0].equals("8")) {
                System.out.println("7" + number.substring(1));
            } else if (number.length() == 10) {
                System.out.println("7" + number);
            } else {
                System.out.println("Неверный формат номера");
            }
        }
    }
}
