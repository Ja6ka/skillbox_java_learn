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

            int digit = 0;

            for (int i = 0; i < +fio.length(); i++) {
                char c = fio.charAt(i);
                if (c >= '0' && c <= '9') {
                    System.out.println("Введенная строка не является ФИО");
                    digit = 1;
                    break;
                }
            }
            if (digit == 1) {
                break;
            }

            if (digit == 0) {
                int indexOfSpace1 = fio.indexOf(' ');
                int indexOfSpace2 = fio.lastIndexOf(' ');
                String name;
                if (fio.contains(" ")) {
                    name = fio.substring(indexOfSpace1, indexOfSpace2);
                } else {
                    System.out.println("Введенная строка не является ФИО");
                    break;
                }
                String surname = fio.substring(0, indexOfSpace1);
                String patronymic = fio.substring(indexOfSpace2);
                if (name.trim().contains(" ") || name.equals("")) {
                    System.out.println("Введенная строка не является ФИО");
                } else {
                    System.out.println("Фамилия: " + surname.trim() + System.lineSeparator() + "Имя: " + name.trim()
                            + System.lineSeparator() + "Отчество: " + patronymic.trim());
                }
                break;
            }
        }
    }
}