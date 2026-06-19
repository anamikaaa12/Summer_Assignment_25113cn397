import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        // Create scanner to capture console input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        // Get the word count
        int count = countWords(sentence);
        
        System.out.println("Word count: " + count);
        
        // Close the scanner resource
        scanner.close();
    }

    /**
     * Helper method to count words in a given string.
     * Handles null values, empty strings, and multiple spaces.
     */
    public static int countWords(String str) {
        // Check for empty or null strings first
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        
        // Trim leading/trailing whitespace and split by one or more spaces
        // "\\s+" matches one or multiple spaces, tabs, or newlines
        String[] words = str.trim().split("\\s+");
        
        return words.length;
    }
}
