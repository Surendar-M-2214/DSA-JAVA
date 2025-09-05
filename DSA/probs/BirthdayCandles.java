package probs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BirthdayCandles {
    public static void main(String[] args) {
        ArrayList ls=new ArrayList<>(Arrays.asList(1,0,0,0,1));
        System.out.println(  birthdayCakeCandles(ls));
    }
    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int num=Integer.MIN_VALUE;
        int count=0;
        for (int n:candles){
            if (n>num){
                num=n;
                count=1;
            } else if (num==n) {
                count++;
            }
        }

return count;
    }
}
