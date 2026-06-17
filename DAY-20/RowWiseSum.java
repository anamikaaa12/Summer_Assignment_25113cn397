import java.util.Scanner;

public class RowWiseSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input number of rows
            System.out.print("Enter number of rows: ");
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                return;
            }
            int rows = sc.nextInt();

            // Input number of columns
            System.out.print("Enter number of columns: ");
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                return;
            }
            int cols = sc.nextInt();

            // Validate matrix size
            if (rows <= 0 || cols <= 0) {
                System.out.println("Matrix dimensions must be positive integers.");
                return;
            }

            int[][] matrix = new int[rows][cols];

            // Input matrix elements
            System.out.println("Enter matrix elements row-wise:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (!sc.hasNextInt()) {
                        System.out.println("Invalid input. Please enter integers only.");
                        return;
                    }
                    matrix[i][j] = sc.nextInt();
                }
            }

            // Calculate and print row-wise sum
            System.out.println("Row-wise sums:");
            for (int i = 0; i < rows; i++) {
                int sum = 0;
                for (int j = 0; j < cols; j++) {
                    sum += matrix[i][j];
                }
                System.out.println("Sum of row " + (i + 1) + ": " + sum);
            }

        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
