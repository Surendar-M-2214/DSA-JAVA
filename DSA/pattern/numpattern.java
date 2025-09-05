package src.pattern;

public class numpattern {
    public static void main(String[] args) {


        int n=4;
        int k=1;
        for (int i = 0; i <n; i++) {

            for (int j = 0; j <n; j++) {
              if (j<i) {
                  System.out.print("   ");
              }
              else {
                  System.out.print(k++ + "  ");
              }

            }

            System.out.println(" ");


        }
        for (int i = 0; i < n; i++) {

        }

    }
}
