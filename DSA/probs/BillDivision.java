package probs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BillDivision {
    public static void main(String[] args) {
        List<Integer> bill=new ArrayList<>(Arrays.asList(3,10,2,9));
bonAppetit(bill,1,7);
        System.out.println();
    }
    public static void bonAppetit(List<Integer> bill, int k, int b) {

     bill.remove(k);
     int sum=0;
     for (int n:bill){
         sum=sum+n;
     }
int bal=sum/2;
      if (bal == b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - bal);
        }


    }
}
