import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Elevator elevator = new Elevator(-10, 26);
        while(true) {
            System.out.print("Введите номер этажа от "  + elevator.getMinFloor() + " до " +
                    elevator.getMaxFloor() + ": " + System.lineSeparator());
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
        }
    }
}
