package Recursion.Backtracking;

public class MazePaths {
    public static void main(String[] args) {

        System.out.println(countPaths(3,3));
        printPaths("",3,3);

    }

    public static int countPaths(int r, int c) {
        if (r==1 || c==1){
            return 1;
        }
        int down= countPaths(r-1,c);
        int right=countPaths(r,c-1);
        return down+right;
    }
    public static void printPaths(String d,int r, int c) {
        if (r==1 && c==1){

            System.out.println(d);
           return;
        }
        if(r>1) {
            printPaths(d + "d", r - 1, c);
        }
        if (c>1) {
            printPaths(d + "r", r, c - 1);
        }
//        return down+right;
    }
}
