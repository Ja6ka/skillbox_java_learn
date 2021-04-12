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
            if (input.trim().matches("7[0-9]{10}")) {
                book.getNameByPhone(input.trim());
            } else {
                book.getPhonesByName(input.trim());
            }
        }
    }
}
