package Leetcode_75;

public class flowerbed {
    public static void main(String[] args) {
int[]arr={1,0,0,0,0,1};
int n=2;
        System.out.println(canPlaceFlowers(arr,n));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        int s=flowerbed.length;
        if(s==1&&flowerbed[0]==0)return true;
        if(s>=2&&flowerbed[0]==0&&flowerbed[1]==0){
            if(n==0)return true;
            flowerbed[0]=1;
            n--;
        }
        if(s>=2&&flowerbed[s-1]==0&&flowerbed[s-2]==0){
            if(n==0)return true;
            flowerbed[s-1]=1;
            n--;
        }
        for(int i=1;n!=0&&i<s-1;i++){
            if(flowerbed[i-1]==0&&flowerbed[i]==0&&flowerbed[i+1]==0){
                flowerbed[i]=1;
                n--;
            }
        }
        return n==0;
    }
}