import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Validate input
        if (input == null || input.isEmpty()) {
            System.out.println("Error: String cannot be empty.");
            sc.close();
            return;
        }

        // Count character frequencies
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char ch : input.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Display results
        System.out.println("\nCharacter frequencies:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }

        sc.close();
    }
}
