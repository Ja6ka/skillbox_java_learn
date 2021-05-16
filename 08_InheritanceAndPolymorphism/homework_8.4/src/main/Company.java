import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class Company {

    private static final int RANDOM_PART = 5000000;
    private static final int FIX_PART = 7500000;
    List<Employee> staff = new ArrayList<>();

    public void hire(Employee employee) {
        staff.add(employee);
    }

    public void hireFromList(List<Employee> employeeList) {
        staff.addAll(employeeList);
    }

    public void fire(Employee employee) {
        staff.remove(employee);
    }

    public void printStaff() {
        System.out.println("List of employees and their month salaries: ");
        for (Employee employee : staff) {
            System.out.println(employee.getProfession() + " - " + employee.getMonthSalary());
        }
    }

    public ArrayList<Employee> getLowestSalaryStaff(int count) {
        int size = staff.size();
        ArrayList<Employee> temp = new ArrayList<>();
        staff.sort(Comparator.comparing(Employee::getMonthSalary));
        if (count <= size) {
            for (int i = 0; i < count; i++) {
                temp.add(staff.get(i));
            }
        }
        return temp;
    }

    public ArrayList<Employee> getTopSalaryStaff(int count) {
        int size = staff.size();
        ArrayList<Employee> temp = new ArrayList<>();
        staff.sort(Comparator.comparing(Employee::getMonthSalary));
        if (count <= size) {
            for (int i = size - 1; i >= size - count; i--) {
                temp.add(staff.get(i));
            }
        }
        return temp;
    }

    public static int getIncome() {
        return (int) (Math.random() * RANDOM_PART + FIX_PART);
    }
}
