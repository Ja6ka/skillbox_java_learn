public class Operator implements Employee {

    private final static int OPERATOR_SALARY = 35000;

    @Override
    public int getMonthSalary() {
        return OPERATOR_SALARY;
    }

    @Override
    public int compareTo() {
        return 0;
    }

    @Override
    public String getProfession() {
        return "Operator";
    }

    @Override
    public String toString() {
        return "Оператор - " + getMonthSalary();
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(getMonthSalary(), o.getMonthSalary());
    }
}
