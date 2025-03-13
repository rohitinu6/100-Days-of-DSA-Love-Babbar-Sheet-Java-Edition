// Reverse String
import java.util.*;
public class q2 {
    public static void main(String[] args) {
        String a = "ROHIT";
        String r = "";
        char ch;
        int l = a.length();
        for (int i = 0; i < l; i++) {
            ch = a.charAt(i);
            r = ch + r;
        }
        for (int i = 0; i < l; i++) {
            System.out.println(r.charAt(i));
        }
    }
}