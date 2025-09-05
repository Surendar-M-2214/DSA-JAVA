package probs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GamingArr {
    public static void main(String[] args) {
//        2
//        5
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList( ));
//        5
//        7 4 6 5 9


        System.out.println( gamingArray(arr));
    }
    public static String gamingArray(List<Integer> arr) {
        // Write your code here
        int count=0;
        int max=0;
        for (int i = 0; i < arr.size(); i++) {
           if (arr.get(i)>max){
               max=arr.get(i);

               count++;
               System.out.println(count);
           }
        }
        if (count%2==0){
            return "ANDY";
        }
        return "BOB";

    }
}
