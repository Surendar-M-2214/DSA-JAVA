package Recursion;

import java.util.ArrayList;

public class findLessEqualfact {

    public static void main(String[] args) {
        System.out.println( factorialNumbers(6));
    }


        static ArrayList<Long> factorialNumbers(long n) {
            // code here

            int i=1;
            ArrayList ls=new ArrayList<>();
            while(i>0 && i<=n){
                long fac=fact(i);
                if(fac<=n){
                    ls.add(fac);

                }
                else {
                    break;
                }
                i++;

            }
            return ls;
        }
        static long fact(long n){

            if(n==0){
                return 1;
            }
            return n* fact(n-1);
        }

}
