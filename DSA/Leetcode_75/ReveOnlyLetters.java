package src.Leetcode_75;

import java.util.Arrays;

public class ReveOnlyLetters {
    public static void main(String[] args) {
        String s="a-bC-dEf-ghIj";
        System.out.println(reverseOnlyLetters(s));

    }
    public static String reverseOnlyLetters(String s) {

        char[] ch=s.toCharArray();
        int i=0,j=ch.length-1;
        while (i<=j){

            if(!Character.isLetter(ch[i])){
                i++;
            } else if (!Character.isLetter(ch[j])) {
                j--;
            }
            else {
                char tem=ch[i];
                ch[i]=ch[j];
                ch[j]=tem;
               i++;
               j--;
            }


        }

        return String.valueOf(ch);
    }
}
