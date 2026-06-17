import java.util.Scanner;

public class MatrixMultiplication {

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] mat1, int[][] mat2) {
        int rows1 = mat1.length;
        int cols1 = mat1[0].length;
        int rows2 = mat2.length;
        int cols2 = mat2[0].length;

        // Check if multiplication is possible
        if (cols1 != rows2) {
            throw new IllegalArgumentException(
                "Matrix multiplication not possible: Columns of first matrix must equal rows of second matrix."
            );
        }

        int[][] result = new int[rows1][cols2];

        // Matrix multiplication logic
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        return result;
    }

    // Method to read a matrix from user
    public static int[][] readMatrix(Scanner sc, int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements row by row:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                while (!sc.hasNextInt()) {
                    System.out.println("Invalid input. Please enter an integer:");
                    sc.next();
                }
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
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
            // Input dimensions for first matrix
            System.out.print("Enter rows and columns of first matrix: ");
            int rows1 = sc.nextInt();
            int cols1 = sc.nextInt();

            // Input dimensions for second matrix
            System.out.print("Enter rows and columns of second matrix: ");
            int rows2 = sc.nextInt();
            int cols2 = sc.nextInt();

            // Read matrices
            System.out.println("First Matrix:");
            int[][] mat1 = readMatrix(sc, rows1, cols1);

            System.out.println("Second Matrix:");
            int[][] mat2 = readMatrix(sc, rows2, cols2);

            // Multiply matrices
            int[][] result = multiplyMatrices(mat1, mat2);

            // Display result
            System.out.println("Resultant Matrix:");
            displayMatrix(result);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
