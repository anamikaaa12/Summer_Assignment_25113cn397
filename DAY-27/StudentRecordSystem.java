import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private int rollNo;
    private String name;
    private String course;

    public Student(int rollNo, String name, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
    }

    public int getRollNo() { return rollNo; }
    public String getName() { return name; }
    public String getCourse() { return course; }

    @Override
    public String toString() {
        return "Roll No: " + rollNo + " | Name: " + name + " | Course: " + course;
    }
}

public class StudentRecordSystem {
    private static ArrayList<Student> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Student Record Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by Roll No");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll Number: ");
                    int roll = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();
                    list.add(new Student(roll, name, course));
                    System.out.println("Student record added successfully!");
                    break;
                case 2:
                    if (list.isEmpty()) {
                        System.out.println("No records found.");
                    } else {
                        System.out.println("\n--- Student List ---");
                        for (Student s : list) System.out.println(s);
                    }
                    break;
                case 3:
                    System.out.print("Enter Roll Number to search: ");
                    int searchRoll = sc.nextInt();
                    boolean found = false;
                    for (Student s : list) {
                        if (s.getRollNo() == searchRoll) {
                            System.out.println("Record Found: " + s);
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Student record not found.");
                    break;
                case 4:
                    System.out.println("Exiting System.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
