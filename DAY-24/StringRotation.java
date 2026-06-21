import java.util.Scanner;

public class StringRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();
        
        if (isRotation(str1, str2)) {
            System.out.println("\"" + str2 + "\" is a rotation of \"" + str1 + "\"");
        } else {
            System.out.println("\"" + str2 + "\" is NOT a rotation of \"" + str1 + "\"");
        }
        
        scanner.close();
    }
    
    public static boolean isRotation(String str1, String str2) {
        // Rotations must have equal length and must not be empty
        if (str1.length() != str2.length() || str1.isEmpty()) {
            return false;
        }
        // Concatenate str1 with itself and check if str2 is present
        String concatenated = str1 + str1;
        return concatenated.contains(str2);
    }
}
