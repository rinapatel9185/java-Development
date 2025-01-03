public class return_type {

    
    // function with return type
    
    public static int result(){
        return 10+20;
    }

    // string return type
    public static String result1(){
        return "Hello";
    }

    // boolean return type
    public static boolean result2(){
        return true;
    }

    // double return type
    public static double result3(){
        return 10.5;
    }

    public static void main(String[] args) {
       
        // calling function
        System.out.println("Addition of two numbers is: "+result());
        System.out.println(result1());
        System.out.println(result2());
        System.out.println(result3());

    }

}