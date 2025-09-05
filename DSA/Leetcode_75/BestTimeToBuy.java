package src.Leetcode_75;

public class BestTimeToBuy {
    public static void main(String[] args) {
        int[] arr={7,1,5,3,8,4};
        System.out.println(maxProfit(arr));
    }
    public static  int maxProfit(int[] prices) {
     int min=prices[0];
     int max=0;
        for (int i = 0; i < prices.length; i++) {

            if (prices[i]<=min ) {
                min = prices[i];
            }

int prof=prices[i]-min;
            if (prof>=max){
                max=prof;
            }

        }

        return max;
    }
}
