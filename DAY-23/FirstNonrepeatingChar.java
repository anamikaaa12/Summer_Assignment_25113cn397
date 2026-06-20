import java.util.Scanner;

public class FirstNonrepeatingChar {
    public static void main(String[] args) {
        // Create a Scanner object to handle user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Find the first unique character
        char result = findFirstUniqueChar(input);
        
        // Display the results to the user
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("All characters are repeating or the input is empty.");
        }
        
        scanner.close();
    }

    /**
     * Finds the first non-repeating character in a string.
     * @param str The user-inputted string
     * @return The first unique character, or '\0' if none exist
     */
    public static char findFirstUniqueChar(String str) {
        if (str == null || str.isEmpty()) {
            return '\0';
        }

        // Frequency array for all 256 Extended ASCII characters
        int[] charCounts = new int[256];

        // Pass 1: Count the occurrences of each character
        for (int i = 0; i < str.length(); i++) {
            charCounts[str.charAt(i)]++;
        }

        // Pass 2: Find the first character with a frequency count of 1
        for (int i = 0; i < str.length(); i++) {
            if (charCounts[str.charAt(i)] == 1) {
                return str.charAt(i); // Return immediately upon finding it
            }
        }

        return '\0'; // Return null character if no unique character is found
    }
}
