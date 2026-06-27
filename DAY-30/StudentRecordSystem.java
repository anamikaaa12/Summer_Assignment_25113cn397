import java.util.Scanner;

public class StudentRecordSystem {
    private static final int MAX = 100;
    private static int[] ids = new int[MAX];
    private static String[] names = new String[MAX], grades = new String[MAX];
    private static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.Add 2.View 3.Exit");
            int c = sc.nextInt(); sc.nextLine();
            if (c == 1) {
                System.out.print("ID, Name, Grade: ");
                ids[count] = sc.nextInt(); sc.nextLine();
                names[count] = sc.nextLine(); grades[count] = sc.nextLine();
                count++;
            } else if (c == 2) {
                for (int i = 0; i < count; i++) System.out.println(ids[i]+":"+names[i]);
            } else break;
        }
    }
}
