public class IndividualBusinessman extends Client {

    @Override
    public void put(double amountToPut) {
        double fee = 0.005;
        if (amountToPut < 1000) {
            fee = 0.01;
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
