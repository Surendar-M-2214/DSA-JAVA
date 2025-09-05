package binarysrch;

public class bitonicArr {
    public static void main(String[] args) {
int[] arr={1,2,2,3,3,4,3,2,1};
int target=3;
        int res=peakIndex(arr);
        System.out.println(res);
       int firsttry=binsearch(arr,target,0,res);
       if (firsttry!=-1){
           System.out.println(firsttry);
       }
       else{
           System.out.println( binsearch(arr,target,res, arr.length-1));
       }
    }

    public static int peakIndex(int[] arr) {
        int st = 0;
        int end = arr.length - 1;
        int ans = 0;
        while (st < end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                st = mid + 1;
            }
        }
        return st;
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
