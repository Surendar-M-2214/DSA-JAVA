package Recursion;

public class sortarr {
    public static void main(String[] args) {
        int[] arr={2,4,5,7,8,8};
        System.out.println(srtarr(arr,0));
    }
    public static boolean srtarr(int[] arr,int i){

        int n=arr.length;
        if (i==n-1){
            return true;
        }
       if (arr[i]<arr[i+1] || arr[i]==arr[i+1]){
           i++;

       }
       else {
           return false;
       }

     return   srtarr(arr,i);
    }
}
