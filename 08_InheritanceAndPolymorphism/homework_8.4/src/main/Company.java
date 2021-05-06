import java.util.*;
import java.util.Comparator;

public class Company {

    List<Employee> staff = new ArrayList<>();

    public void hire(StaffTypes typeOfEmployee) {
        if (typeOfEmployee.equals(StaffTypes.OPERATOR)) {
            staff.add(new Operator());
        } else if (typeOfEmployee.equals(StaffTypes.MANAGER)) {
            staff.add(new Manager());
        } else if (typeOfEmployee.equals(StaffTypes.TOP_MANAGER)) {
            staff.add(new TopManager());
        }
    }

    public void fire(StaffTypes typeOfEmployee) {

    }

    public void printStaff() {
        System.out.println("List of employees and their month salaries: ");
        for (Employee employee : staff) {
            System.out.println(employee.getStaffType() + " - " + employee.getMonthSalary());
        }
    }

    public ArrayList<Employee> getLowestSalaryStaff(int count) {
        ArrayList<Employee> temp = new ArrayList<>();
        staff.sort(Comparator.comparing(Employee::getMonthSalary));
        for (int i = 0; i < count; i++) {
            temp.add(staff.get(i));
        }
        return temp;
    }

    public ArrayList<Employee> getTopSalaryStaff(int count) {
        ArrayList<Employee> temp = new ArrayList<>();
        staff.sort(Comparator.comparing(Employee::getMonthSalary));
        for (int i = staff.size() - 1; i >= staff.size() - count; i--) {
            temp.add(staff.get(i));
        }
        return temp;
    }

    public static int getIncome() {
        return (int) (Math.random() * 500000 + 500000);
    }
}
