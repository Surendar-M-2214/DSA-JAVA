package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSeq {
    public static void main(String[] args) {
//        System.out.println(seq("","abc"));
    int[] arr={1,2,1};
    List l=new ArrayList<>();
//    seqarr(0,arr,l,3);
        sumofseq(0,arr,l,3,0,2);

    }
    static ArrayList<String> seq(String p, String up){
        if (up.isEmpty()){
           ArrayList<String> list=new ArrayList<>();
           list.add(p);
            return list;
        }
        char ch=up.charAt(0);
     ArrayList<String> left =  seq(p+ch,up.substring(1));
        ArrayList<String> right =   seq(p,up.substring(1));
        left.addAll(right);
        return left;
    }
    static  void seqarr(int i, int[] arr, List emparr, int n){
        if (i==n){

                System.out.print(emparr);
                System.out.println("");

            return;
        }
      emparr.add(arr[i]);
        seqarr(i+1,arr,emparr,n);
        emparr.removeLast();
        seqarr(i+1,arr,emparr,n);


    }

    static void sumofseq(int i, int[] arr, List emparr, int n,int sum,int s){
        if (i==n ){
if ( s==sum ) {
    System.out.print(emparr);
    System.out.println("");
}
    return;

        }
        emparr.add(arr[i]);
        sum+=arr[i];
        sumofseq(i+1,arr,emparr,n,sum,s);

        sum-=arr[i];
        emparr.removeLast();
        sumofseq(i+1,arr,emparr,n,sum,s);
    }
}
