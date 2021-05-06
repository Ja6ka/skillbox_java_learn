public class Operator implements Employee {

    private final static int OPERATOR_SALARY = 35000;
    private final static StaffTypes staffType = StaffTypes.OPERATOR;


    @Override
    public int getMonthSalary() {
        return OPERATOR_SALARY;
    }


    @Override
    public StaffTypes getStaffType() {
        return staffType;
    }

    @Override
    public String toString() {
        return StaffTypes.OPERATOR + " - " + getMonthSalary();
    }
}
