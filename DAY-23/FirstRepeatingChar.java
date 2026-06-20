import java.util.Scanner;

public class FirstRepeatingChar{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        char result = findFirstRepeating(input);
        
        if (result != '\0') {
            System.out.println("The first repeating character is: '" + result + "'");
        } else {
            System.out.println("No repeating characters found.");
        }
        
        scanner.close();
    }

    public static char findFirstRepeating(String str) {
        // Extended ASCII table has 256 characters
        boolean[] count = new boolean[256];
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // If the character has been visited before, it's our first duplicate
            if (count[ch]) {
                return ch;
            }
            
            // Mark the character as visited
            count[ch] = true;
        }
        
        return '\0'; 
    }
}
