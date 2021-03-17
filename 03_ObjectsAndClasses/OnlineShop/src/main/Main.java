
public class Main {

    public static void main(String[] args) {
        Basket vasyabasket = new Basket();
        vasyabasket.add("Бутылка кефира", 40, 3);
        vasyabasket.add("Пол-батона", 12, 4, 1);
        vasyabasket.add("Килограмм гвоздей", 100, 1);
        vasyabasket.add("Килограмм пуха", 100);
        vasyabasket.printBasket("Корзина Васи: ");
        vasyabasket.clean();
        System.out.println();
        vasyabasket.printBasket("Корзина Васи: ");
    }
}
