package sortings;

import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
int[] arr={5,4,3,2,1,1,0};
        selectsrt(arr);
    }
    public static void selectsrt(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int  min =i;
            for (int j =i+1; j < arr.length ; j++) {
                if (arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
