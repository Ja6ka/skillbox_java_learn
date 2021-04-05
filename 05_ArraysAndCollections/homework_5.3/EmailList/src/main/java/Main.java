import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        EmailList myList = new EmailList();
        Pattern emailPattern = Pattern.compile("[A-Z]+@[A-Z]+\\.[A-Z]+", Pattern.CASE_INSENSITIVE);
        Pattern splitter = Pattern.compile(" ");

        while (true) {

            System.out.println("Введите *ADD* и нужный e-mail");
            String input = scanner.nextLine();
            input = input.replaceAll("\\s\\s", " ").trim();

            String[] inputByWords = splitter.split(input);
            String command = inputByWords[0];

            if (command.equalsIgnoreCase("ADD")) {
                String email = inputByWords[1];
                Matcher matcher = emailPattern.matcher(email);
                if (matcher.find()) {
                    myList.add(email);
                }
            } else if (command.equalsIgnoreCase("LIST")) {
                myList.list();
            }
        }
    }
}
