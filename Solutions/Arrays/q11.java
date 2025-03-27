// ARRAYLIST AND OPERATIONS
import java.util.ArrayList;
import java.util.Collections;
public class q11{
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                num.add(a[i]);
            }
        }
        num.set(1, 15);
        num.remove(num.size() - 1);
        num.remove(Integer.valueOf(1));
        Collections.sort(num);
        for (int i = 0; i < num.size(); i++) {
            System.out.println(num.get(i));
        }
        boolean b = num.contains(9);
        System.out.println(b);
    }
}