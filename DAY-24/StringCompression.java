import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string to compress: ");
        String input = scanner.nextLine();
        
        String compressed = compress(input);
        System.out.println("Result: " + compressed);
        
        scanner.close();
    }
    
    public static String compress(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        
        StringBuilder compressed = new StringBuilder();
        int countConsecutive = 0;
        
        for (int i = 0; i < str.length(); i++) {
            countConsecutive++;
            
            // If next character is different or we reach the end, append to result
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressed.append(str.charAt(i));
                compressed.append(countConsecutive);
                countConsecutive = 0;
            }
        }
        
        // Return original if compression doesn't save space
        return compressed.length() < str.length() ? compressed.toString() : str;
    }
}
