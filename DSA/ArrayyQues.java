package src;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ArrayyQues {
    public static void main(String[] args) {
        int[] arr = { 1,2, 3, 4, 5 };
//        int n=6;
//        missingNum(arr,n);
//        System.out.println( repeatingNum(arr));
//        int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
//        int arr_size = arr.length;
//        sort012(arr, arr_size);
//        int[] arr1={1,2,3,5,6,8};
//        int[] arr2={1,2,3,7,6,5};
//        System.out.println(duplicateArray(arr1,arr2));
//        if (duplicateArray(arr1,arr2)){
//            System.out.println("NO DUPLICATES");
//        }
//        else {
//            System.out.println("DUPLICATES FOUND");
//        }

//        rotateArray(arr,2);
//        System.out.println(Arrays.toString(arr));


















    }
    public static void missingNum(int[] arr,int n){

        int sum=0;
        int N= arr.length;

        for (int i = 0; i < N; i++) {
            sum=sum+arr[i];
        }
        int ans=(n*(n+1)/2)-sum;
        System.out.println(ans);
    }
    public static int repeatingNum(int[] nums){
        for(int i=0;i<nums.length;i++) {
            int ind = Math.abs(nums[i]);
            if(nums[ind] < 0) {
                return ind;
            }
            nums[ind] = -nums[ind];
        }
        return -1;
    }
    static void sort012(int a[], int arr_size)
    {
        int lo = 0;
        int hi = arr_size - 1;
        int mid = 0, temp = 0;
        // Iterate till all the elements
        // are sorted
        while (mid <= hi) {
            switch (a[mid]) {
                // If the element is 0
                case 0: {
                    temp = a[lo];
                    a[lo] = a[mid];
                    a[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                // If the element is 1
                case 1:
                    mid++;
                    break;
                // If the element is 2
                case 2: {
                    temp = a[mid];
                    a[mid] = a[hi];
                    a[hi] = temp;
                    hi--;
                    break;
                }
            }
        }
        int i;
        for (i = 0; i < arr_size; i++)
            System.out.print(a[i] + " ");
        System.out.println("");
    }
static boolean duplicateArray(int[] arr1,int[] arr2) {
    int a1 = arr1.length;
    int a2 = arr2.length;
    if (a1 != a2)
        return false;
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    for (int i = 0; i < a1; i++) {
        if (arr1[i] != arr2[i]) {
            return false;
        }

    }
    return true;
}

static void rotateArray(int[] arr,int k){
        if (k==0)
            return;
        int n=arr.length-1;
        int temp=arr[n];
    for (int i=n; i >0 ; i--) {
        arr[i]=arr[i-1];
    }
    arr[0]=temp;
 rotateArray(arr,k-1);

}


static boolean subsetArray(int[] arr1,int[] arr2)
{
    int n=arr1.length;
    int m=arr2.length;
    HashMap<Integer, Integer> frequency
            = new HashMap<Integer, Integer>();

    // Increase the frequency of each element
    // in the frequency table.
    for (int i = 0; i < m; i++) {
        frequency.put(arr1[i],
                frequency.getOrDefault(arr1[i], 0)
                        + 1);
    }

    // Decrease the frequency if the
    // element was found in the frequency
    // table with the frequency more than 0.
    // else return 0 and if loop is
    // completed return 1.
    for (int i = 0; i < n; i++) {
        if (frequency.getOrDefault(arr2[i], 0) > 0)
            frequency.put(arr2[i],
                    frequency.get(arr1[i]) - 1);
        else {
            return false;
        }
    }
    return true;
}
}


