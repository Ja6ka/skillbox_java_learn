import java.time.LocalDate;

public class DepositAccount extends BankAccount {

    private LocalDate lastIncome;

    public boolean take(double amountToTake) {
        boolean hasTaken = false;
        if (!monthHasPassed()) {
            System.out.println("Прошло менее месяца с момента пополнения! Вы не можете снять деньги до " +
                    lastIncome.plusMonths(1));
        } else {
            hasTaken = super.take(amountToTake);
        }
        return hasTaken;
    }

    public void put(double amountToPut) {
        super.put(amountToPut);
        setLastIncome(LocalDate.now());

    }

    public boolean send(BankAccount receiver, double amount) {
        boolean hasSend = false;
        if (!monthHasPassed()) {
            System.out.println("Прошло менее месяца с момента пополнения! Перевод не выполнен");
        } else {
            super.send(receiver, amount);
            hasSend = true;
        }
        return hasSend;
    }

    private boolean monthHasPassed() {
        return lastIncome.isBefore(LocalDate.now().minusMonths(1));
    }

    public LocalDate getLastIncome() {
        return lastIncome;
    }

    public void setLastIncome(LocalDate lastIncome) {
        this.lastIncome = lastIncome;
    }
}
