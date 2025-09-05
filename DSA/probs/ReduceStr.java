package probs;

import java.util.HashSet;

public class ReduceStr {
    public static void main(String[] args) {
        System.out.println(superReducedString("aabbccdd"));
    }
    public static String superReducedString(String s) {
        // Write your code here

       StringBuilder sb=new StringBuilder(s);
        for (int i = 1; i < sb.length() ; i++) {
            if (sb.charAt(i)==sb.charAt(i-1)){
                sb.delete(i-1,i+1);
                i=0;
            }

        }
        String st= sb.toString();
        if (st.isEmpty()){
            return "Empty String";
        }else {
            return st;

        }

    }
}
