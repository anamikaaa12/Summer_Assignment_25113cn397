import java.util.Scanner;

public class MatrixSubtraction {

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] mat1, int[][] mat2) {
        int rows = mat1.length;
        int cols = mat1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = mat1[i][j] - mat2[i][j];
            }
        }
        return result;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
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

            int[][] matrix1 = new int[rows][cols];
            int[][] matrix2 = new int[rows][cols];

            // Input first matrix
            System.out.println("Enter elements of first matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix1[i][j] = sc.nextInt();
                }
            }

            // Input second matrix
            System.out.println("Enter elements of second matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix2[i][j] = sc.nextInt();
                }
            }

            // Subtract matrices
            int[][] result = subtractMatrices(matrix1, matrix2);

            // Display result
            System.out.println("Resultant Matrix after subtraction:");
            displayMatrix(result);

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            sc.close();
        }
    }
}
