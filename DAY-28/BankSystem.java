import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ". New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    public void checkBalance() {
        System.out.println("Account Holder: " + accountHolder + " | Balance: " + balance);
    }
}

public class BankSystem {
    private Map<String, BankAccount> accounts = new HashMap<>();

    public void createAccount(String number, String name, double initialDeposit) {
        if (!accounts.containsKey(number)) {
            accounts.put(number, new BankAccount(number, name, initialDeposit));
            System.out.println("Account created successfully.");
        } else {
            System.out.println("Account number already exists.");
        }
    }

    public BankAccount getAccount(String number) {
        return accounts.get(number);
    }

    public static void main(String[] args) {
        BankSystem bank = new BankSystem();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Create Account\n2. Deposit\n3. Withdraw\n4. Check Balance\n5. Exit");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 5) break;

            System.out.print("Enter Account Number: ");
            String num = scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter Name: "); String name = scanner.nextLine();
                System.out.print("Enter Initial Deposit: "); double deposit = scanner.nextDouble();
                bank.createAccount(num, name, deposit);
                continue;
            }

            BankAccount account = bank.getAccount(num);
            if (account == null) {
                System.out.println("Account not found.");
                continue;
            }

            switch (choice) {
                case 2:
                    System.out.print("Enter Deposit Amount: ");
                    account.deposit(scanner.nextDouble());
                    break;
                case 3:
                    System.out.print("Enter Withdrawal Amount: ");
                    account.withdraw(scanner.nextDouble());
                    break;
                case 4:
                    account.checkBalance();
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
