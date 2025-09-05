package src.Leetcode_75;

import java.util.HashMap;
import java.util.Map;

public class ContiguousMaxElement {
    public static void main(String[] args) {
        int[] arr={0,1,1,1,1,1,0,0,0};
        System.out.println(findMaxLength(arr));
    }
    public static int findMaxLength(int[] nums) {

        int len = nums.length;
        // creating our own hashmap
        int[] presum = new int[len * 2 + 1];//取值范围是[-len, len]所以是len*2+1
        for (int i = 0; i < presum.length; i++) {
            presum[i] = -2;//用来表示还没有出现过
        }

        int sum = len;// index ! < 0, so start from len
        presum[sum] = -1;//表示在index为-1也就是没有元素的时候，0和1数量相等
        int max = 0;
        for (int i = 0; i < len; i++) {
            sum += (nums[i] * 2 - 1);//0 -> -1 || 1 -> 1
            if (presum[sum] == -2) {
                presum[sum] = i;//只存最早出现的index
            } else {
                max = Math.max(max, i - presum[sum]);
            }
        }
        return max;
        }
}
/*
-1,0
1,2
2,3
3,4
4,5
 */