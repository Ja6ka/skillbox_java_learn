public interface Employee extends Comparable<Employee> {

    StaffTypes getStaffType();

    int getMonthSalary();

    @Override
    default int compareTo(Employee o) {
        return Double.compare(getMonthSalary(), o.getMonthSalary());
    }
}
