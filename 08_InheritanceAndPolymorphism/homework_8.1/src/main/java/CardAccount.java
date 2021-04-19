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
        return super.send(receiver, amount * (FEE_PERCENT + 1));
    }
}
