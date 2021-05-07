import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        Employee a = new Operator();
        Employee b = new TopManager();
        Employee c = new Manager();
        Employee d = new TopManager();
        Employee f = new Operator();
        Employee g = new Operator();

        List<Employee> listToHire = Arrays.asList(a, b, c, d, f, g);
        Company apple = new Company();
        Employee employee = new Operator();
        Employee ivan = new TopManager();
        apple.hire(employee);
        apple.hire(ivan);
        apple.hireFromList(listToHire);
        apple.printStaff();
        apple.fire(ivan);
        apple.printStaff();
    }
}
