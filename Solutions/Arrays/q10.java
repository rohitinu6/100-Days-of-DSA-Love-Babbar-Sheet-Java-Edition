// TO CHECK IF A GIVEN ARRAY OF INTEGER IS ALL PALINDROME OR NOT
public class q10 {
    static boolean isPalindrome(int a) {
        String str = Integer.toString(a);
        int l = str.length();
        boolean res = true;
        for (int i = 0; i < l / 2; i++) {
            if (str.charAt(i) != str.charAt(l - i - 1)) {
                res = false;
            } else {
                res = true;
            }
        }
        return res;

    }
    public static void main(String[] args) {
        int[] a = { 111, 121, 21 };
        for (int i = 0; i < a.length; i++) {
            boolean r1 = isPalindrome(a[i]);
            if (r1 == false) {
                System.out.println("not a palindrome");
            }
        }
    }
}
