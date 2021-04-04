import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        List<String> arrayNumbers = CoolNumbers.generateCoolNumbers();
        Collections.sort(arrayNumbers);
        TreeSet<String> treeNumbers = new TreeSet<>(arrayNumbers);
        HashSet<String> hashNumbers = new HashSet<>(arrayNumbers);

        String ourNumber = "Т566ТТ106";

        for (int count = Integer.parseInt(number); count > 0; count--) {
            CoolNumbers.bruteForceSearchInList(arrayNumbers, ourNumber);
            CoolNumbers.binarySearchInList(arrayNumbers, ourNumber);
            CoolNumbers.searchInHashSet(hashNumbers, ourNumber);
            CoolNumbers.searchInTreeSet(treeNumbers, ourNumber);
        }

        CoolNumbers.printBruteForceResults();
        CoolNumbers.printBinarySearchResults();
        CoolNumbers.printHashSetResults();
        CoolNumbers.printTreeSetResults();
    }
}
