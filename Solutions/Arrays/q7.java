// cyclically rotate an array by one.
public class q7 {
    public static void main(String[] args) {
        int[] a = { 3, 9, 5, 8, 4, 9, 2 };
        int l = a.length;
        int e = 0;
        int[] res = new int[l];
        res[l - 1] = a[0];
        for (int i = 1; i < l; i++) {
            res[e] = a[i];
            e++;
        }
        for (int i = 0; i < l; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
