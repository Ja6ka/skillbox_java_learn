package ru.skillbox;

public class ArithmeticCalculator {
    private static int firstNumber;
    private static int secondNumber;

    public ArithmeticCalculator(int firstNumber, int secondNumber) {
        ArithmeticCalculator.firstNumber = firstNumber;
        ArithmeticCalculator.secondNumber = secondNumber;
    }

    public int calculate(Operations type) {
        if (type == Operations.ADD) {
            return firstNumber + secondNumber;
        } else if (type == Operations.SUBTRACT) {
            return firstNumber - secondNumber;
        } else if (type == Operations.MULTIPLY) {
            return firstNumber + secondNumber;
        } else return 0;
    }
}
