import java.util.Scanner;

public class MatrixTranspose {

    // Method to compute transpose of a matrix
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];

        // Swap rows with columns
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input matrix dimensions
            System.out.print("Enter number of rows: ");
            int rows = sc.nextInt();
            System.out.print("Enter number of columns: ");
            int cols = sc.nextInt();

            if (rows <= 0 || cols <= 0) {
                System.out.println("Rows and columns must be positive integers.");
                return;
            }

            int[][] matrix = new int[rows][cols];

            // Input matrix elements
            System.out.println("Enter matrix elements:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            // Display original matrix
            System.out.println("\nOriginal Matrix:");
            printMatrix(matrix);

            // Compute and display transpose
            int[][] transposed = transpose(matrix);
            System.out.println("\nTransposed Matrix:");
            printMatrix(transposed);

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            sc.close();
        }
    }
}
