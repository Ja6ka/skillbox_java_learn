public class Main {


    public static void main(String[] args) {
        Arithmetic twoDigits = new Arithmetic(5, 7);
        System.out.println("Сумма чисел: " + twoDigits.sumDigits() + System.lineSeparator() +
                "Разница чисел: " + twoDigits.subtractDigits() + System.lineSeparator() +
                "Произведение чисел: " + twoDigits.multiplyDigits() + System.lineSeparator() +
                "Результат деления чисел: " + twoDigits.divideDigits() + System.lineSeparator() +
                "Наибольшее число:  " + twoDigits.largerNumber() + System.lineSeparator() +
                "Наименьшее число: " + twoDigits.smallerNumber() + System.lineSeparator());
    }
}
