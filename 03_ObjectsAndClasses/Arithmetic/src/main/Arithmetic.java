public class Arithmetic {
    private int firstNumber = 0;
    private int secondNumber = 0;

    public Arithmetic(int first, int second) {
        firstNumber = first;
        secondNumber = second;
    }

    public int sumDigits() {
        return firstNumber + secondNumber;
    }

    public int subtractDigits() {
        return firstNumber - secondNumber;
    }

    public int multiplyDigits() {
        return firstNumber * secondNumber;
    }

    public double divideDigits() {
        return (double) firstNumber / secondNumber;
    }

    public int largerNumber() {
        return Math.max(firstNumber, secondNumber);
    }

    public int smallerNumber() {
        return Math.min(firstNumber, secondNumber);
    }
}
