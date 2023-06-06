public class Main {
    public static void main(String[] args) {
        Randomizer randomizer = new Randomizer();

        randomizer.randomize();
        System.out.println(randomizer.getNumber() + "\n" + Comfort.setCustomersCount(randomizer.getNumber()));
    }
}
