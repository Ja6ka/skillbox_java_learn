public class TwoDimensionalArray {
    public static char symbol = 'X';

    public static char[][] getTwoDimensionalArray(int size) {

        char[][] painting = new char[size][size];

        for (int i = 0; i < painting.length; i++) {
            for (int k = 0; k < painting[i].length; k++) {
                if (i == k || i + k == painting[i].length - 1) {
                    painting[i][k] = symbol;
                } else
                    painting[i][k] = ' ';
            }
        }
        return painting;
    }
}
