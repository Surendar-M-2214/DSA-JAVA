import java.util.Scanner;

public class RevString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter A String: ");
        String str=in.next();
        System.out.println(in);

        System.out.println(str.length());
        String nstr=",";
        for (int i = str.length()-1; i >=0; i--) {

            nstr=nstr+str.charAt(i);
        }
        System.out.println("final: "+nstr);

    }
}
