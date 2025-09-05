package arrays;


import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
int[][][] arr=new int[2][2][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[j].length; k++) {
                    arr[i][j][k]= in.nextInt();
                }
            }
        }
        for (int[][] nums:arr)   {
           for (int[] num:nums){
               System.out.println(Arrays.toString(num));
           }
        }


    }

}
