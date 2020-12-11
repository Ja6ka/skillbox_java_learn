public class DeadMeow //Run to kill the cat with hunger
{
    public static void main(String[] args)
    {
        Cat murka = new Cat();
        while (murka.getWeight() > murka.minWeight)
        {
            murka.meow();
        }
        System.out.println(murka.getStatus());
    }
}
