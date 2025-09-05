package src.binarysrch;

public class rotatedArr {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int target=0;
       int res= fndrotate(arr);
        System.out.println(res);
if (res != -1){
    if (target==arr[0]){
        System.out.println(0);
    } else if (target<arr[0]) {
      int tes=  binarysrch.binarySearch.binsearch(arr,target,res+1,arr.length-1);
        System.out.println(tes);
    }else if(target>arr[0]) {
        int tes= binarysrch.binarySearch.binsearch(arr,target,0,res);
        System.out.println(tes);
    }
}

    }

//    public static int findrotation(int[] arr){
//       int st=0;
//       int end= arr.length-1;
//       while(st<=end){
//           int mid=st+(end-st)/2;
//           if (mid<end &&  arr[mid]>arr[mid+1]){
//               return mid;
//           }
//           if(mid>st && arr[mid]< arr[mid-1]){
//               return mid-1;
//           }
//           if(arr[mid]<=arr[st]){
//               end=mid-1;
//           }
//           else {
//               st=mid+1;
//           }
//       }
//
//        return -1;
//    }


    static int fndrotate(int[] arr){
        int st=0;
        int end=arr.length-1;
        while (st<=end){
            int mid=st+(end-st)/2;
            if (arr[mid]>arr[mid+1] ){
                return mid;
            } else if (arr[mid]>st) {

                st=mid+1;

            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
