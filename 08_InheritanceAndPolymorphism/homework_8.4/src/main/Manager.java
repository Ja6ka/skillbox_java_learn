public class Manager implements Employee {

    private final static int MANAGER_SALARY = 50000;
    private final static StaffTypes staffType = StaffTypes.MANAGER;

    @Override
    public int getMonthSalary() {
        return MANAGER_SALARY + (int) (getManagerIncome() * 0.05);
    }


    @Override
    public StaffTypes getStaffType() {
        return staffType;
    }

    public int getManagerIncome() {
        return (int) (Math.random() * 25000 + 115000);
    }

    @Override
    public String toString() {
        return StaffTypes.MANAGER + " - " + getMonthSalary();
    }
}
