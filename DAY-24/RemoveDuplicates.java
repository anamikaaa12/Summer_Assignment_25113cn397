import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string to remove duplicates from: ");
        String input = scanner.nextLine();
        
        String cleanString = removeDuplicateChars(input);
        System.out.println("String with duplicates removed: " + cleanString);
        
        scanner.close();
    }
    
    public static String removeDuplicateChars(String str) {
        // LinkedHashSet keeps the insertion order and enforces uniqueness
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        
        // Build the final string from unique set tokens
        StringBuilder sb = new StringBuilder();
        for (Character ch : set) {
            sb.append(ch);
        }
        
        return sb.toString();
    }
}
