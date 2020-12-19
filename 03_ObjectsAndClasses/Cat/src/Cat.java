
public class Cat
{
    public static final int LEGS_COUNT = 4;
    public static final int MIN_WEIGHT = 1000;
    public static final int MAX_WEIGHT = 9000;

    public static double originWeight;
    public static double weight;
    public static double minWeight;
    public static double maxWeight;
    public static double foodAmount;
    public static double drinkAmount;
    public static int timesMeow;
    public static int count;
    public static boolean isDead = false;
    public static String colour;
    public static String name;

    //==============================================================================

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count++;
    }

    public Cat(double weight) {
        Cat.weight = weight;
    }

    public static String setColour(String colour) {
        Cat.colour = colour;
        return colour;
    }

    public static String getColour() {
        Cat.colour = colour;
        return colour;
    }

    public static String setName(String name) {
        Cat.name = name;
        return name;
    }

    public static String getName() {
        Cat.name = name;
        return name;
    }


    public static void meow() {
        if(weight > minWeight && weight < maxWeight) {
            weight = weight - 50;
            timesMeow = ++timesMeow;
            System.out.println("Meow");
        } else {
            System.out.println("Dead cat cannot meow");
            isDead = true;
            count--;
        }
    }

    public static void feed(Double amount) {
        if(weight > minWeight && weight < maxWeight) {
            weight = weight + amount;
            foodAmount = foodAmount + amount;
            System.out.println("Yum");
        } else {
            System.out.println("Dead cat cannot eat");
            isDead = true;
            count--;
        }
    }

    public static void drink(Double amount) {
        if(weight > minWeight && weight < maxWeight) {
            weight = weight + amount;
            drinkAmount = drinkAmount + amount;
            System.out.println("Surp");
        } else {
            System.out.println("Dead cat cannot drink");
            isDead = true;
            count--;
        }
    }

    public static void pee () {
            if(weight > minWeight && weight < maxWeight) {
                weight = weight - 100;
                System.out.println("Peeee");
            } else {
                System.out.println("Dead cat cannot pee");
                isDead = true;
                count--;
            }
        }

    public int getTimesMeow() {
        return timesMeow;
    }

    public static Double getFoodAmount()
    {
        return foodAmount;
    }

    public static Double getDrinkAmount()
    {
        return drinkAmount;
    }

    public static Double getWeight()

    {
        return weight;
    }

    public static int getDeadCatCount()
    {
        return count;
    }

    public static String getStatus()
    {
        if(weight < minWeight)
        {
            return "Dead";
        }
        else if(weight > maxWeight)
        {
            return "Exploded";
        }
        else if(weight > originWeight)
        {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}