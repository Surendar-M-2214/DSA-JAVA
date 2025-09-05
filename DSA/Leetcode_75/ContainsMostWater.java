package src.Leetcode_75;

public class ContainsMostWater {
    public static void main(String[] args) {
        int[] arr={8,7,2,1};
        System.out.println(maxArea(arr));
    }
    public static int maxArea(int[] height) {
        int N = height.length;
        int left = 0, right = N - 1;
        int maxWater = Integer.MIN_VALUE;

        while( left < right ) {
             int min=Math.min(height[left], height[right]) * (right - left);
            maxWater = Math.max(maxWater, min);

            if( height[left] < height[right] ) left++;
            else right--;
        }

        return maxWater;
    }
}
