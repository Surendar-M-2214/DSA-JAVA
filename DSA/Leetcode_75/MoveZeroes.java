package Leetcode_75;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr={4,2,4,0,0,3,0,5,1,0};
        moveZeroes1(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length-1 ;j >=0 ; j--) {
                if (nums[i]==0){
                    int temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                }

            }

        }
        System.out.println(Arrays.toString(nums));
    }
    public static void moveZeroes1(int[] nums) {
        int nonZeroIndex = 0;
        for(int i=0;i<nums.length;i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = 0;
                nums[nonZeroIndex] = temp;
                nonZeroIndex++;
            }
        }
    }
}
