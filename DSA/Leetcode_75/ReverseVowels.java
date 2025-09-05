package Leetcode_75;

import java.util.Arrays;

public class ReverseVowels {
    public static void main(String[] args) {
String s="lietcode";
        System.out.println(reverseVowels(s));
    }
    public static String reverseVowels(String s) {
        s.toLowerCase();
        char[] ch=s.toCharArray();
        for (int i = 1; i < s.length(); i++) {
            if ((ch[i]=='a' ||ch[i]=='e' ||ch[i]=='i' ||ch[i]=='o' ||ch[i]=='u')&&(ch[i-1]=='a' ||ch[i-1]=='e' ||ch[i-1]=='i' ||ch[i-1]=='o' ||ch[i-1]=='u')){
                char temp=ch[i-1];
                ch[i-1]=ch[i];
                ch[i]=temp;
            }
        }
        return  String.valueOf(ch);
    }
}
