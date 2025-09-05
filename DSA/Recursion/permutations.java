package Recursion;

import java.util.ArrayList;

public class permutations {
    public static void main(String[] args) {
  ArrayList<String> ans= permu("","abc");
        System.out.println(ans);
    }
    static ArrayList<String> permu(String p, String up){
        if (up.isEmpty()){
           ArrayList<String> lis=new ArrayList<>();
           lis.add(p);
           return lis;
        }
        char ch=up.charAt(0);
        ArrayList<String> ans=new ArrayList<>();
        int n=p.length();
        for (int i = 0; i <=n; i++) {
               String f=p.substring(0,i);
               String s=p.substring(i,p.length());
         ans.addAll(permu(f+ch+s,up.substring(1)));


        }
        return ans;

    }
}
