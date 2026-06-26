import java.util.Scanner;

class Product {
    int id;
    String name;
    int quantity;
    double price;

    public Product(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public void displayProduct() {
        System.out.printf("ID: %-5d | Name: %-15s | Qty: %-5d | Price: $%-8.2f\n", id, name, quantity, price);
    }
}

public class InventoryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] inventory = new Product[100]; // Max capacity 100 items
        int productCount = 0;
        int choice;

        do {
            System.out.println("\n=== INVENTORY MANAGEMENT SYSTEM ===");
            System.out.println("1. Add New Product");
            System.out.println("2. Display All Products");
            System.out.println("3. Search Product by ID");
            System.out.println("4. Update Product Price");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (productCount >= inventory.length) {
                        System.out.println("Inventory database full.");
                        break;
                    }
                    System.out.print("Enter Product ID (Integer): ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Clear buffer
                    System.out.print("Enter Product Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Stock Quantity: ");
                    int qty = scanner.nextInt();
                    System.out.print("Enter Unit Price: ");
                    double price = scanner.nextDouble();

                    inventory[productCount] = new Product(id, name, qty, price);
                    productCount++;
                    System.out.println("Product registered successfully.");
                    break;

                case 2:
                    if (productCount == 0) {
                        System.out.println("No products available in the inventory.");
                    } else {
                        System.out.println("\n--- Current Inventory Items ---");
                        for (int i = 0; i < productCount; i++) {
                            inventory[i].displayProduct();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Product ID to search: ");
                    int searchId = scanner.nextInt();
                    boolean found = false;
                    for (int i = 0; i < productCount; i++) {
                        if (inventory[i].id == searchId) {
                            System.out.println("Product Records Found:");
                            inventory[i].displayProduct();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Product with ID " + searchId + " not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Product ID to update pricing: ");
                    int updateId = scanner.nextInt();
                    boolean updated = false;
                    for (int i = 0; i < productCount; i++) {
                        if (inventory[i].id == updateId) {
                            System.out.print("Enter new price for " + inventory[i].name + ": ");
                            inventory[i].price = scanner.nextDouble();
                            System.out.println("Price updated successfully.");
                            updated = true;
                            break;
                        }
                    }
                    if (!updated) {
                        System.out.println("Product ID mismatch. No updates made.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting Inventory System.");
                    break;

                default:
                    System.out.println("Invalid structural entry. Select valid choice options (1-5).");
            }
        } while (choice != 5);

        scanner.close();
    }
}
