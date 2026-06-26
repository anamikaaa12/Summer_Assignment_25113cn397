import java.util.Scanner;

public class StringOperationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.String.valueOf(System.in));
        // Use separate sc.nextLine() processing to handle space separation cleanly
        Scanner stringScanner = new Scanner(System.in); 
        int choice;

        do {
            System.out.println("\n=== STRING OPERATIONS MENU ===");
            System.out.println("1. Find String Length");
            System.out.println("2. Concatenate Strings");
            System.out.println("3. Reverse a String");
            System.out.println("4. Convert to Uppercase");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = stringScanner.nextInt();
            stringScanner.nextLine(); // Consume newline leftover

            switch (choice) {
                case 1:
                    System.out.print("Enter a string: ");
                    String str1 = stringScanner.nextLine();
                    System.out.println("Length: " + str1.length());
                    break;

                case 2:
                    System.out.print("Enter first string: ");
                    String s1 = stringScanner.nextLine();
                    System.out.print("Enter second string: ");
                    String s2 = stringScanner.nextLine();
                    System.out.println("Concatenated String: " + s1.concat(s2));
                    break;

                case 3:
                    System.out.print("Enter string to reverse: ");
                    String target = stringScanner.nextLine();
                    String reversed = new StringBuilder(target).reverse().toString();
                    System.out.println("Reversed String: " + reversed);
                    break;

                case 4:
                    System.out.print("Enter string: ");
                    String lowerStr = stringScanner.nextLine();
                    System.out.println("Uppercase: " + lowerStr.toUpperCase());
                    break;

                case 5:
                    System.out.println("Exiting String Operation System.");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);

        stringScanner.close();
    }
}
