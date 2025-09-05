import java.util.*;

public class HashTest {
    public static void main(String[] args) {
        HashMap<String,Integer> suray=new HashMap<>();
        suray.put("Suray",20);
        suray.put("Vinu",60);
        int k=suray.getOrDefault("Vinu",78);
        System.out.println(k );

//
//

        Scanner in=new Scanner(System.in);
        HashSet<String> set=new HashSet<>();
//        for (int i = 0; i < 5; i++) {
//            String str=in.next();
//            set.add(str);
//        }
//        System.out.println(Collections.frequency(set,"Suray"));
//        LinkedHashSet<String> lset=new LinkedHashSet<>();
//        lset.add("suray");
//        lset.add("Suray");
//        lset.add("suray");
//        System.out.println("Linked Set: "+lset);

    }


}
