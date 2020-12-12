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

        System.out.println(Cat.getCount());

        while (lala.getWeight() > lala.minWeight)
        {
            lala.meow();
        }
        System.out.println(lala.getStatus());
        lala.deadCount();
        System.out.println(Cat.getCount());

        while (po.getWeight() > po.minWeight)
        {
            po.meow();
        }
        System.out.println(po.getStatus());
        po.deadCount();
        System.out.println(Cat.getCount());

    }
}
