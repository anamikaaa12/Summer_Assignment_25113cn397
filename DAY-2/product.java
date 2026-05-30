import java.util.Scanner;
public class product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        int product = 1;
        while (n > 0) {
            product *= n % 10; // Multiply the last digit to the product
            n /= 10; // Remove the last digit
        }
        System.out.println("Product of digits is: " + product);
        sc.close();
    }}
