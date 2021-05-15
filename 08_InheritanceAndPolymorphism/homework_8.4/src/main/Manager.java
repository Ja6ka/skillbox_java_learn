public class Manager implements Employee {

    private final static int MANAGER_SALARY = 50000;
    private static final int RANDOM_PART = 25000;
    private static final int FIX_PART = 115000;
    private static final double EARNED_MONEY_PERCENT = 0.05;

    @Override
    public int getMonthSalary() {
        return MANAGER_SALARY + (int) (getManagerIncome() * EARNED_MONEY_PERCENT);
    }

    @Override
    public int compareTo() {
        return 0;
    }

    public int getManagerIncome() {
        return (int) (Math.random() * RANDOM_PART + FIX_PART);
    }

    @Override
    public String toString() {
        return "Менеджер - " + getMonthSalary();
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(getMonthSalary(), o.getMonthSalary());
    }
}
