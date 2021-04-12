public class BankAccount {

    private double amountOfMoney = 0;

    public void put(double amountToPut) {
        if (amountToPut > 0) {
            amountOfMoney += amountToPut;
            System.out.println("Успешное пополнение " + amountToPut + " руб.");
        } else {
            System.out.println("Введите корректную сумму!");
        }
    }

    public boolean take(double amountToTake) {
        boolean hasTaken = false;
        if (validToTake(amountToTake)) {
            amountOfMoney -= amountToTake;
            System.out.println("Успешное снятие " + amountToTake + " руб." + System.lineSeparator() +
                    "Ваш баланс: " + amountOfMoney);
            hasTaken = true;
        } else {
            System.out.println("На вашем счёте недостаточно средств!");
        }
        return hasTaken;
    }

    public boolean send(BankAccount receiver, double amount) {
        boolean hasSend = false;
        if (take(amount)) {
            receiver.put(amount);
            hasSend = true;
            System.out.println("Перевод выполнен!");
        } else {
            System.out.println("Перевод не выполнен!");
        }
        return hasSend;
    }

    public boolean validToTake(double amount) {
        return amount > 0 && amount < getAmount();
    }

    public double getAmount() {
        return amountOfMoney;
    }

    public void setAmount(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }
}
