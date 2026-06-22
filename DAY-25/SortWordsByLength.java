import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SortWordsByLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter words separated by spaces: ");
        String input = scanner.nextLine();
        
        String[] words = input.split("\\s+");

        // Sort using length property
        Arrays.sort(words, Comparator.comparingInt(String::length));

        System.out.println("Words Sorted by Length: " + Arrays.toString(words));
        scanner.close();
    }
}
