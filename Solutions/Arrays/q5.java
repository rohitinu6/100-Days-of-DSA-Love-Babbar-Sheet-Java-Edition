// MOVING ALL THE NEGATIVE INTEGER TO THE LEFT AND THE POSITIVE TO THE RIGHT
// IN SIMPLE TERMS THIS IS QUICK SORT
public class q5 {
    public static void main(String[] args) {
        int[] arr = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
        int l = arr.length,temp;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < l; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
