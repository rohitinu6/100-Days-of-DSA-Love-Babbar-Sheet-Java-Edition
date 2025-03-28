// TO PRINT THE OCCURENCES OF DISTINCT CHARACTERS IN A GIVEN ARRAY
public class q1 {
    public static void main(String[] args){
        String s = "program";
        char[] ch = s.toCharArray();
        boolean[] b = new boolean[s.length()];
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (b[i]) {
                continue;
            }
            int c = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (ch[i] == ch[j]) {
                    c++;
                    b[j] = true;
                }
            }
            System.out.println(ch[i] + ": " + c);
            str.append(ch[i]).append(c);
        }
        System.out.println(str.toString());
    }
}
