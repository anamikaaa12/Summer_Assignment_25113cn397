import java.util.Scanner;

public class MarksheetGenerationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Academic Marksheet Generation Module ---");
        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();
        System.out.print("Enter Registration / Roll Number: ");
        String rollNum = sc.nextLine();

        // Target subject inputs
        System.out.print("Enter marks for Mathematics (Out of 100): ");
        double math = sc.nextDouble();
        System.out.print("Enter marks for Science (Out of 100): ");
        double science = sc.nextDouble();
        System.out.print("Enter marks for English (Out of 100): ");
        double english = sc.nextDouble();

        // Computations
        double totalObtained = math + science + english;
        double percentage = (totalObtained / 300) * 100;
        
        String grade;
        if (percentage >= 90) grade = "A+ (Excellent)";
        else if (percentage >= 75) grade = "A (Very Good)";
        else if (percentage >= 60) grade = "B (Good)";
        else if (percentage >= 40) grade = "C (Pass)";
        else grade = "F (Fail)";

        // Rendering Output Sheet Block
        System.out.println("\n==============================================");
        System.out.println("               OFFICIAL MARKSHEET             ");
        System.out.println("==============================================");
        System.out.println("Student Name : " + studentName);
        System.out.println("Roll Number  : " + rollNum);
        System.out.println("----------------------------------------------");
        System.out.println("Mathematics  : " + math + " / 100");
        System.out.println("Science      : " + science + " / 100");
        System.out.println("English      : " + english + " / 100");
        System.out.println("----------------------------------------------");
        System.out.println("Total Marks  : " + totalObtained + " / 300");
        System.out.printf("Percentage   : %.2f%%\n", percentage);
        System.out.println("Final Grade  : " + grade);
        System.out.println("==============================================");

        sc.close();
    }
}
