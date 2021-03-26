import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static final EmailList mailList = new EmailList();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите *ADD* и нужный e-mail");
            String input = scanner.nextLine();

            input = input.replaceAll("\\s\\s", " ").trim();
            Pattern pattern = Pattern.compile("([A-Z]*)(\\s+[A-Z]+@[A-Z]+\\.[A-Z]+)?", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                String command = matcher.group(1);
                String email = matcher.group(2);

                if (command.equals("ADD")) {
                    mailList.add(email);
                }

                if (command.equals("LIST")) {
                    mailList.list();
                }
            }
        }
    }
}
