package src.Leetcode_75;

public class GCDofStrings {

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABACBAB","AB"));
    }
    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int lenGCD = gcd(str1.length(), str2.length());
        return str1.substring(0, lenGCD);
    }
    public static int gcd(int l,int m){
        while (m!=0){
            int temp=l%m;
            l=m;
            m=temp;
        }
        return l;
    }
}
