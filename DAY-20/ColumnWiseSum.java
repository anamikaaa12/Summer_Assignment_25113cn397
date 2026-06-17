import java.util.Scanner;

public class ColumnWiseSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Take matrix dimensions from user
            System.out.print("Enter number of rows: ");
            int rows = sc.nextInt();
            System.out.print("Enter number of columns: ");
            int cols = sc.nextInt();

            // Validate dimensions
            if (rows <= 0 || cols <= 0) {
                System.out.println("Rows and columns must be positive integers.");
                return;
            }

            int[][] matrix = new int[rows][cols];

            // Input matrix elements
            System.out.println("Enter the elements of the matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.printf("Element [%d][%d]: ", i, j);
                    matrix[i][j] = sc.nextInt();
                }
            }

            // Calculate column-wise sum
            System.out.println("\nColumn-wise sums:");
            for (int j = 0; j < cols; j++) {
                int colSum = 0;
                for (int i = 0; i < rows; i++) {
                    colSum += matrix[i][j];
                }
                System.out.printf("Sum of column %d = %d\n", j, colSum);
            }

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            sc.close();
        }
    }
}
