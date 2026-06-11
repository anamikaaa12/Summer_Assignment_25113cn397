import java.util.Scanner;

public class DuplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Duplicate elements are:");

        for(int i = 0; i < n; i++) {
            boolean duplicatePrinted = false;

            for(int k = 0; k < i; k++) {
                if(arr[i] == arr[k]) {
                    duplicatePrinted = true;
                    break;
                }
            }

            if(duplicatePrinted)
                continue;

            for(int j = i + 1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}