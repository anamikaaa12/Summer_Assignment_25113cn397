import java.util.*;

public class AtmSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000.00; // Initial balance
        int pin = 1234; // Default PIN

        System.out.print("Enter your PIN: ");
        if (!sc.hasNextInt() || sc.nextInt() != pin) {
            System.out.println("Invalid PIN. Access denied.");
            return;
        }

        while (true) {
            System.out.println("\n=== ATM Menu ===");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid choice! Try again.");
                sc.next();
                continue;
            }

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.printf("Your balance: ₹%.2f%n", balance);
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    if (sc.hasNextDouble()) {
                        double deposit = sc.nextDouble();
                        if (deposit > 0) {
                            balance += deposit;
                            System.out.println("Deposit successful.");
                        } else {
                            System.out.println("Amount must be positive.");
                        }
                    } else {
                        System.out.println("Invalid amount.");
                        sc.next();
                    }
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    if (sc.hasNextDouble()) {
                        double withdraw = sc.nextDouble();
                        if (withdraw > 0 && withdraw <= balance) {
                            balance -= withdraw;
                            System.out.println("Withdrawal successful.");
                        } else {
                            System.out.println("Invalid amount or insufficient funds.");
                        }
                    } else {
                        System.out.println("Invalid amount.");
                        sc.next();
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using our ATM.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
