public class DeadFeed

//Run to overfeed the cat and see how much food it consumed before death

{
    public static void main(String[] args)
    {
        Cat romka = new Cat();
        System.out.println("Romka's weight: " + romka.getWeight());
        while (!romka.isDead)
        {
            romka.feed(1.0);
        }
        System.out.println(romka.getStatus());
        System.out.println( "Romka just ate " + romka.getFoodAmount() + " before explosion");
    }
}
