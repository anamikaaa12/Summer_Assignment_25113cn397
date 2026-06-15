import java.util.Arrays;

public class BubbleSort {
    
    // Method to perform bubble sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        // Outer loop for number of passes
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            // Inner loop for adjacent element comparison
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true; // Mark that a swap occurred
                }
            }
            
            // If no two elements were swapped in the inner loop, the array is sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] data = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Original Array: " + Arrays.toString(data));
        
        // Call the sorting method
        bubbleSort(data);
        
        System.out.println("Sorted Array:   " + Arrays.toString(data));
    }
}
