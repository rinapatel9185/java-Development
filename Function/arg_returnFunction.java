public class arg_returnFunction {


    // function with argument and return type
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
   
        // calling function
        System.out.println("Addition of two numbers is: " + add(10, 20));
        System.out.println("Addition of two numbers is: " + add(30, 40));

    }
}