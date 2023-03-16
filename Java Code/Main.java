


public class Main{
    
    // static int add(int x, int y){ //This can also be used as a sum function
    //     return x+y;
    // }
    static int convert(int x){ //converts minutes to seconds
        return x*60;
    }
    
    public static void main(String args[]){
        System.out.println(convert(5));
        System.out.println(convert(3));
        System.out.println(convert(2));
    }
}