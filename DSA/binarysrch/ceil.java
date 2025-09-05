package binarysrch;

public class ceil {
    public static void main(String[] args) {
        int[] arr={2,3,4,56,78};
        int tr=5;

        System.out.println(ceilnum(arr,tr));
    }
    public static int ceilnum(int[] arr,int target){

        int st=0;
        int end= arr.length-1;
        while ( st<=end){
            int mid=st+(end-st)/2;
            if (arr[mid]==target){
                return mid;
            } else if (arr[mid]<target) {

                st=mid+1;

            }
            else if(arr[mid]>target ){
                end=mid-1;
            }else {
                return st;
            }
        }



        return st;
    }
}
