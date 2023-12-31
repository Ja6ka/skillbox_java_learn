import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailList {

    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";
    private final ArrayList<String> emails = new ArrayList<>();

    public void add(String email) {
        if (email != null) {
            Matcher matcher = Pattern.compile("[A-Z]+@[A-Z]+\\.[A-Z]+", Pattern.CASE_INSENSITIVE).matcher(email);
            if (matcher.find() && !emails.contains(email.toLowerCase())) {
                emails.add(email.toLowerCase());
                System.out.println("e-mail добавлен!");
            } else {
                System.out.println(WRONG_EMAIL_ANSWER);
            }
        }
    }

    public void list() {
        Collections.sort(emails);
        for (String email : emails) {
            System.out.println(email);
        }
    }

    public List<String> getSortedEmails() {
        Collections.sort(emails);
        return emails;
    }
}
