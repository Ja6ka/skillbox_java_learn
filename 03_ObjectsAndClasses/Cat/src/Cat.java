
public class Cat
{
    public static final int LEGS_COUNT = 4;
    public static final int MIN_WEIGHT = 1000;
    public static final int MAX_WEIGHT = 9000;

    public double originWeight;
    public double weight;
    public double minWeight;
    public double maxWeight;
    public double foodAmount;
    public double drinkAmount;
    public int timesMeow;
    public static int count;
    public static boolean isDead = false;
    public String colour;
    public String name;

    //==============================================================================

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count++;
    }

    public Cat(double weight) {
        this.weight = weight;
    }

    public Cat catCopy() {
        Cat catCopy = new Cat (this.weight);
        catCopy.originWeight = this.originWeight;
        catCopy.minWeight = this.minWeight;
        catCopy.maxWeight = this.maxWeight;
        count++;
        return catCopy;
    }

    public  String setColour(String colour) {
        this.colour = colour;
        return colour;
    }

    public  String getColour() {
        this.colour = colour;
        return colour;
    }

    public  String setName(String name) {
        this.name = name;
        return name;
    }

    public  String getName() {
        this.name = name;
        return name;
    }


    public  void meow() {
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

    public  void feed(Double amount) {
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

    public  void drink(Double amount) {
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

    public  void pee () {
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

    public  Double getFoodAmount()
    {
        return foodAmount;
    }

    public  Double getDrinkAmount()
    {
        return drinkAmount;
    }

    public  Double getWeight()

    {
        return weight;
    }

    public static int getDeadCatCount()
    {
        return count;
    }

    public  String getStatus()
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