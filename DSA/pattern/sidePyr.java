package pattern;

import java.util.Scanner;

public class sidePyr {
    public static void main(String[] args) {
        sidepyrmid();
    }
static void sidepyrmid(){
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the num: ");
    int n=in.nextInt();
    for (int i = 0; i < 2*n; i++) {
   int total=i>n?2*n-i:i;
        for (int j = 0; j < total; j++) {
            System.out.print("*");
        }
        System.out.println(" ");

    }
}
}
