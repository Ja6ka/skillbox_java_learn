public class TopManager implements Employee {

    private final static int TOP_MANAGER_SALARY = 200000;
    private static final int MIN_REWARD_INCOME = 10000000;

    @Override
    public int getMonthSalary() {
        if (Company.getIncome() > MIN_REWARD_INCOME) {
            return (int) (TOP_MANAGER_SALARY * 2.5);
        } else {
            return TOP_MANAGER_SALARY;
        }
    }

    @Override
    public int compareTo() {
        return 0;
    }

    @Override
    public String getProfession() {
        return "Top-Manager";
    }

    @Override
    public String toString() {
        return "Топ-менеджер - " + getMonthSalary();
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(getMonthSalary(), o.getMonthSalary());
    }
}
