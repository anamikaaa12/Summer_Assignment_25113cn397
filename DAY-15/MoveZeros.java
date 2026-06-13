import java.util.*;

public class MoveZeros {
    public static void main(String[] args) {
        int arr[] = {1, 0, 3, 0, 5, 0, 7};

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }

        System.out.println(Arrays.toString(arr));
    }
}