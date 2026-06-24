import java.util.ArrayList;
import java.util.Scanner;

class SalaryRecord {
    private int empId;
    private String name;
    private double baseSalary;

    public SalaryRecord(int empId, String name, double baseSalary) {
        this.empId = empId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculateGrossSalary() {
        double hra = baseSalary * 0.12; // 12% HRA
        double da = baseSalary * 0.08;  // 8% DA
        return baseSalary + hra + da;
    }

    public void displayPaySlip() {
        System.out.println("Emp ID: " + empId + " | Name: " + name + 
                           " | Base: $" + baseSalary + " | Net Gross Payroll: $" + calculateGrossSalary());
    }
}

public class SalaryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SalaryRecord> payrollList = new ArrayList<>();
        
        while (true) {
            System.out.println("\n--- Salary Management & Payroll System ---");
            System.out.println("1. Generate New Payroll Calculation Entry");
            System.out.println("2. View All Corporate Pay Slips");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter Employee ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Base Monthly Salary: ");
                double base = sc.nextDouble();
                
                payrollList.add(new SalaryRecord(id, name, base));
                System.out.println("Payroll record calculated!");
            } else if (choice == 2) {
                if(payrollList.isEmpty()) {
                    System.out.println("No payroll records evaluated yet.");
                } else {
                    System.out.println("\n--- Corporate Payroll Register ---");
                    for (SalaryRecord record : payrollList) {
                        record.displayPaySlip();
                    }
                }
            } else if (choice == 3) {
                System.out.println("Exiting Payroll System.");
                sc.close();
                break;
            } else {
                System.out.println("Invalid option selected.");
            }
        }
    }
}
