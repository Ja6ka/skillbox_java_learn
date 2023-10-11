import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        HashMap<String, Account> accounts = new HashMap<String, Account>() {{
            put("Иванов", new Account(("1"), 1000));
            put("Петров", new Account(("2"), 0));
            put("Сидоров", new Account(("3"), 0));
        }};
        Bank sborBank = new Bank(accounts);
        System.out.println(sborBank.getSumAllAccounts());
        for (int i = 1; i <= 100; i++) {
            Thread thread = new Thread(() -> {
                try {
                    sborBank.transfer("1", "2", 600);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }, i + " Thread");
            thread.start();
        }
    }
}