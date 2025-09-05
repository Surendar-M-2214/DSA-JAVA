package src.Leetcode_75;

public class ispalin {
    public static void main(String[] args) {


        System.out.println(isPalindrome(855555555));
    }

    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        long rev =0;
        long temp=x;
        while(temp!=0){
            int rem = (int) (temp%10);
            rev = rev*10+rem;
            temp=temp/10;
        }
        return (rev==x);
    }
}
