import java.util.Scanner;

public class Armstrong {
    static boolean isArmstrong(int n) {
        int temp = n, sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }

        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (isArmstrong(num))
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}