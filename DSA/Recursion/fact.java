package Recursion;

public class fact {
    public static void main(String[] args) {
        System.out.println(factr(5));
    }

    public static int factr(int n) {
        if (n<=1){
           return 1;
        }
        return n*factr(n-1);
    }
}
