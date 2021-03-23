package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        ArithmeticCalculator calculator = new ArithmeticCalculator(5, 7);
        System.out.println(calculator.calculate(Operations.ADD));
        System.out.println(calculator.calculate(Operations.SUBTRACT));
        System.out.println(calculator.calculate(Operations.MULTIPLY));
    }
}
