package src.Leetcode_75;

public class LongestPalin {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
    }
    public static int longestPalindrome(String s) {
      int[] hs=new int[128];
        for (char c:
             s.toCharArray()) {
            hs[c-'0']++;
        }
        boolean flag=false;
        int res=0;
        for (int r:
             hs) {
            if (r%2==0){
                res+=r/2;
            }else {
                flag=true;
                res+= (r-1)/2;
            }

        }
        return flag?(res*2)+1:res*2;
    }
}
