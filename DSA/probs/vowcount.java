package probs;

import java.util.Arrays;

import static java.lang.String.valueOf;

public class vowcount {
    public static void main(String[] args) {
        vowelscnt("LINZ TECHNOLIGESEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
    }

    public static void vowelscnt(String str) {
        StringBuilder sr=new StringBuilder();
        sr.append('s');
        sr.append('t');
        System.out.println(sr);

//
//        char ch;
//        int strlen = str.length();
//        int count = 0;
//        int varcnt = 0;
//        char[] newstr = str.toCharArray();
//        char[] varr = {'a', 'e', 'i', 'o', 'u'};
//        for (int i = 0; i < strlen; i++) {
//            ch = str.charAt(i);
//            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
//                newstr[i] = varr[varcnt];
//                varcnt++;
//                if (varcnt==5){
//                    varcnt=0;
//                }
//            }
//        }
//        str=valueOf(newstr);
//        System.out.println(str);

    }
}
