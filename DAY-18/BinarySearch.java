public class BinarySearch {
    public static int search(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Prevents integer overflow

            if (arr[mid] == target) return mid;      // Element found
            if (arr[mid] < target) low = mid + 1;    // Search right half
            else high = mid - 1;                     // Search left half
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 12};
        int target = 8;
        System.out.println("Element found at index: " + search(numbers, target));
    }
}
