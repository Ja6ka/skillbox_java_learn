import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        int salary = calculateSalarySum("Вася заработал 5115 рублей, Витя 2345, а Вова - проблемы");
        System.out.println(salary);
    }

    public static int calculateSalarySum(String text) {
        int sum = 0;
        Matcher digitFinder = Pattern.compile("\\d+").matcher(text);
        while (digitFinder.find()) {
            int value = Integer.parseInt(digitFinder.group());
            sum += value;
        }
        return sum;
    }
}

