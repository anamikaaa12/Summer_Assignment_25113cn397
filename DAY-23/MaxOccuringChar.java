import java.util.Scanner;

public class MaxOccuringChar{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        if (input == null || input.isEmpty()) {
            System.out.println("The input string is empty.");
            scanner.close();
            return;
        }
        
        char maxChar = getMaxOccurringChar(input);
        System.out.println("The maximum occurring character is: '" + maxChar + "'");
        
        scanner.close();
    }
    
    public static char getMaxOccurringChar(String str) {
        int[] frequency = new int[256];
        int length = str.length();
        
        for (int i = 0; i < length; i++) {
            frequency[str.charAt(i)]++;
        }
        
        int maxCount = -1;
        char maxChar = ' ';
        
        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            if (frequency[currentChar] > maxCount) {
                maxCount = frequency[currentChar];
                maxChar = currentChar;
            }
        }
        
        return maxChar;
    }
}
