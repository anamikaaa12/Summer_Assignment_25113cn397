import java.util.Arrays;
import java.util.Scanner;

public class SortNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter names separated by spaces: ");
        String input = scanner.nextLine();
        
        // Split input string into an array of names
        String[] names = input.split("\\s+");

        Arrays.sort(names);

        System.out.println("Alphabetically Sorted Names: " + Arrays.toString(names));
        scanner.close();
    }
}
