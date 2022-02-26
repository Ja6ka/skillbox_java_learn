public class Main {
    public static void main(String[] args) {
        Movements movements = new Movements("C:\\java_basics\\13_FilesAndNetwork\\homework_13.3\\src\\test\\resources\\movementList.csv");
        movements.printExpensesByCategories();
        movements.printIncomeByCategories();
    }
}
