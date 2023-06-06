public class Randomizer {

    private int number;

    private void setNumber(int number) {
        this.number = number;
    }

    void randomize() {
        setNumber((int) (Math.random() * 100));
    }

    public int getNumber() {
        return number;
    }

}
