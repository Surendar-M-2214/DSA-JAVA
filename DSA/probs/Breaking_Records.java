package probs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Breaking_Records {
    public static void main(String[] args) {
//        3 4 21 36 10 28 35 5 24 42
        List<Integer> ls= new ArrayList<>(Arrays.asList(10,5,20,20,4,5,2,25,1));
        System.out.println(breakingRecords(ls));
    }
    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int highcnt=0;
        int lowcnt=0;
        List<Integer> total=new ArrayList<>();
        int max= scores.get(0);
        int min=scores.get(0);
        for (int i = 1; i < scores.size(); i++) {
            if (max< scores.get(i)){
                highcnt++;
                 max=scores.get(i);
            }
            if (min>scores.get(i)) {
                lowcnt++;
                min=scores.get(i);
            }
        }

        total.add(highcnt);
        total.add(lowcnt);
        return total;
    }
}
