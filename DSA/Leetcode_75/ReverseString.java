package Leetcode_75;

public class ReverseString {
    public static void main(String[] args) {
        String s="  hello world  ";
        System.out.println(reverseWords(s));
    }
    public static  String reverseWords(String s) {
          String[] sr=s.split("\\s+");
          String st="";
        for (int i = sr.length-1; i >=0 ; i--) {
            st+=sr[i]+" ";
        }
        return st.trim();
    }
}
