// Find Largest sum contiguous Subarray [V. IMP]
public class q8 {
    public static void main(String[] args) {
        int[] a = { 2, 3, -8, 7, -1, 2, 3 };
        int res = a[0];
        int maxSum = a[0];
        for (int i = 0; i < a.length; i++) {
            maxSum = Math.max(maxSum + a[i], a[i]);
            res = Math.max(maxSum, res);
        }
        System.out.println(res);
    }
}
