package Recursion;

import java.util.ArrayList;

public class Phonepad {
    public static void main(String[] args) {
        System.out.println(  pad("","12"));
    }

    public static ArrayList pad(String p, String up) {
        if (up.isEmpty()){
            ArrayList rs=new ArrayList<>();
          rs.add(p);
            return rs;
        }
        int dig= up.charAt(0) -'0';
        ArrayList ls=new ArrayList<>();
        for (int i = (dig-1)*3; i < dig*3 ; i++) {
            char ch= (char) ('a'+i);
            ls.addAll(pad(p+ch, up.substring(1)));
        }
        return ls;
    }
}
