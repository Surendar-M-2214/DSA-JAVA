package sortings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {
int[] arr={3,0,1};
        System.out.println(cycsrt(arr));
    }

    public static int cycsrt(int[] arr) {
        int i=0;
        while(i < arr.length){
            int crt=arr[i];
            if (arr[i]< arr.length && arr[i] !=arr[crt]){
                int temp=arr[i];
                arr[i]=arr[crt];
                arr[crt]=temp;
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] !=  j){
                return j;
            }

        }

        return arr.length;
    }
}
