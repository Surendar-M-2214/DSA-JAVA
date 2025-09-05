package Leetcode_75;

public class MergeAlternatively {
    public static void main(String[] args) {
      String  word1 = "rbc";
      String  word2 = "pr";
      char[] str=word1.toCharArray();

        System.out.println(  mergeAlternately(word1,word2));
    }
    public static String mergeAlternately(String word1, String word2) {
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        StringBuilder sb = new StringBuilder();

        int len1 = chars1.length;
        int len2 = chars2.length;
        int minLength = len1 < len2 ? len1 : len2;

        for (int i = 0; i < minLength; i++) {
            sb.append(chars1[i]);
            sb.append(chars2[i]);
        }

        if (len1 > len2) {
            sb.append(word1.substring(len2));
        } else {
            sb.append(word2.substring(len1));
        }

        return sb.toString();

    }
}
