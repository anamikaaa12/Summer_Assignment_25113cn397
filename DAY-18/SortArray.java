import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {15, 3, 91, 42, 6, 28};
        int temp;

        // Nested loops to compare and swap elements
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) { // Change to < for descending order
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Print the result
        System.out.println("Descending Order: " + Arrays.toString(arr));
    }
}
