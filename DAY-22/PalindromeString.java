import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string to check if it's a palindrome: ");
        String originalStr = scanner.nextLine();
        
        // Check palindrome status
        if (isPalindrome(originalStr)) {
            System.out.println("\"" + originalStr + "\" is a palindrome.");
        } else {
            System.out.println("\"" + originalStr + "\" is NOT a palindrome.");
        }
        
        // Close the scanner resource
        scanner.close();
    }

    /**
     * Helper method to verify if a string is a palindrome.
     * It is case-insensitive and ignores spaces/special characters.
     */
    public static boolean isPalindrome(String str) {
        // Edge case: an empty string or single character is always a palindrome
        if (str == null || str.isEmpty()) {
            return true;
        }
        
        // Clean the string: convert to lowercase and remove non-alphanumeric characters
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int left = 0;
        int right = cleanedStr.length() - 1;
        
        // Compare characters from both ends moving towards the center
        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false; // Mismatch found, not a palindrome
            }
            left++;
            right--;
        }
        
        return true; // All characters matched
    }
}
