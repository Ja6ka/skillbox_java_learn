public class Elevator {
    private int minFloor = 0;
    private int maxFloor = 0;
    private int currentFloor = 1;

    public Elevator(int min, int max) {
        minFloor = min;
        maxFloor = max;
    }

    public void move(int floorCount) {
        if (isFloorValid(floorCount) && floorCount > currentFloor) {
            while (currentFloor < floorCount) {
                moveUp();
            }
            System.out.println("Приехали!");
        } else if (isFloorValid(floorCount) && floorCount < currentFloor) {
            while (currentFloor > floorCount) {
                moveDown();
            }
            System.out.println("Приехали!");
        } else {
            System.out.println("Введите существующий этаж!");
        }
    }

    private boolean isFloorValid(int floor) {
        if (floor > maxFloor || floor < minFloor) {
            return false;
        } else {
            return true;
        }

    }

    public void moveUp() {
        currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor;
        getCurrentFloor();
    }

    public void moveDown() {
        currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;
        getCurrentFloor();
    }

    public void getCurrentFloor() {
        System.out.println(currentFloor);
    }

    public int getMinFloor() {
        return minFloor;
    }

    public int getMaxFloor() {
        return maxFloor;
    }
}
