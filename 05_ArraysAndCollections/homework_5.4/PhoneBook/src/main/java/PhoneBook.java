import java.util.Collections;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneBook {

    TreeMap<String, String> phoneNumbers = new TreeMap<>();


    public void addContact(String phone, String name) {
        Matcher phoneChecker = Pattern.compile("\\d+").matcher(phone);
        if (phoneChecker.find()) {
            phoneNumbers.put(name, phone);
            System.out.println("Номер добавлен!");
        }
        if (phoneNumbers.containsValue(phone)) {
            phoneNumbers.put(name, phone);
            System.out.println("Номер уже есть в списке, имя перезаписано!");
        }
    }
    // проверьте корректность формата имени и телефона
    // если такой номер уже есть в списке, то перезаписать имя абонента

    public String getNameByPhone(String phone) {
        String contact = "";
        if (phoneNumbers.containsValue(phone)) {
            contact = phoneNumbers.get(phone) + " - " + phone;
        }
        System.out.println(contact);
        // формат одного контакта "Имя - Телефон"
        // если контакт не найдены - вернуть пустую строку
        return contact;
    }

    public Set<String> getPhonesByName(String name) {
        Set<String> phones = phoneNumbers.keySet();
        String contact;
        for (String nameInBook : phones) {
            if (nameInBook.equals(name)) {
                contact = name + " - " + phoneNumbers.get(name);
                System.out.println(contact);
            }
        }
        // формат одного контакта "Имя - Телефон"
        // если контакт не найден - вернуть пустой TreeSet
        return phones;
    }

    public Set<String> getAllContacts() {
        // формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet
        if (!phoneNumbers.isEmpty()) {
            for (String contact :
                    phoneNumbers.keySet()) {
                System.out.println(contact + " - " + phoneNumbers.get(contact));
            }
            return phoneNumbers.keySet();
        } else {
            return new TreeSet<>();
        }
    }
}