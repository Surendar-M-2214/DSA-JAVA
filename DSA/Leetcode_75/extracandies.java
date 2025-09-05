package Leetcode_75;

import java.util.ArrayList;
import java.util.List;

public class extracandies {


    public static void main(String[] args) {
      int[] arr={2,3,5,1,3};
        System.out.println(kidsWithCandies(arr,3));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList ls = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (max <= candies[i]) {
                max = candies[i];
            }
        }
        for (int k: candies){
ls.add(k+extraCandies>=max);
        }
        return ls;

    }

}