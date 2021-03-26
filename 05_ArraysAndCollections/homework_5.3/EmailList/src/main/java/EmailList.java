import java.util.*;

public class EmailList {

    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";
    private static final Set<String> emails = new TreeSet<>();

    public void add(String email) {
        if (email != null && !emails.contains(email.toLowerCase())) {
            emails.add(email.toLowerCase());
            System.out.println("e-mail добавлен!");
        } else {
            System.out.println(WRONG_EMAIL_ANSWER);
        }
    }

    public void list() {
        for (String email : emails) {
            System.out.println(email);
        }
    }

    public Set<String> getSortedEmails() {
        return emails;
    }
}
