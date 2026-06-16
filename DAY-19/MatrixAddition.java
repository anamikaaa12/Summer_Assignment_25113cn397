import java.util.Scanner;

public class MatrixAddition {

    // Method to add two matrices
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] sum = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = A[i][j] + B[i][j];
            }
        }
        return sum;
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
                System.out.println("Matrix dimensions must be positive integers.");
                return;
            }

            int[][] A = new int[rows][cols];
            int[][] B = new int[rows][cols];

            // Input first matrix
            System.out.println("Enter elements of first matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    A[i][j] = sc.nextInt();
                }
            }

            // Input second matrix
            System.out.println("Enter elements of second matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    B[i][j] = sc.nextInt();
                }
            }

            // Add matrices
            int[][] sum = addMatrices(A, B);

            // Display result
            System.out.println("Sum of the two matrices:");
            printMatrix(sum);

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            sc.close();
        }
    }
}
