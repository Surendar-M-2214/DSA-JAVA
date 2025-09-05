package binarysrch;

public class binarySearch {
    public static void main(String[] args) {
int[] arr={99,99,99,77,66,55,2,1};
        System.out.println(binsearch(arr,99,0, arr.length-1));
    }
    public static int binsearch(int[] arr,int target,int start,int end){




        boolean isAsc=arr[start]<arr[end];
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] == target) {
                    return mid;
                }
               if (isAsc) {
                   if (arr[mid] < target) {

                       start = mid + 1;
                   } else {
                       end =mid-1;

                   }

               }
               else{
                   if (arr[mid] < target) {
                       end =mid-1;

                   } else {
                       start = mid +1;

                   }
               }
            }




        return -1;
    }
}
