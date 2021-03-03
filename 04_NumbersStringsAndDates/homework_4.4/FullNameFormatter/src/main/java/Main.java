import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0") || input.equals("") || input.equals(" ")) {
                System.out.println("Введенная строка не является ФИО");
                break;
            }
            String fio = input.trim();

            int indexOfSpace1 = fio.indexOf(' ');
            int indexOfSpace2 = fio.lastIndexOf(' ');

            String name = fio.substring(indexOfSpace1, indexOfSpace2);
            String surname = fio.substring(0, indexOfSpace1);
            String patronymic = fio.substring(indexOfSpace2);

            if (name.trim().contains(" ")) {
                System.out.println("Введенная строка не является ФИО");
                break;
            }

            System.out.println("Фамилия: " + surname.trim() + "\nИмя: " + name.trim() + "\nОтчество: " + patronymic.trim());
        }
    }
}