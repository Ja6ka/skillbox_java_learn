import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        int day = 20;
        int month = 12;
        int year = 1996;

        System.out.println(collectBirthdays(year, month, day));

    }

    public static String collectBirthdays(int year, int month, int day) {
        int count = 0;
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy - E", Locale.ENGLISH);
        SimpleDateFormat monthFormat = new SimpleDateFormat("MM");
        Calendar currentDate = Calendar.getInstance();
        Calendar birthday = Calendar.getInstance();
        birthday.set(Calendar.DATE, day);
        birthday.set(Calendar.MONTH, month - 1);
        birthday.set(Calendar.YEAR, year);
        StringBuilder text = new StringBuilder();
        if (birthday.getTimeInMillis() > currentDate.getTimeInMillis()) {
            return "";
        }
        for (birthday.getWeekYear(); birthday.getTimeInMillis() <= currentDate.getTimeInMillis(); ) {
            text.append(count).append(" - ").append(format.format(birthday.getTime())).append(System.lineSeparator());
            count++;
            birthday.add(Calendar.YEAR, 1);
        }
        return text.toString();
    }
}
