package src.Leetcode_75;

public class CapitalizeTitle {


    public static void main(String[] args) {

        System.out.println(capitalizeTitle("i was the strONGeSt mAN"));

    }
    public static String capitalizeTitle(String title) {

        char ch[]=title.toCharArray();
        int chlen=ch.length;
        for (int i = 0; i < chlen; i++) {
            int firstIndex=i;
            while(i<chlen&&ch[i]!=' '){
                ch[i]=Character.toLowerCase(ch[i]);
                i++;

            }
            if (i-firstIndex>2){
                ch[firstIndex]=Character.toUpperCase(ch[firstIndex]);
            }


        }


        return String.valueOf(ch);
    }
}
