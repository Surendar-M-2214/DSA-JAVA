package src.pattern;

public class diamond {
    public static void main(String[] args) {
        diamndpattrn(5);
    }
    static void diamndpattrn(int n){
        for (int i = 1; i < 2*n; i++) {
            int total=i>n?2*n-i:i;
            int spaces=n-total;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < total; k++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

}
