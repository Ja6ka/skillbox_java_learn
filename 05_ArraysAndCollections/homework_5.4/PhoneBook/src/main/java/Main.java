import java.util.Locale;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите имя или номер: ");
            String input = scanner.nextLine();
            if (input.trim().equals("LIST")) {
                book.getAllContacts();
            }
            if (input.matches("\\d+")) {
                book.getNameByPhone(input.trim());
            }
            if (input.trim().matches("(\\w[^0-9])+")) {
                book.getPhonesByName(input.trim());
            }
            if (input.trim().matches("(\\w[^0-9])+\\s+\\d+")) {
                String [] splitInput = input.split(" ");
                book.addContact(splitInput[1], splitInput[0]);
            }
        }
    }
}
