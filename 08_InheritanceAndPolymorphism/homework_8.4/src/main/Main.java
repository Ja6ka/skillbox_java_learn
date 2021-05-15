import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        Employee a = new Operator();
        Employee b = new TopManager();
        Employee c = new Manager();
        Employee d = new TopManager();
        Employee e = new Operator();
        Employee f = new Operator();

        List<Employee> listToHire = Arrays.asList(a, b, c, d, e, f);

        Company apple = new Company();
        Employee employee = new Operator();
        Employee ivan = new TopManager();

        apple.hire(employee);
        apple.hire(ivan);
        apple.hireFromList(listToHire);
        apple.printStaff();

        apple.fire(ivan);
        System.out.println("\n");
        apple.printStaff();
        System.out.println("Зарплаты по возрастанию: " + System.lineSeparator() + apple.getLowestSalaryStaff(7));
        System.out.println("Зарплаты по убыванию: " + System.lineSeparator() + apple.getTopSalaryStaff(7));
    }
}
