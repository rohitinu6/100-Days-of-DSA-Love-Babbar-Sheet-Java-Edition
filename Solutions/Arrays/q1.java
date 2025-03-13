// Array Reverse
public class q1 {
    public static void main(String[] args) {
        System.out.println("Reverse an Array");
        int[] arr = { 1, 2, 3, 4, 5 };
        int l = arr.length;
        int temp = arr[0];
        for (int i = 0; i < l / 2; i++) {
            temp = arr[i];
            arr[i] = arr[l - i - 1];
            arr[l - i - 1] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}