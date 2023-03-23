//import java.util.ArrayList;

public class Main{
    static boolean isEqual(int x, int y){
        return x == y ? true : false;
    }
    public static void main(String args[]){
        System.out.println(isEqual(4, 8));
        System.out.println(isEqual(2, 2));
        System.out.println(isEqual(42, 32));
    }
}
    //=========================== WEEK 1 CODE ===================================
    // static int add(int x, int y){ //This can also be used as a sum function
    //     return x+y;
    // }
    // static int convert(int x){ //converts minutes to seconds
    //     return x*60;
    // }
    
    // public static void main(String args[]){
    //     System.out.println(convert(5));
    //     System.out.println(convert(3));
    //     System.out.println(convert(2));
    // }
    //============================================ WEEK 2 CODE ==================================================
    // static ArrayList<Integer> multiples(int num, int length){
    //     ArrayList<Integer> retVal = new ArrayList<Integer>();

    //     for(int i = 1; i <= length; ++i){
    //         retVal.add(num*i);
    //     }
    //     return retVal;
    // }
    // public static void main(String args[]){
    //     System.out.println(multiples(1,10));
    //     System.out.println(multiples(5,10));
    //     System.out.println(multiples(10,10));
    // }