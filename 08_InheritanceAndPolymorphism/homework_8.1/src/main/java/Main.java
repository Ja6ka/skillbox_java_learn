public class Main {
    public static void main(String[] args) {
        CardAccount cardAccount = new CardAccount();
        BankAccount bankAccount = new BankAccount();

        cardAccount.put(1000.0);
        bankAccount.put(1000.0);

        cardAccount.send(bankAccount, 500);

        System.out.println(cardAccount.getAmount());
        System.out.println(bankAccount.getAmount());
    }
}
