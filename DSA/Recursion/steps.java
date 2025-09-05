package Recursion;

public class steps {
    public static void main(String[] args) {

        System.out.println(noSteps(20));
    }

    public static int noSteps( int num) {
        return help(num,0);
    }

    private static int help(int num, int i) {
        if (num==0){
            return i;
        }
        if (num%2==0){
            return help(num/2,i+1);
        }
        return help(num-1,i+1);
    }
}
