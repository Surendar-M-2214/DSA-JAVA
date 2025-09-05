package src.Leetcode_75;

public class ReverseStr {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));


    }


        public static  String reverseWords(String s) {
            StringBuilder sb = new StringBuilder();
            int n = s.length();
            int i = 0;

            while (i<n){
                while(i<n && s.charAt(i)==' ') i++;
                int j=i+1;
                while (j<n&&s.charAt(j)!=' ')j++;
                String str=s.substring(i,j);
                if (sb.length()==0){
                     sb.append(str);

                }else {
                    sb.insert(0,str+" ");

                }
                i=j+1;
            }


            return sb.toString();

        }

}