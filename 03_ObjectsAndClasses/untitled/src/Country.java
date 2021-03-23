public class Country {

    private boolean hasSeaShore;
    private String name;
    private int square;
    private String capital;
    private int population;

    public Country(String name) {
        this.name = name;
    }

    public boolean isHasSeaShore() {
        return hasSeaShore;
    }

    public void setHasSeaShore(boolean hasSeaShore) {
        this.hasSeaShore = hasSeaShore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
