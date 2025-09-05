package probs;

public class PrintPrime {
    public static void main(String[] args) {
nprimes(20);
    }

    private static void nprimes(int n) {
        for (int i = 0; i <= n; i++) {
            if (i == 1 || i == 0)
                continue;
           int   flag = 1;
            for (int j = 2; j <= i / 2; j++ ){
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }

            if (flag == 1)
                System.out.println(i);
        }
    }

}
