package src.Leetcode_75;

public class MaxSubAvg {
    public static double findMaxAverage(int[] nums, int k) {
double sum=0;
        for (int i = 0; i < k; i++) {
            sum+= nums[i];
        }
   double maxAvg=sum;
        for (int i = k; i < nums.length ; i++) {
            sum=sum-nums[i-k]+nums[i];
            maxAvg=Math.max(maxAvg,sum);

        }
return maxAvg/k;
    }

    public static void main(String[] args) {
        int[] nums={1,12,-5,-6,50,3};
        double val=findMaxAverage(nums,4);
        System.out.println(val);

    }
}
