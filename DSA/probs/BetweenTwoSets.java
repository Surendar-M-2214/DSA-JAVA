package probs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BetweenTwoSets {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>(Arrays.asList(2,4));
        ArrayList<Integer> b=new ArrayList<>(Arrays.asList(16,32,96));
//        Collections.sort(a);
        System.out.println( getTotalX(a,b));
    }
    public static int getTotalX(List<Integer> a, List<Integer> b)
    {
        int res=0;
        int fst=a.getLast();
        int lst=b.getFirst();
        for (int i = fst; i <=lst; i++) {
                boolean ismultiple=true;
            for (int n:a){
                if (i%n!=0){
                     ismultiple=false;
                     break;
                }

            }
            if (ismultiple==true) {
                for (int k : b) {
                    if (k % i != 0) {
                        ismultiple = false;
                        break;
                    }
                }
            }
            if (ismultiple==true) {
                res++;
            }
        }
return res;
    }
}
