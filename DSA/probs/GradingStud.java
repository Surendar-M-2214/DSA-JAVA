package probs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStud {
    public static void main(String[] args) {
List li=new ArrayList<>(Arrays.asList(73,67,38,33));
        System.out.println(gradingStudents(li));



    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
List<Integer> l=new ArrayList<>();
for (int i:grades){
        int mul=(i/5+1)*5;
        if (i>=38 && (mul-i)<3 ){
            l.add(mul);
        }
        else {
            l.add(i);
        }

}
return l;
    }
}
