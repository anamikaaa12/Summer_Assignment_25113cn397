import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private String department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }

    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Department: " + department;
    }
}

public class EmployeeManagementSystem {
    private static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Employee Management System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();
                    employees.add(new Employee(id, name, dept));
                    System.out.println("Employee added successfully!");
                    break;
                case 2:
                    if (employees.isEmpty()) {
                        System.out.println("No corporate records available.");
                    } else {
                        System.out.println("\n--- Employee Directory ---");
                        for (Employee emp : employees) System.out.println(emp);
                    }
                    break;
                case 3:
                    System.out.println("Exiting Corporate Directory Subsystem.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid selection.");
            }
        }
    }
}
