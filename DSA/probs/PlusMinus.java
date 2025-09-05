package probs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {
List<Integer> ls=new ArrayList<>(Arrays.asList(-4,3,-9,0,4,1));


plusMinus(ls);

    }
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
double positive=0;
double negative=0;
double zero=0;
int size= arr.size();

for (int n:arr){
    if (n>0){
        positive++;
    } else if (n<0) {
        negative++;
    }
    else {
        zero++;
    }
}
        System.out.println(String.format("%.6f",positive/size));
        System.out.println(String.format("%.6f",negative/size));
        System.out.println(String.format("%.6f",zero/size));
    }
}
