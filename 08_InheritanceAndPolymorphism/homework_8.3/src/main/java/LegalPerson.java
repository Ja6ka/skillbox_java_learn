public class LegalPerson extends Client {

    private double FEE_PERCENT = 1.01; //1% комиссии

    @Override
    public void take(double amountToTake) {
        super.take(amountToTake * FEE_PERCENT);
    }

    @Override
    public void printInfo() {
        System.out.println("Вам доступно пополнение без комиссии. Комиссия при снятии - 1%" + System.lineSeparator() +
                "Ваш баланс: " + getAmount());
    }
}
