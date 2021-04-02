import java.util.*;

public class CoolNumbers {


    public static List<String> generateCoolNumbers() {
        List<String> numbers = new ArrayList<>();
        String [] letters = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        int regionNumber;
        String coolDigits;
        for (regionNumber = 1; regionNumber <= 199; regionNumber++) {
            for (String l : letters) {
                for (int i = 1; i <=999; i++) {
                    if (i < 10) {
                        coolDigits = "00" + i;
                    } else if (i < 100) {
                        coolDigits = "0" + i;

                    } else coolDigits = Integer.toString(i);
                    numbers.add(l + coolDigits + l + l + (regionNumber < 10 ? "0" + regionNumber : regionNumber));
                }
            }
        }
        return numbers;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        boolean isFound = false;
        long startOfSearch = System.nanoTime();
        for (String result : list) {
            if (result.equals(number)) {
                long durationOfSearch = System.nanoTime() - startOfSearch;
                System.out.println("Поиск перебором: номер найден, поиск занял " + durationOfSearch + "нс");
                isFound = true;
            }
        } if (!isFound) {
            long durationOfSearch = System.nanoTime() - startOfSearch;
            System.out.println("Поиск перебором: номер не найден, поиск занял " + durationOfSearch + "нс");
        } return isFound;
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        boolean isFound = false;
        long startOfSearch = System.nanoTime();
        int foundInteger = Collections.binarySearch(sortedList, number);
        if(foundInteger >= 0) {
            long durationOfSearch = System.nanoTime() - startOfSearch;
            System.out.println("Бинарный поиск: номер найден, поиск занял " + durationOfSearch + "нс");
            isFound = true;
        } else {
            long durationOfSearch = System.nanoTime() - startOfSearch;
            System.out.println("Бинарный поиск: номер не найден, поиск занял " + durationOfSearch + "нс");
        }
        return isFound;
    }


    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        boolean isFound = false;
        long startOfSearch = System.nanoTime();
        if (hashSet.contains(number)) {
            long durationOfSearch = System.nanoTime() - startOfSearch;
            System.out.println("Поиск в HashSet: номер найден, поиск занял " + durationOfSearch + "нс");
            isFound = true;
        } else {
            long durationOfSearch = System.nanoTime() - startOfSearch;
            System.out.println("Поиск в HashSet: номер не найден, поиск занял " + durationOfSearch + "нс");
        }
        return isFound;
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        boolean isFound = false;
        long startOfSearch = System.nanoTime();
        if (treeSet.contains(number)) {
            long durationOfSearch = System.nanoTime() - startOfSearch;
            System.out.println("Поиск в TreeSet: номер найден, поиск занял " + durationOfSearch + "нс");
            isFound = true;
        } else {
            long durationOfSearch = System.nanoTime() - startOfSearch;
            System.out.println("Поиск в TreeSet: номер не найден, поиск занял " + durationOfSearch + "нс");
        }
        return isFound;
    }
}
