// Array Sorting to fetch the Kth element

public class q3 {
    public static void main(String[] args) {
        int[] arr = { 9, 2, 47, 3, 54, 69, 65, 4, 6, 2, 9 };
        int l = arr.length, temp;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < l; i++) {
            System.out.print(arr[i] + " ");
        }
        int k = 5;
        System.out.println("element at " + k + "th position is : " + arr[k - 1]);
    }
}
