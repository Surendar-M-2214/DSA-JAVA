package sortings;

import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
        int[] arr={5,3,1,4,7,8,9};
        insertsrt(arr);
    }
    public static void insertsrt(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if (arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else {
                    break;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
