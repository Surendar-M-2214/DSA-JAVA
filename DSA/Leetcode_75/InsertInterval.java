package src.Leetcode_75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {
    public static void main(String[] args) {
int[][] arr={{1,3},{6,9}};
int[] newar={2,5};
int[][] ns=insert(arr,newar);
        for (int[] tyr:ns
             ) {
            System.out.println(Arrays.toString(tyr));

        }
    }
    public static int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> lst =new ArrayList<>();
        for (int[] intr:intervals) {
            
            if (newInterval[1]<intr[0]){
                lst.add(newInterval);
                newInterval=intr;
            } else if (intr[1]<newInterval[0]) {
                lst.add(intr);
                
            }else {
                newInterval[0]=Math.min(newInterval[0], intr[0]);
                newInterval[1]=Math.max(newInterval[1],newInterval[1] );
            }

        }
        lst.add(newInterval);

return lst.toArray(new int[lst.size()][]);

    }
}
