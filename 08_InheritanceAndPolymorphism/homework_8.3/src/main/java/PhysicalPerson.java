public class PhysicalPerson extends Client {

    @Override
    public void printInfo() {
        System.out.println("Вам доступно пополнение и снятие без комиссии" + System.lineSeparator() +
                "Ваш баланс: " + getAmount());
    }
}
