public class CardAccount extends BankAccount {

    private final double FEE_PERCENT = 0.01;

    public boolean take(double amountToTake) {
        boolean hasTaken = false;
        if (getAmount() >= amountToTake * (FEE_PERCENT + 1)) {
            setAmount(getAmount() - amountToTake * FEE_PERCENT);
            hasTaken = super.take(amountToTake);
            System.out.println("Комиссия за операцию: " + (amountToTake * FEE_PERCENT) + "руб.");
        }
        return hasTaken;
    }

    public boolean send(BankAccount receiver, double amount) {
        boolean hasSend = false;
        if (take(amount)) {
            receiver.put(amount);
            hasSend = true;
            System.out.println("Перевод выполнен!");
        } else {
            System.out.println("Перевод не выполнен!");
        }
        return hasSend;
    }
}
