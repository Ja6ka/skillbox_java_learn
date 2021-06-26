package tasks;

import java.util.Arrays;
import java.util.List;

public class Task2_IntStream {

    /**
     * Задача перемножить все числа переданные в список.
     * <p>
     * Метод должен вернуть -1 в 2-х случаях:
     * 1. Если в функцию попадает пустой стрим
     * 2. Если результат умножения превышает 100
     * <p>
     * Примеры:
     * <p>
     * (2,3) -> 6
     * (2,2,2) -> 8
     * () -> -1
     * (50, 3) -> -1
     * <p>
     * Понадобиться:
     * - Stream::reduce
     * - Optional::filter
     * - Optional::orElse
     *
     * @param linkedListOfNumbers
     * @return
     */
    public static Integer multiply(List<Integer> linkedListOfNumbers) {
        if (linkedListOfNumbers.isEmpty()) {
            return -1;
        } else {
            Integer result =
                    linkedListOfNumbers.stream().reduce(1, (acc, x) -> acc * x);
            if (result > 100) {
                return -1;
            } else {
                return result;
            }
        }
    }

    /**
     * Найти среднее чисел в массиве, или вернуть исключение, если массив пустой.
     * <p>
     * см. Стримы для примитивов в https://annimon.com/article/2778
     * <p>
     * Понадобиться:
     * - IntStream::of
     * - IntStream::average
     * - Optional:orElseThrow
     *
     * @param numbers
     * @return
     */
    public static double findAverage(int[] numbers) {
        if (numbers.length == 0) {
            throw new PleaseDeleteMeAndImplement();
        }
        double result = Arrays.stream(numbers).asDoubleStream()
                .average()
                .getAsDouble();
        return result;
    }

}
