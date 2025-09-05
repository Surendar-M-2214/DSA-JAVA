import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
//        int arr[];
//       arr=new int[5];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=in.nextInt();
//        }
//        for(int nums:arr){
//            System.out.print(nums+" ");
//        }
//        System.out.print(Arrays.toString(arr));
        //internal working of toString
//        System.out.println("Too stringg"+toostring(arr));

///String Array

        String str[]=new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i]=in.next();
        }
        System.out.println(Arrays.toString(str));
        }

        public static String toostring(int a[]){
        if (a==null)
            return "null";
        int len=a.length-1;
        if (len==-1)
            return "[]";
        StringBuilder b=new StringBuilder();
        b.append("[");
            for (int i = 0;; i++) {
                b.append(a[i]);
                b.append(",");
                if (i==len)
                    return b.append("]").toString();
                b.append(",");
            }


        }

    }
