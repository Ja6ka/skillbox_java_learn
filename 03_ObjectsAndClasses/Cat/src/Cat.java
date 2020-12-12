
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
    public double timesMeow;
    public static int count;
    public boolean isDead;
    public String colour;

    public  boolean isDead()
    {
        if (weight < minWeight)
        {
            isDead = true;
        }
        if (weight > maxWeight)
        {
            isDead = true;
        }
        return isDead;
    }

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count = ++count;
        ;

    }




    public void meow()
    {
        if(weight > minWeight)
        {
            weight = weight - 50;
            timesMeow = ++timesMeow;
            System.out.println("Meow");
        }
        else System.out.println("Dead cat cannot meow");
    }

    public void feed(Double amount)
    {
        if(weight < maxWeight)
        {
            weight = weight + amount;
            foodAmount = foodAmount + amount;
        }
        else System.out.println("Exploded cat cannot eat");
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public void pee ()
        {
            if(weight > minWeight)
            {
                weight = weight - 100;
                System.out.println("Go clean cat's litter box");
            }
            else
                System.out.println("Dead cat cannot pee");
        }

    public Double getTimesMeow()
    {
        return timesMeow;
    }

    public Double getFoodAmount()
    {
        return foodAmount;
    }

    public Double getWeight()

    {
        return weight;
    }

    public  int deadCount()
    {
        if (isDead = true)
        {
            count = --count;

        }
        return count;
    }


    public static int getCount()
    {
        return count;
    }

    public String getStatus()
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