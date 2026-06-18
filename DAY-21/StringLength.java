import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        // Find the length without using the .length() method
        int calculatedLength = findStringLength(inputString);
        
        System.out.println("The length of the string is: " + calculatedLength);
        
        scanner.close();
    }

    public static int findStringLength(String str) {
        int count = 0;
        
        // Convert string to character array and loop through it
        for (char ch : str.toCharArray()) {
            count++;
        }
        
        return count;
    }
}
