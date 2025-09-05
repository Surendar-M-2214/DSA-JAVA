package src.Leetcode_75;

import java.util.HashMap;
import java.util.Map;

public class SubarraySum {

    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println( subarraySum(arr,2));
    }
    public static int subarraySum(int[] nums, int k) {
int prefixSum=0;
int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for (int i=0;i< nums.length;i++){
            prefixSum+=nums[i];
            int diff=prefixSum-k;
            if (map.containsKey(diff)){
                count+=map.get(diff);

            }
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);



        }
        return count;

    }
}
