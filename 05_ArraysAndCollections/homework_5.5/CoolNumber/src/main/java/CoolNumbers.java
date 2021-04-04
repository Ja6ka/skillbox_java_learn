import java.util.*;

public class CoolNumbers {

    private static final StringBuilder bruteForceResults = new StringBuilder("Поиск перебором: " + System.lineSeparator());
    private static final StringBuilder binarySearchResults = new StringBuilder("Бинарный поиск: " + System.lineSeparator());
    private static final StringBuilder hashSetResults = new StringBuilder("Поиск в HashSet:" + System.lineSeparator());
    private static final StringBuilder treeSetResults = new StringBuilder("Поиск в TreeSet:" + System.lineSeparator());

    private static long totalBruteTime = 0;
    private static long totalBinaryTime = 0;
    private static long totalHashTime = 0;
    private static long totalTreeTime = 0;

    private static long bruteCount = 0;
    private static long binaryCount = 0;
    private static long hashCount = 0;
    private static long treeCount = 0;


    public static List<String> generateCoolNumbers() {
        List<String> numbers = new ArrayList<>();
        String[] letters = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        int regionNumber;
        String coolDigits;
        for (regionNumber = 1; regionNumber <= 199; regionNumber++) {
            for (String l : letters) {
                for (int i = 1; i <= 999; i++) {
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
                bruteForceResults.append("Номер найден, поиск занял ").append(durationOfSearch).append("нс")
                        .append(System.lineSeparator());
                isFound = true;
                totalBruteTime = totalBruteTime + durationOfSearch;
                bruteCount++;
            }
        }
        if (!isFound) {
            long durationOfSearch = System.nanoTime() - startOfSearch;
            bruteForceResults.append("Номер не найден, поиск занял ").append(durationOfSearch)
                    .append("нс").append(System.lineSeparator());
            totalBruteTime = totalBruteTime + durationOfSearch;
            bruteCount++;
        }
        return isFound;
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        boolean isFound = false;
        long startOfSearch = System.nanoTime();
        int foundInteger = Collections.binarySearch(sortedList, number);
        if (foundInteger >= 0) {
            long durationOfSearch = System.nanoTime() - startOfSearch;
            binarySearchResults.append("Номер найден, поиск занял ").append(durationOfSearch).append("нс")
                    .append(System.lineSeparator());
            isFound = true;
            totalBinaryTime = totalBinaryTime + durationOfSearch;
            binaryCount++;
        } else {
            long durationOfSearch = System.nanoTime() - startOfSearch;
            binarySearchResults.append("Номер не найден, поиск занял ").append(durationOfSearch).append("нс")
                    .append(System.lineSeparator());
            totalBinaryTime = totalBinaryTime + durationOfSearch;
            binaryCount++;
        }
        return isFound;
    }

    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        boolean isFound = false;
        long startOfSearch = System.nanoTime();
        if (hashSet.contains(number)) {
            long durationOfSearch = System.nanoTime() - startOfSearch;
            hashSetResults.append("Номер найден, поиск занял ").append(durationOfSearch).append("нс")
                    .append(System.lineSeparator());
            isFound = true;
            totalHashTime = totalHashTime + durationOfSearch;
            hashCount++;
        } else {
            long durationOfSearch = System.nanoTime() - startOfSearch;
            hashSetResults.append("Номер не найден, поиск занял ").append(durationOfSearch).append("нс")
                    .append(System.lineSeparator());
            totalHashTime = totalHashTime + durationOfSearch;
            hashCount++;
        }
        return isFound;
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        boolean isFound = false;
        long startOfSearch = System.nanoTime();
        if (treeSet.contains(number)) {
            long durationOfSearch = System.nanoTime() - startOfSearch;
            treeSetResults.append("Номер найден, поиск занял ").append(durationOfSearch).append("нс")
                    .append(System.lineSeparator());
            isFound = true;
            totalTreeTime = totalTreeTime + durationOfSearch;
            treeCount++;
        } else {
            long durationOfSearch = System.nanoTime() - startOfSearch;
            treeSetResults.append("Номер не найден, поиск занял ").append(durationOfSearch).append("нс")
                    .append(System.lineSeparator());
            totalTreeTime = totalTreeTime + durationOfSearch;
            treeCount++;
        }
        return isFound;
    }

    public static void printBruteForceResults() {
        bruteForceResults.append("Среднее время поиска: ").append(totalBruteTime / bruteCount).append("нс");
        System.out.println(bruteForceResults.toString());
    }

    public static void printBinarySearchResults() {
        binarySearchResults.append("Среднее время поиска: ").append(totalBinaryTime / binaryCount).append("нс");
        System.out.println(binarySearchResults.toString());
    }

    public static void printHashSetResults() {
        hashSetResults.append("Среднее время поиска: ").append(totalHashTime / hashCount).append("нс");
        System.out.println(hashSetResults.toString());
    }

    public static void printTreeSetResults() {
        treeSetResults.append("Среднее время поиска: ").append(totalTreeTime / treeCount).append("нс");
        System.out.println(treeSetResults.toString());
    }
}
