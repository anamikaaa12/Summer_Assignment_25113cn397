import java.util.*;

public class IntersectionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];

        System.out.println("Enter elements:");
        for(int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];

        System.out.println("Enter elements:");
        for(int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        for(int x : arr1)
            set.add(x);

        System.out.println("Intersection:");

        for(int x : arr2) {
            if(set.contains(x))
                System.out.print(x + " ");
        }
    }
}