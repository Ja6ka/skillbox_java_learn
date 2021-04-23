public class IndividualBusinessman extends Client {

    private double SMALL_FEE = 0.005;
    private double BIG_FEE = 0.01;

    @Override
    public void put(double amountToPut) {
        double fee;
        if (amountToPut < 1000) {
            fee = BIG_FEE;
        } else {
            fee = SMALL_FEE;
        }
        super.put(amountToPut - (amountToPut * fee));
    }

    @Override
    public void printInfo() {
        System.out.println("Вам доступно снятие без комиссии. При пополнении до 1000 рублей - " +
                "комиссия 1%, при пополнении от 1000 рублей и больше - 0.5%" + System.lineSeparator() +
                "Ваш баланс: " + getAmount());
    }
}
