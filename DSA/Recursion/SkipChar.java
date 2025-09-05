package Recursion;

public class SkipChar {
    public static void main(String[] args) {
        System.out.println(skip("bacccah",'c'));
    }
    static String skip(String str,char skip){

        if (str.isEmpty()){

            return "" ;
        }
        char ch=str.charAt(0);
        if(ch==skip){
        return   skip(str.substring(1),skip);

        }else {

          return ch+skip(str.substring(1),skip);
        }

    }
}
