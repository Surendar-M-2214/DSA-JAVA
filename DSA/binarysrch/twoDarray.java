package binarysrch;

import java.util.Arrays;

public class twoDarray {
    public static void main(String[] args) {

        int[][] arr={
                {10}

        };
        int[] r= arraysrch(arr,10);
        System.out.println(Arrays.toString(r));

    }
    public static int[] arraysrch(int[][] arr, int target){
              int r=0;
             int row=arr.length;
             int col=arr[0].length;
             int j=col-1;

              while(r<row && r<=0 && j<col &&j>=0){
                  if (arr[r][j]==target){
                      return new int[]{r,j};
                  }
                  if (arr[r][j]>target){
                      j--;

                  }
                  else {
                      r++;
                  }
              }
              return new int[]{-1,-1};
    }
}
