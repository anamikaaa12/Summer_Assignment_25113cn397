import java.util.Scanner;

public class LibrarySystem {
    static String[] books = new String[10];
    static boolean[] borrowed = new boolean[10];
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1.Add 2.Borrow 3.List: ");
        int ch = sc.nextInt(); sc.nextLine();
        if (ch == 1) { books[count] = sc.nextLine(); count++; }
        else if (ch == 2) { int id = sc.nextInt(); borrowed[id] = true; }
        else { for(int i=0; i<count; i++) System.out.println(books[i]+(borrowed[i]?"[X]":"[O]")); }
    }
}
