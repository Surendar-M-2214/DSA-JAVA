package sortings;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
int[] arr={3,1,5,4,2};
bublesrt(arr);
    }
    public static void bublesrt(int[] arr){
        for (int i = 0; i < arr.length; i++) {

            int didswap=0;
            for (int j = 1; j<arr.length-i; j++) {
                if (arr[j]<arr[j-1]){
                     int tem=arr[j];
                     arr[j]=arr[j-1];
                     arr[j-1]=tem;
                     didswap=1;


                }
            }
            if (didswap==0){
                break;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
