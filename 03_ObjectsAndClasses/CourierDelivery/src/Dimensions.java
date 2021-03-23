public class Dimensions {

    private final int HEIGHT;
    private final int WIDTH;
    private final int LENGTH;

    public Dimensions(int HEIGHT, int WIDTH, int LENGTH) {
        this.HEIGHT = HEIGHT;
        this.WIDTH = WIDTH;
        this.LENGTH = LENGTH;
    }

    public int getVolume() {
        return  HEIGHT * WIDTH * LENGTH;
    }

    public Dimensions setHeight(int HEIGHT) {
        return new Dimensions(HEIGHT, WIDTH, LENGTH);
    }

    public Dimensions setWidth(int WIDTH) {
        return new Dimensions(HEIGHT, WIDTH, LENGTH);
    }

    public Dimensions setLength(int LENGTH) {
        return new Dimensions(HEIGHT, WIDTH, LENGTH);
    }

    public int getHeight() {
        return HEIGHT;
    }

    public int getWidth() {
        return WIDTH;
    }

    public int getLength() {
        return LENGTH;
    }

}
