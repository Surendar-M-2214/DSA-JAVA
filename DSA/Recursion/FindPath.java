package Recursion;

public class FindPath {
    public static void main(String[] args) {
        System.out.println(count(3,3));
    }

     static int count(int r, int c) {
        if (r==1 ||c==1){
            return 1 ;
        }
int left=count(r-1,c);
        int ri8=count(r,c-1);
        return left+ri8;
    }
}
