import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class Movements {

    private final String PATH_CSV;

    public Movements(String PATH_CSV) {
        this.PATH_CSV = PATH_CSV;
    }

    private static List<MovementString> parse(String path) {
        List<MovementString> temp = new ArrayList<>();
        Path movement = Paths.get(path);

        try {
            List<String> lines = Files.readAllLines(movement);
            lines.remove(lines.get(0));
            for (String line : lines) {
                String[] fields = removeQuotes(line).split(",");
                String category = fields[5].replaceAll("[\\W\\d]+", " ");
                category = category.substring(0, category.length() - 8).trim();
                temp.add(new MovementString(category,
                        Double.parseDouble(fields[6]),
                        Double.parseDouble(fields[7])));
                MovementString.categories.add(category);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return temp;
    }

    private static String removeQuotes(String line) {
        int control = 0;
        if (line.contains("\"")) {
            String[] parts = line.split("\"");
            StringBuilder builder = new StringBuilder();
            builder.append(parts[0]);
            for (int i = 1; i <= parts.length - 1; i = i + 2) {
                builder.append(parts[i].replaceAll(",", "."));
                control = i;
            }
            if (control != parts.length - 1) {
                builder.append(parts[parts.length - 1]);
            }
            return builder.toString().replaceAll("\"", "");
        } else {
            return line;
        }
    }

    public double getExpenseSum() {
        double expenseSum = 0;
        List<MovementString> outcomes = parse(PATH_CSV);
        for (MovementString outcome : outcomes) {
            expenseSum += outcome.getTransactionOutcome();
        }
        return expenseSum;
    }

    public double getIncomeSum() {
        double incomeSum = 0;
        List<MovementString> incomes = parse(PATH_CSV);
        for (MovementString income : incomes) {
            incomeSum += income.getTransactionIncome();
        }
        return incomeSum;
    }

    public void printExpensesByCategories() {
        List<MovementString> outcomes = parse(PATH_CSV);
        for (String category : MovementString.categories) {
            double expenseSum = 0;
            for (MovementString outcome : outcomes) {
                if (outcome.getTransactionOutcome() != 0.0 && outcome.getTransactionDescription().equals(category)) {
                    expenseSum += outcome.getTransactionOutcome();
                }
            }
            if (expenseSum > 0) {
                System.out.println("Расход по категории " + category + " составил " + expenseSum);
            }
        }
    }

    public void printIncomeByCategories() {
        List<MovementString> incomes = parse(PATH_CSV);
        for (String category : MovementString.categories) {
            double incomeSum = 0;
            for (MovementString income : incomes) {
                if (income.getTransactionIncome() > 0.0 && income.getTransactionDescription().equals(category)) {
                    incomeSum += income.getTransactionIncome();
                }
            }
            if (incomeSum > 0) {
                System.out.println("Доход по категории " + category + " составил " + incomeSum);
            }
        }
    }
}
