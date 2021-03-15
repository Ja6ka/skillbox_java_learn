public class Main {

    public static void main(String[] args) {
        int[][] matrix = new int[6][7];
        int count = 10;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = count;
                count++;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print(System.lineSeparator());
        }
        System.out.println("-------------");
        int[][] matrixCopy = getTransposedMatrix(matrix);
    }

    public static int[][] getTransposedMatrix(int[][] matrix) {
        int[][] matrixCopier = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrixCopier[i][j] = matrix[j][i];
                System.out.print(matrixCopier[i][j] + " ");
            }
            System.out.print(System.lineSeparator());
        }
        return matrixCopier;
    }
}
