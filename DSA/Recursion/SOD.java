package Recursion;

public class SOD {
    public static void main(String[] args) {
        System.out.println(sumofdig(78945
        ));
    }
    static int sumofdig(int n){
        if (n==0){
            return 0;
        }
        int dig=(int)(Math.log10(n));
       int rem= n%10;
        n=n/10;
        int r=(int)Math.pow(10,dig);
        return (rem*r)+sumofdig(n);
    }

}
