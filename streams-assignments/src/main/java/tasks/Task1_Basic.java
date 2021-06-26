package tasks;


import java.util.Collection;

import java.util.stream.Stream;

class Task1_Basic {


    /**
     * Функция должна вернуть количество четных чисел в списке.
     * <p>
     * Пример:
     * 0,2 -> 2
     * 1,2,3,5 -> 1
     * <p>
     * Тут подойдут эти методы:
     * - Collection::stream()
     * - Stream::filter()
     * - Stream::count()
     */
    static long countEven(Collection<Integer> numbers) {
        return numbers.stream().filter(n -> n % 2 == 0).count();
    }

    /**
     * Функция должна вернуть число строчных символов в строке.
     * <p>
     * Пример:
     * "abcDE" -> 3
     * "ABC" -> 0
     * <p>
     * Тут подойдут эти методы:
     * - String::chars()
     * - Character::isLowerCase()
     * - Stream::count()
     */
    static long countLowercaseLetters(String str) {
        // Не смог решить :(
        return 0;
    }


    /**
     * Функция должна заменить каждое слово в строке его длинной.
     * <p>
     * Слова разделяются одним или более пробелами.
     * <p>
     * Пример:
     * "a b cd" -> "1 1 2"
     * "one two   three" -> "3 3 5"
     * <p>
     * Тут подойдут эти методы:
     * - String::split()
     * - Stream::map()
     * - Stream::collect()
     * - Collectors.joining()
     */

    //Понимаю что решил коряво, поэтому хочу попросить помощи в улучшении кода)
    static String replaceWordsOnLength(String str) {
        String[] a = str.split(" ");
        StringBuilder output = new StringBuilder();
        Stream.of(a)
                .map(word ->
                {
                    if (word.length() != 0) {
                        word = Integer.toString(word.length());
                    }
                    return word;
                })
                .forEach(word -> output.append(word).append(" "));
        return output.toString().trim().replaceAll("\\s\\s", "\s");
    }
}