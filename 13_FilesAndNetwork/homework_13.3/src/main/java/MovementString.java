import java.util.Set;
import java.util.TreeSet;

public class MovementString {

    private String transactionDescription;
    private Double transactionIncome;
    private Double transactionOutcome;

    static Set<String> categories = new TreeSet<>();

    public MovementString(String transactionDescription, Double transactionIncome, Double transactionOutcome) {
        this.transactionDescription = transactionDescription;
        this.transactionIncome = transactionIncome;
        this.transactionOutcome = transactionOutcome;
    }

    public String getTransactionDescription() {
        return transactionDescription;
    }

    public Double getTransactionIncome() {
        return transactionIncome;
    }

    public Double getTransactionOutcome() {
        return transactionOutcome;
    }

    public Set<String> getCategories() {
        return categories;
    }
}
