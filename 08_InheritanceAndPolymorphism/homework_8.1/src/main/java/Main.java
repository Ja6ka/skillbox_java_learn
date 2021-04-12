import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Небольшой тест. Создадим аккаунты и пополним их
        CardAccount cardAccount = new CardAccount();
        BankAccount bankAccount = new BankAccount();
        DepositAccount depositAccount = new DepositAccount();
        cardAccount.put(1000.0);
        bankAccount.put(1000.0);
        depositAccount.put(1000.0);
        depositAccount.setLastIncome(LocalDate.now().minusMonths(2)); //Задаю дату последнего пополнения на два месяца ранее
        depositAccount.send(bankAccount, 300);
        depositAccount.take(500);
        depositAccount.setLastIncome(LocalDate.now()); //А теперь проверим с текущей датой
        depositAccount.send(bankAccount, 500);
        cardAccount.take(500); //И самое интересное: проверим карточный счёт с комиссией
        cardAccount.send(bankAccount, 250);
    }
}
