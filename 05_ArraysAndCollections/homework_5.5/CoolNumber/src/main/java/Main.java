import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Main {


    public static void main(String[] args) {
        List<String> arrayNumbers = CoolNumbers.generateCoolNumbers();
        Collections.sort(arrayNumbers);
        TreeSet<String> treeNumbers = new TreeSet<>(arrayNumbers);
        HashSet<String> hashNumbers = new HashSet<>(arrayNumbers);

        String ourNumber = "Т566ТТ106";
        CoolNumbers.bruteForceSearchInList(arrayNumbers, ourNumber);
        CoolNumbers.binarySearchInList(arrayNumbers, ourNumber);
        CoolNumbers.searchInHashSet(hashNumbers, ourNumber);
        CoolNumbers.searchInTreeSet(treeNumbers, ourNumber);
    }
}
