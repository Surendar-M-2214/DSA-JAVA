package src.Leetcode_75;

public class StringCompress {
    public static void main(String[] args) {
       char[] chars = {'a','b','b','b','b','b'};
        System.out.println(compress(chars));
    }
    static public int compress(char[] chars) {

        int ind=0,cnt=0;
        for (int i = 0; i < chars.length; i++) {
             cnt++;
             if (i+1== chars.length || chars[i]!=chars[i+1]){
                 ind++;
                 if (cnt>1) {
                     for (char c : Integer.toString(cnt).toCharArray()
                     ) {
                         ind++;

                     }
                 }
                 cnt=0;

             }
        }
        return ind;
    }
}
