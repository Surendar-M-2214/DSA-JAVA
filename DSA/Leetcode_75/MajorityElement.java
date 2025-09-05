package src.Leetcode_75;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr={2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }
    static public int majorityElement(int[] nums) {
        int cnt=0;
        int major=0 ;
        for(int num:nums){
            if(cnt==0){
                major=num;
            }
            cnt= num==major?cnt+1:cnt-1;
        }
        return major;
    }
}
