package core;

public class Car
{
    public String number;
    public int height;
    public double weight;
    public boolean hasVehicle;
    public boolean isSpecial;

    public String toString()
    {
        String special = isSpecial ? "СПЕЦТРАНСПОРТ " : "";
        return "\n=========================================\n" +
            special + "Автомобиль с номером " + number +
            ":\n\tВысота: " + height + " мм\n\tМасса: " + weight + " кг";
    }

    public String setNumber(String number) {
        this.number = number;
        return number;
    }
    
    public String getNumber() {
        return number;
    }

    public int setHeight(int height) {
        this.height = height;
        return height;
    }

    public int getHeight() {
        return height;
    }

    public double setWeight(double weight) {
        this.weight = weight;
        return weight;
    }

    public double getWeight() {
        return weight;
    }

    public boolean setVehicle(boolean hasVehicle) {
        this.hasVehicle = hasVehicle;
        return hasVehicle;
    }

    public boolean getVehicle() {
        return hasVehicle;
    }

    public boolean setSpecial(boolean isSpecial) {
        this.isSpecial = isSpecial;
        return isSpecial;
    }
        public boolean getSpecial() {
            return isSpecial;
        }
    }