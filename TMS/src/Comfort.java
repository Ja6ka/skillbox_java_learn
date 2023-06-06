public class Comfort {

    private static int customersCount;

    static int setCustomersCount(int comfortNumber) {
        customersCount = (int) (3 * (Math.floor(Math.abs(comfortNumber / 3)))) / 3;
        return customersCount;
    }

    public int getCustomersCount() {
        return customersCount;
    }

}
