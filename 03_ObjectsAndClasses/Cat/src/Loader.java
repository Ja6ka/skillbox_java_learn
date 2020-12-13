
public class Loader
{
    public static void main(String[] args)
    {

    Cat rex = new Cat();

        System.out.println("Сейчас живо кошек: " + Cat.getDeadCatCount());

        while (!rex.isDead)
        {
            rex.meow();
        }

        System.out.println(rex.getStatus());
        System.out.println(rex.getWeight());
        System.out.println("Кошка мяукнула " + rex.getTimesMeow() + " раз перед смертью.");
        System.out.println("Сейчас живо кошек: " + Cat.getDeadCatCount());
    }


}