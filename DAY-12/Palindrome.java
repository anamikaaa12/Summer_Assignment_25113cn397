import java.util.Scanner;

public class Palindrome {
    static boolean isPalindrome(int n) {
        int temp = n, rev = 0;
        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        return temp == rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (isPalindrome(num))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}