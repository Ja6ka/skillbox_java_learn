import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerStorage {
    private final Map<String, Customer> storage;

    public CustomerStorage() {
        storage = new HashMap<>();
    }

    public void addCustomer(String data) {


        final int INDEX_NAME = 0;
        final int INDEX_SURNAME = 1;
        final int INDEX_EMAIL = 2;
        final int INDEX_PHONE = 3;


        String[] components = data.split("\\s+");
        if (components.length != 4) {
            throw new IllegalArgumentException("Wrong format! Correct format: add Василий Петров vasily.petrov@gmail.com +79215637722");
        }
        Pattern phonePattern = Pattern.compile("\\+7([0-9]){10}");
        Pattern emailPattern = Pattern.compile("\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{2,4}");
        Matcher phoneMatcher = phonePattern.matcher(components[INDEX_PHONE]);
        Matcher emailMatcher = emailPattern.matcher(components[INDEX_EMAIL]);

        if (phoneMatcher.find() && emailMatcher.find()) {
            String name = components[INDEX_NAME] + " " + components[INDEX_SURNAME];
            storage.put(name, new Customer(name, components[INDEX_PHONE], components[INDEX_EMAIL]));
        } else {
            throw new IllegalArgumentException("Wrong phone or email format!" +
                    System.lineSeparator() + "Correct phone format: \"+7\" then 10 digits" +
                    System.lineSeparator() + "Correct email format: yourmail@domain.name");
        }

    }

    public void listCustomers() {
        if (storage.isEmpty()) {
            System.out.println("There are no customers!");
        } else storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name) {
        storage.remove(name);
    }

    public Customer getCustomer(String name) {
        return storage.get(name);
    }

    public int getCount() {
        return storage.size();
    }
}