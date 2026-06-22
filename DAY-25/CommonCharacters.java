import java.util.Scanner;

public class CommonCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        int[] count1 = new int[256];
        int[] count2 = new int[256];

        for (char ch : str1.toCharArray()) {
            count1[ch]++;
        }
        for (char ch : str2.toCharArray()) {
            count2[ch]++;
        }

        StringBuilder common = new StringBuilder();
        for (int i = 0; i < 256; i++) {
            int matchCount = Math.min(count1[i], count2[i]);
            for (int c = 0; c < matchCount; c++) {
                common.append((char) i);
            }
        }

        System.out.println("Common Characters: " + common.toString());
        scanner.close();
    }
}
