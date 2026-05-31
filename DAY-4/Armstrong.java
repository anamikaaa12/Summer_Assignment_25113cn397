import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int digits = 0;
        int temp = num;

        // count digits
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        int sum = 0;
        temp = num;

        // calculate Armstrong sum
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        if (sum == original) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }

        sc.close();
    }
}