package src.Leetcode_75;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(plusOne(arr));
    }
    static public int[] plusOne(int[] digits) {
     int [] arr=new int[5];
        String s="";
        for (int c:digits
             ) {
            s+= (char) c;


        }
        System.out.println(s);


        return  arr;

    }
}
