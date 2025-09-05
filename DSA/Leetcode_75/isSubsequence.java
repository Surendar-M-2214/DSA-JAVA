package src.Leetcode_75;

public class isSubsequence {
    public static void main(String[] args) {
        System.out.println(isSubseq("abc","acbgd"));
    }
    public static boolean isSubseq(String s, String t) {
        if (s.equals(""))
            return true;

        if (s.length() > t.length())
            return false;

        int sl = s.length();
        int tl = t.length();
        boolean flag = false;

        char c[] = s.toCharArray();
        for (int i = 0; i<sl; i++) {
            String a = Character.toString(c[i]);

            if (t.contains(a)) {
                String z[] = t.split(a,2);
                t=z[1];
                flag = true;
            } else
                return false;
        }
        return flag;
    }
}
