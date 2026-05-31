import java.util.Scanner;
public class ArmstrongRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start of range: ");
        int start = sc.nextInt();

        System.out.print("Enter end of range: ");
        int end = sc.nextInt();

        System.out.println("Armstrong numbers in range:");

        for (int num = start; num <= end; num++) {
            int original = num;
            int temp = num;
            int digits = 0;

            // count digits
            while (temp > 0) {
                digits++;
                temp /= 10;
            }

            temp = num;
            int sum = 0;

            // calculate sum of powers
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == original) {
                System.out.print(num + " ");
            }
        }

        sc.close();
    }
}