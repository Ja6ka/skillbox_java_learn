
public class Loader
{
    public static void main(String[] args)
    {

    Cat rex = new Cat();

        System.out.println("Сейчас живо кошек: " + Cat.getDeadCatCount());

        while (!Cat.isDead)
        {
            Cat.meow();
        }

        System.out.println(Cat.getStatus());
        System.out.println(Cat.getWeight());
        System.out.println("Кошка мяукнула " + rex.getTimesMeow() + " раз перед смертью.");
        System.out.println("Сейчас живо кошек: " + Cat.getDeadCatCount());

        getKitten();
        Cat.setName("Barsik");
        System.out.println(Cat.getName() + " is now " + Cat.getStatus() + " and weights " + Cat.getWeight());

        getKitten();
        Cat.setName("Karasik");
        System.out.println(Cat.getName() + " is now " + Cat.getStatus() + " and weights " + Cat.getWeight());

        getKitten();
        Cat.setName("Pupsik");
        System.out.println(Cat.getName() + " is now " + Cat.getStatus() + " and weights " + Cat.getWeight());
        Cat.meow();
        System.out.println(Cat.getWeight());


    }

    private static Cat getKitten() {
      return new Cat (1100.00);
    }

}