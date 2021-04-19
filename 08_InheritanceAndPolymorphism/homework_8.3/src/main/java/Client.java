public abstract class Client {

    private double amount = 0;

    public double getAmount() {
        return amount;
    }

    public void put(double amountToPut) {
        if (amountToPut > 0) {
            amount += amountToPut;
        }
    }

    public void take(double amountToTake) {
        if (validToTake(amountToTake)) {
            amount -= amountToTake;
        }
    }

    public boolean validToTake(double amount) {
        return amount > 0 && amount <= this.amount;
    }

    public abstract void printInfo();
}
