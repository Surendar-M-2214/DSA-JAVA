package Recursion;


import java.util.Arrays;

public class Recurse {
    public static void main(String[] args) {
       print_n(5);
//       sod(3,0);
//        int[] arr={5,4,3,2,1};
//    swaparr(0,arr);
        String s="madam";
//        System.out.println( swapstr(0,s));

    }
    public static void print_n(int n){
      if (n==0){
          return;
      }

      n--;
      print_n(n);
        System.out.println(n);
    }
    public  static void sod(int i,int n){
        if (i==0){
            System.out.println(n);
            return;
        }
        sod(i-1,n+i);
    }

    public static void swaparr(int i,int[] arr){
      int  n= arr.length;
        if (i>=n/2){
            System.out.println(Arrays.toString(arr));
            return;
        }
       int temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
        swaparr(i+1,arr);

    }
    public static boolean swapstr(int i,String s){
        int n=s.length();
        if (i>=n/2){
            return true;
        }
        if (s.charAt(i)!=s.charAt(n-i-1))
            return false;

return swapstr(i+1,s);
    }



}
