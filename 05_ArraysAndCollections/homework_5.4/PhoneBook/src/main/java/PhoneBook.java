import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneBook {

    TreeMap<String, String> phoneNumbers = new TreeMap<>();

    public void addContact(String phone, String name) {
        Matcher phoneChecker = Pattern.compile("\\d+").matcher(phone);
        if (!phone.isEmpty() && !name.isEmpty()) {
            if (phoneNumbers.containsValue(phone)) {
                String nameToDelete = "";
                for (Map.Entry<String, String> entry : phoneNumbers.entrySet()) {
                    String entryKey = entry.getKey();
                    if (phoneNumbers.get(entryKey).equals(phone)) {
                        nameToDelete = entryKey;
                    }
                }
                phoneNumbers.remove(nameToDelete, phone);
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
        Set<String> nameAndPhone = new TreeSet<>();
        String contact;
        boolean hasName = false;
        for (String nameInBook : allNames) {
            if (nameInBook.equals(name)) {
                contact = name + " - " + phoneNumbers.get(name);
                hasName = true;
                System.out.println(contact);
                nameAndPhone.add(contact);
            }
        }
        if (!hasName) {
            System.out.println("Такого имени в телефонной книге нет" + System.lineSeparator() +
                    "Введите номер для контакта " + "\"" + name + "\"");
            phoneNumbers.put(name, scanner.nextLine());
            System.out.println("Контакт сохранен!");
        }
        return nameAndPhone;
    }

    public Set<String> getAllContacts() {
        Set<String> nameAndPhone = new TreeSet<>();
        String contact = "";
        if (!phoneNumbers.isEmpty()) {
            for (String name : phoneNumbers.keySet()) {
                contact = name + " - " + phoneNumbers.get(name);
                nameAndPhone.add(contact);
                System.out.println(contact);
            }
            return nameAndPhone;
        } else {
            return new TreeSet<>();
        }
    }
}