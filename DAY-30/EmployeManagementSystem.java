import java.util.Scanner;

public class EmployeManagementSystem {
    static int[] ids = new int[50];
    static String[] names = new String[50];
    static double[] sal = new double[50];
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Add emp(id,name,sal): ");
        ids[count] = sc.nextInt(); sc.nextLine();
        names[count] = sc.nextLine();
        sal[count] = sc.nextDouble();
        count++;
    }
}
