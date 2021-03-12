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
            StringBuilder number = new StringBuilder();
            Matcher digits = Pattern.compile("^\\+?[7-8][ (-]*[9]([( -]*[\\d][ )-]*){9}$|^[ (-]?[9]([( -]*[\\d][ )-]*){9}$").matcher(input);
            while (digits.find()) {
                number.append(digits.group());
            }
            StringBuilder normal = new StringBuilder();
            Matcher tester = Pattern.compile("\\d+").matcher(number);
            while (tester.find()) {
                normal.append(tester.group());
            }
            String[] s = normal.toString().split("");
            if (normal.length() == 11 && s[0].equals("7")) {
                System.out.println(normal);
            } else if (normal.length() == 11 && s[0].equals("8")) {
                System.out.println("7" + normal.substring(1));
            } else if (normal.length() == 10) {
                System.out.println("7" + normal);
            } else {
                System.out.println("Неверный формат номера");
            }
        }
    }
}
