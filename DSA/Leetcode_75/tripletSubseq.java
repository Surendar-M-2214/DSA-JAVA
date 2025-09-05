package Leetcode_75;

import java.util.Arrays;

public class tripletSubseq {
    public static void main(String[] args) {
        int [] arr={20,100,10,12,5,13};
       Solution s=new Solution();
        System.out.println( s.increasingTriplet(arr));
    }
}
class Solution {
    public boolean increasingTriplet(int[] nums) {
       int first=Integer.MAX_VALUE;
       int second=Integer.MAX_VALUE;
       for (int n :nums){
           if (n<=first){
               first=n;
           } else if (n<=second) {
               second=n;

           }
           else {
             return  true;
           }
       }return false;
    }
}