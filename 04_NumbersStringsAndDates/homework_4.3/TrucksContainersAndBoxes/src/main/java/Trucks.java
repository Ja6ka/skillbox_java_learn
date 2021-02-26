import java.util.Scanner;

public class Trucks {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String boxes = scanner.nextLine();

        int boxCount = Integer.parseInt(boxes);
        int containerCapacity = 27; // Коробок
        int truckCapacity = 12; // Контейнеров
        int containerCount = 0;
        int truckCount = 0;

        if ((boxCount % containerCapacity) != 0) {
            containerCount = (boxCount / containerCapacity) + 1;
        } else containerCount = boxCount / containerCapacity;

        if ((containerCount % truckCapacity) != 0) {
            truckCount = (containerCount / truckCapacity) + 1;
        } else truckCount = containerCount / truckCapacity;

        System.out.println("Нужно " + containerCount + " контейнеров и " + truckCount + " грузовиков");
        int a = 1;
        int b = 1;
        for (int t = 1; t <= truckCount; t++) {
            System.out.println("Грузовик: " + t);
            int c = 0;
            while (c < 12 && b <= containerCount) {
                System.out.println("\tКонтейнер: " + b);
                int d = 0;
                while (d < 27 && a <= boxCount) {
                    System.out.println("\t \tЯщик: " + a);
                    a++;
                    d++;
                }
                b++;
                c++;
            }
        }
    }
}







