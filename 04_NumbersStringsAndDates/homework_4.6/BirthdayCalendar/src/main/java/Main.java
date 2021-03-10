import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        int day = 20;
        int month = 12;
        int year = 2021;

        System.out.println(collectBirthdays(year, month, day));

    }

    public static String collectBirthdays(int year, int month, int day) {
        String birthdayDate = year + " " + month + " " + day;
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("yyyy MM dd");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy - E", Locale.ENGLISH);
        LocalDate current = LocalDate.now();
        LocalDate birthday = LocalDate.parse(birthdayDate, parser);
        StringBuilder date = new StringBuilder();
        if (birthday.isAfter(current)) {
            System.out.println("Неправильная дата рождения!");
        } else {
            int count = 0;
            while (birthday.isBefore(current)) {
                date.append(count).append(" - ").append(birthday.format(formatter)).append(System.lineSeparator());
                birthday = birthday.plusYears(1);
                count++;
            }
        }
        return date.toString();
    }
}
