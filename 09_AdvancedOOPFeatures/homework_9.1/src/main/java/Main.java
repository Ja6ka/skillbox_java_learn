import java.util.List;

public class Main {

    public static final String STAFF_TXT = "data/staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
        sortBySalaryAndAlphabet(staff);
        System.out.println(staff);
    }

    public static void sortBySalaryAndAlphabet(List<Employee> staff) {
        staff.sort(((o1, o2) -> {
            int i;
            i = o1.getSalary().compareTo(o2.getSalary());
            if (o1.getSalary().equals(o2.getSalary())) {
                i = o1.getName().compareTo(o2.getName());
            }
            return i;
        }));
    }
}