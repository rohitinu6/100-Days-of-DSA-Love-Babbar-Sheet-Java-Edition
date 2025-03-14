// SORT ARRAY CONSISTING OF 0,1,2
public class q4 {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 0, 1, 2, 2, 1, 0, 1, 2, 0, 2, 0, 1, 2, 0, 1, 2 };
        int c0 = 0, c1 = 0, c2 = 0, l = arr.length;
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 0:
                    c0++;
                    break;
                case 1:
                    c1++;
                    break;
                case 2:
                    c2++;
                    break;
            }
        }
        // System.out.println(c0 + " " + c1 + " " + c2);
        for (int i = 0; i < c0; i++) {
            arr[i] = 0;
        }
        for (int i = l - c1 - c2; i < c1 + c2; i++) {
            arr[i] = 1;
        }
        for (int i = l - c2; i < l; i++) {
            arr[i] = 2;
        }
        for (int i = 0; i < l; i++) {
            System.out.println(arr[i]);
        }
    }
}
