package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class arrayduplicates {
    public static void main(String[] args) {
        dupe();
    }
    static void dupe(){
      int[]  arr={2,4,5,6,7,8,4};
        HashSet set=new HashSet<>();
        ArrayList lst=new ArrayList<>();
         for (int nums:arr){
             if (!set.add(nums)){
                 lst.add(nums);
             }
         }
        System.out.println(lst);

    }
}
