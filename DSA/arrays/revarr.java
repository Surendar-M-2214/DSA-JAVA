package arrays;

import java.util.Arrays;

public class revarr {
    public static void main(String[] args) {
        int[] nums={3,2,1,56,78};
        Arrays.sort(nums);
reversearr(nums);
    }
    static void reversearr(int[] arr){
 int s=0;
 int e=arr.length-1;
 while (s<e){
     int temp=arr[s];
     arr[s]=arr[e];
     arr[e]=temp;
     s++;
     e--;
 }

        System.out.println(Arrays.toString(arr));

    }
}
