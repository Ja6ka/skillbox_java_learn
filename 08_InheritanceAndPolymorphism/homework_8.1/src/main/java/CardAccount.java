public class CardAccount extends BankAccount {

    private final static double FEE_PERCENT = 0.01;

    @Override
    public boolean take(double amountToTake) {
        boolean hasTaken;
        hasTaken = super.take(amountToTake * (FEE_PERCENT + 1));
        System.out.println("Комиссия за операцию: " + (amountToTake * FEE_PERCENT) + " руб.");
        return hasTaken;
    }
}
