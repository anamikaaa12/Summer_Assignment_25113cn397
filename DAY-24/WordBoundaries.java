import java.text.BreakIterator;
import java.util.Scanner;

public class WordBoundaries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence to analyze boundaries: ");
        String text = scanner.nextLine();
        
        System.out.println("\n--- Identified Word Boundaries ---");
        BreakIterator wordIterator = BreakIterator.getWordInstance();
        wordIterator.setText(text);
        
        int start = wordIterator.first();
        for (int end = wordIterator.next(); end != BreakIterator.DONE; start = end, end = wordIterator.next()) {
            String word = text.substring(start, end);
            // Filter out empty spaces and punctuation intervals to show pure words
            if (Character.isLetterOrDigit(word.charAt(0))) {
                System.out.println("Word: [" + word + "] found between index " + start + " and " + end);
            }
        }
        
        scanner.close();
    }
}
