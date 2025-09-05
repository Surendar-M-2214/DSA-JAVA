package src.Leetcode_75;

import java.util.Arrays;

public class MaxVowSub {
    public static int maxVowels(String s, int k) {
        int[] chars = new int[128];
        chars['a']=chars['e']=chars['i']=chars['o']=chars['u']=1;
        char[] arr = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += chars[arr[i]];
        }
        int max=sum;
        for (int i =k; i <arr.length ; i++) {
            sum=sum-chars[arr[i-k]]+chars[arr[i]];
            max=Math.max(max,sum);
        }
        System.gc();
        return max;
    }

    public static void main(String[] args) {

        System.out.println(maxVowels("aeiou",2));


    }
}
