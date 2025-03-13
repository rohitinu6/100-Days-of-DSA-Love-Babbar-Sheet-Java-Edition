// Find minimum and maximum in an Array
public class q3 {
    public static void main(String[] args) {
        int arr[] = {1,3,6,4,8,6,0,1,95,89,46};
        int min = arr[0];
        int max = arr[0];
        int l = arr.length;
        for(int i = 1;i<l;i++){
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("the minimum is " + min);
        System.out.println("the maximum is " + max);
    }
}
