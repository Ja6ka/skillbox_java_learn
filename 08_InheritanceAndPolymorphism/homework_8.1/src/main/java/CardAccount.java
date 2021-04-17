public class CardAccount extends BankAccount {

    private final double FEE_PERCENT = 0.01;

    @Override
    public boolean take(double amountToTake) {
        boolean hasTaken;
        hasTaken = super.take(amountToTake * (FEE_PERCENT + 1));
        System.out.println("Комиссия за операцию: " + (amountToTake * FEE_PERCENT) + "руб.");
        return hasTaken;
    }

    @Override
    public boolean send(BankAccount receiver, double amount) {
        boolean hasSend = take(amount * (FEE_PERCENT + 1));
        if (hasSend) {
            receiver.put(amount);
            System.out.println("Перевод выполнен!");
        } else {
            System.out.println("Перевод не выполнен!");
        }
        return hasSend;
    }
}
