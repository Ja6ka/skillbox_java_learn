
public class Loader
{
    public static void main(String[] args)
    {
    Cat george = new Cat();
    Cat rex = new Cat();

        System.out.println("Сейчас живо кошек: " + Cat.getDeadCatCount());

        while (!rex.isDead)
        {
           rex.meow();
        }

        System.out.println(rex.getStatus());
        System.out.println(rex.getWeight());
        System.out.println("Кошка мяукнула " + rex.getTimesMeow() + " раз перед смертью.");
        rex.meow();
        rex.meow();
        george.meow();
        System.out.println("Сейчас живо кошек: " + Cat.getDeadCatCount());

        //Создаем котенка
        Cat roma = getKitten();
        System.out.println("Вес Ромы " + roma.getWeight());
        roma.feed(100.0);
        System.out.println("Вес Ромы " + roma.getWeight());

        //Копируем котенка
        Cat lisa = new Cat();
        System.out.println("Вес Лизы " + lisa.getWeight());
        Cat belfegor = lisa.catCopy();
        System.out.println("Вес Бельфегора " + belfegor.getWeight());
        lisa.feed(1000.0);
        System.out.println("После кормления вес Лизы составил " + lisa.getWeight());
        System.out.println("Бельфегор всё еще весит  " + belfegor.getWeight() +
                            " и это доказывает, что это разные кошки");
        System.out.println("Сейчас живо кошек: " + Cat.getDeadCatCount());

        rex.setColour(Colours.BLACK);
        System.out.println(rex.getColour());
    }

    private static Cat getKitten() {
      return new Cat (1100.00);
    }


}