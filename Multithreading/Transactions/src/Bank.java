import java.util.Map;
import java.util.Random;

public class Bank {

    private Map<String, Account> accounts;
    private final Random random = new Random();

    public Bank(Map<String, Account> accounts) {
        this.accounts = accounts;
    }

    public synchronized boolean isFraud()
            throws InterruptedException {
        Thread.sleep(1000);
        return random.nextBoolean();
    }

    /**
     * TODO: реализовать метод. Метод переводит деньги между счетами. Если сумма транзакции > 50000,
     * то после совершения транзакции, она отправляется на проверку Службе Безопасности – вызывается
     * метод isFraud. Если возвращается true, то делается блокировка счетов (как – на ваше
     * усмотрение)
     */
    public void transfer(String senderNum, String receiverNum, long amount) throws InterruptedException {
        if (amount > 50000 & isFraud()) {
            blockAccount(senderNum);
            blockAccount(receiverNum);
        } else for (Account account : accounts.values()) {
            if (account.getAccNumber().equals(senderNum)) {
                account.setMoney(account.getMoney() - amount);
            }
            if (account.getAccNumber().equals(receiverNum)) {
                account.setMoney(account.getMoney() + amount);
            }
        }
    }

    public long getBalance(String accountNum) {
        long balance = 0;
        for (Account account : accounts.values()) {
            if (account.getAccNumber().equals(accountNum)) {
                balance = account.getMoney();
            }
        }
        return balance;
    }

    public long getSumAllAccounts() {
        long sum = 0;
        for (Account account : accounts.values()) {
            sum = sum + account.getMoney();
        }
        return sum;
    }

    public void blockAccount(String accountNum) {
        for (Account account : accounts.values()) {
            if (account.getAccNumber().equals(accountNum)) {
                account.setBlocked();
            }
        }
    }

    public void unblockAccount(String accountNum) {
        for (Account account : accounts.values()) {
            if (account.getAccNumber().equals(accountNum)) {
                account.setUnblocked();
            }
        }
    }
}
