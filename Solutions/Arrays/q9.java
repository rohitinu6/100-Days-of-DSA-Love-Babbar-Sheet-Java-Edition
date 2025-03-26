// TO CHECK IF A GIVEN INTEGER/STRING IS A PALINDROME OR NOT
public class q9 {
    static boolean checkPalindrome(String a) {
        String str = a;
        boolean result = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt(str.length() - i - 1)) {
                result = true;
                continue;
            } else {
                result = true;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        // int a1 = 12121;
        // String a1s = Integer.toString(a1);
        String a1s = "APPA";
        boolean a2 = checkPalindrome(a1s);
        if (a2 == true) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
