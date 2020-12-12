public class DeadMeow

//Run to kill the cat with hunger and see how many times it meowed before death

{
    public static void main(String[] args)
    {
        Cat murka = new Cat();
        System.out.println("Romka's weight: " + murka.getWeight());
        while (murka.getWeight() > murka.minWeight)
        {
            murka.meow();
        }
        System.out.println(murka.getStatus());
        System.out.println("Murka meowed " + murka.getTimesMeow() + " times before death");
    }
}
