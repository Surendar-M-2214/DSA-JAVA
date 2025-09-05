package src.pattern;

import java.util.Scanner;

public class pyramidpattern
{
    static void pyrpattern()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the num: ");
        int n=in.nextInt();
        for (int i = n; i >0; i--)
        {
            for (int j = 0; j<i ; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
