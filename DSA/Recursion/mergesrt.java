package Recursion;

import java.util.Arrays;

public class mergesrt {
    public static void main(String[] args) {
        int[] arr={3,2,1};
        mrgsrtInplace(arr,0, arr.length-1);
        System.out.println(
               Arrays.toString(arr)
        );
    }
    static int[] mrgsrt(int[] arr){
        int len= arr.length;
        if (len==1){
            return arr;
        }
        int mid=len/2;
        int[] left=mrgsrt(Arrays.copyOfRange(arr,0,mid));
        int[] right=mrgsrt(Arrays.copyOfRange(arr,mid,len));

        return srt(left,right);
    }

    private static int[] srt(int[] left, int[] right) {

        int[] mix = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mix[k] = left[i];
                i++;
            } else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            mix[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            mix[k] = right[j];
            j++;
            k++;
        }
        return mix;
    }


    static void mrgsrtInplace(int[] arr,int s,int e){

        if (s<e) {

            int m = (s + e) / 2;
            mrgsrtInplace(arr, 0, m);
            mrgsrtInplace(arr, m + 1, e);

            srtInplace(arr, s, m, e);
        }
    }

    private static void srtInplace(int[] arr, int l, int mid, int r) {
        // Sizes of the two subarrays to be merged
        int n1 = mid - l + 1;
        int n2 = r - mid;

        // Create temporary arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        // Merge the temporary arrays
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
