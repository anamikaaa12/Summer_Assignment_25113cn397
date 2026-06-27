
public class MiniProject{
    static String[] items = new String[10];
    static int[] qty = new int[10];
    static int count = 0;

    public static void main(String[] args) {
        addItem("Apple", 10);
        listItems();
    }
    static void addItem(String n, int q) {
        items[count] = n; qty[count] = q; count++;
    }
    static void listItems() {
        for(int i=0; i<count; i++) System.out.println(items[i]+":"+qty[i]);
    }
}
