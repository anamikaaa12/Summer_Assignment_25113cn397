import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (input == null || input.isEmpty()) {
            System.out.println("Input string is empty.");
            scanner.close();
            return;
        }

        StringBuilder result = new StringBuilder();

        // Loop through each character and skip spaces
        for (char c : input.toCharArray()) {
            if (!Character.isWhitespace(c)) { // skips spaces, tabs, newlines
                result.append(c);
            }
        }

        System.out.println("String without spaces: " + result.toString());
        scanner.close();
    }
}
