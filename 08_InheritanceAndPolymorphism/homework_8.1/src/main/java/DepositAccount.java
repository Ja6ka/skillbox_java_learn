import java.time.LocalDate;

public class DepositAccount extends BankAccount {

    private LocalDate lastIncome;

    @Override
    public boolean take(double amountToTake) {
        boolean hasTaken = false;
        if (monthHasPassed()) {
            hasTaken = super.take(amountToTake);
        } else {
            System.out.println("Прошло менее месяца с момента пополнения! Вы не можете снять деньги до " +
                    lastIncome.plusMonths(1));
        }
        return hasTaken;
    }

    @Override
    public void put(double amountToPut) {
        super.put(amountToPut);
        setLastIncome(LocalDate.now());
    }

    private boolean monthHasPassed() {
        return lastIncome.isBefore(LocalDate.now().minusMonths(1));
    }

    public void setLastIncome(LocalDate lastIncome) {
        this.lastIncome = lastIncome;
    }
}
