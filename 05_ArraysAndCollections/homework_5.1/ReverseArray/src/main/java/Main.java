import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String line = "Каждый охотник желает знать, где сидит фазан";
        String [] b = line.split(" ");
        String [] c = ReverseArray.reverse(b);
        System.out.println(Arrays.toString(c));
    }




}
