public class TopManager implements Employee {

    private final static int TOP_MANAGER_SALARY = 200000;
    private final static StaffTypes staffType = StaffTypes.TOP_MANAGER;

    @Override
    public int getMonthSalary() {
        if (Company.getIncome() > 500000) {
            return (int) (TOP_MANAGER_SALARY * 2.5);
        } else {
            return TOP_MANAGER_SALARY;
        }
    }

    @Override
    public StaffTypes getStaffType() {
        return staffType;
    }

    @Override
    public String toString() {
        return StaffTypes.TOP_MANAGER + " - " + getMonthSalary();
    }
}
