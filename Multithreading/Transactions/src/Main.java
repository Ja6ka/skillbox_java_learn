import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        HashMap<String, Account> accounts = new HashMap<String, Account>() {{
            put("Иванов", new Account(("1"), 100));
            put("Петров", new Account(("2"), 170));
            put("Сидоров", new Account(("3"), 250));
        }};
        Bank sborBank = new Bank(accounts);
        System.out.println(sborBank.getSumAllAccounts());
        Thread thread = new Thread(Main::sborBank.transfer("1", "2", 100));
    }
}
