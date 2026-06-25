import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Contact {
    private String name;
    private String phoneNumber;
    private String email;

    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() { return name; }

    @Override
    public String toString() {
        return "Name: " + name + " | Phone: " + phoneNumber + " | Email: " + email;
    }
}

public class ContactManager {
    private List<Contact> contacts = new ArrayList<>();

    public void addContact(String name, String phone, String email) {
        contacts.add(new Contact(name, phone, email));
        System.out.println("Contact added successfully.");
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts saved.");
            return;
        }
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public void searchContact(String name) {
        boolean found = false;
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.println(contact);
                found = true;
            }
        }
        if (!found) System.out.println("Contact not found.");
    }

    public static void main(String[] args) {
        ContactManager manager = new ContactManager();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Contact Manager Menu ---");
            System.out.println("1. Add Contact\n2. View Contacts\n3. Search Contact\n4. Exit");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: "); String name = scanner.nextLine();
                    System.out.print("Enter Phone: "); String phone = scanner.nextLine();
                    System.out.print("Enter Email: "); String email = scanner.nextLine();
                    manager.addContact(name, phone, email);
                    break;
                case 2: manager.displayContacts(); break;
                case 3:
                    System.out.print("Enter Name to search: ");
                    manager.searchContact(scanner.nextLine());
                    break;
                case 4: return;
                default: System.out.println("Invalid choice.");
            }
        }
    }
}
