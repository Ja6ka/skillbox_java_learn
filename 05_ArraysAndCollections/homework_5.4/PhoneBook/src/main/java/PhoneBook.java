import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class PhoneBook {

    TreeMap<String, String> phoneNumbers = new TreeMap<>();

    public void addContact(String phone, String name) {
        Matcher phoneChecker = Pattern.compile("\\d+").matcher(phone);
        if (!phone.isEmpty() && !name.isEmpty()) {
            if (phoneNumbers.containsValue(phone)) {
                phoneNumbers.put(name, phone);
                System.out.println("Номер уже есть в списке, имя перезаписано!");
            } else if (phoneChecker.find() && !name.matches("\\d+")) {
                phoneNumbers.put(name, phone);
                System.out.println("Номер добавлен!");
            } else {
                System.out.println("Введите номер телефона, начиная с 7");
            }
        }
    }

    public String getNameByPhone(String phone) {
        Scanner scanner = new Scanner(System.in);
        Set<String> allPhones = phoneNumbers.keySet();
        String contact = "";
        boolean hasName = false;
        for (String name : allPhones) {
            if (phoneNumbers.get(name).contains(phone)) {
                contact = name + " - " + phone;
                hasName = true;
                System.out.println(contact);
            }
        }
        if (!hasName) {
            System.out.println("Такого номера нет в телефонной книге." + System.lineSeparator() +
                    "Введите имя абонента для номера " + "\"" + phone + "\"");
            phoneNumbers.put(scanner.nextLine(), phone);
            System.out.println("Контакт сохранен!");
        }
        return contact;
    }

    public Set<String> getPhonesByName(String name) {
        Scanner scanner = new Scanner(System.in);
        Set<String> allNames = phoneNumbers.keySet();
        String contact = "";
        boolean hasName = false;
        for (String nameInBook : allNames) {
            if (nameInBook.equals(name)) {
                contact = name + " - " + phoneNumbers.get(name);
                hasName = true;
                System.out.println(contact);
            }
        }
        if (hasName) {
            return allNames;
        } else {
            System.out.println("Такого имени в телефонной книге нет" + System.lineSeparator() +
                    "Введите номер для контакта " + "\"" + name + "\"");
            phoneNumbers.put(name, scanner.nextLine());
            System.out.println("Контакт сохранен!");
            return new TreeSet<>();
        }
    }

    public Set<String> getAllContacts() {
        if (!phoneNumbers.isEmpty()) {
            for (String contact : phoneNumbers.keySet()) {
                System.out.println(contact + " - " + phoneNumbers.get(contact));
            }
            return phoneNumbers.keySet();
        } else {
            return new TreeSet<>();
        }
    }
}