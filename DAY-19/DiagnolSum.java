import java.util.Scanner;

public class DiagnolSum {

    // Method to calculate the sum of primary and secondary diagonals
    public static int[] calculateDiagonalSums(int[][] matrix, int n) {
        int primarySum = 0;
        int secondarySum = 0;

        for (int i = 0; i < n; i++) {
            primarySum += matrix[i][i]; // Primary diagonal: row == col
            secondarySum += matrix[i][n - 1 - i]; // Secondary diagonal: row + col == n - 1
        }

        return new int[]{primarySum, secondarySum};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter size of square matrix (n): ");
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                return;
            }
            int n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Matrix size must be positive.");
                return;
            }

            int[][] matrix = new int[n][n];
            System.out.println("Enter " + (n * n) + " elements of the matrix:");

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (!sc.hasNextInt()) {
                        System.out.println("Invalid input. Please enter integers only.");
                        return;
                    }
                    matrix[i][j] = sc.nextInt();
                }
            }

            int[] sums = calculateDiagonalSums(matrix, n);

            System.out.println("Primary Diagonal Sum: " + sums[0]);
            System.out.println("Secondary Diagonal Sum: " + sums[1]);

            // If you want the total sum of both diagonals without double-counting the center (for odd n)
            int totalSum = sums[0] + sums[1];
            if (n % 2 == 1) {
                totalSum -= matrix[n / 2][n / 2]; // Remove duplicate center element
            }
            System.out.println("Total Diagonal Sum (no double count): " + totalSum);

        } finally {
            sc.close();
        }
    }
}
