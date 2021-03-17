public class Basket {
    private String items = "";
    private int totalPrice = 0;
    private int totalWeight = 0;

    public Basket() {
        items = "Список товаров: ";
    }

    public void add(String name, int price) {
        items = items + System.lineSeparator() + name + ", цена: " + price;
        totalPrice += price;
    }

    public void add(String name, int price, int weight) {
        add(name, price);
        items = items + ", вес: " + weight;
        totalWeight += weight;
    }

    public void add(String name, int price, int count, int weight) {
        items = items + System.lineSeparator() + name + " " + count + "шт, цена: " +
                count * price + ", вес: " + count * weight;
        totalPrice += count * price;
        totalWeight += count * weight;

    }

    public void clean() {
        totalPrice = 0;
        items = "";
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void printBasket(String title) {
        System.out.println(title + System.lineSeparator());
        if (items.isEmpty()) {
            System.out.println("Корзина пуста!");
        } else {
            System.out.println(items + System.lineSeparator() + "Общая стоимость товаров: " + totalPrice +
                    System.lineSeparator() + "Вес корзины: " + totalWeight);
        }
    }
}
