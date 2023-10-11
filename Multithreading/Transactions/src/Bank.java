import java.util.Map;
import java.util.Random;

public class Bank {

    private final Map<String, Account> accounts;
    private final Random random = new Random();

    public Bank(Map<String, Account> accounts) {
        this.accounts = accounts;
    }

    public synchronized boolean isFraud()
            throws InterruptedException {
        Thread.sleep(1000);
        return random.nextBoolean();
    }

    public void transfer(String senderNum, String receiverNum, long amount) throws InterruptedException {
        String confirmation = "";
        if (amount > 50000 & isFraud()) {
            blockAccount(senderNum);
            blockAccount(receiverNum);
        } else for (Account account : accounts.values()) {
            if (account.getAccNumber().equals(senderNum) && account.getMoney() >= amount && !account.isBlocked()) {
                synchronized (account) {
                    account.setMoney(account.getMoney() - amount);
                    confirmation = receiverNum;
                    System.out.println("Transferred " + amount + " to #" + receiverNum + ", current balance: " + account.getMoney());
                }
            }
            if (account.getAccNumber().equals(receiverNum) && confirmation.equals(receiverNum)) {
                synchronized (account) {
                    account.setMoney(account.getMoney() + amount);
                    System.out.println("Received " + amount + " from #" + senderNum + ", current balance: " + account.getMoney());
                }
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
                System.out.println("Account #" + account.getAccNumber() + " is temporarily unavailable" +
                        " due to fraudulent activity");
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
