public class CatCount //Run to check how many cats were created
{
    public static void main(String[] args)
    {
        Cat tinkyWinky = new Cat();
        tinkyWinky.meow();

        Cat dipsy = new Cat();
        dipsy.meow();

        Cat lala = new Cat();
        lala.meow();

        Cat po = new Cat();
        po.meow();

        System.out.println(Cat.getCatCount());

        while (!lala.isDead)
        {
            lala.meow();
        }
        System.out.println(lala.getStatus());
        System.out.println(Cat.getCatCount());

        while (!po.isDead)
        {
            po.meow();
        }
        System.out.println(po.getStatus());
        System.out.println(Cat.getCatCount());

    }
}
