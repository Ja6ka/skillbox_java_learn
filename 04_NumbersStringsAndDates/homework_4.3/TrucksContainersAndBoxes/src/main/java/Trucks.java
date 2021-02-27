import java.util.Scanner;

public class Trucks {

    private static final int CONTAINER_CAPACITY = 27; //количество ящиков в контейнере
    private static final int TRUCK_CAPACITY = 12; //количество контейнеров в грузовике
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String boxes = scanner.nextLine();

        int boxCount = Integer.parseInt(boxes);
        int containerCount = 0;
        int truckCount = 0;

        if ((boxCount % CONTAINER_CAPACITY) != 0) {
            containerCount = (boxCount / CONTAINER_CAPACITY) + 1;
        } else containerCount = boxCount / CONTAINER_CAPACITY;

        if ((containerCount % TRUCK_CAPACITY) != 0) {
            truckCount = (containerCount / TRUCK_CAPACITY) + 1;
        } else truckCount = containerCount / TRUCK_CAPACITY;

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







