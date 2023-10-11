public class Account {

    private volatile long money;
    private String accNumber;
    private volatile boolean isBlocked = false;

    public Account(String accNumber, long money) {
        this.accNumber = accNumber;
        this.money = money;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        if (isBlocked) {
            System.out.println("Аккаунт заблокирован, обратитесь в поддержку по номеру 8-800-555-35-35");
        } else {
            this.money = money;
        }
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked() {
        isBlocked = true;
    }

    public void setUnblocked() {
        isBlocked = false;
    }
}
