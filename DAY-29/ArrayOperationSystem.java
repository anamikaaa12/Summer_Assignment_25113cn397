import java.util.Scanner;

public class ArrayOperationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the maximum capacity of your array: ");
        int capacity = scanner.nextInt();
        int[] array = new int[capacity];
        int size = 0; 
        int choice;

        do {
            System.out.println("\n=== ARRAY OPERATIONS MENU ===");
            System.out.println("1. Insert Element");
            System.out.println("2. Display Array");
            System.out.println("3. Search Element");
            System.out.println("4. Find Maximum Element");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (size >= capacity) {
                        System.out.println("Array Full! Cannot insert more elements.");
                    } else {
                        System.out.print("Enter the integer element to insert: ");
                        array[size] = scanner.nextInt();
                        size++;
                        System.out.println("Element inserted successfully.");
                    }
                    break;

                case 2:
                    if (size == 0) {
                        System.out.println("Array is empty.");
                    } else {
                        System.out.print("Array Elements: ");
                        for (int i = 0; i < size; i++) {
                            System.out.print(array[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    if (size == 0) {
                        System.out.println("Array is empty. Nothing to search.");
                        break;
                    }
                    System.out.print("Enter element to search for: ");
                    int key = scanner.nextInt();
                    int foundIndex = -1;
                    for (int i = 0; i < size; i++) {
                        if (array[i] == key) {
                            foundIndex = i;
                            break;
                        }
                    }
                    if (foundIndex != -1) {
                        System.out.println("Element found at position index: " + foundIndex);
                    } else {
                        System.out.println("Element not found in the array.");
                    }
                    break;

                case 4:
                    if (size == 0) {
                        System.out.println("Array is empty.");
                    } else {
                        int max = array[0];
                        for (int i = 1; i < size; i++) {
                            if (array[i] > max) {
                                max = array[i];
                            }
                        }
                        System.out.println("Maximum Element: " + max);
                    }
                    break;

                case 5:
                    System.out.println("Exiting Array Operation System.");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);
        
        scanner.close();
    }
}
