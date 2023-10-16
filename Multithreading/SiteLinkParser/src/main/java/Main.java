import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ForkJoinPool;

public class Main {

    public static final String homepage = "https://shop.tastycoffee.ru";

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        Task task = new Task(homepage);
        TreeSet<String> links = pool.invoke(task);
        HashMap<String, ParsedLink> linkMap = new HashMap<>();
        int i = 0;
        for (String s : links) {
            String[] arr = s.split("/");
            linkMap.put(s, new ParsedLink(arr[arr.length - 2], arr.length));
        }
        System.out.println(homepage);
        for (Map.Entry<String, ParsedLink> entry : linkMap.entrySet()) {
            String[] array = entry.getKey().split("/");
            if (array.length == 4) {
                System.out.println("\t" + entry.getKey());
                for (Map.Entry<String, ParsedLink> secondEntry : linkMap.entrySet()) {
                    String[] secondArray = secondEntry.getKey().split("/");
                    if (secondEntry.getValue().getParentLink().equals(array[3])) {
                        System.out.println("\t\t" + secondEntry.getKey());
                        for (Map.Entry<String, ParsedLink> thirdEntry : linkMap.entrySet()) {
                            if (thirdEntry.getValue().getParentLink().equals(secondArray[4])) {
                                System.out.println("\t\t\t" + thirdEntry.getKey());
                            }
                        }
                    }
                }
            }
        }
    }
}
