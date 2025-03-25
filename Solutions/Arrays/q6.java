// MEDIAN OF TWO SORTED ARRAYS OF DIFFERENT SIZES
public class q6 {
    public static void main(String[] args) {
        int[] a1 = { 1,8 };
        int[] a2 = { 2, 4, 5, 6 };
        int l = a1.length + a2.length;
        int[] a3 = new int[l];
        for (int i = 0; i < a1.length; i++) {
            a3[i] = a1[i];
        }
        int k = a1.length;
        for (int i = 0; i < a2.length; i++) {
            a3[k] = a2[i];
            k++;
        }
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                if (a3[i] < a3[j]) {
                    int temp = a3[i];
                    a3[i] = a3[j];
                    a3[j] = temp;
                }
            }
        }
        for (int i = 0; i < l; i++) {
            System.out.println(a3[i]);
        }
        int median;
        if (l % 2 != 0) {
            median = l / 2;
            System.out.println("median: " + a3[median]);
        } else {
            double sum = (a3[l / 2] + a3[(l / 2) - 1]) / 2.0;
            System.out.println(a3[l / 2] +" " +  a3[(l / 2)-1]);
            System.out.println("Median : " + sum);
        }
        
    }
}
