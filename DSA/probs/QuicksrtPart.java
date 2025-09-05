package probs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuicksrtPart {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr = Arrays.asList(new Integer[] {4,5,3,7,2});//4 2 3 7 5//
        int n = arr.size();
        System.out.println(quickSort(arr));
    }
    public static List<Integer> quickSort(List<Integer> arr) {
        // Write your code here
        int pivot=arr.get(0);
        int i=0;
        int j=arr.size()-1;
        while(i<j){
            while(arr.get(i)<=pivot ){
                i++;
            }
            while(arr.get(j)>pivot){
                j--;
            }
            if (i < j) {
                int temp = arr.get(i);

                arr.set(i, arr.get(j));

                arr.set(j, temp);
            }
        }

        int temp = arr.get(0);
     System.out.println(temp);
        arr.set(0, arr.get(j));
        System.out.println(arr);
        arr.set(j, temp);
        return arr;



    }

}
