package probs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiviSumPairs {
    public static void main(String[] args) {
        List l=new ArrayList<>(Arrays.asList(1, 3, 2, 6, 1, 2));
        System.out.println( divisibleSumPairs(6,3,l));
    }
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
int cnt=0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int sum= ar.get(i) + ar.get(j);
                if (sum%k==0){
                    cnt++;
                }
            }

        }

return cnt;
    }
}
