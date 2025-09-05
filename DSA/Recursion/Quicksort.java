package Recursion;

import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
     int[]   arr={5,4,3,2,8,9,56,1,74,90};
     int n= 9;
     quicksrt(arr,0, n);
        System.out.println(Arrays.toString(arr));
    }
static void quicksrt(int[] arr,int lo,int hi){
        if (lo>=hi){
            return;
        }
        int s=lo;
        int e= hi;
        int mid= s+(e-s)/2;
        int pivot=arr[mid];
        while(s<=e){
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            if (s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        quicksrt(arr,lo,e);
        quicksrt(arr,s,hi);


}
//static void qs(int[] arr,int lo,int hi){
//int i=lo;
//int j=hi;
//int pivot=arr[0];
//while(i<j){
//    while (i<=hi && arr[i]<=pivot ){
//        i++;
//    }
//    while (j>=lo && arr[j]>pivot  ){
//        j--;
//    }
//    if (i<j){
//        int temp=arr[i];
//        arr[i]=arr[j];
//        arr[j]=temp;
//        i++;
//        j--;
//    }
//
//}
//
//    int temp=arr[j];
//    arr[j]=arr[0];
//    arr[0]=temp;
//
//    qs(arr,0,j-1);
//    qs(arr,j+1,hi);
//}
}
