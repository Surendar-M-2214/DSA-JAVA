package probs;

import java.util.ArrayList;
import java.util.List;

public class triplets {
    public static void main(String[] args) {
        List<Integer> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        a.add(17);
        a.add(28);
        a.add(30);
        b.add(99);
        b.add(16);
        b.add(8);
        System.out.println(a);
        System.out.println(b);
        System.out.println(compareTriplets(a,b));
    }
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> ls=new ArrayList<>();
        int alice=0;
        int bob=0;
        for(int i=0;i<3;i++)
        {
            if(a.get(i)>b.get(i)){
                alice++;
            }
            if(b.get(i)>a.get(i)){
                bob++;
            }
        }
        ls.add(alice);
        ls.add(bob);
        return ls;

    }
}
