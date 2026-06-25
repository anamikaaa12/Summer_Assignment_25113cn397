import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {
    private String id;
    private String title;
    private String author;
    private boolean isIssued;

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public boolean isIssued() { return isIssued; }
    public void setIssued(boolean issued) { isIssued = issued; }

    @Override
    public String toString() {
        return "ID: " + id + " | Title: " + title + " | Author: " + author + " | Status: " + (isIssued ? "Issued" : "Available");
    }
}

public class LibrarySystem {
    private List<Book> books = new ArrayList<>();

    public void addBook(String id, String title, String author) {
        books.add(new Book(id, title, author));
        System.out.println("Book added successfully.");
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void issueBook(String id) {
        for (Book book : books) {
            if (book.getId().equals(id) && !book.isIssued()) {
                book.setIssued(true);
                System.out.println("Book issued successfully.");
                return;
            }
        }
        System.out.println("Book not available or already issued.");
    }

    public void returnBook(String id) {
        for (Book book : books) {
            if (book.getId().equals(id) && book.isIssued()) {
                book.setIssued(false);
                System.out.println("Book returned successfully.");
                return;
            }
        }
        System.out.println("Invalid ID or book was not issued.");
    }

    public static void main(String[] args) {
        LibrarySystem library = new LibrarySystem();
        Scanner scanner = new Scanner(System.網絡 or System.in);
        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book\n2. View Books\n3. Issue Book\n4. Return Book\n5. Exit");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: "); String id = scanner.nextLine();
                    System.out.print("Enter Title: "); String title = scanner.nextLine();
                    System.out.print("Enter Author: "); String author = scanner.nextLine();
                    library.addBook(id, title, author);
                    break;
                case 2: library.viewBooks(); break;
                case 3:
                    System.out.print("Enter Book ID to issue: ");
                    library.issueBook(scanner.nextLine());
                    break;
                case 4:
                    System.out.print("Enter Book ID to return: ");
                    library.returnBook(scanner.nextLine());
                    break;
                case 5: return;
                default: System.out.println("Invalid choice.");
            }
        }
    }
}
