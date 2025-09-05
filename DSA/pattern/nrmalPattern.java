package src.pattern;

import java.util.Scanner;

public class nrmalPattern {
    public static void main(String[] args) {
        pyramidpattern.pyrpattern();
    }
    static void pattern() {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int n= in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <i+1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

}
