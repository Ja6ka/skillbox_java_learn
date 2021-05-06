public class Main {


    public static void main(String[] args) {

        Company apple = new Company();
        apple.hire(StaffTypes.MANAGER);
        apple.hire(StaffTypes.OPERATOR);
        apple.hire(StaffTypes.TOP_MANAGER);
        apple.hire(StaffTypes.MANAGER);
        apple.hire(StaffTypes.OPERATOR);
        apple.hire(StaffTypes.TOP_MANAGER);
        apple.hire(StaffTypes.MANAGER);
        apple.hire(StaffTypes.OPERATOR);
        apple.hire(StaffTypes.TOP_MANAGER);
        apple.hire(StaffTypes.MANAGER);
        apple.hire(StaffTypes.OPERATOR);
        apple.hire(StaffTypes.TOP_MANAGER);
        apple.hire(StaffTypes.MANAGER);
        apple.hire(StaffTypes.OPERATOR);
        apple.hire(StaffTypes.TOP_MANAGER);
        apple.printStaff();
        apple.getTopSalaryStaff(10);
        System.out.println(apple.getTopSalaryStaff(10).toString());
        System.out.println(apple.getLowestSalaryStaff(10).toString());
    }
}
